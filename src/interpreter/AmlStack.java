package interpreter;

import data.Data;
import music.AmlTrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class AmlStack {
    private class StackData {
        ArrayList<Data> localVariables;
        AmlTrack localTrack;
    }

    private Stack<StackData> stack;

    public AmlStack(AmlTrack initialTrack) {
        stack = new Stack<>();
        StackData firstData = new StackData();
        firstData.localTrack = initialTrack;
        stack.push(firstData);
    }

    public void push(AmlTree function, AmlTrack track) {
        StackData data = new StackData();
        data.localTrack = track;
        data.localVariables = new ArrayList<>(Collections.nCopies(function.getNumVariables(), new Data()));
        stack.push(data);
    }

    public void pop() {
        stack.pop();
    }

    public ArrayList<Data> getLocalVariables() {
        return stack.firstElement().localVariables;
    }

    public AmlTrack getTrack() { return stack.firstElement().localTrack; }
}
