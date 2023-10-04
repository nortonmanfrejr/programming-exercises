package Tools;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrT {

    public static Pattern StrPattern = Pattern.compile("[^A-Za-z]");

    /**
     * String matcher with a specified regex [A-Za-Z]
     * */
    private static Matcher StringMatching(String str)
    {
        return StrPattern.matcher(str);
    }

    /**
     * Verify if a string exists a char A-Z
     * */
    public static boolean ValidString(String str)
    {
        return !StringMatching(str).find();
    }

    /**
     * @return String value of any object/type
     * */
    public static String ToStr(Object any)
    {
        return String.valueOf(any);
    }
}
