
package javaapplication24;
import java.util.Scanner;

public class JavaApplication24 {
    

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        int number, sum, total;
        int sets, numbers;
        
        final int MAX_SETS = 5;
        final int MAX_NUMBERS = 2;
        
        sum = 0;
        total = 0;
        
        for (sets = 1; sets <= MAX_NUMBERS;) {
            for (numbers = 1; numbers <= MAX_SETS;) {
                System.out.print("Enter number " + numbers + " of set " 
                        + sets + ".");
                number = keyboard.nextInt();
                sum = sum + number;
            }
            System.out.print("The sum of set " + sets + " is " + sum + ".");
            total = total + sum;
            sum = 0; 
        }       
        
        System.out.print("The total of all the sets is " + total + ".");
       
  }
}