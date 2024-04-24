import java.util.*;

public class Test3{

		public static void main(String...args){
		Scanner square = new Scanner(System.in);

		int max = 0;
		int min = 0;

		System.out.print("Enter number 1:");
		int number1 = square.nextInt();
              
                System.out.print("Enter number 1:");
		int number2 = square.nextInt();
		
		System.out.print("Enter number 1:");
		int number3 = square.nextInt();

		

		System.out.println(number1 + number2 + number3);
		System.out.println(number2 * number2 * number3);
		System.out.println(number3 - number2 - number3);
		System.out.printf("%.2f%n",(double)(number1 + number2 + number3) / 2 );
		System.out.printf("%d%n", Math.abs(number1 - number2 - number3));
		//System.out.printf("%d%n", Math.max(number1, number2, number3));
		//System.out.printf("%d%n", Math.min(number1, number2, number3));
		}

	}

