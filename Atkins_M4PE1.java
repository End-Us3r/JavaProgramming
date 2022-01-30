//James Atkins
//M4PE1
//02-25-2021
//This program calculates acreage

package atkins_m4pe1;

import java.util.Scanner;

public class Atkins_M4PE1 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int tractSize;
        int acres;
        
        final int SQ_FEET_PER_ARCE = 43560;
        
        System.out.println("Enter the number of square feet in the tract.");
        tractSize = keyboard.nextInt();
        
        acres = tractSize / SQ_FEET_PER_ARCE;
        
        System.out.println("The size of that tract is " + acres + " acres.");
    }
    
}
