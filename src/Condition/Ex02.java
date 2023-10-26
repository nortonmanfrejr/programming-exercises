package Condition;

import Tools.GeneralT;

import java.util.Scanner;

public class Ex02 {

    static Scanner sc = new Scanner(System.in);
    static int Number;

    public static void main(String[] args)
    {
        GeneralT.Println("Numero: ");
        Number = sc.nextInt();
        GeneralT.Println(String.format(Number < 0 ? "Negativo" : "Positivo"));
    }
}
