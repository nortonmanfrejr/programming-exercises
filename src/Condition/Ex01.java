package Condition;

import Tools.GeneralT;

import java.util.Scanner;

public class Ex01 {

    static Scanner sc = new Scanner(System.in);
    static int Number, Number2;

    public static void main(String[] args)
    {
        GeneralT.Println("Numero 1:");
        Number = sc.nextInt();

        GeneralT.Println("Numero 2:");
        Number2 = sc.nextInt();

        GeneralT.Println(String.format("%d", Number > Number2 ? Number : Number2));
    }

}
