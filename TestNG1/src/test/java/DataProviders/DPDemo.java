package DataProviders;

import org.testng.annotations.DataProvider;

public class DPDemo {

    @DataProvider(name = "testData",parallel=true)
    public Object[][] getData() {
		
		 // return new Object[][] { {"Selenium"}, {"TestNG"}, {"Automation"} };
		 
    	return new Object[][] {{"Automation Tester","2-3 years"},
    		{"performance tester","3+years"},
    		{"Devops","5+years"}};
    		
    		
    }
}
