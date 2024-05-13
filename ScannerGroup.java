import java.util.Scanner;

   public class ScannerGroup{
     public static void main(String...args){
     Scanner chiSmart = new Scanner(System.in);

     int count = 0;
     int total = 1;

     while(count < 10){
     System.out.println("Enter number of time you wish to play");
     int userInput = chiSmart.nextInt();
     count++;
     total = total + total;
     }
     userInput = count + total;
     
     
     System.out.print("The total is", + userInput);

   
    }


}