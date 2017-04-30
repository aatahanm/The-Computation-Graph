package core;

import core.functions.CVertex;

import java.util.ArrayList;

public class OutputVertex extends CVertex
{
    public OutputVertex()
    {
        super.inpCount = 1;
    }

    public double getDerivative(int ID)
    {
        if ( !super.checkConditions())
            return 0;
        return 0;

    }

    ArrayList<Double> calcOutput() {
    return null;
    }

}
