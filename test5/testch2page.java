package test5;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testch2page {
	WebDriver selenium;
	@Before
	public void setUp(){
		selenium = new FirefoxDriver();
	}
	@After
	public void tearDown(){
		selenium.quit();
	}
	@Test
	public void
	ShouldLoadTheHomePageAndThenCheckButtonOnChapter2(){
		selenium.get("http://book.theautomatedtester.co.uk");
		homepage hp = new homepage(selenium);
		ch2page ch2 = hp.clickChapter2();
		assertTrue(ch2.isButtonPresent("but1"));
	}
}
 
