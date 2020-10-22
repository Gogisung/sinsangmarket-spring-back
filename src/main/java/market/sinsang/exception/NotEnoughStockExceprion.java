package market.sinsang.exception;

public class NotEnoughStockExceprion extends RuntimeException {
    public NotEnoughStockExceprion() {
        super();
    }

    public NotEnoughStockExceprion(String message) {
        super(message);
    }

    public NotEnoughStockExceprion(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockExceprion(Throwable cause) {
        super(cause);
    }
}
