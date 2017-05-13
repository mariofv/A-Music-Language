package exceptions;

public class AmlRunTimeException extends AmlException {
    public AmlRunTimeException(String message) {
        super(message);
    }

    public AmlRunTimeException(String message, int line) { super(message, line); }

    @Override
    public void printStackTrace() {
        System.err.println("Stack trace:");
    }
}
