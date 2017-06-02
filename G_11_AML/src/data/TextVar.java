package data;

import sun.plugin.dom.core.Text;

public class TextVar extends Data{

    private String dataString;

    public TextVar(){}

    public TextVar(String dataStringValue) {
        dataString = dataStringValue;
    }

    @Override
    public String getValue() {
        return dataString;
    }

    @Override
    public void setValue(Object value) { dataString = (String)value; }

    @Override
    public Data clone() {
        return new TextVar(dataString);
    }

    @Override
    public Data sumOperator(Data secondTerm) {
        if(secondTerm instanceof TextVar) {
            return new TextVar(dataString + ((TextVar) secondTerm).getValue());
        }
        throw new Error("Sum operator is not defined for TextVar and " + secondTerm.getClass().toString());
    }

    @Override
    public Data equalOperator(Data secondTerm) {
        if (secondTerm instanceof TextVar) {
            return new Bool(dataString.equals(secondTerm.getValue()));
        }
        throw new Error("equalOperator operator is not defined for TextVar and " + secondTerm.getClass().toString());
    }

    @Override
    public Data notEqualOperator(Data secondTerm) {
        if (secondTerm instanceof TextVar) {
            return new Bool(!dataString.equals(secondTerm.getValue()));
        }
        throw new Error("notEqualOperator operator is not defined for TextVar and " + secondTerm.getClass().toString());
    }

    @Override
    public Data lesserThanOperator(Data secondTerm) {
        if (secondTerm instanceof TextVar) {
            int value = dataString.compareTo((String) secondTerm.getValue());
            return new Bool(value < 0);
        }
        throw new Error("lesserThan operator is not defined for TextVar and " + secondTerm.getClass().toString());
    }

    @Override
    public Data lesserEqualOperator(Data secondTerm) {
        if (secondTerm instanceof TextVar) {
            int value = dataString.compareTo((String) secondTerm.getValue());
            return new Bool(value <= 0);
        }
        throw new Error("lesserOrEqualThan operator is not defined for TextVar and " + secondTerm.getClass().toString());
    }

    @Override
    public Data greaterThanOperator(Data secondTerm) {
        if (secondTerm instanceof TextVar) {
            int value = dataString.compareTo((String) secondTerm.getValue());
            return new Bool(value > 0);
        }
        throw new Error("greaterThan operator is not defined for TextVar and " + secondTerm.getClass().toString());
    }

    @Override
    public Data greaterEqualOperator(Data secondTerm) {
        if (secondTerm instanceof TextVar) {
            int value = dataString.compareTo((String) secondTerm.getValue());
            return new Bool(value >= 0);
        }
        throw new Error("greaterOrEqualThan operator is not defined for TextVar and " + secondTerm.getClass().toString());
    }
}
