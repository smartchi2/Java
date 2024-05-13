import java.util.Scanner;

public class Factor{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number");
       int counter = input.nextInt();
      
       int factor = 0;
       counter = 1;

       while(counter < factor){
         if(factor  % counter == 0) { 
            counter = counter +1;
           }
           System.out.println(factor);       
         }
     

     factor++;
  }
 }

