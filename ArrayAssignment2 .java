import java.util.Arrays;

public class ArrayAssignment2 {
    public static void main(String[] args) {
	
        int[] arrays = {4,5,8};
        int[] result = replaceEvenWithZeros(arrays);
        
		System.out.print(Arrays.toString(result));
    }

    public static int[] replaceEvenWithZeros(int[] arrays) {
        int[] newArrays = new int[arrays.length];
	int[] output = new int[6];
	int sum = 0;
	int count = 0;
	for (int i = 0; i < arrays.length; i++) {
		
		sum = arrays[i] + arrays[i];
		newArrays[i] = sum;
		}
		for (int i = 0; i < arrays.length; i++) {
		output[i] = arrays[i];
		}
		for (int j = 4; j < output.length; j++) {
		output[j] = arrays[count];
		count++;
		}
        return output;
    }
}