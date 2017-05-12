package tcg.core;

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
    public static final int COS_VERTEX = 7;
    public static final int COT_VERTEX = 8;
    public static final int DIVISION_VERTEX = 9;
    public static final int EXP_VERTEX = 10;
    public static final int LOG_VERTEX = 11;
    public static final int SIN_VERTEX = 12;
    public static final int SUBTRACTION_VERTEX = 13;
    public static final int TANH_VERTEX = 14;
    public static final int TAN_VERTEX = 15;

    public static final int CGRAPH = 99;


}
