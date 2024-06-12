package lesson_43.code.exceptions.userExceptions.validation;

public class MyPersonalExceptionClass extends RuntimeException{
    public MyPersonalExceptionClass(String message) {
        super(message);
    }
}
