package Abstract;

public abstract class Things {
    private String name;
    private String property = "";

    public Things(String name) {
        this.name = name;
        System.out.println("Объект " + name + " типа " + this.getClass().getName() + " создан");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
        System.out.println("Объекту " + name + " добавлено свойство " + property);
    }
}
