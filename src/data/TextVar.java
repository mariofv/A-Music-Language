package data;

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
}
