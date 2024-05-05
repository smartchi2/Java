import java.util.*;
public class WhoKnows{
	public static void main(String...args){
	int[] numbers = {11, 45, 60, 17, 5};
	}
	int minNumber =  numbers[0];
	int maxNumber = numbers[0];
	int index = 0;
for(int index = 0; index < numbers.length; index++){
	if(index > maxNumber) maxNumber = index;
	if(index < minNumber) minNumber = index;

		}
System.out.println("The max number is: " +  maxNumber +"The min number is: " + minNumber);
	}
}