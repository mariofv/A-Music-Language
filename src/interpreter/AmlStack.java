package interpreter;

import data.Data;

import java.util.ArrayList;
import java.util.Stack;

public class AmlStack {
    private Stack<AmlTree> stack;

    public AmlStack() {
        stack = new Stack<>();
    }

    public void push(AmlTree function) {
        function.pushLocalVariables();
        stack.push(function);
    }

    public void pop() {
        stack.firstElement().popLocalVariables();
        stack.pop();
    }

    public ArrayList<Data> getLocalVariables() {
        return stack.firstElement().getLocalVariables();
    }
}
