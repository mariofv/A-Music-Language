package data;

public class Void extends Data{
    private static Void ourInstance = new Void();

    public static Void getInstance() {
        return ourInstance;
    }

    private Void() {
    }
}
