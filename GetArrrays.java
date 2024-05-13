import java.util.*;
public class GetArrrays{
	public static void main(String...smart){
	 int[] getNumber = {2,9,3,1,6,};
	 int[] result = GetArrrays.arrayNumber(getNumber);
	 System.out.println(Arrays.toString(result));
	 
		
	
		}

	public static int[] arrayNumber(int[] getNumbers){
		for(int index = 0; index < getNumbers.length; index++){
		for(int get = 0; get < getNumbers.length; get++){
			if(getNumbers[index] < getNumbers[get]){
		 getNumbers[index] = getNumbers[get] + getNumbers[index];
		 getNumbers[get] = getNumbers[index] - getNumbers[get];
		 getNumbers[index] =   getNumbers[index] - getNumbers[get];
		 //getNumbers[index] = getNumbers[index] - getNumbers[get];	
			}
		
	      }
     } 
  return getNumbers;  		
}		

}