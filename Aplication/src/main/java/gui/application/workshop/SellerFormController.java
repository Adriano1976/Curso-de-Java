package gui.application.workshop;

import gui.application.workshop.util.Alerts;
import gui.application.workshop.util.Constraints;
import gui.application.workshop.util.Utils;
import gui.db.DbException;
import gui.listeners.DataChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;
import model.entities.Department;
import model.entities.Seller;
import model.exceptions.ValidationException;
import model.services.DepartmentService;
import model.services.SellerService;

import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@SuppressWarnings("ClassEscapesDefinedScope")
public class SellerFormController implements Initializable {

    private Seller seller;

    private SellerService sellerService;

    private DepartmentService departmentService;

    private final List<DataChangeListener> dataChangeListeners = new ArrayList<>();

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private DatePicker dpBirthDate;

    @FXML
    private TextField textBaseSalary;

    @FXML
    private ComboBox<Department> departmentComboBox;

    @FXML
    private Label labelErrorName;

    @FXML
    private Label labelErrorEmail;

    @FXML
    private Label labelErrorBirthDate;

    @FXML
    private Label labelErrorBaseSalary;

    @FXML
    private Button buttonSave;

    @FXML
    private Button buttonCancel;

    private ObservableList<Department> departmentObservableList;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setServices(SellerService sellerService, DepartmentService departmentService) {
        this.sellerService = sellerService;
        this.departmentService = departmentService;
    }

    public void subscribeDataChangeListener(DataChangeListener listener) {
        dataChangeListeners.add(listener);
    }

    @FXML
    public void onButtonSaveAction(ActionEvent event) {
        if (seller == null) {
            throw new IllegalStateException("Entity was null");
        }

        if (sellerService == null) {
            throw new IllegalStateException("Dervice was null");
        }

        try {
            seller = getFormData();
            sellerService.saveOrUpdate(seller);
            notifyDataChangeListeners();
            Utils.currentStage(event).close();

        } catch (DbException e) {
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

    private Seller getFormData() {
        Seller newSeller = new Seller();
        ValidationException exception = new ValidationException("Validation error");

        newSeller.setId(Utils.tryParseToInt(textFieldId.getText()));

        if (textFieldName.getText() == null || textFieldName.getText().trim().equals("")) {
            exception.addError("name", "Field can't be empty");
        }
        newSeller.setName(textFieldName.getText());

        if (textFieldEmail.getText() == null || textFieldEmail.getText().trim().equals("")) {
            exception.addError("email", "Field can't be empty");
        }
        newSeller.setEmail(textFieldEmail.getText());

        if (dpBirthDate.getValue() == null) {
            exception.addError("dpBirthDate", "Field can't be empty");
        } else {
            Instant instant = Instant.from(dpBirthDate.getValue().atStartOfDay(ZoneId.systemDefault()));
            newSeller.setBirthDate(Date.from(instant));
        }

        if (textBaseSalary.getText() == null || textBaseSalary.getText().trim().equals("")) {
            exception.addError("baseSalary", "Field can't be empty");
        }
        newSeller.setBaseSalary(Utils.tryParseToDouble(textBaseSalary.getText()));

        newSeller.setDepartment(departmentComboBox.getValue());

        if (exception.getErrors().size() > 0) {
            throw exception;
        }
        return newSeller;
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
        Constraints.setTextFieldMaxLength(textFieldName, 70);
        Constraints.setTextFieldDouble(textBaseSalary);
        Constraints.setTextFieldMaxLength(textFieldEmail, 60);
        Utils.formatDatePicker(dpBirthDate, "dd/MM/yyyy");
        initializeComboBoxDepartment();
    }

    public void updateFormData() {
        if (seller == null) {
            throw new IllegalStateException("Entity was null");
        }
        textFieldId.setText(String.valueOf(seller.getId()));
        textFieldName.setText(seller.getName());
        textFieldEmail.setText(seller.getEmail());
        Locale.setDefault(Locale.US);
        textBaseSalary.setText(String.format("%.2f", seller.getBaseSalary()));

        if (seller.getBirthDate() != null) {
            dpBirthDate.setValue(LocalDate.ofInstant(seller.getBirthDate().toInstant(), ZoneId.systemDefault()));
        }

        if (seller.getDepartment() == null) {
            departmentComboBox.getSelectionModel().selectFirst();
        } else {
            departmentComboBox.setValue(seller.getDepartment());
        }
    }

    public void loadAssociatedDepartments() {
        if (departmentService == null) {
            throw new IllegalStateException("DepartmentService was null");
        }
        List<Department> departmentList = departmentService.findAll();
        departmentObservableList = FXCollections.observableArrayList(departmentList);
        departmentComboBox.setItems(departmentObservableList);
    }

    private void setErrorMessages(Map<String, String> errors) {
        Set<String> fields = errors.keySet();

        labelErrorName.setText(fields.contains("name") ? errors.get("name") : "");
        labelErrorEmail.setText(fields.contains("email") ? errors.get("email") : "");
        labelErrorBirthDate.setText(fields.contains("dpBirthDate") ? errors.get("dpBirthDate") : "");
        labelErrorBaseSalary.setText(fields.contains("baseSalary") ? errors.get("baseSalary") : "");
    }

    private void initializeComboBoxDepartment() {
        Callback<ListView<Department>, ListCell<Department>> factory = lv -> new ListCell<>() {

            @Override
            protected void updateItem(Department department, boolean empty) {
                super.updateItem(department, empty);
                setText(empty ? "" : department.getName());
            }
        };

        departmentComboBox.setCellFactory(factory);
        departmentComboBox.setButtonCell(factory.call(null));
    }
}
