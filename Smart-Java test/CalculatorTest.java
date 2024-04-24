public class CalculatorTest{

	public void testThatCalculateCanAddTwoPositiveNumbers(){
		int sum = CalculatorTest1.add(4,4);
		int expectedSum = 8;
		//assertion

		if(sum != expectedSum){
			System.err.printf("Test failed\nExpected:  %d\n actual: %d", expectedSum, sum);
		}else{
				System.out.println("Test passed, yey:)");
		}
	        }
		public static void main(String...args){
			CalculatorTest calculatorTest = new CalculatorTest();
		    calculatorTest.testThatCalculateCanAddTwoPositiveNumbers();
	}
}