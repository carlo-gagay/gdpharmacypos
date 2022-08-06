module com.simplesoft {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.simplesoft.app.controllers.views to javafx.fxml;
    exports com.simplesoft;
}