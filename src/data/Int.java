package data;

/**
 * Created by carlos.roldan on 25/04/2017.
 */
public class Int extends Data {

    int dataInt;

    public Int(int valueDataInt){
        dataInt = valueDataInt;
    }

    public int getValue() {
        return dataInt;
    }

    public void setValue(int value) { dataInt = value;}

}
