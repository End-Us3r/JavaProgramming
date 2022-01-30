//M3CW1
//James Atkins
//CSC-151-0902
//02-10-2021
package get.input;
    import java.util.Scanner;

public class GetInput
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        double payRate;
        int hours;
        
        System.out.print("Enter your name: ");
        name = keyboard.nextLine();
        
        System.out.print("Enter your hourly pay rate: ");
        payRate = keyboard.nextDouble();
        
        System.out.print("Enter the numbers of hours worked: ");
        hours = keyboard.nextInt();
        
        System.out.println("Here are the values that you entered: ");
        System.out.println(name);
        System.out.println(payRate);
        System.out.println(hours);
        
    }
    
}
