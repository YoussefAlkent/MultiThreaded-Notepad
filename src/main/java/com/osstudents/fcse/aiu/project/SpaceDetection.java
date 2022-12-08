package com.osstudents.fcse.aiu.project;

public class SpaceDetection extends Thread{
    public void run(String fullText){

        for (int i = 0; i<fullText.length();i++){
            if(!(fullText.charAt(i) == ' ')){
                continue;
            }
            if(fullText.charAt(i-1) == ' '){
                char[] Text = fullText.toCharArray();
                for(int j = i-1; j<fullText.length(); j++){
                    Text[j] = Text[j+1];
                }
                continue;
            }
            if (fullText.charAt(i+1) == ' '){
                char[] Text = fullText.toCharArray();
                for(int j = i-1; j<fullText.length(); j++){
                    Text[j] = Text[j+1];
                }
                continue;
            }
        }

    }
}
