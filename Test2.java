import java.util.*;

public class Test2{
	public static void main(String...args){
		Scanner test2 = new Scanner(System.in);
	
		System.out.print("Enter first integer: ");
		int first = test2.nextInt();

		System.out.print("Enter second integer: ");
		int second = test2.nextInt();

		System.out.print("Enter third integer: ");
		int third = test2.nextInt();

		int sum = first * second * third;
		System.out.print(sum);
		}
	}

