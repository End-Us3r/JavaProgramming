//James Atkins 
//M7A1
//04-29-2021
/*This program calculates number grades and 
returns letter grades and test averages*/

package m7a1;


import java.util.Scanner;


public class M7A1 {
    
    /**
     *
     * @param args
     
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double grade;
   
        double total = 0;
       
        double number;
        
        System.out.println("Please enter up to five test scores. ");
        System.out.print("Test #1 score: ");
        grade = keyboard.nextDouble();
        System.out.print(grade + " is a ");
        System.out.println(letterGrade(grade));
        total = total + grade;
        
        System.out.print("Test #2 score: ");
        grade = keyboard.nextDouble();
        System.out.print(grade + " is a ");
        System.out.println(letterGrade(grade));
        total = total + grade;
        
        System.out.print("Test #3 score: ");
        grade = keyboard.nextDouble();
        System.out.print(grade + " is a ");
        System.out.println(letterGrade(grade));
        total = total + grade;
        
        System.out.print("Test #4 score: ");
        grade = keyboard.nextDouble();
        System.out.print(grade + " is a ");
        System.out.println(letterGrade(grade));
        total = total + grade;
        
        System.out.print("Test #5 score: ");
        grade = keyboard.nextDouble();
        System.out.print(grade + " is a ");
        System.out.println(letterGrade(grade));
        total = total + grade;
        
        System.out.print("Your test average is ");
        calcAverage(total);
        System.out.print(calcAverage(total));
  
    }
  
    public static String letterGrade(double grade){
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String f = "F";
            if (grade >= 90 && grade <= 100){
                return a;
            }else if (grade >= 80 && grade <= 89){
                return b;
            }else if (grade >= 70 && grade <= 79){
                return c;
            }else if (grade >= 60 && grade <= 69){
                return d;
            }else if (grade <= 60){
                return f;
            }else
        return null;
                     
    }
    
    public static double calcAverage(double total){
        
        double averageTest = total / 5;
        return averageTest;
        }
        
        
}
    
 
            

    

