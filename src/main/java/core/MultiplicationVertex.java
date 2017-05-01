package core;

import java.util.ArrayList;

/**
 * {MultiplicationVertex}
 * Author: Yaman Yağız Taşbağ
 * Version: {1.05.2017}
 */
public class MultiplicationVertex extends CVertex
{
    public MultiplicationVertex(){
        super.inpCount = 2;
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
}