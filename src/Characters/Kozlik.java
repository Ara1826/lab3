package Characters;

import Abstract.Creations;
import Abstract.Things;
import Enum.Genders;

public class Kozlik extends Creations {

    public Kozlik() {
        super("Козлик", Genders.MALE);
    }

    public void Locatedin(Things things) {
        System.out.println("который находится в дрянингской " + things.getName());
    }

}
