import java.util.*;

 public class AssDrilling10{
	public static void main(String...args){
	int[] numbers = {2, 55, 4, 42, 6};

	
	int maxNumber = numbers[0];

	for(int index = 0; index < numbers.length; index++){
		if(numbers[index] > maxNumber) maxNumber = numbers[index];
		}
		System.out.print("The maximum number is: "+ maxNumber);
	}

}