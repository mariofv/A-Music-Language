package data;

/**
 * Created by carlos.roldan on 25/04/2017.
 */
public class Bool extends Data {

    boolean dataBool;

    public Bool(boolean dataBoolValue) {
        dataBool = dataBoolValue;
    }

    public boolean getValue() {
        return dataBool;
    }
}
