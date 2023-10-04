package Condition;

import Tools.GeneralT;
import Tools.StrT;

import java.util.Scanner;

public class Ex4 {

    static Scanner sc = new Scanner(System.in);
    static String Word;

    static final String[] Vogal  = {"A","E","I","O","U"};

    public static void main(String[] args)
    {
        GeneralT.Println("Insira uma letra para avaliarmos se ela é uma vogal e/ou consoante!");

        Word = sc.next();

        if (!StrT.ValidString(Word)) GeneralT.Println("Invalid Value!");
        else
        {
            String answer = GeneralT.Exists(Word, Vogal)
                    ? "É UMA VOGAL"
                    : "É UMA CONSOANTE";

            GeneralT.Println(answer);
        }
    }
}
