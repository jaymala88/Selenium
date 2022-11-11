package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	
	public void demo() {
	String actual="jammi";
	String expected = "jammi2";
	Assert.assertEquals(actual, expected);
	System.out.println("pass");
	
	}
}
