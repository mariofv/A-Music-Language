package exceptions;

import interpreter.AmlStack;
import interpreter.AmlTree;

public class AmlRunTimeException extends AmlException {
    public AmlRunTimeException(String message) {
        super(message);
    }

    public AmlRunTimeException(String message, int line) { super(message, line); }

    public void printStackTrace(AmlStack stack) {
        System.err.println("Stack trace:");
        while(!stack.isEmpty()) {
            AmlTree function = stack.topFunction();
            System.out.println(function.getText() + ": line " + function.getLine());
            stack.pop();
        }
    }
}
