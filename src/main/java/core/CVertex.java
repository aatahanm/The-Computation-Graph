package core;

import java.util.*;

/**
 * Created by mertcinar on 30/04/2017.
 */
public abstract class CVertex implements Dsf
{
    private final int ID;
    private boolean selected;
    private ArrayList<Double> input;
    TreeSet<Integer> containSet;
    public CVertex()
    {
        ID = STATICS.getID();
        containSet = new TreeSet<Integer>();
        containSet.add ( ID);
    }

    public double getDerivative(int ID)
    {
        if ( containSet.contains ( ID))
            return calcDerivative ( ID);
        else
            return 0;
    }

    abstract double calcDerivative ( int ID);
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

    public boolean addContainment ( int ID )
    {
        return containSet.add ( ID);
    }

    public boolean removeContainment ( int ID)
    {
        return containSet.remove ( ID);
    }
}
