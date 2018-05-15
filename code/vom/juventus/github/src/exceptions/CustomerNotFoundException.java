package code.vom.juventus.github.src.exceptions;

public class CustomerNotFoundException extends Exception {

    private int customerId;

    public CustomerNotFoundException(int customerId) {
        this.customerId = customerId;
    }

    public CustomerNotFoundException(String message, int customerId) {
        super(message);
        this.customerId = customerId;
    }

    public CustomerNotFoundException(String message, Throwable cause, int customerId) {
        super(message, cause);
        this.customerId = customerId;
    }

    public CustomerNotFoundException(Throwable cause, int customerId) {
        super(cause);
        this.customerId = customerId;
    }

    public CustomerNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int customerId) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.customerId = customerId;
    }
}
