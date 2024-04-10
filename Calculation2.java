import java.util.Scanner;

  public class Calculation2{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     

    System.out.println("Enter price");
    int price = input.nextInt();
 
    int sum = price - 0.1 * price;
   System.out.printf("Smu is %d%n", sum);



   }

}