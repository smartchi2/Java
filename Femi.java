public class ReCreat{

  public static int creat(int[] numbers){
		if(numbers < 2){
		 return 0;
			}
		int[] get = getnumbers.get(numbers);
		int productLessGiven = get[0] * get[1];
		int productGiven = get[get.length -1] * get[get.legth - 2];
		if(productLessGiven < productGiven){
			return productLessGiven;
			}

			return productGiven;
		}

}