package tcg.core;

import java.util.ArrayList;


public class LogVertex extends CVertex{

    public LogVertex() {
        inpCount = 1;
        super.input.add(1.0);
    }

    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(1.0/(input.get(0)));
        return d;
    }

    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.log(super.input.get(0)));
        return al;
    }

    public String toString()
    {
        return "ln(x0)";
    }

    public int getType()
    {
        return STATICS.LOG_VERTEX;
    }
}
