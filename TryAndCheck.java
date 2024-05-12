import java.util.Arrays;
public class TryAndCheck{
	public static void main(String...args){
		int[] numbers = {3, 4, 5, 6, 7,8};
		System.out.print(Arrays.toString(numbers));
	}
	public static int[] arrays(int[]numbers){
		int temp = 0;
		for(int index = 0; index < numbers.length - 4; index++){
			temp =numbers[index];
			numbers[index] = numbers[index + 1];
			numbers[index + 1] = numbers[index];
			numbers[index] = temp;
		System.out.print(Arrays.toString(numbers));		
		}
		return numbers;
		
	}
	
}