package Characters;

import Abstract.Creations;
import Enum.Genders;

public class MistressMinoga extends Creations {
    public MistressMinoga() {
        super("Госпожа Минога", Genders.FEMALE);
    }

    public void Zapret(Creations creations) {
        System.out.println("тебе не пристало водить дружбу с " + creations.getName());
    }

    public void Plata(Creations creations) {
        System.out.println(getName() + " выплатила " + creations.getName() + " пять фертингов");
    }
}
