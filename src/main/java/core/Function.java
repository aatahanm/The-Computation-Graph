package core;

import java.util.ArrayList;

public interface Function
{
    ArrayList<Double> getOutput();
    void setInput ( ArrayList<Double> al);
    int getInputCount();
}
