package in.com.hcl.pagobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CreateEveryDayNewCustomer {
	static WebDriver driver;
	public CreateEveryDayNewCustomer(WebDriver driver){
		 super();

		}
	
	@FindBy(xpath="//a//span[contains(text(),'Bank ')]")
	public WebElement BankSave;
		
	@FindBy(xpath="//a//span[contains(text(),'Everyday Banking')]")
	public WebElement EveryDayBanking;
	
	@FindBy(xpath="//*[@id='menu-everyday-banking']/ul/li[1]/a/div/h6")
	WebElement MenuEveryDayBank;
	
	@FindBy(xpath="//section/div[2]//a[contains(text(),'Open now')]")
	WebElement OpenNewButton;
	
	@FindBy(xpath="//a[contains(text(),'New customer')]")
	WebElement NewCustomerButton;
	
	public void navigate_to_Orange_Everyday_bank_account() {
		
		BankSave.click();		
		EveryDayBanking.click();
		MenuEveryDayBank.click();
		System.out.println("Successfully clicked on menu-everyday-banking");
	}
	
	public void click_on_Open_Now_button() {
		OpenNewButton.click();
		System.out.println("Successfully clicked on open now button");
	}
	
	public void click_on_New_Custmer_button() {
		NewCustomerButton.click();
		System.out.println("Successfully clicked on new customer button");

	}


	
}
