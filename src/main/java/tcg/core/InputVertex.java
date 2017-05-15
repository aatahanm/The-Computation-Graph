package tcg.core;

import java.util.ArrayList;

public class InputVertex extends CVertex {

    public InputVertex(){
        inpCount = 1;
        super.input.add(0.0);
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

    public String toString()
    {
        return super.input.get(0) + "";
    }

    public int getType()
    {
        return STATICS.INPUT_VERTEX;
    }
}
