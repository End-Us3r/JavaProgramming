//James Atkins
//M5HW1
//03-24-2021
/*This program asks for input for a date and uses if-else statements
to determine if the date is "magic"
*/

package m5hw1;


import java.util.Scanner;

public class M5HW1 {

    
    public static void main(String[] args) 
    { 
        Scanner keyboard = new Scanner(System.in);
        
        //Declare variables
        int day, month, year, magicDate;
        String date;
        
        //Ask user for input
        System.out.print("Please enter a month in numeric form: ");
        month = keyboard.nextInt();
        System.out.print("Please enter a day in numeric form: ");
        day = keyboard.nextInt();
        System.out.print("Please enter a year "
                + "(last two digits) in numeric form: ");
        year = keyboard.nextInt();
        
        //Calculate date and magicDate
        date = (month + "/" + day + "/" + year);
        magicDate = (month * day);
        
        //Write if-else statements
            if ((year == magicDate)) 
                System.out.print("You have entered a magic "
                        + "date: " + date);
            else {
                System.out.print("The date " + date + " you have "
                        + "entered is not magic.");           
            }     
    }
    
}
