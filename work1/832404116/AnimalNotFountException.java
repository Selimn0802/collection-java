package com.animals;

public class AnimalNotFountException extends RuntimeException {

    public AnimalNotFountException(String message) {
        super(message);
    }

}