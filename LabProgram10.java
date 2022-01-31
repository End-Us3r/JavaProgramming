import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice; 
      int lastMonthsPrice;
      int changeInPrice;
      double monthlyMortgage;
      
      currentPrice = scnr.nextInt(); 
      lastMonthsPrice = scnr.nextInt();
      
      changeInPrice = (currentPrice - lastMonthsPrice);
      monthlyMortgage = ((currentPrice * 0.051) / 12);
      
      System.out.print("This house is $" + currentPrice + ".");
      System.out.println(" The change is $" + changeInPrice + " since last month.");
      System.out.println("The estimated monthly mortgage is $" + monthlyMortgage + ".");
   }
}
