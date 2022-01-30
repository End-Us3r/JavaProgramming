//James Atkins
//M6A2
//04-17-2021
//Generates the multiplication table 
package m6a2;

/**
 *
 * @author james
 */
public class M6A2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
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

