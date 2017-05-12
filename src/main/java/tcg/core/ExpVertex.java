package tcg.core;

import java.util.ArrayList;


public class ExpVertex extends CVertex{

    public ExpVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(Math.exp(super.input.get(0)));
        return d;
    }

    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.exp(super.input.get(0)));
        return al;
    }

    public String toString()
    {
        return "exp(x0)";
    }
}
