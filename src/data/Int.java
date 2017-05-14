package data;

public class Int extends Data {

    private int dataInt;

    public Int() {};

    public Int(int valueDataInt){
        dataInt = valueDataInt;
    }

    public int getValue() {
        return dataInt;
    }

    public void setValue(int value) { dataInt = value;}

    @Override
    public Data clone() {
        return new Int(dataInt);
    }
}
