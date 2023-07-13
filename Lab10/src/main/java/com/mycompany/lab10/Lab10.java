package com.mycompany.lab10;
import java.util.Scanner;
public class Lab10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Numerator: ");
        int numerator = sc.nextInt();
        System.out.println("Enter The Denominator: ");
        int denominator = sc.nextInt();
        
        try
        {
            int result =(numerator/denominator);
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Devision by zero is not allowed.");
        }
    }
}
