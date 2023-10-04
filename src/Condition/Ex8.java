package Condition;

import Tools.GeneralT;
import Tools.StrT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex8 {

    static Scanner sc = new Scanner(System.in);
    static int Length = 3;
    static Produto[] Products = new Produto[Length];

    public static void main(String[] args)
    {
        for (int i = 0; i < Length; i++)
        {
            Produto product = new Produto();

            product.ID = i + 1;

            GeneralT.Println("Nome Produto " + (i + 1));
            product.NOM_PRODUTO = sc.next();

            GeneralT.Println("Nome Produto " + (i + 1));
            product.VAL_PRODUTO = sc.nextFloat();

            Products[i] = product;
        }

        Produto MinorValProduct = Arrays
                .stream(Products)
                .min(Comparator.comparingDouble(x -> x.VAL_PRODUTO))
                .orElse(null)
                ;

        if (MinorValProduct != null)
        {
            String Name = MinorValProduct.NOM_PRODUTO;
            float Value = MinorValProduct.VAL_PRODUTO;

            String formattedString = String.format("%s com o valor de R$ %f", Name, Value);
            GeneralT.Println(formattedString);
        }
    }
}

class Produto {

    protected int ID;
    protected String NOM_PRODUTO;
    protected float VAL_PRODUTO;

}