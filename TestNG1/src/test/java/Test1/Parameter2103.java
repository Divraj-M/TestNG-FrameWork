package Test1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
@Listeners(Test1.ListenerDemo.class)
public class Parameter2103 {
  @Test
  @Parameters({"val1","val2"})
  public void sum(int v1,int v2) {
	  int finalsum=v1+v2;
	  System.out.println("the final sum is :"+finalsum);
	  
  }
  @Test
  @Parameters({"val3","val4"})
	  public void sum1(int v1,int v2)
	  {
		  int finalsum=v1-v2;
		  System.out.println("the final sub is :"+finalsum);
	
	  }
}
