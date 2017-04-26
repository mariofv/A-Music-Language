package exceptions;

public class AmlMusicException extends AmlRunTimeException {
    public AmlMusicException(String message) {
        super(message);
    }

    public AmlMusicException(String message, int line) {
        super(message);
        this.line = line;
    }
}
