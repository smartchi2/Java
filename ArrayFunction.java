public class ArrayFunction{

		public static void main(String...smart){
		System.out.println(ArrayFunctions.add(5,54,3,10,6,44,13,47,11,9));
		

 	public static int add(int firstNumber, int secondNumber){

			return firstNumber + secondNumber;
		       }

		public static int add(int firstNumber, int secondNumber, int thirdNumber){
				return add(add( firstNumber, secondNumber), thirdNumber);

			}

		public static int add(int length, int...numbers){
		int total = 0;
		for(int i = 0; 1 < length; i++){
			total += number;
				}
				return total;

			}
	}