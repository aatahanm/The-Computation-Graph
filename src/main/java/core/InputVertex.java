package core;

import java.util.ArrayList;

public class InputVertex extends CVertex {

    public double getDerivative(int ID)
    {
        return 0;
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
