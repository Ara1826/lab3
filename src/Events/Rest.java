package Events;

import Abstract.Event;

public class Rest extends Event {
    public Rest() {
        super(" отдых");
    }
    public void RestStart(){
        System.out.println("Начался" + getName());
    }
}