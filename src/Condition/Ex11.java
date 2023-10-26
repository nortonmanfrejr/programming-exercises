package Condition;

import Tools.GeneralT;
import Tools.MathT;

import java.util.*;

public class Ex11 {

    static Scanner sc = new Scanner(System.in);
    static double Salary;

    static String InvalidSalary = "O Salário apresentado é invalido, não pode ser menor que zero!";

    static List<Tax> TaxRange = new ArrayList<>()
    {{
        add(new Tax(0.2,280));
        add(new Tax(0.15,700));
        add(new Tax(0.1,1500));
    }};

    public static void main(String[] args)
    {

        GeneralT.Println("Salario do colaborador?");

        Salary = sc.nextDouble();
        isValidSalary();

        SalaryAdjust Adjust = new SalaryAdjust(Salary);

        Adjust.Tax = TaxRange.stream()
                .filter(x -> Salary <= x.Range)
                .findFirst()
                .map(Tax::getTax)
                .orElse(new Tax(0.05).Tax);

        Adjust.AdjustCalc();
        Adjust.ShowAdjust();
    }

    private static void isValidSalary()
    {
        while(Salary < 0)
        {
            GeneralT.Println(InvalidSalary);
            Salary = sc.nextDouble();
        }
    }
}

class SalaryAdjust{
    public double Tax;
    public double Salary;
    public double AdjustedValue;
    public double SalaryBeforeAdjust;
    public double SalaryAfterAdjust;


    public SalaryAdjust(double Salary){
        this.Salary = Salary;
    }

    public void AdjustCalc()
    {
        SalaryBeforeAdjust = Salary;
        AdjustedValue = MathT.PercentMultiply(Tax, Salary);
        SalaryAfterAdjust = Salary + AdjustedValue;
        Tax *= 100;
    }

    public void ShowAdjust()
    {
        GeneralT.Println("Tax: " + Tax);
        GeneralT.Println("Before Adjust Salary: " + SalaryBeforeAdjust);
        GeneralT.Println("After Adjust Salary: " + SalaryAfterAdjust);
        GeneralT.Println("Adjust Value: " + AdjustedValue);
    }
}

/**
 * Save the tax and range of Adjust
 * */
class Tax {
    public double Tax;
    public double Range;

    public Tax(double Tax, double Range)
    {
        this.Tax = Tax;
        this.Range = Range;
    }

    public Tax(double Tax)
    {
        this.Tax = Tax;
    }

    public double getTax(){
        return Tax;
    }

}