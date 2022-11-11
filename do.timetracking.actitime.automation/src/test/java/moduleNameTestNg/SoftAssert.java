package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {

	@Test
	
	public void demo() {
	String actual="jammi";
	String expected = "jammi2";
	
	org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
	soft.assertEquals(actual, expected); 	// it will pass all asserts no matter if it is false or true and it is used to send report at the end of project
	//soft.assertAll();				//it will check all asserts
	
	System.out.println("pass");
}
}