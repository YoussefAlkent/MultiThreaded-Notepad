package com.osstudents.fcse.aiu.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class testController {
    public Label statusMessage;
    public Button cleanText;
    private File textFile;
    @FXML
    private TextArea MainArea;

    @FXML
    private void chooseFile(ActionEvent event) throws FileNotFoundException {
        String text = "";
        FileChooser fileChooser = new FileChooser();
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
            FileWriter writer = new FileWriter(textFile);
            writer.write(MainArea.getText());
            writer.flush();
            return;
        }
        FileChooser chooser = new FileChooser();
        File newFile = chooser.showSaveDialog(null);
        FileWriter writer = new FileWriter(newFile);
        writer.write(MainArea.getText());
        writer.flush();
    }
    @FXML
    private void onTextEdit(KeyEvent event) throws InterruptedException {
        Thread spaceDetection = new Thread(new Runnable() {
            @Override
            public void run() {
                String fullText = MainArea.getText();
                int caretPosition = MainArea.getCaretPosition();
                fullText=fullText.replaceAll("[ ]{2,}", " ");
                MainArea.setText(fullText);
                MainArea.positionCaret(caretPosition);

            }
        });
        spaceDetection.start();
        spaceDetection.join();
        Thread wordCorrection = new Thread(new Runnable() {
            @Override
            public void run() {
                int caretPos = MainArea.getCaretPosition();
                String[] ArrayPass = MainArea.getText().split(" ");
                String[][] Dictionary = EditorApp.getDic();
                for(int i = 0; i<ArrayPass.length; i++){
                    for(int j = 0; j<Dictionary.length; j++){
                        System.out.println(ArrayPass[i]);
                        System.out.println(ArrayPass[i].equals(Dictionary[i][0]));
                        if (ArrayPass[i].equals(Dictionary[i][0])) {
                            System.out.println(ArrayPass[i].equals(Dictionary[i][0]));
                            ArrayPass[i] = Dictionary[i][1];
                            break;
                        }
                    }
                }
                String fixedText = "";
                for(int i = 0; i<ArrayPass.length; i++){
                    fixedText+=ArrayPass[i];
                }
                MainArea.setText(fixedText);
                MainArea.positionCaret(caretPos);
            }
        });
        wordCorrection.start();
        wordCorrection.join();

    }

}
