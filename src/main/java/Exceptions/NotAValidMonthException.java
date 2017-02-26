package Exceptions;

public class NotAValidMonthException extends Throwable
{

    public NotAValidMonthException(String message) {
        super(message);
    }
}
