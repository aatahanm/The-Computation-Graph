package core;

import java.util.Random;

public class STATICS {
    private static int ID = 0;
    public static int getID()
    {
        return ID++;
    }
}
