package tcg.core;

import java.util.ArrayList;


public class CosVertex extends CVertex{

    public CosVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(-Math.sin(input.get(0)));
        return d;
    }

    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.cos(super.input.get(0)));
        return al;
    }

    public String toString()
    {
        return "cos(x0)";
    }

    public int getType()
    {
        return STATICS.COS_VERTEX;
    }
}

