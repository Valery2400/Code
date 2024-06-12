package lesson_43.code.exceptions.practice.withExceptions;

public class ProductValidationException extends RuntimeException{
    public ProductValidationException(String message) {
        super(message);
    }
}
