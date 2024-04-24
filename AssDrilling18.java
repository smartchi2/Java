import java.util.*;

public class AssDrilling18{
	public static void main(String... arg){
	int[] numbers = {2, 55, 4, 42, 6};
	
	int minNumber = numbers[0];
	for(int index = 0; index < numbers.length; index++){
	 if(numbers[index] < minNumber) minNumber = numbers[index];
		}
	System.out.print("The minimum number is: "+ minNumber);
		
	} 
}