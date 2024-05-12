import java.util.Scanner;
public class Modula{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);

	int numbers = 0;
	int sum = 0;
	int odd = 0;
	int even = 0;
	for(int count; count < 5; count++){
	System.out.println("Enter an Integer: ");
	numbers = input.nextInt();
	if(numbers %2 == 1){
		System.out.println("odd number entered\t" + numbers);
		}
	if(numbers %2 == 0){
		System.out.println("Even number entered\t" + numbers);
		sum += numbers;
		odd += numbers %2;
		even += numbers %2;
		}
		
	}
	System.out.println("sum total of entered numbers is\t" + sum );
	System.out.println("odd  numbers is\t" + count );
	System.out.println("even  numbers is\t" + count );
      }
}