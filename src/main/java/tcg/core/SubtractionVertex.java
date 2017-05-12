package tcg.core;

import java.util.ArrayList;

/**
 * {SubtractionVertex}
 * Author: Yaman Yağız Taşbağ
 * Version: {12.05.2017}
 */
public class SubtractionVertex extends CVertex {

    public SubtractionVertex()
    {
        inpCount = 2;
        super.input.add(0.0);
        super.input.add(0.0);
    }
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(1.0);
        d.add(-1.0);
        return d;
    }

    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(super.input.get(0) - super.input.get(1));
        return al;
    }

    public String toString()
    {
        return "x0 - x1";
    }
}
