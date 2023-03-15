package Characters;

import Abstract.Creations;
import Abstract.Things;
import Enum.Genders;
import Interfaces.Eat;
import Interfaces.Remember;

import java.util.Random;

public class Neznajka extends Creations implements Remember, Eat {
    public Neznajka() {
        super("Незнайка", Genders.MALE);
    }

    @Override
    public void Pomnit(Creations creations) {
        System.out.println(getName() + " никогда не забывал " + creations.getName() + "а");
    }
    public void Run(Creations creations){
        Random random = new Random();
        int y = random.nextInt(3);
        switch (y){
            case 0 -> System.out.println("Не проходило и дня, чтобы " + getName() + " не забежал к " + creations.getName() + "у");
            case 1 -> System.out.println("Не проходило и двух дней, чтобы " + getName() + " не забежал к " + creations.getName() + "у");
            case 2 -> System.out.println("Не проходило и трех дней, чтобы " + getName() + " не забежал к " + creations.getName() + "у");
        }
    }
    public void Do(){
        System.out.println("Делал это во время послеобеденной прогулки");
    }
    public void Nesti(Creations creations){System.out.println(getName() + " относил все это голодному " + creations.getName() + "у");}
    public void Help(){
        System.out.println("так как ему нужно помочь больному приятелю, ");
    }
    public void Zaiti(Things things){
        System.out.println("на другой день он вошел в " + things.getName());}
    public void Invite(Creations creations, Doctor doctor){
        System.out.println("пригласил " + "к " + creations.getName() + "у "  + doctor.getName() + "а");}
    public void Zapolnyat(Things things){
        System.out.println(getName() + " заполнял " + things.getName());
    }


    @Override
    public void Kuchats(Creations creations) {
        System.out.println("Всегда, когда " + getName() + " обедал с " + creations.getName());
    }
}
