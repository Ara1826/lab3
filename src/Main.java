import Characters.*;
import Events.*;
import Exceptions.NoFoodException;
import Things.*;

public class Main {
    public static void main(String... args) {
        Neznajka neznajka = new Neznajka();
        Doctor doctor = new Doctor();
        Gardener sadovnic = new Gardener();
        Kozlik kozlik = new Kozlik();
        Dogs dogs = new Dogs();
        MistressMinoga GospozhaMioga = new MistressMinoga();
        Bread hleb = new Bread();
        Meatball kotlet = new Meatball();
        Pie pirojok = new Pie();
        Flophouse nochleg = new Flophouse();
        Wealthyhouse bogdom = new Wealthyhouse();
        Richdogs cultdogs = new Richdogs();
        DogList sobachijur = new DogList();
        Week nedelya = new Week();
        PhysicalSport phizra = new PhysicalSport();
        Rest otdih = new Rest();
        Theatre teatr = new Theatre();
        Dinner uzhin = new Dinner();
        Healing lechebnica = new Healing();
        System.out.println();

        dogs.Vernutsa();
        dogs.Sport();
        dogs.Sadgon();
        dogs.Kust();
        sadovnic.Nedovolny();
        otdih.RestStart();
        neznajka.Zapolnyat(sobachijur);
        neznajka.Pomnit(kozlik);
        neznajka.Run(kozlik);
        neznajka.Do();
        neznajka.Kuchats(dogs);
        neznajka.eat();

        try {
            neznajka.Nesti(kozlik);
        } catch (NoFoodException e) {
            System.out.println(e.getMessage());
        }
        neznajka.Govorit(neznajka);
        neznajka.Help();
        kozlik.Locatedin(nochleg);
        GospozhaMioga.Govorit(GospozhaMioga);
        neznajka.Zhit(bogdom);
        neznajka.Zhit(cultdogs);
        GospozhaMioga.Zapret(kozlik);
        nedelya.Pass();
        GospozhaMioga.Plata(neznajka);
        neznajka.Zaiti(lechebnica);
        neznajka.Invite(kozlik, doctor);
        doctor.Osmotr(kozlik);
        doctor.Diagnoz();
//        throw new NullPointerException();
    }
}