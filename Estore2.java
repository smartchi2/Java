import java.util.Scanner;
 public class Estore2{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to Smart Buyers Store");
    System.out.println("What is your name?");
    String name = input.nextLine();

     System.out.print("Please enter number of item purchased: ");
     int numberOfItems = input.nextInt();
     

     
     for(int count =1; int count <= numberOfItems; count++){
     System.out.print("Please enter cost of items for 1 or -1 to quit: "+count);
     float itemCost = input.nextFloat();
     total += itemCost;
     }

    double discountedPrice;
    if (total > 200){
       discountedPrice = total - (discount * 0.01 * total);
    }else{
        discountedPrice = total;

     }
    
    
   
    System.out.print("Please enter number of item purchased: ");
    int purchased = input.nextInt();
     

      System.out.print("Customer:" + name);
      System.out.printf("\n The discount amount is:" + discount);
      System.out.printf("\n The items bought is:" + numberOfItems);
      System.out.printf("\n Total sum  is  $%.0f",  total );
      System.out.println("\n Thanks for your patronage");
   }   

}
        

 

