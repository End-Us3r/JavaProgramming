
package question.pkg3.test;

import java.util.Scanner;

public class Question3Test 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int lowest;
        int highest;
        int average;
        
        System.out.print("Enter the lowest");
        lowest = keyboard.nextInt();
        
        System.out.print("Enter the highest");
        highest = keyboard.nextInt();
        
         average = lowest + highest / 2;
        
         System.out.print("The average is, ");
         System.out.print(average); 
        // TODO code application logic here
    }
    
}
