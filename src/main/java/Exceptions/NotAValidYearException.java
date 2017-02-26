package Exceptions;

/**
 * Created by flaps_win10 on 26-02-2017.
 */
public class NotAValidYearException extends Throwable {
    public NotAValidYearException(String s) {
        super(s);
    }
}
