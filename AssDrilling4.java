import java.util.*;

public class AssDrilling4{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] numbers = {2, 31, 55, 3, 4, 23, 42, 7, 6, 1};

	int[] result = outputArray(numbers);

	System.out.print(Arrays.toString(result));

	}

	public static int[] outputArray(int[] number){
		int count = 0;
         	int[] numbers = new int[number.length / 2];	
	for(int index = 0; index < number.length; index+=2){
               numbers[count] = number[index];
		count++;
			//if(index % 2 == 0){
		 //System.out.printf("%3d%s", numbers[index], ",");
			//}
	   } 	
	  return numbers;
          } 


}