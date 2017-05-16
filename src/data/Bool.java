package data;

public class Bool extends Data {

    private boolean dataBool;

    public Bool(){}

    public Bool(boolean dataBoolValue) {
        dataBool = dataBoolValue;
    }

    public boolean getValue() {
        return dataBool;
    }

    public void setValue(boolean value) { dataBool = value; }

    public int toInt() {
        return dataBool ? 1 : 0;
    }

    @Override
    public Data clone() {
        return new Bool(dataBool);
    }

    @Override
    public Data sumOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(toInt() + ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(toInt() + value);
        }
        throw new Error("Sum operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data substractOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(toInt() - ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(toInt() - value);
        }
        throw new Error("Substract operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data productOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(toInt() * ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(toInt() * value);
        }
        throw new Error("Multiply operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data quotientOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(toInt() / ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(toInt() / value);
        }
        throw new Error("Quotient operator is not defined for Int and " + secondTerm.getClass().toString());
    }
}
