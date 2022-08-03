package gui.application.workshop;

import gui.application.workshop.util.Alerts;
import gui.application.workshop.util.Constraints;
import gui.application.workshop.util.Utils;
import gui.db.DbException;
import gui.listeners.DataChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;
import model.exceptions.ValidationException;
import model.services.DepartmentService;

import java.net.URL;
import java.util.*;

@SuppressWarnings("ClassEscapesDefinedScope")
public class DepartmentFormController implements Initializable {

    private Department department;

    private DepartmentService departmentService;

    private final List<DataChangeListener> dataChangeListeners = new ArrayList<>();

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldName;

    @FXML
    private Label labelErrorName;

    @FXML
    private Button buttonSave;

    @FXML
    private Button buttonCancel;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public void subscribeDataChangeListener(DataChangeListener listener) {
        dataChangeListeners.add(listener);
    }

    @FXML
    public void onButtonSaveAction(ActionEvent event) {
        if (department == null) {
            throw new IllegalStateException("Entity was null");
        }
        if (departmentService == null) {
            throw new IllegalStateException("Dervice was null");
        }
        try {
            department = getFormData();
            departmentService.saveOrUpdate(department);
            notifyDataChangeListeners();
            Utils.currentStage(event).close();

        }catch (DbException e) {
            Alerts.showAlert("Error saving object", null, e.getMessage(), Alert.AlertType.ERROR);
        } catch (ValidationException e) {
            setErrorMessages(e.getErrors());
        }
    }

    private void notifyDataChangeListeners() {
        for (DataChangeListener listener : dataChangeListeners) {
            listener.onDataChanged();
        }
    }

    private Department getFormData() {
        Department newDepartment = new Department();
        ValidationException exception = new ValidationException("Validation error");

        newDepartment.setId(Utils.tryParseToInt(textFieldId.getText()));
        if (textFieldName.getText() == null || textFieldName.getText().trim().equals("")) {
            exception.addError("name", "Field can't be empty");
        }
        newDepartment.setName(textFieldName.getText());
        if (exception.getErrors().size() > 0) {
            throw exception;
        }
        return newDepartment;
    }


    @FXML
    public void onButtonCancelAction(ActionEvent event) {
        Utils.currentStage(event).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }

    private void initializeNodes() {
        Constraints.setTextFieldInteger(textFieldId);
        Constraints.setTextFieldMaxLength(textFieldName, 30);
    }

    public void updateFormData() {
        if (department == null) {
            throw new IllegalStateException("Entity was null");
        }
        textFieldId.setText(String.valueOf(department.getId()));
        textFieldName.setText(department.getName());
    }

    private void setErrorMessages(Map<String, String> errors) {
        Set<String> fields = errors.keySet();

        if (fields.contains("name")) {
            labelErrorName.setText(errors.get("name"));
        }
    }
}
