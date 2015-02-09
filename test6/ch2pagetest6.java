package test6; 
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class ch2pagetest6 {
	 WebDriver selenium;
	 //WebElement verifybutton;
	 @FindBy(how=How.NAME,using="verifybutton") WebElement verifybutton;
	 
	 public ch2pagetest6(WebDriver selenium){
		 this.selenium = selenium;
		 //verifybutton = selenium.findElement(By.id("verifybutton"));
	 		if (!"Chapter 2".equalsIgnoreCase(this.selenium.getTitle())){
	 			selenium.get("http://book.theautomatedtester.co.uk/chapter2");
	 		}
	 }
	public boolean isButtonPresent(String button){
		 return selenium.findElements(By.xpath("//input[@id='"+button+"']")).size()>0;
	}
}

