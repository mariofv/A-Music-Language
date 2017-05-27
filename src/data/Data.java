package data;

public abstract class Data {

    @Override
    public abstract Data clone();

    public abstract void setValue(Object o);

    public abstract Object getValue();

    public Data sumOperator(Data secondTerm) {
        throw new Error("Sum operator is not implemented for "
                        + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data substractOperator(Data secondTerm) {
        throw new Error("Substract operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data productOperator(Data secondTerm) {
        throw new Error("Product operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data quotientOperator(Data secondTerm) {
        throw new Error("Quotient operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data modOperator(Data secondTerm) {
        throw new Error("Mod operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

}
