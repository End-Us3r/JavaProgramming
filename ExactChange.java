import java.util.Scanner; 
//Exact change program, filled with numerous nested else-if statements and switch statements
//FIX ME: Overly Complicated, can be done with simpler code
public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int change = scnr.nextInt();
      
      int valueDollars  = 100;
      int valueQuarters = 25;
      int valueDimes    = 10;
      int valueNickels  = 5;
      int valuePennies  = 1;
      
      if (change == 0) {
         System.out.println("No change");
         }
         
      if (change >= valueQuarters && change < valueQuarters * 2) {
         System.out.println("1 Quarter");
         change = change % valueQuarters;
         if (change >= valueDimes && change < valueDimes * 2) {
            System.out.println("1 Dime");
            change = change % valueDimes;
            }
            else if (change == valueDimes * 2) {
               System.out.println("2 Dimes");
               }
         }
         else if (change >= valueQuarters * 2 && change < valueQuarters * 3) {
            System.out.println("2 Quarters");
            }
            else if (change >= valueQuarters * 3 && change < valueQuarters * 4) {
               System.out.println("3 Quarters");
               }
               
      if (change >= valueDollars && change < valueDollars * 2) {
         System.out.println("1 Dollar");
         change = change % valueDollars;
         if (change >= valueQuarters && change < valueQuarters * 2) {
            System.out.println("1 Quarter");
            change = change % valueQuarters;
            if (change >= valueDimes && change < valueDimes * 2) {
               System.out.println("1 Dime");
               change = change % valueDimes;
               if (change >= valueNickels && change < valueNickels * 2) {
                  System.out.println("1 Nickel");
                  change = change % valueNickels;
                  }
                  if (change >= valuePennies && change < valuePennies * 4) {
                     switch (change) {
                        case 1:
                           System.out.println("1 Penny");
                           break;
                           
                        case 2:
                           System.out.println("2 Pennies");
                           break;
                           
                        case 3:
                           System.out.println("3 Pennies");
                           break;
                        
                        case 4:
                           System.out.println("4 Pennies");
                           break;
                           
                        default:
                           break;
                        }
                     }
               }
               else if (change >= valueDimes * 2 && change < valueDimes * 3) {
                  System.out.println("2 Dimes");
                  change = change % valueDimes;
                  }
            }
            else if (change >= valueQuarters * 2 && change < valueQuarters * 3) {
               System.out.println("2 Quarters");
               change = change % valueQuarters;
               if (change >= valueDimes && change < valueDimes * 2) {
                  System.out.println("1 Dime");
                  change = change % valueDimes;
                  }
                  else if (change >= valueDimes * 2 && change < valueQuarters) {
                     System.out.println("2 Dimes");
                     change = change % valuePennies;
                     if (change >= valuePennies && change < valueNickels) {
                        switch (change) {
                           case 1:
                              System.out.println("1 Penny");
                              break;
                              
                           case 2:
                              System.out.println("2 Pennies");
                              break;
                              
                           case 3: 
                              System.out.println("3 Pennies");
                              break;
                              
                           case 4:
                              System.out.println("4 Pennies");
                              break;
                              
                           default:
                              break;
                           }
                        }
                     }
                     else if (change >= valueNickels && change < valueNickels * 2) {
                        System.out.println("1 Nickel");
                        change = change % valueNickels;
                        if (change >= valuePennies && change < valueNickels) {
                           switch (change) {
                              case 1:
                                 System.out.println("1 Penny");
                                 break;
                                 
                              case 2:
                                 System.out.println("2 Pennies");
                                 break;
                                 
                              case 3:
                                 System.out.println("3 Pennies");
                                 break;
                                 
                              case 4: 
                                 System.out.println("4 Pennies");
                                 break;
                                 
                              default:
                                 break;
                              }
                           }
                        }
               }
               if (change >= valueDimes && change < valueDimes * 2) {
                  System.out.println("1 Dime");
                  change = change % valueDimes;
                  if (change >= valueNickels && change < valueNickels * 2) {
                     System.out.println("1 Nickel");
                     change = change % valueNickels;
                     }
                     if (change >= valuePennies && change < valuePennies * 4) {
                        switch (change) {
                           case 1:
                              System.out.println("1 Penny");
                              break;
                              
                           case 2:
                              System.out.println("2 Pennies");
                              break;
                              
                           case 3:
                              System.out.println("3 Pennies");
                              break;
                              
                           case 4:
                              System.out.println("4 Pennies");
                              break;
                              
                           default:
                              break;
                           }
                        }
                  }
                  else if (change >= valueDimes * 2 && change < valueDimes * 3) {
                     System.out.println("2 Dimes");
                     change = change % valueDimes;
                     }
      }
      if (change == valueDollars * 2) {
            System.out.println("2 Dollars");
            change = change % valueDollars;
         }
      if (change == valueDollars * 3) {
               System.out.println("3 Dollars");
               change = change % valueDollars;
         }
      
   }
}