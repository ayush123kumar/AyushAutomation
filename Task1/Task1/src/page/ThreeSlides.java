package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ThreeSlides extends TestBase {
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shop;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement Home;
	
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement check;
	
	
	public ThreeSlides()
	{
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void shopClick()
	{
		shop.click();
	}
	
	public void homeClick()
	{
		Home.click();
	}
	
	public void checkClick()
	{
		check.click();
		check.click();
		check.click();
	}

	
	

}
