package Abstract;

import Enum.Genders;
import Interfaces.Live;
import Interfaces.Talk;

import java.util.Objects;

public abstract class Creations implements Talk, Live {
    private String name;
    private int age;
    private Genders genders;

    public Creations(String name, Genders genders) {
        this.name = name;
        this.genders = genders;
        System.out.println("Существо типа " + this.getClass().getName() + " с именем " + name + " создано");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genders getGenders() {
        return genders;
    }

    public void setGenders(Genders genders) {
        this.genders = genders;
    }

    @Override
    public void Govorit(Creations creations) {
        genders.Govorit(creations);
    }

    @Override
    public void Zhit(Things things) {
        System.out.println("в" + things.getName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Creations creations)) return false;
        return age == creations.age && Objects.equals(name, creations.name) && genders == creations.genders;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, genders);
    }

    @Override
    public String toString() {
        return "Creations{" + "имя='" + name + '\'' + '}';
    }
}
