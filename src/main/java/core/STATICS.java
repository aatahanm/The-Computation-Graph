package core;

import java.util.Random;

public class STATICS {
    private static int ID = 0;
    public static int getID()
    {
        return ID++;
    }
    public static final int CONSTANT_VERTEX = 1;
    public static final int INPUT_VERTEX = 2;
    public static final int ADDITION_VERTEX = 3;
    public static final int MULTIPLICATION_VERTEX = 4;
    public static final int OUTPUT_VERTEX = 5;
    public static final int SIGMOID_VERTEX = 6;


}
