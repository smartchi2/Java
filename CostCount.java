import java.util.Scanner;
 public class CostCount{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to Smart Buyers Store");
    System.out.println("What is your name?");
    String name = input.nextLine();

    System.out.println(" Enter the discount: ");
    float discount = input.nextFloat();
    discount = discount / 100;
  
       double discount_amount = 5;
       double discount1 = 5;
       double total = 5;

      
       int items1 = 0;
       while(items1 !=-1){

     System.out.print("Please enter cost of items for 1 or -1 to quit: ");
     items1 = input.nextInt();
     items1 = items1 ++;
     }
     System.out.println("Enter the total cost : ");
     double cost = input.nextDouble();

    System.out.print("Please enter number of item purchased: ");
    int purchased = input.nextInt();
     

    if (cost > 0  && discount > 5)
    if(discount > 5 && discount >= 19){
      discount1 = 5/100;
        }
     else if(discount > 10 && discount >=49){
      discount1 = 5/100;
        }   
     else if(discount > 10 && discount >=99){
       discount1 = 5/100;
        }
     else if(discount < 100){
      discount1 = 5/100;
        }
       else {
     System.out.println( " please enter valid input ");
       }
       double total1 = cost - discount;
       discount_amount = total1 * discount1; 
       total1 = total1 - discount1;

      System.out.print(name);
      System.out.printf("\n The discount amount is:" + discount1);
      System.out.printf("\n The cost for the items is:" + cost);
      System.out.printf("\n Total sum  is  $%.2f",  total1 );
   }   

}
        

 

