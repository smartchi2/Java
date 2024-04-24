import java.util.*;

public class Return{
	public static void main(String...args){
	int[] git = {2, 3, 5, 6, 7};
	int[] result = showArray(git);

	System.out.print(Arrays.toString(result));

	}

	public static int[] showArray(int[] gits){
          int index = 0;
          int[] git = new int[gits.length / 1];
  	   for(int index1 = 0; index1 < gits.length; index1+=1){
		git[index1] = gits[index1];
		index++;

	 }
	return git;
	}

}