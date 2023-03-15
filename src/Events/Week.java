package Events;

import Abstract.Event;

public class Week extends Event {
    public Week() {
        super("неделя");
    }

    public void Pass(){
        System.out.println("прошла " + getName());
    }
}
