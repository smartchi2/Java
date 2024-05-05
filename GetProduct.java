public class GetProduct{
	
	public static int getMaximumProduct(int[] numbers){
		if(numbers.length < 2){
			return 0;
			}
		int[] numberSorted = Ascending.arrageinAscendingOrder(numbers);
		int productOfTwoSmallNumbers = numbersSorted[0] * numbersSorted[1];
		int productOfTwoLargestNumbers = numbersSorted[numbersSorted.length - 1] *
 			numbersSorted[numbersSorted.length - 2];
		if(productOfTwoSmallNumbers < productOfTwoLargestNumbers){
			return productOfTwoSmallNumbers;
		        }
	      }
		return productOfTwoLargestNumbers;

}