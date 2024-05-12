import java.util.Arrays;
public class ArraySwap{
	public static void main(String...Arr){
	int[] arr = {1, 2, 3, 4, 5, 6};
	int[] arrays = int new[6];
	for(int index = 0; index < arr.length; -2){
	int[] temp = arr[index];
	arr[index] = arr[index + 1];
	arr[index +1] = temp;
	index+=2;
		}
	System.out.print(Arrays.toString(arr));
	}
}