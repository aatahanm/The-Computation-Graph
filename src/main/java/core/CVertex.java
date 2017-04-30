package core;

import java.util.ArrayList;

/**
 * Created by mertcinar on 30/04/2017.
 */
public abstract class CVertex implements Dsf
{
    private final int ID;
    private boolean selected;
    private ArrayList<Double> input;

    public CVertex()
    {
        ID = STATICS.getID();
    }

    public double getDerivative(int ID)
    {
        return ID;
    }

    public boolean contains ( int ID)
    {
        return false;
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean s) {
        selected = s;
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
}
