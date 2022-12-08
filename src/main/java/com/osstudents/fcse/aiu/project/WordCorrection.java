package com.osstudents.fcse.aiu.project;

public class WordCorrection extends Thread{
    public void run(String[] ArrayPass){
        String[][] Dictionary = HelloApplication.getDic();
        for (int i =0; i<ArrayPass.length; i++){
            for(int j = 0; j<Dictionary.length; j++){
                if(ArrayPass.equals(Dictionary[j][0])){
                    ArrayPass[i] = Dictionary[j][0];
                }
            }
        }
    }
}
