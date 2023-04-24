package exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidNumberException extends Exception{

    public InvalidNumberException(String message) {
        super(message);
    }

    public InvalidNumberException(Throwable cause) {
        super(cause);
    }

    public InvalidNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
