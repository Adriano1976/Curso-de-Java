package com.viewcontroller.demoviewcontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button BtText;

    @FXML
    public void onBtTestAction() {
        System.out.println("Click");
    }
}
