package main;

import java.io.Serial;

public class MyCustomException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public MyCustomException(String message) {
        super(message);
    }
}
