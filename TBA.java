//James Atkins
//HandsOnTest #3
//4-14-2021
//Provides a multiplcation table
package handsontest_atkins;


public class TBA {

    
    public static void main(String[] args) {
        
        //Declare variables
        int num1 = 1;
        int num2 = 0;
        int product;
        
        //Generate multiplication table 
        while (num1 <= 12) {
            while (num2 <= 12) {
            product = num1 * num2;
           System.out.println(num1 + " * " + num2 + " = " + product);
           num2 = num2 + 1;
            }
            num1 = num1 + 1;
            num2 = 0;
        }
        
    }
    
}
