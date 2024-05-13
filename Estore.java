import java.util.Scanner;
 public class Estore{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    

    System.out.println("Welcome to Smart Buyers Store");
    System.out.println("What is your name?");
    String name = input.nextLine();
  
       
    System.out.print("Please enter number of item purchased: ");
    int numberOfItems = input.nextInt();

    System.out.println(" Enter the discount: ");
    float discount = input.nextFloat();
    
    float total = 0;
    int count = 1;
    while(count <=  numberOfItems){
     System.out.println("Please enter cost of items for item "+count);
     float itemCost = input.nextFloat();
     total += itemCost;
     count++;
     }

    
    double discountedPrice;
    if (total > 200){
	discountedPrice = total - (discount * 0.01 * total);
    }else{
	discountedPrice = total;
    }
    

      System.out.print("Customer Name:" + name);
      System.out.printf("\n The discount amount is:" + discount);
      System.out.printf("\n The of items bought is:" + numberOfItems);
      System.out.printf("\n Total discount sum is $%.0f",  total );
      System.out.println("\n Thanks for your patronage");
      

}
        
} 
 

