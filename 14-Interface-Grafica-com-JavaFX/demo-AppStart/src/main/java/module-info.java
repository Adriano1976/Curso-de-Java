module model.application.appstart {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens model.application.appstart to javafx.fxml;
    exports model.application.appstart;
}