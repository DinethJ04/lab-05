package com.mycompany.arrayaccessprogram;
public class ArrayAccessProgram 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1,2,3,4,5};
        
        try
        {
            int index = 4;
            int value = numbers[index];
            System.out.println("Value at index "+index+":"+value);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index. Index is Out of Bounds");
        }
    }
}
