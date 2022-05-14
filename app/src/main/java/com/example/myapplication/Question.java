package com.example.myapplication;

public class Question {
    public String questions[] = {
            "Masina skirta vazinejimui:",
            "Masinos dydis:",
    };

    public String choices[][] = {
            {"Kasdieniniam naudojimui", "Iki vieno tasko ir atgal", "Kelionems", "Retiems pasivazinejimams"},
            {"Didelis(Dzipas, Pikapas)", "Vidutinis(Kupe, Sedanas)", "Mazas(Hecbekas)", "Labai mazas(Smart)"},
    };

    public String correctAnswer[] = {
            "Kasdieniniam naudojimui",
            "Didelis(Dzipas, Pikapas)",
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }


}