package oop.practice.exceptions.level2_validator;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        System.err.println(message);
    }
}
