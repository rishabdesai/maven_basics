package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	//valid test case
	@Test
	public void testLogin1() {
		App myApp = new App();
		Assert.assertEquals(1, myApp.uerLogin("root", "rootroot"));
	}

	//invalid test case
	@Test
	public void testLogin2() {
		App myApp = new App();
		Assert.assertEquals(0, myApp.uerLogin("root1", "rootroot1"));
	}
}
