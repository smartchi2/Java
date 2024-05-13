import java.util.Scanner;
   public class Prompt{
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
    
       
      
       int count = 0;
       int positive = 0, negative = 0, zero = 0;

       
      System.out.println("Enter  any number (enter -1 to end):  ");
      int numbers = input.nextInt();
       
      while(numbers != -1){
	

      if(numbers %2 == 0){
        positive+=1;
          
 
       }else if(numbers %2 != 0){
         negative++; 
       
       
       }else{
        zero++;
       }
  System.out.println("Enter  any number (enter -1 to end):  ");
      numbers = input.nextInt();
}

 System.out.println("positive numbers are:" + positive);
 System.out.println("negative numbers are:" + negative);
 System.out.println("zero numbers are:" + zero);
       
}
  
}


