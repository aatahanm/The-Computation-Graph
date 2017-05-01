package core;

import java.util.ArrayList;

public class InputVertex extends CVertex {

    public Function getDerivative(int ID)
    {
        return null;
    }

    public ArrayList<Double> calcOutput()
    {
        if ( super.input.size() != 1)
            return null;

        ArrayList<Double> out;
        out = new ArrayList<Double>();
        out.add ( super.input.get(0));
        return out;
    }

}
