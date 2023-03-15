package Interfaces;

import Abstract.Creations;

public interface Eat {
    void Kuchats(Creations creations);
    default void Noteatall(Creations creations){
        System.out.println(creations.getName() + " не съедал порцию до конца");
    }
}
