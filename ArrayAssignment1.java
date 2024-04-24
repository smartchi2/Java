import java.util.Arrays;

public class ArrayAssignment1 {
    public static void main(String[] args) {
	
        int[] arrays = {4,5,8,8,8,2,9};
        int[] result = replaceEvenWithZeros(arrays);
        
		System.out.print(Arrays.toString(result));
    }

    public static int[] replaceEvenWithZeros(int[] arrays) {
        int[] newArrays = new int[arrays.length];
        
	for (int i = 0; i < arrays.length; i++) {
		if(arrays[i] % 2 == 0){
			newArrays[i] = 0;
		}else {
			newArrays[i] = 1;
		}
        }
        return newArrays;
    }
}