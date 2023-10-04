package Tools;

import java.util.Arrays;

public class MathT {

    /**
     * receive a dynamic array of double values and return your average
     * */
    public static double Avg(double... values)
    {
        return Arrays.stream(values).sum() / values.length;
    }

}
