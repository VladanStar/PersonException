package com.company;

public class PersonException extends Exception {

    public PersonException() {
    }
    public PersonException(String message){
        super(message);
    }
    public PersonException(String message, Throwable cause){
        super(message, cause);
    }
    public PersonException(Throwable cause) {
        super(cause);
    }

}
