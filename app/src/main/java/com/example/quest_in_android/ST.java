package com.example.quest_in_android;

public class ST {
    ST[] direction;
    String subject,text;
    int dscore;
    public ST (String subject, String text, int variants, int score) {
        this.subject=subject;
        this.text=text;
        dscore=score;
        direction=new ST[variants];
    }
}

