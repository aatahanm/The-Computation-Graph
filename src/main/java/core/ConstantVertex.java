package core;

import java.util.ArrayList;

public class ConstantVertex extends CVertex
{

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
        return super.input;
    }
}
