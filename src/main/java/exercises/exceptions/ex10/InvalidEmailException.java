package exercises.exceptions.ex10;

public class InvalidEmailException extends Exception {

    public InvalidEmailException(String message) {
        super(message);
    }
}
