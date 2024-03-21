package com.example.learnmalayalam.HelperClass.HomeAdapter;

public class GameClass {
    String title, malayalam;

    public GameClass(String title, String malayalam) {
        this.title = title;
        this.malayalam = malayalam;

    }

    public  String getMalayalam(){
        return malayalam;
    }
    public String getTitle() {
        return title;
    }
}
