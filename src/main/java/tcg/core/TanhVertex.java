package tcg.core;

import java.util.ArrayList;


public class TanhVertex extends CVertex{

    public TanhVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(1.0/Math.pow(Math.cosh(input.get(0)),2));
        return d;
    }

    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.tanh(super.input.get(0)));
        return al;
    }

    public String toString()
    {
        return "tanh(x0)";
    }

    public int getType()
    {
        return STATICS.TANH_VERTEX;
    }
}
