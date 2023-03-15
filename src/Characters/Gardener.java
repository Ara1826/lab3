package Characters;

import Abstract.Creations;
import Enum.Genders;

public class Gardener extends Creations {
    public Gardener() {
        super("Садовник", Genders.MALE);
    }

    public void Nedovolny() {
        System.out.println("это не нравилось " + getName() + "у" + " ,потому что он следил за садом");
    }
}
