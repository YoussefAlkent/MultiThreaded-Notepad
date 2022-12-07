module com.osstudents.fcse.aiu.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.osstudents.fcse.aiu.project to javafx.fxml;
    exports com.osstudents.fcse.aiu.project;
}