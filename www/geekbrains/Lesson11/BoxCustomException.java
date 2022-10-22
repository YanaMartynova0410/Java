package main.Lesson11;

public class BoxCustomException extends RuntimeException{
    public BoxCustomException(String message) {
        super(message);
    }
}