
import java.util.Scanner;
 public class Mortgage{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  

   System.out.println("Enter loan amount: ");
   double loanAmount = input.nextDouble();

   System.out.println("Enter annual interest rate: ");
   double rate = input.nextDouble();
	rate = rate /100;

   System.out.println("Enter duration in Years: ");
   double year = input.nextInt();
	year = year *12;
	
	
 
	double numerator = Math.pow(rate*(1+rate),year);						
	double denominator = Math.pow(1+rate, year) -1;
		

		
	double mortgage = loanAmount * numerator / denominator;

		

		System.out.print(mortgage);
	

    

    



}

}