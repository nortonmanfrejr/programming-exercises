package Tools;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MathT {

    private static String SingleDecimalHouse = "#.#";
    private static String PairDecimalHouse = "#.##";

    private static DecimalFormat DecHouseFormat(String format)
    {
        return new DecimalFormat(format);
    }
    /**
     * receive a dynamic array of double values and return your average
     * */
    public static double Avg(double... values)
    {
        return Arrays.stream(values).sum() / values.length;
    }

    /**
     * Multiply by Percentage.
     * @return by default result contains two decimal houses.
     */
    public static double PercentMultiply(double percentage, double value)
    {
        return Double.parseDouble(DecHouseFormat(PairDecimalHouse).format(value * percentage));
    }
}
