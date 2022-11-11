package moduleNameTestNg;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test(enabled = false)			// to skip the execution
	
	public void demo1()
	{
		System.out.println("first");
		
	}
	@Test(priority = 1)				//to set priority
	public void demo2()
	{
		System.out.println("second");
		
	}
	@Test(invocationCount = 5)		//to execute multiple times
	public void demo3()
	{
		System.out.println("third");
		System.out.println("end");
		
	}
	
	

}
