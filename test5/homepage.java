package test5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
	 WebDriver selenium;
	 public homepage(WebDriver selenium){
		 this.selenium = selenium;
	 }
	 public ch2page clickChapter2(){
		 clickChapter("2");
	 	return new ch2page(selenium);
	 }

	 private void clickChapter(String number){
	 selenium.findElement(By.linkText("Chapter"+number)).click();
	 }
	
}
