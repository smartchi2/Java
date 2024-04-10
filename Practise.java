import java.util.Scanner;

public class Practise{
    public static void main(String[] args){
    Scanner practise = new Scanner(System.in);
    

    int number1 = practise.nextInt();
    

    //int count1 = number1 - number2;
    

   
      

   // }else if(number2 > number1){
       //System.out.print(count2);
  
   
   int count = 1;
   int factor = 0;
   while(count <= number1){
     count++; 
      
     if(number1 % count == 0){
       factor++;  
      
   if(factor == 2){
      System.out.print("It is a prime number");
     
     else{
         System.out.print("It is not a prime number");
         }

    }
