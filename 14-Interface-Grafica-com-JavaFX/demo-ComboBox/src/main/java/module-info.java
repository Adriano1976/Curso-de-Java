module gui.application.democombobox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens gui.application.democombobox to javafx.fxml;
    exports gui.application.democombobox;
}