package test7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test7testch2 {
	WebDriver s;
	@Before
	public void setUp()
	{
		s = new FirefoxDriver();
	}
	@After
	public void tearDown()
	{
		s.quit();
	}
	@Test
	public void ShouldLoadTheHomePageAndThenCheckButtonOnChapter2()
	{
		test7ch2page cht = new test7ch2page(s).get();
		cht.isButtonPresent("but1");
		System.out.println("verifybutton class: "+cht.verifybutton.getClass());
		System.out.println("verifybutton tostring: "+cht.verifybutton.toString());
	}
}
