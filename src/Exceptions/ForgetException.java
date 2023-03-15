package Exceptions;

import Abstract.Creations;

public class ForgetException extends RuntimeException {
    public ForgetException(Creations creations1, Creations creations2) {
        super(creations1.getName() + " забыл о " + creations2.getName());
    }
}