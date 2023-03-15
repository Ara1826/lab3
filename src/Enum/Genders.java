package Enum;

import Abstract.Creations;

import java.util.Locale;

import static java.lang.Character.getName;


public enum Genders {
    MALE (" Госпожа Минога, выплатите мне жалование на недельку вперед пожалуйста - "),
    FEMALE ("ты живешь "),
    ANOTHER ("");
    private String cheonidolzhiumetgovor;

    private Genders(String cheonidolzhiumetgovor){
        this.cheonidolzhiumetgovor = cheonidolzhiumetgovor;
    }

    public void Govorit(Creations creations){
        System.out.printf(creations.getName() + " говорит: " + cheonidolzhiumetgovor);

    }

}
