package Exceptions;

import Abstract.Event;

import java.util.NoSuchElementException;

public class NoSuchIventException extends NullPointerException {
    public NoSuchIventException() {
        super("Такого события в списке нет");
    }
}