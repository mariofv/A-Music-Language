package data;

public class TextVar extends Data{

    private java.lang.String dataString;

    public TextVar(){};

    public TextVar(java.lang.String dataStringValue) {
        dataString = dataStringValue;
    }

    public java.lang.String getValue() {
        return dataString;
    }

    public void setValue(java.lang.String value) { dataString = value; }

    @Override
    public Data clone() {
        return new TextVar(dataString);
    }
}
