package data;

public class Bool extends Data {

    private boolean dataBool;

    public Bool(){};

    public Bool(boolean dataBoolValue) {
        dataBool = dataBoolValue;
    }

    public boolean getValue() {
        return dataBool;
    }

    public void setValue(boolean value) { dataBool = value; }

    @Override
    public Data clone() {
        return new Bool(dataBool);
    }
}
