package data;

import exceptions.AmlRunTimeException;

import java.util.ArrayList;

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

    public Data quotientOperator(Data secondTerm)  throws AmlRunTimeException {
        throw new Error("Quotient operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data modOperator(Data secondTerm) {
        throw new Error("Mod operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data equalOperator(Data secondTerm) {
        throw new Error("Equal operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data notEqualOperator(Data secondTerm) {
        throw new Error("Equal operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data greaterThanOperator(Data secondTerm) {
        throw new Error("Greater than operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data greaterEqualOperator(Data secondTerm) {
        throw new Error("Greater or equal than operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data lesserThanOperator(Data secondTerm) {
        throw new Error("Lesser than operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }

    public Data lesserEqualOperator(Data secondTerm) {
        throw new Error("Lesser or Equal than operator is not implemented for "
                + getClass().toString() + " with " + secondTerm.getClass().toString());
    }
    @Override
    public String toString() {
        return getValue().toString();
    }
}
