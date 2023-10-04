package Condition;

import Tools.GeneralT;
import Tools.StrT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex9 {

    static Scanner sc = new Scanner(System.in);
    static int Length = 3;
    static double[] Nums = new double[Length];

    public static void main(String[] args)
    {
        for (int i = 0; i < Length; i++) Nums[i] = sc.nextDouble();

        Nums = Arrays.stream(Nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToDouble(Double::doubleValue)
                .toArray();

        Arrays.stream(Nums).forEach(x -> GeneralT.Println(StrT.ToStr(x)));
    }
}