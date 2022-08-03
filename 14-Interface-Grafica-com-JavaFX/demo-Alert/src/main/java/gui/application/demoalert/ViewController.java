package gui.application.demoalert;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

    @FXML
    private Label txtLabel;

    @FXML
    private Button buttonInformation;

    @FXML
    private Button buttonError;

    @FXML
    private Button buttonConfirm;

    @FXML
    protected void onButtonInformationAction() {
        Alerts.showAlert("Alert title", "Alert header", "Hello my brother!", Alert.AlertType.INFORMATION);
    }

    @FXML
    protected void onButtonErrorAction() {
        Alerts.showAlert("Alert title", "Alert header", "Hello my brother!", Alert.AlertType.ERROR);
    }

    @FXML
    protected void onButtonConfirmAction() {
        Alerts.showAlert("Alert title", "Alert header", "Hello my brother!", Alert.AlertType.CONFIRMATION);
    }
}
