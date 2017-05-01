package core;


import java.util.*;

public abstract class CVertex implements Dsf
{
    private final int ID;
    private boolean selected;
    int inpCount = 0;

    public CVertex()
    {
        ID = STATICS.getID();
    }
    public abstract Function getDerivative(int ID);

    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean s) {
        selected = s;
    }

    abstract public ArrayList<Double> getOutput();

}
