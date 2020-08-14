package Com.Qa.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Maven {
	
	
	@Test	
	public void Sumtest() {
		System.out.println("Sum Test Method------>");
		int a = 10;
		int b = 20;	
		Assert.assertEquals(30, a+b);
		
	}
@Test	
	public void Subtest() {
		System.out.println("Sub Test Method------>");
		int a = 10;
		int b = 20;	
		Assert.assertEquals(10, b-a);	
	}	
@Test

public void Multest() {
	System.out.println("Mul Test Method------>");
	int a = 10;
	int b = 20;	
	Assert.assertEquals(200, a*b);
	
}
@Test

public void Divtest() {
	System.out.println("Div Test Method------>");
	int a = 10;
	int b = 20;	
	Assert.assertEquals(2, b/a);
	
}

}
