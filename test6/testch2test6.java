package test6;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.*;

public class testch2test6 {
	WebDriver selenium;
	@Before
	public void setUp(){
		selenium = new FirefoxDriver();
	}
	@After
	public void tearDown(){
		selenium.quit();
	}
	private void clickChapter(String number){
		 selenium.findElement(By.linkText("Chapter"+number)).click();
	 }
	
	public ch2pagetest6 clickChapter2(){
		clickChapter("2");
		return PageFactory.initElements(selenium, ch2pagetest6.class);
	}
	@Test
	public void ShouldLoadTheHomePageAndThenCheckButtonOnChapter2() {
		selenium.get("http://book.theautomatedtester.co.uk");
		ch2pagetest6 ch2 = clickChapter2();
		assertTrue(ch2.isButtonPresent("but1"));
 }
}
