package com.osstudents.fcse.aiu.project;

public class WordCorrection extends Thread{
    public void run(String[] ArrayPass){
        String[][] Dictionary = EditorApp.getDic();
        for (int i =0; i<ArrayPass.length; i++){
            for(int j = 0; j<Dictionary.length; j++){
                if(ArrayPass[i].equals(Dictionary[j][0])){
                    ArrayPass[i] = Dictionary[j][1];
                }
            }
        }
    }
}
