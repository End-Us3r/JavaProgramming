package atkinslastexam;

import java.util.Scanner;

public class AtkinsLastExam {

    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        displayInfo();
        double payRate = getRate();
        double hoursWorked = getHours();
        double grossPay = calculateGrossPay(payRate, hoursWorked);
        displayRHGrossPay(payRate,hoursWorked,grossPay);
    }
    
    
    public static String displayInfo() {
        String name, date, description;
        name = "James Atkins";
        date = "05/09/2021";
        description = "This program calculates the gross pay"
                + " for an individual by using different methods.";
        System.out.println(name);
        System.out.println(date);
        System.out.println(description);
        
           return null;
    }
    
    public static double getRate() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your hourly pay rate: ");
        double payRate = userInput.nextDouble();
        
        return payRate;
    }
    
    public static double getHours() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your total amount of hours worked: ");
        double getHours = userInput.nextDouble();
        
        return(getHours);
    }
    
    public static double calculateGrossPay(double payRate,double hoursWorked) {
        double grossPay = payRate * hoursWorked;
        return grossPay;
    }
    
    public static void displayRHGrossPay(double payRate,double
            hoursWorked,double grossPay) {
        System.out.println("The pay rate is $" + payRate);
        System.out.println("The hours worked are " + hoursWorked);
        System.out.println("The gross pay is $" + grossPay);     
    }
    
}
