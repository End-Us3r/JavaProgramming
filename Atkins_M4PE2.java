//James Atkins
//M4PE2
//02-25-2021
//This program calculates the tip, tax, and total for a dine-in
package atkins_m4pe2;

import java.util.Scanner;

public class Atkins_M4PE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double food;
        double tip;
        double tax;
        double total;
        
        final double TAX_RATE = 0.07;
        final double TIP_RATE = 0.15;
        
        
        System.out.print("Enter the charge for the food. $");
        food = keyboard.nextDouble();
        
        //Calculates tip
        tip = food * TIP_RATE;
        
        //Calculates tax
        tax = food * TAX_RATE;
        
        //Calculates total
        total = food + tip + tax;
        
        System.out.println("Tip: $" + tip);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
   
    }
    
}
