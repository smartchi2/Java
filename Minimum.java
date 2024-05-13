public class Minimum{
  public static void main(String[] args){
	int[] array = {2, 5, 1, 73, 44, 22};
	System.out.println(minimum(array));
 }

   public static int minimum(int[] array){
     int minimum = 0;
     for(int count =0; count < array.length; count++){
       if (array[count] < minimum) minimum = array[count];

	}
	return minimum;
   }

}