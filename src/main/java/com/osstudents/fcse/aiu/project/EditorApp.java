package com.osstudents.fcse.aiu.project;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Builder;

public class EditorApp extends Application {
    public static final String[][] Dictionary = {{}};
    public static String[][] getDic(){
        return Dictionary;
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("test.fxml"));
        //loader.setBuilderFactory(t -> (Builder<?>) new EditorController(new EditorModel()));
        Scene scene = new Scene(loader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
