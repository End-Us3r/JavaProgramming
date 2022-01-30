//James Atkins
//M6A1
//4-14-2021
/* This program calculates a users budget and expenses 
to determine if they are under, over, or have met, their budget */
package m6a1;

import java.util.Scanner;

public class BudgetAnalysis 
{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        
        while(keep_going.equalsIgnoreCase("yes"))
        {
           budgetAnalysis();
           System.out.print("Do you want to run the program again? Enter"
                   + " yes or no: ");
           keep_going = in.nextLine();
        }
        System.out.println("The program has been terminated!");
    }
    
    public static void budgetAnalysis()
    {
        Scanner in = new Scanner(System.in);
        
        //Declare variables
        double budgetThisMonth;
        double expensesThisMonth;
        double anotherExpense;
        double number = 0;
        double total;
        
        //Ask user for budget and expenses for the month
        System.out.print("What is your budget for this month? ");
        budgetThisMonth = in.nextInt();
        
        System.out.print("Please enter an expense: ");
        expensesThisMonth = in.nextInt();
        total = expensesThisMonth + number;
        
        System.out.println("Current expenses: " + total);
        
        //Calculate running total using loop
        do
        { System.out.println("Please enter another expense."
                + " If none, put 0.");
            anotherExpense = in.nextInt();
            total = anotherExpense + total;
            System.out.println("Current expenses: " + total);
        } while (anotherExpense != 0);
          
        if (total > budgetThisMonth)
        {
            System.out.println("You are over your budget"
                    + " by " + (total - budgetThisMonth));   
        }
        
        else if (total < budgetThisMonth)
        {
            System.out.println("You are under your budget"
                    + " by " + (budgetThisMonth - total));
        }
        
        else if (total == budgetThisMonth)
        {
            System.out.println("You have met your budget.");
        }  
    }
}