package ricardoribeiro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	public int calculator(int a, int b) {
		return a + b;
	}
	
	@Test
	public void testSun() {
		Assertions.assertEquals(2, calculator(1,1));
	}
	
}
