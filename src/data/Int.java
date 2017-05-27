package data;

public class Int extends Data {

    private int dataInt;

    public Int() {}

    public Int(int valueDataInt){
        dataInt = valueDataInt;
    }

    @Override
    public Integer getValue() {
        return dataInt;
    }

    @Override
    public void setValue(Object value) { dataInt = (Integer)value;}

    @Override
    public Data clone() {
        return new Int(dataInt);
    }

    @Override
    public Data sumOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(dataInt + ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(dataInt + value);
        }
        throw new Error("Sum operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data substractOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(dataInt - ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(dataInt - value);
        }
        throw new Error("Substract operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data productOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(dataInt * ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(dataInt * value);
        }
        throw new Error("Product operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    //TODO: Añadir excepcion division por cero
    @Override
    public Data quotientOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(dataInt / ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(dataInt / value);
        }
        throw new Error("Quotient operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data modOperator(Data secondTerm) {
        if(secondTerm instanceof Int) {
            return new Int(dataInt % ((Int) secondTerm).getValue());
        } else if(secondTerm instanceof Bool) {
            int value = ((Bool) secondTerm).toInt();
            return new Int(dataInt % value);
        }
        throw new Error("Quotient operator is not defined for Int and " + secondTerm.getClass().toString());
    }


}
