package core;


import java.io.Serializable;
import java.util.*;

public abstract class CVertex implements Dsf, Serializable
{
    private static final long serialVersionUID = 52177932855L;
    final int ID;
    private boolean selected;
    int inpCount = 0;
    ArrayList<Double> input;

    public CVertex()
    {
        ID = STATICS.getID();
        input = new ArrayList<Double>();
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean s) {
        selected = s;
    }

    public int getType(){
        if (this instanceof ConstantVertex)
            return STATICS.CONSTANT_VERTEX;
        else if (this instanceof InputVertex)
            return STATICS.INPUT_VERTEX;
        else if (this instanceof AdditionVertex)
            return STATICS.ADDITION_VERTEX;
        else if (this instanceof MultiplicationVertex)
            return STATICS.MULTIPLICATION_VERTEX;
        else if (this instanceof OutputVertex)
            return STATICS.OUTPUT_VERTEX;
        else if (this instanceof SigmoidVertex)
            return STATICS.SIGMOID_VERTEX;
        return -1;
    }

    public ArrayList<Double> getOutput()
    {
            return calcOutput();
    }

    public void setInput(ArrayList<Double> al)
    {
            input = al;
    }

    abstract ArrayList<Double> calcOutput();

    public int getInputCount()
    {
        return inpCount;
    }

}
