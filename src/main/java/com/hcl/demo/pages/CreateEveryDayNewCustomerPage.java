package com.hcl.demo.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.hcl.demo.basepage.TestBase;
import com.hcl.demo.utilities.Utility;

public class CreateEveryDayNewCustomerPage extends TestBase {
	//static WebDriver driver;
	public CreateEveryDayNewCustomerPage(WebDriver driver){
		 super(driver);

		}
	
	@FindBy(css="#continueButton")
	private WebElement continueButton;
	
	public WebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(xpath="//a//span[contains(text(),'Bank ')]")
	private WebElement BankSave;
		
	@FindBy(xpath="//a//span[contains(text(),'Everyday Banking')]")
	public WebElement EveryDayBanking;
	
	@FindBy(xpath="//*[@id='menu-everyday-banking']/ul/li[1]/a/div/h6")
	WebElement MenuEveryDayBank;
	
	@FindBy(xpath="//section/div[2]//a[contains(text(),'Open now')]")
	WebElement OpenNewButton;
	
	@FindBy(xpath="//*[@aria-label='Nationality (Citizenship)']")
	private WebElement nationalityField;
	
	@FindBy(xpath="//*[@id='dropMenuItem']/div/paper-item[1]")
	private WebElement dropdownResponse;
	
	@FindBy(xpath="//*[@id='titleDropdown_targetInput']")
	private WebElement titleDropDownField;
	
	@FindBy(xpath="//*[@aria-label='Given name']")
	private WebElement givenNameField;
	
	@FindBy(xpath="//*[@aria-label='Family name']")
	private WebElement familyNameField;
	
	@FindBy(xpath="//*[@aria-label='Email address']")
	private WebElement emailAddressField;
	
	@FindBy(xpath="//*[@aria-label='Mobile']")
	private WebElement mobileField;
	
	@FindBy(xpath="//*[@aria-label='Date of birth (dd/mm/yyyy)']")
	private WebElement dobField;
	
	@FindBy(xpath="//*[@aria-label='Place of birth']")
	private WebElement placeOfBirthField;
	
	@FindBy(xpath="//*[@aria-label='Country of birth']")
	private WebElement countryOfBirthField;
	
	@FindBy(xpath="//*[@aria-label='Enter address']")
	private WebElement addressInputField;
	
	@FindBy(xpath="//*[@aria-describedby='securityQuestion_validationErrorSpan']")
	private WebElement securityQuestionTextBox;
	
	public void navigate_to_Orange_Everyday_bank_account() {
		
		BankSave.click();		
		EveryDayBanking.click();
		MenuEveryDayBank.click();
		System.out.println("Successfully clicked on menu-everyday-banking");
	}
	
	public WebElement getBankSave() {
		return BankSave;
	}

	public WebElement getEveryDayBanking() {
		return EveryDayBanking;
	}

	public WebElement getMenuEveryDayBank() {
		return MenuEveryDayBank;
	}

	public WebElement getOpenNewButton() {
		return OpenNewButton;
	}

	public WebElement getNationalityField() {
		return nationalityField;
	}

	public WebElement getDropdownResponse() {
		return dropdownResponse;
	}

	public WebElement getTitleDropDownField() {
		return titleDropDownField;
	}

	public WebElement getGivenNameField() {
		return givenNameField;
	}

	public WebElement getFamilyNameField() {
		return familyNameField;
	}

	public WebElement getEmailAddressField() {
		return emailAddressField;
	}

	public WebElement getMobileField() {
		return mobileField;
	}

	public WebElement getDobField() {
		return dobField;
	}

	public WebElement getPlaceOfBirthField() {
		return placeOfBirthField;
	}

	public WebElement getCountryOfBirthField() {
		return countryOfBirthField;
	}

	public WebElement getAddressInputField() {
		return addressInputField;
	}

	public WebElement getSecurityQuestionTextBox() {
		return securityQuestionTextBox;
	}

	public void click_on_Open_Now_button() {
		OpenNewButton.click();
		System.out.println("Successfully clicked on open now button");
	}
	
	public void click_on_New_Custmer_button() {
		//NewCustomerButton.click();
		System.out.println("Successfully clicked on new customer button");

	}
	
	public void fillDetailsInOrangeEverydayPage(List<Map<String,String>> list) throws Exception
	{
		//Thread.sleep(3000);
		Utility.selectRadioButtonResponse("Single;Male;Yes;Less than three years");
		getNationalityField().sendKeys(list.get(0).get("nationality"));
		Thread.sleep(3000);
		getDropdownResponse().click();
		Actions actionObj=new Actions(TestBase.driver);
		getTitleDropDownField().click();
		Utility.selectOption(list.get(0).get("title"));
		getGivenNameField().sendKeys(list.get(0).get("givenName"));
		getFamilyNameField().sendKeys(list.get(0).get("familyName"));
		getEmailAddressField().sendKeys(list.get(0).get("emailAddress"));
		getMobileField().sendKeys(list.get(0).get("mobile"));
		getDobField().sendKeys(list.get(0).get("dateOfBirth(dd/mm/yyyy)"));
		getPlaceOfBirthField().sendKeys(list.get(0).get("placeOfBirth"));
		getCountryOfBirthField().sendKeys(list.get(0).get("countryOfBirth"));
		actionObj.sendKeys(Keys.TAB).build().perform();
		actionObj.sendKeys(Keys.ENTER).build().perform();
		getAddressInputField().sendKeys(list.get(0).get("address"));
		actionObj.sendKeys(Keys.TAB).build().perform();
		actionObj.sendKeys(Keys.ENTER).build().perform();
		getSecurityQuestionTextBox().sendKeys(list.get(0).get("SecurityQues"));
		
		
	}


	
}
