import java.util.*;

public class AssDrilling5{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] numbers = {2, 31, 55, 3, 4, 23, 42, 7, 6, 1};

	int[] result = outputArray(numbers);

	System.out.print(result);

	}

	public static int[] outputArray(int[] numbers){
		for(int index = 0; index < numbers.length; index++){
			if(index % 1 == 0){
				System.out.printf("%3d%s", numbers[index], ",");
			}
		} 	
		return numbers;

	} 

