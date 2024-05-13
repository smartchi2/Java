import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	@Test
	public void testThatCalculateCanAddTwoPositiveNumber(){
		int sum = Calculator.add(4, 4);
		int expectedSum = 8;
		//assertion
		assertEquals(expectedSum, sum);

	      }
		
	@Test
	public void testThatCalculateCanSubtractTwoPositiveNumbers(){
		int difference = Calculator.subtract(4, 2);
		int expectedDifference = 2;
		//assertion
		assertEquals(expectedDifference, difference);
		}
	@Test
	public void testThatCalculateCanSubtractTwoNegativeNumbers(){
		int subtracts = Calculator.subtraction(-4, -2);
		int expectedsubtracts = -2;
		//assertion
		assertEquals(expectedsubtracts, subtracts);
		}
	
	@Test
	public void testThatCalculateCanMultipleTwoPositiveNumbers(){
		int count ++;
		for(int index = 0;
		int multiple = Calculator.multiple(2, 2);
		int expectedmultiple = ;
		//assertion
		assertEquals(expectedmultiple, multiple);
		}
	
	
}