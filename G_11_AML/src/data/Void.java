package data;

public class Void extends Data {
    private static Void ourInstance = new Void();

    public static Void getInstance() {
        return ourInstance;
    }

    private Void() {}

    @Override
    public void setValue(Object o) {
        throw new Error("This should never happen");
    }

    @Override
    public Object getValue() {
        throw new Error("This should never happen");
    }

    @Override
    public Data clone() {
        return null;
    }
}
