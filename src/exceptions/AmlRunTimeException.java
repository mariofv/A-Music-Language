package exceptions;

public class AmlRunTimeException extends AmlException {
    public AmlRunTimeException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.err.println("Stack trace:");
    }
}
