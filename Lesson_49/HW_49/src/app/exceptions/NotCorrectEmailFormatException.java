package app.exceptions;

import java.util.List;

public class NotCorrectEmailFormatException extends Exception {
    public NotCorrectEmailFormatException(List<String> errors){
        super(String.join("; ",errors));

    }
}
