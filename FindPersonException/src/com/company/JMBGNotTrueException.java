package com.company;

public class JMBGNotTrueException extends PersonException {

    public JMBGNotTrueException() {
    }
    public JMBGNotTrueException(String message) {
        super(message);
    }
    public JMBGNotTrueException(String message, Throwable couse){
        super(message,couse);
    }
    public JMBGNotTrueException(Throwable couse){
        super(couse);


    }
}
