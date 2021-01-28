package com.company;

public class PersonNotFoundException extends PersonException {

    public PersonNotFoundException() {
    }
    public PersonNotFoundException(String message) {
        super(message);
    }
    public PersonNotFoundException(String message, Throwable cause) {
        super(message,cause);
    }
    public PersonNotFoundException(Throwable cause) {
        super(cause);
    }
}
