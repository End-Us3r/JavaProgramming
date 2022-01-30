//James Atkins
//M4PE3
//03-4-2021
//This program uses modules/methods to execute programs M4PE1 and M4PE2
package m4pe3;

import java.util.Scanner;

public class M4PE3 {

    
    public static void main(String[] args) 
    {
        //Calling M4PE1 Method which calculates acreage.
        M4PE1();
        
        //Calling M4PE2 Method which calculates tip, tax, and total.
        M4PE2();
    }
    
    public static void M4PE1()
    {
        Scanner keyboard = new Scanner(System.in);
        int tractSize;
        int acres;
        
        final int SQ_FEET_PER_ACRE = 43560;
        
        System.out.println("Enter the number of square feet in the tract.");
        tractSize = keyboard.nextInt();
        
        acres = tractSize / SQ_FEET_PER_ACRE;
        
        System.out.println("The size of that tract is " + acres + " acres.");
    }
    
    public static void M4PE2()
    {
        Scanner keyboard = new Scanner(System.in);
        double food;
        double tip;
        double tax;
        double total;
        
        final double TAX_RATE = 0.07;
        final double TIP_RATE = 0.15;
        
        System.out.print("Enter the charge for the food. $");
        food = keyboard.nextDouble();
        
        tip = food * TIP_RATE;
        tax = food * TAX_RATE;
        total = food + tip + tax;
        
            System.out.println(
            String.format("Tip: $%.2f", tip));
            System.out.println(
            String.format("Tax: $%.2f", tax));
            System.out.println(
            String.format("Total: $%.2f", total));
        
    }
}
