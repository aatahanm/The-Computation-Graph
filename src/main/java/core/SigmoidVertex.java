package core;

import java.util.ArrayList;

public class SigmoidVertex extends CVertex{

    public SigmoidVertex(){
        super.inpCount = 1;
    }

    public ArrayList<Double> getDerivative ( int ID)
    {
        ArrayList<Double> al;
        double temp;
        al = new ArrayList<Double>();
        temp = 1/(1+Math.exp(-input.get(0)));
        al.add(temp*(1-temp));
        return al;
    }

    public ArrayList<Double> calcOutput() {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add ( 1/(1+Math.exp(-input.get(0))));
        return al;
    }

    public String toString()
    {
        return "sgm";
    }
}
