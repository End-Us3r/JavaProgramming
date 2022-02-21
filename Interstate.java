import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      
      highwayNumber = scnr.nextInt();
      
      if ((highwayNumber % 2 == 0) && (highwayNumber % 100 != 00)) {
         if (highwayNumber > 0 && highwayNumber < 100) {
            System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            }
            else if (highwayNumber >= 100 && highwayNumber <= 999) {
               System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + (highwayNumber % 100) + ", going east/west.");
               }
         }  
         else if ((highwayNumber % 2 != 0) && (highwayNumber % 100 != 00)) {
            if (highwayNumber > 0 && highwayNumber < 100) {
               System.out.println("I-" + highwayNumber + " is primary, going north/south.");
               }
               else if (highwayNumber >= 100 && highwayNumber <= 999) {
                  System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + (highwayNumber % 100) + ", going north/south.");
                  }
            }
            else if ((highwayNumber <= 0) || (highwayNumber >= 1000)) {
               System.out.println(highwayNumber + " is not a valid interstate highway number.");
               }
               else if (highwayNumber % 100 == 00) {
                  System.out.println(highwayNumber + " is not a valid interstate highway number.");
                  }
   }
}
