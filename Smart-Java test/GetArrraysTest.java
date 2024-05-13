import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Asser,tions.assertEquals;


public class GetArrraysTest{

	@Test
	public void testarrayNumber(){
	int  multiple = GetArrrays.multiple(2,9,3,1,6);
	int expectedmultiple = 54;
	assertEquals(expectedMultiple, multiple);

	}


}