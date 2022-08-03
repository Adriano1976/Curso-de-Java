module gui.application.demoalert {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens gui.application.demoalert to javafx.fxml;
    exports gui.application.demoalert;
}