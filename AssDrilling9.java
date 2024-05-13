import java.util.*;

 public class AssDrilling9{
	public static void main(String...args){
		int[] numbers ={83, 77, 55, 59, 91};

		int maxNumber = numbers[0];
		for(int index = 0; index > numbers.length; index++){
		if(numbers[index] > maxNumber) maxNumber = numbers[index];
			}
		System.out.print("The maximum number is: "+ maxNumber);

		}

	}