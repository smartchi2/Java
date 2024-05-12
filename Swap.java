import java.util.Arrays;
public class Swap{
	public static void main(String...add){
	int[] numbers = {10, 8, 6, 11, 7, 4};
	
	
	for(int index = 0; index < numbers.length;){
	          int tamp = numbers[index];
                               numbers[index] = numbers[index + 1];
                              numbers[index  + 1] = tamp;
	         index++;
	}
                       System.out.print(Arrays.toString(numbers));
}
}