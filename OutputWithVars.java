import java.util.Scanner; 

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int userNum2;

      System.out.println("Enter integer:");
      userNum = scnr.nextInt(); 
      int numSquared = (userNum * userNum);
      int numCubed = (numSquared * userNum);

      System.out.println("You entered: " + userNum);
      System.out.println(userNum + " squared is " + numSquared);
      System.out.println("And " + userNum + " cubed is " + numCubed + "!!");
      
      System.out.println("Enter another integer:");
      userNum2 = scnr.nextInt();
      int sum = (userNum + userNum2);
      int product = (userNum * userNum2);
      
      System.out.println(userNum + " + " + userNum2 + " is " + sum);
      System.out.println(userNum + " * " + userNum2 + " is " + product);  
   }
}