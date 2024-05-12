import java.util.*;
public class Testing{
	public static void main(String...testing){
	Scanner rand = new Scanner(System.in);
	Random Lucky_numbers = new Random();
	//Lucky_numbers = 0;
	int sum = 0;
	int numbers = (int)(Math.random()*10);

	while(Lucky_numbers != numbers){
		System.out.println("Enter Lucky random numbers: ", + numbers );
		numbers = rand.nextInt(10) +1;
			if(Lucky_numbers == numbers){
			System.out.println("Your entered number is correct");
				}
			if(Lucky_numbers != numbers){
				System.out.println("Keep trying almost there");
				}
			else if(Lucky_numbers < numbers){
				System.out.println("Number entered is too low");
				}
			else if(Lucky_numbers == 0){
			System.out.println("Trying time over"  );
				}
				sum += numbers;
				int total = sum += Lucky_numbers;
				System.out.println(sum);
				System.out.println(total);
		   	}
		}
	}
