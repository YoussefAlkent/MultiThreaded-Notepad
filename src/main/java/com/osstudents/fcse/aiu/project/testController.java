package com.osstudents.fcse.aiu.project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testController {
    private File textFile;
    @FXML
    private TextArea MainArea;
    @FXML
    private Button loadChangesButton;

    @FXML
    private void chooseFile(ActionEvent event) throws FileNotFoundException {
        String text = "";
        FileChooser fileChooser = new FileChooser();
        //Node node = (Node) event.getSource();
        textFile = fileChooser.showOpenDialog(null);
        if (textFile != null) {
            Scanner file = new Scanner(textFile);
            while(file.hasNext()){
            text+=file.nextLine();
            }
        }
        MainArea.setText(text);
    }
    @FXML
    private void saveFile(ActionEvent event) throws IOException {
        if(textFile != null){
            FileWriter writer = new FileWriter(textFile.getAbsoluteFile());
            writer.write(MainArea.getText());
            writer.flush();
        }
    }

}
