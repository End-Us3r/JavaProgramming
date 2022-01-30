//James Atkins
//M5CW1
//03-20-2021
//This program will demo decision structures 
package m5cw1_atkins;
    import java.util.Scanner;


public class Decision_Structures 
{

    
    public static void main(String[] args) 
    {
        determineLoanStatus();
        compareNames();
    }
    
    public static void determineLoanStatus() 
    {
        Scanner keyboard = new Scanner(System.in);
        
        double salary, yearsOnJob;
        
        System.out.print("Enter your annual salary: ");
        salary = keyboard.nextDouble();
        
        System.out.print("Enter the number of years on your " + 
                         "current job: ");
        yearsOnJob = keyboard.nextDouble();
        
        if (salary >= 30000)
        {
            if (yearsOnJob >= 2)
            {
                System.out.println("You qualify for the loan.");
            }
            else 
            {
                System.out.println("You must have been on your current");
                System.out.println("job for at least two years to qualify.");
            }
        }
        else 
        {
            System.out.println("You must earn at least $30,000");
            System.out.println("per year to qualify.");
        }
    }
    
    public static void compareNames() 
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name1;
        String name2;
        
        System.out.print("Enter a name (last name first): ");
        name1 = keyboard.nextLine();
        System.out.print("Enter another name (last name first): ");
        name2 = keyboard.nextLine();
        System.out.println("Here are the names, listed alphabetically: ");
        if (name1.compareTo(name2) < 0)
        {
            System.out.println(name1);
            System.out.println(name2);
        }
        else
        {
            System.out.println(name2);
            System.out.println(name1);
        }         
    }
}
