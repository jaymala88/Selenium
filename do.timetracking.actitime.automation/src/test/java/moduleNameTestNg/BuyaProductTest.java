package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyaProductTest {
	
	@Test(priority = 1,groups = "smoke")
	
	public void loginTest()
	{
		System.out.println("login successful");
	}
	@Test(priority = 2)
	public void searchForproductTest()
	{
		System.out.println("Product found");
		Assert.fail();
	}
	@Test(dependsOnMethods = "searchForproductTest")
	public void addProductToCartTest()
	{
		System.out.println("product added successfully");
	}
	@Test(dependsOnMethods = "addProductToCartTest")
	public void paymentTest()
	{
		System.out.println("payment was successfull");
	}
	@Test(priority = 3)
	public void logoutTest()
	{
		System.out.println("logout success");
	}

}
