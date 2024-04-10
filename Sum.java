import java.util.Scanner;

public class Sum{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     

      System.out.println("Enter price");
         int price = input.nextInt();

      System.out.println("Enter discount");
         int discount = input.nextInt();

     System.out.println("Enter percentage");
         int percentage = input.nextInt();

     int sum = price + percentage - discount;
     System.out.printf("The total is %d", sum);

    }


 }