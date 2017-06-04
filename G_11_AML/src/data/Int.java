package data;

import exceptions.AmlRunTimeException;

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

    @Override
    public Data quotientOperator(Data secondTerm) throws AmlRunTimeException {
        if(secondTerm instanceof Int) {
            if ((int)secondTerm.getValue() == 0) throw new AmlRunTimeException("Floating point exception: Division by 0.");
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

    @Override
    public Data equalOperator(Data secondTerm) {
        if (secondTerm instanceof Int) {
            return new Bool(dataInt == (int) secondTerm.getValue());
        }
        throw new Error("equalOperator operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data notEqualOperator(Data secondTerm) {
        if (secondTerm instanceof Int) {
            return new Bool(dataInt != (int) secondTerm.getValue());
        }
        throw new Error("notEqualOperator operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data lesserThanOperator(Data secondTerm) {
        if (secondTerm instanceof Int) {
            return new Bool(dataInt < (int) secondTerm.getValue());
        }
        throw new Error("lesserThan operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data lesserEqualOperator(Data secondTerm) {
        if (secondTerm instanceof Int) {
            return new Bool(dataInt <= (int) secondTerm.getValue());
        }
        throw new Error("lesserOrEqualThan operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data greaterThanOperator(Data secondTerm) {
        if (secondTerm instanceof Int) {
            return new Bool(dataInt > (int) secondTerm.getValue());
        }
        throw new Error("greaterThan operator is not defined for Int and " + secondTerm.getClass().toString());
    }

    @Override
    public Data greaterEqualOperator(Data secondTerm) {
        if (secondTerm instanceof Int) {
            return new Bool(dataInt >= (int) secondTerm.getValue());
        }
        throw new Error("greaterOrEqualThan operator is not defined for Int and " + secondTerm.getClass().toString());
    }


}
