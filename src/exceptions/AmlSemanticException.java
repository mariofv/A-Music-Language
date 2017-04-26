package exceptions;

public class AmlSemanticException extends AmlException {
    public AmlSemanticException(String message, int line) {
        super(message);
        this.line = line;
    }
}
