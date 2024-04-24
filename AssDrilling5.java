import java.util.*;

public class AssDrilling5{
	public static void main(String... args){
	int[] numbers = {83, 33, 77, 11, 55, 19, 59, 27, 91, 1};

	int[] result = outputArray(numbers);

	System.out.print(Arrays.toString(result));

	}

	public static int[] outputArray(int[] number){
		int count = 0;
		int[] numbers = new int[number.length / 2];
		for(int index = 0; index < number.length; index+=2){
			numbers[count] = number[index];
			count++;
			 //}
		} 	
		return numbers;
		} 

}