package taskTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import pomRepo.CustomerDetailsPage;
import pomRepo.HomePage;
import pomRepo.TaskPage;

public class CreateCustomerTest extends BaseClass {
	
	@Test
	public void createCustomerAndVerifyCustomerNameTest() throws EncryptedDocumentException, IOException
	{
		ExcelUtility eUtils = new ExcelUtility();
		String expectedCustomerName = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 0);
		String description = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 1);
		
		HomePage home = new HomePage(driver);
		home.clickOnTaskButton();
		 
		TaskPage task = new  TaskPage(driver);
		task.createCustomerAction(expectedCustomerName, description);
		
		CustomerDetailsPage customer = new CustomerDetailsPage(driver);
		String actualCustomerName = customer.verifyCustomerName(expectedCustomerName);
		
		Assert.assertEquals(actualCustomerName, expectedCustomerName);
		System.out.println("Customer verified");	
		
	}

}
