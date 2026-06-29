package ExceptionHandlingMaster.exceptions;

public class MetricCollectionException extends Exception {
    public MetricCollectionException(String message) {
        super(message);
    }

    public MetricCollectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
