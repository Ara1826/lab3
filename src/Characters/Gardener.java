package Characters;
import Enum.Genders;
import Abstract.Creations;
public class Gardener extends Creations {
    public Gardener(){super("Садовник", Genders.MALE);}
    public void Nedovolny(){
        System.out.println("это не нравилось " + getName() + "у" + " ,потому что он следил за садом");

    }
}
