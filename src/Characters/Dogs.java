package Characters;

import Abstract.Creations;
import Enum.Genders;

public class Dogs extends Creations {
    public Dogs() {
        super("Собаки", Genders.ANOTHER);
    }

    public void Vernutsa() {
        System.out.println(getName() + " вернулись с прогулки");
    }

    public void Sport() {
        System.out.println("занимались физ-зарядкой");
    }

    public void Sadgon() {
        System.out.println("гнались за Незнайкой по саду");
    }

    public void Kust() {
        System.out.println("прыгали через кусты и цветочные клумбы");
    }
}
