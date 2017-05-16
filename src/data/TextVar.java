package data;

public class TextVar extends Data{

    private String dataString;

    public TextVar(){}

    public TextVar(String dataStringValue) {
        dataString = dataStringValue;
    }

    public String getValue() {
        return dataString;
    }

    public void setValue(String value) { dataString = value; }

    @Override
    public Data clone() {
        return new TextVar(dataString);
    }
}
