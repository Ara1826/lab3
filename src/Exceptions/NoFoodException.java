package Exceptions;

public class NoFoodException extends Exception {
    public NoFoodException() {
        super("Нет еды чтобы ее отнести");
    }
}
