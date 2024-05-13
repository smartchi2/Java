import java.util.*;

public class ArrayOfNumbers{
	public static void main(String...args){
	int[] numbers = {31, 4, 5, 6, 7, 18, 90, 10};
	//int[] return = calculateMinMaxOf(scores);
	//System.out.println("")
	}
	int minNumber = numbers[0];
	int maxNumber = numbers[0];

       for(int number : numbers){
	if(number > maxNumber) maxNumber = number;
	if(number < minNumber) minNumber = number;
	}
       
System.out.println("The maximum number is: "+ maxNumber + " The minimum number is: "+ minNumber); 

 	}

}