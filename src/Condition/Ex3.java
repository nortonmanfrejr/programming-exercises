package Condition;

import Tools.GeneralT;

import java.util.Scanner;

public class Ex3 {

    static Scanner sc = new Scanner(System.in);
    static String Woman = "F", Man = "M";

    public static void main(String[] args)
    {
        String Gen;
        String Response;

        GeneralT.Println("Qual o seu genero?");
        Gen = sc.next();

        /**
         * switch (Gen)
         * {
         *     case Woman: Response = "F - Feminino"; break;
         *     case Man: Response = "M = Masculino"; break;
         *     default: Response = "Genero Invalido";
         * }
         * */

        if (!Gen.equals(Woman)  && !Gen.equals(Man)) Response = "Genero Invalido";
        else Response = Gen + " - " + (Gen.equals(Woman)  ? "Feminino" : "Masculino");

        GeneralT.Println(Response);
    }
}
