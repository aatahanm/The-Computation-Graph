package core;

import java.util.ArrayList;

public class OutputVertex extends CVertex
{
    public OutputVertex()
    {
        super.inpCount = 1;
    }

    public ArrayList<Double> getDerivative ( int ID)
    {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add(0.0);
        return al;
    }
    public ArrayList<Double> calcOutput()
    {
        return super.input;
    }

}
