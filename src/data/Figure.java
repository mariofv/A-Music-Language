package data;

import exceptions.AmlRunTimeException;
import music.AmlFigure;

import java.util.ArrayList;

public class Figure extends AttributeData {

    public static final String tie =  "tie";
    public static final String untie =  "untie";
    public static final String isTied =  "isTied";

    private AmlFigure dataFigure;

    public Figure() {
        dataFigure = null;
    }

    public Figure(AmlFigure dataFigureValue) {
        dataFigure = dataFigureValue;
    }

    @Override
    public AmlFigure getValue() {
        if (dataFigure == null) {
            throw new NullPointerException();
        }
        return dataFigure;
    }

    @Override
    public Data method(String funcName, ArrayList<Data> arguments) throws AmlRunTimeException{
        switch (funcName) {
            case tie:
                dataFigure.setTie(true);
                return Void.getInstance();
            case untie:
                dataFigure.setTie(false);
                return Void.getInstance();
            case isTied:
                return new Bool(dataFigure.isTied());
            default:
                throw new Error("This should never happen.");
        }
    }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "duration":
                dataFigure.setDuration((Integer) value);
                break;
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public Data getAttributeValue(String attribute) {
        switch (attribute) {
            case "duration":
                return new Int(dataFigure.getDuration());
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public void setValue(Object value) { dataFigure = (AmlFigure)value; }

    @Override
    public Data clone() {
        return new Figure(dataFigure.clone());
    }

}
