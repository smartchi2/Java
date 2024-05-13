import java.util.*;

public class RangAgain{
	public static void main(String...args){
	int[] given = {7, 4, 2, 3, 4};

	int[] calculator = Range.deRange(given);
	String results = calculator;
	String expected = {5};

	assertEquals(expected, results);

	System.out.print(results);
	}
}