package Enum;

import Abstract.Creations;


public enum Genders {
    MALE(" Госпожа Минога, выплатите мне жалование на недельку вперед пожалуйста - "),
    FEMALE("ты живешь "),
    ANOTHER("");
    private String cheonidolzhiumetgovor;

    private Genders(String cheonidolzhiumetgovor) {
        this.cheonidolzhiumetgovor = cheonidolzhiumetgovor;
    }

    public void Govorit(Creations creations) {
        System.out.print(creations.getName() + " говорит: " + cheonidolzhiumetgovor);
    }
}
