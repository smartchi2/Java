public class Largest{
  public static void main(String[] args){
	int[] array = {2, 5, 1, 73, 44, 22};
	System.out.println(maximum(array));
 }

   public static int maximum(int[] array){
     int maximum = 0;
     for(int count =0; count < array.length; count++){
       if (array[count] > maximum) maximum = array[count];

	}
	return maximum;
   }

}