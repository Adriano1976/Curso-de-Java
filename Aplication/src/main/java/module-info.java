module javafx.application.aplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens gui.application.workshop.util to javafx.fxml, javafx.graphics, java.base;
    opens gui.application.workshop to javafx.fxml, javafx.graphics, java.base;
    opens gui.db to javafx.fxml, javafx.graphics, java.base;
    opens model.entities to  javafx.graphics, javafx.fxml, javafx.base;
    opens model.services to javafx.graphics, javafx.fxml;
    opens model.dao to javafx.graphics, javafx.fxml;
    opens model.dao.implement to javafx.graphics, javafx.fxml;

    exports gui.application.workshop;
    exports gui.application.workshop.util;
    exports gui.db;
}
