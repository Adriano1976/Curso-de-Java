module gui.application.demotexfilde {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens gui.application.demotexfilde to javafx.fxml;
    exports gui.application.demotexfilde;
}