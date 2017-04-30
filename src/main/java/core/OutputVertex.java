package core;

import java.util.ArrayList;

/**
 * {OutputVertex}
 * Author: Yaman Yağız Taşbağ
 * Version: {30.04.2017}
 */
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
