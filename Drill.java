import java.util.Scanner;
  
   public class Drill3{
     public static void main(String[] args){
     Scanner drill = new Scanner(System.in);

     int total = 0;
     int numbers = 1;
     while(numbers <= 10){
     System.out.println("Enter 10 numbers: ");
     int numbers1 = drill.nextInt();
    numbers = numbers + 1;
    total = total + numbers1;
     }
    
    
    int average = total / 10;
    
    System.out.printf("Sum is %d%n", + total);
    System.out.printf("The average is %d%n", + average);
   

  }

 }
