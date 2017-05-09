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
