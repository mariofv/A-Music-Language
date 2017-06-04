package exceptions;

public class AmlException extends Exception {
    int line = -1;

    public AmlException(String message) {
        super(message);
    }

    public AmlException(String message, int line) {
        super(message);
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}