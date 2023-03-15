package Abstract;

public abstract class Event {
    private String name;

    protected Event(String name) {
        this.name = name;
        System.out.println("Событие " + name + " типа " + this.getClass().getName() + " произошло");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
