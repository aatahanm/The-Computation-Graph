package tcg.core;

import java.util.ArrayList;

public class MultiplicationVertex extends CVertex
{
    public MultiplicationVertex(){
        super.inpCount = 2;
        super.input.add(0.0);
        super.input.add(0.0);
    }

    public ArrayList<Double> getDerivative (int ID)
    {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add(input.get(1));
        al.add(input.get(0));
        return al;
    }

    public ArrayList<Double> calcOutput() {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add ( input.get(0) * input.get(1));
        return al;
    }

    public String toString()
    {
        return "x0 * x1";
    }
}
