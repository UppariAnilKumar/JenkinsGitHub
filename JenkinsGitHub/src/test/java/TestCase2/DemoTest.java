package TestCase2;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void k1()
	{
		System.out.println("hello");
		Reporter.log("K1 pass",true);
	}

}
