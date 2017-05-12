package core;

import java.util.ArrayList;

public class ConstantVertex extends CVertex
{
    ArrayList<Double> consInput;
    public ConstantVertex ( double d)
    {
       consInput = new ArrayList<>();
       consInput.add(d);
    }
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        if ( ID == super.ID)
            al.add(1.0);
        else
            al.add(0.0);
        return al;
    }

    ArrayList<Double> calcOutput() {
        return consInput;
    }
    public String toString()
    {
        return "{" + consInput.get(0) + "}";
    }
}
