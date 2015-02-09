package test7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.LoadableComponent;

public class test7ch2page extends LoadableComponent<test7ch2page>{

	WebDriver selnm;
	@FindBy(how= How.NAME, using="verifybutton") WebElement verifybutton;
	public test7ch2page(WebDriver s)
	{
		selnm = s;
		PageFactory.initElements(s, this);
		if (!"Chapter 2".equalsIgnoreCase(selnm.getTitle())){
			 selnm.get("http://book.theautomatedtester.co.uk/chapter2");
		 }
	}
	public boolean isButtonPresent(String button)
	{
		return selnm.findElements(By.xpath("//input[@id='"+button+"']")).size()>0;
	}
	
	@Override protected void isLoaded()
	{
		String url = selnm.getCurrentUrl();
		if(url != "http://book.theautomatedtester.co.uk")
		{
			selnm.get("http://book.theautomatedtester.co.uk");
		}
	}
	@Override protected void load()
	{
		selnm.get("http://book.theautomatedtester.co.uk");
	}
	
}
