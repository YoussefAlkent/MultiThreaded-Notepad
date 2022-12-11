package com.osstudents.fcse.aiu.project;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Scanner;

public class EditorApp extends Application {
    public static String[][] Dictionary = new String[90][2];
    public static void initDictionary() throws FileNotFoundException {
        File file = new File("C:\\Users\\Spectre\\IdeaProjects\\Project\\src\\main\\java\\com\\osstudents\\fcse\\aiu\\project\\dictionary.txt");
        Scanner fileReader = new Scanner(file);
        int i = 0;
        while(fileReader.hasNext()){
            Dictionary[i] = fileReader.nextLine().split(" - ");
            i++;
        }
    }
    public static String[][] getDic(){
        return Dictionary;
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor.fxml"));
        //loader.setBuilderFactory(t -> (Builder<?>) new EditorController(new EditorModel()));
        Scene scene = new Scene(loader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
