package Characters;

import Enum.Genders;
import Abstract.Creations;

public class Doctor extends Creations {
    public Doctor(){
        super("Доктор",Genders.MALE);
    }
    public void Osmotr(Creations creations){
        System.out.println(getName() + " внимательно осмотрел "+ creations.getName());
    }
    public void Diagnoz(){
        System.out.println("Диагноз: лучше отправить его в больницу, болезнь запущена");
    }
}
