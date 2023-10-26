package Condition;

import Tools.GeneralT;
import Tools.MathT;

import java.util.Scanner;

public class Ex05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        GeneralT.Println("N1:");
        double N1 = sc.nextDouble();

        GeneralT.Println("N2:");
        double N2 = sc.nextDouble();

        // save average of values in a local scope var
        double average = MathT.Avg(N1,N2);

        String msg = average == 10
                ? "Aprovado com distinção"
                : average >= 7 ? "Aprovado"
                : "Reprovado";

        GeneralT.Println(msg);
    }
}
