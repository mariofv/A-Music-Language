package interpreter;

import data.Data;
import music.AmlTrack;

import java.util.ArrayList;
import java.util.Stack;

public class AmlStack {
    private Stack<AmlTree> stack;
    private Stack<AmlTrack> trackStack;

    public AmlStack(AmlTrack initialTrack) {
        stack = new Stack<>();
        trackStack = new Stack<>();
        trackStack.push(initialTrack);
    }

    public void push(AmlTree function, AmlTrack track) {
        function.pushLocalVariables();
        stack.push(function);
        trackStack.push(track);
    }

    public void pop() {
        stack.firstElement().popLocalVariables();
        stack.pop();
        trackStack.pop();
    }

    public ArrayList<Data> getLocalVariables() {
        return stack.firstElement().getLocalVariables();
    }

    public AmlTrack getTrack() { return trackStack.firstElement(); }
}
