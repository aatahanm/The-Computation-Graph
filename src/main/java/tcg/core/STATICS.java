package tcg.core;

/**
 * This class hold statics for type of the vertices.
 */
public class STATICS {

    //Properties
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

    /**
     * Determine type of the vertex.
     * @param type static number of a vertex
     * @param d constant number
     * @return vertex
     */
    public static Dsf typeToVertex(int type,double d)
    {
        Dsf vertex = null;
        if ( type == STATICS.CONSTANT_VERTEX)
            vertex = new ConstantVertex(d);
        if ( type == STATICS.INPUT_VERTEX)
            vertex = new InputVertex();
        if ( type == STATICS.ADDITION_VERTEX)
            vertex = new AdditionVertex();
        if ( type == STATICS.MULTIPLICATION_VERTEX)
            vertex = new MultiplicationVertex();
        if ( type == STATICS.SIGMOID_VERTEX)
            vertex = new SigmoidVertex();
        if ( type == STATICS.OUTPUT_VERTEX)
            vertex = new OutputVertex();
        if ( type == STATICS.COS_VERTEX)
            vertex = new CosVertex();
        if ( type == STATICS.COT_VERTEX)
            vertex = new CotVertex();
        if ( type == STATICS.DIVISION_VERTEX)
            vertex = new DivisionVertex();
        if ( type == STATICS.EXP_VERTEX)
            vertex = new ExpVertex();
        if ( type == STATICS.LOG_VERTEX)
            vertex = new LogVertex();
        if ( type == STATICS.SIN_VERTEX)
            vertex = new SinVertex();
        if ( type == STATICS.SUBTRACTION_VERTEX)
            vertex = new SubtractionVertex();
        if ( type == STATICS.TAN_VERTEX)
            vertex = new TanVertex();
        if ( type == STATICS.TANH_VERTEX)
            vertex = new TanhVertex();
        return vertex;
    }

}
