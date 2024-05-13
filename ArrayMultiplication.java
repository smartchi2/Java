import java.util.*;

public class ArrayMultiplication{
	public static void main(String...args){
		int[] arrayOfNumbers = {6, 9, 1, 2, 3};
		int result = maximum1(arrayOfNumbers);
		System.out.println(result);
 
		}
		public static int[] numbers(int[] arrayOfNumbers){

			int[]arrayMulitplication = new int[arrayOfNumbers.length];

			int[]getin = new int[arrayOfNumbers.length];
				
			  int maximum1 = 0;
			  int maximum2 = 0;
			  //int count = 1;

			for(int index = 0; index < arrayOfNumbers.length; index++){
					int count = 1;
				for(int just = 1; just < arrayOfNumbers.length; just++){
				  if(arrayOfNumbers[index] != arrayOfNumbers[index]){
				       arrayMulitplication[index] = arrayOfNumbers[index] * arrayOfNumbers[just];
					} 
					count++;
				}
			   for(int assign = 0; assign < arrayMulitplication.length; assign++){
				if(arrayMulitplication > maximum1 * arrayOfNumbers){
					maximum1 = arrayMulitplication[index];
					}
					getin[assign] = maximum1;
				}
				
			}
			for(int best = 0; best < getin.length; best++){
					if(getin[best] > maximum2){
					    maximum2 = getin[best];
					}
					return maximum2;
				}
				
		}

	}



