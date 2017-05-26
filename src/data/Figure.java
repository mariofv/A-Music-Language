package data;

import music.AmlFigure;

/**
 * Created by Carlos on 26/05/2017.
 */
public class Figure extends AttributeData {

    private AmlFigure dataFigure;

    public Figure() {
        dataFigure = null;
    }

    public Figure(AmlFigure dataFigureValue) {
        dataFigure = dataFigureValue;
    }

    public AmlFigure getValue() {
        if (dataFigure == null) {
            throw new NullPointerException();
        }
        return dataFigure;
    }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "figure":
                dataFigure.setFigure(AmlFigure.Figure.valueOf((String) value));
                break;
            default:
                throw new Error("This should never happen!");

        }
    }

    public void setValue(AmlFigure value) { dataFigure = value; }

    @Override
    public Data clone() {
        return new Figure(dataFigure.clone());
    }

}
