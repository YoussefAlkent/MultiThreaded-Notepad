package com.osstudents.fcse.aiu.project;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public  class EditorController {
    @FXML
    private TextArea areaText;
    private EditorModel model;
    public EditorController(EditorModel model){
        this.model=model;
    }

    @FXML
    private void onSave() {

    }
    @FXML
    private void onLode() {

    }
    @FXML
    private void onClose() {
    System.exit(0);
    }
    @FXML
    private void onAbout() {

    }

}
