package tcg.core;

import java.util.ArrayList;


public class SinVertex extends CVertex{

    public SinVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(Math.cos(input.get(0)));
        return d;
    }

    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.sin(super.input.get(0)));
        return al;
    }

    public String toString()
    {
        return "sin(x0)";
    }

    public int getType()
    {
        return STATICS.SIN_VERTEX;
    }
}
