//James Atkins
//M5HW2
//03-25-2021
//This program converts a users input into seconds, minutes, hours, and days
package m5hw2;

import java.util.Scanner; 

public class M5HW2 {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        //Declare variables
        //Convert variables
        //Ask user for input
        //Use if-else statements on input
        int oneSecond = 1;
        int oneMinute = 60 * oneSecond;
        int oneHour = 60 * oneMinute;
        int oneDay = oneHour * 24;
        
        int userInput;
        
        System.out.print("Enter an amount of seconds: ");
        userInput = keyboard.nextInt();
            
            if (userInput < oneMinute) 
                    System.out.println("You have entered " 
                                + userInput + " second(s).");
            
            else if (userInput >= oneMinute && userInput < oneHour)
                System.out.print(userInput + " seconds is "
                                + userInput / oneMinute + " minute(s) and " 
                        + userInput % oneMinute + " second(s).");
            
            else if (userInput == oneHour) 
                System.out.print(userInput + " seconds is "
                            + userInput / oneHour + " hour.");
            
            else if (userInput < oneDay) 
                System.out.print(userInput + " seconds is " 
                                 + userInput / oneHour + " hour(s) and " 
                        + userInput / oneMinute % oneMinute + " minute(s) and "
                                + userInput % oneMinute + " second(s)."); 
            
            else if (userInput == oneDay)
                    System.out.print(userInput + " seconds is " 
                            + userInput / oneDay + " day.");
                        
            else if (userInput > oneDay)
                    System.out.print(userInput + " seconds is " 
                            + userInput / oneDay + " day(s)."); 
                            
        
    }
    
}
