package Tools;

import java.util.Arrays;

public class GeneralT {

    /**
     * a function created to reduce the amount of System.out.println spread across the code.
     * */
    public static void Println(String str)
    {
        System.out.println(str);
    }

    /**
     * @return a boolean case exists object on the list.
     * */
    public static boolean Exists(Object anyValue, Object[] anyList)
    {
        return Arrays.asList(anyList).contains(anyValue);
    }
}
