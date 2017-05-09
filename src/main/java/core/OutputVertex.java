package core;

import java.util.ArrayList;

public class OutputVertex extends CVertex
{
    public OutputVertex()
    {
        super.input = new ArrayList<Double>();
        super.input.add(0.0);
        super.inpCount = 1;
    }

    public ArrayList<Double> getDerivative ( int ID)
    {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add(1.0);
        return al;
    }
    public ArrayList<Double> calcOutput()
    {
        return super.input;
    }

    public String toString()
    {
        return "ID #" + ID + " :" + super.input.get(0);
    }
}
