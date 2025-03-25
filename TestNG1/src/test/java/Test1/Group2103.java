package Test1;

import org.testng.annotations.Test;

public class Group2103 {
	@Test(alwaysRun=true,groups= {"regressiontest"})
	public void f()
	{
		System.out.println("Login the application");
	}
	@Test(alwaysRun=true,groups= {"regressiontest","smoketest"})
	public void f1()
	{
		System.out.println("Manage the application");
	}
	@Test(alwaysRun=true,groups= {"regressiontest","smoketest","sanitytest"})
		public void f2()
		{
			System.out.println("logout the application");
		}
  
}
