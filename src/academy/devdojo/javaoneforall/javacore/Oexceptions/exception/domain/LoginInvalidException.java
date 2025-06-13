package academy.devdojo.javaoneforall.javacore.Oexceptions.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Invalid login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
