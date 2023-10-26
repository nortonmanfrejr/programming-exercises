package Condition;

import Tools.GeneralT;
import Tools.StrT;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06Ex07 {

    /*
    * Esse é considerado da lista de condicional, mas foi feito sem nenhuma condição e sim com Arrays.
    * */
    static Scanner sc = new Scanner(System.in);
    static int Length = 3;
    static int[] Nums = new int[Length];

    public static void main(String[] args)
    {
        for (int i = 0; i < Length; i++)
        {
            GeneralT.Println("Numero: " + (i + 1));
            Nums[i] = sc.nextInt();
        }

        Object Higher = Arrays.stream(Nums).max().getAsInt(); // Ex-6
        Object Minor = Arrays.stream(Nums).min().getAsInt(); // Ex-7

        GeneralT.Println("Maior numero: " + StrT.ToStr(Higher));
        GeneralT.Println("Menor numero: " + StrT.ToStr(Minor));
    }
}
