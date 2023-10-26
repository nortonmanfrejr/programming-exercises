package Condition;

import Tools.GeneralT;
import Tools.StrT;

import java.time.Period;
import java.util.*;

public class Ex10 {

   // Faça um Programa que pergunte em que turno você estuda.
    //Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
    //Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou , conforme o caso.
    static Scanner sc = new Scanner(System.in);

    static Map<String, String> Periodos = new HashMap<>()
    {{
        put("M","Matutino");
        put("V", "Vespertino");
        put("N","Noturno");
    }};

    public static void main(String[] args)
    {

        GeneralT.Println("Em que periodo você estuda?\nDigite um dos Abaixo.");

        //This HashMap was created just to perform this print
        Periodos.forEach((x,y) -> GeneralT.Println(x + " - " + y));

        String key = sc.next();
        key = key.toUpperCase();

        String msg;
        switch (key)
        {
            case "M" : msg = "Bom Dia!"; break;
            case "V" : msg = "Boa Tarde!"; break;
            case "N" : msg = "Boa Noite!"; break;
            default: msg = "Valor Inválido!"; break;
        }
        GeneralT.Println(msg);
    }
}