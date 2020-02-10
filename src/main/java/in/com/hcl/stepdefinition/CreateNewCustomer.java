package in.com.hcl.stepdefinition;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.Key;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.com.hcl.pagebjects.CreateEveryDayNewCustomer;
import in.com.hcl.util.ConfigFileReader;
import in.com.hcl.util.ScreenShot;
import in.com.hcl.util.WebDriver_Generic;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateNewCustomer {

	ConfigFileReader configFileReader;

	// **********************************************UI
	// methods****************************************************************************
	WebDriver driver;

	@Given("^launch the ING browser$")
	public void launch_the_ING_browser() {
		configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// C:\\Users\\suryakanthnag.pujar\\Desktop\\softwares\\Chrome\\chromedriver.exe
		// driver.get("http://www.google.com");
		// driver.get(ConfigFileReader.getApplicationUrl());
		driver.get(ConfigFileReader.getApplicationUrl());
		System.out.println("Successfully opened the ING browser");
	}


	@When("^Fill the form Details$")
	public void fill_the_form_Details(DataTable field) throws InterruptedException {
		
		Map<String, String> testData = field.asMap(String.class, String.class);

		driver.findElement(By.xpath("//*[@id='singleOrJointButtons']//label[contains(text(),'Single')]")).click();
		System.out.println("Clicked on Single Radio button");
		
		WebElement Country = driver.findElement(By.xpath("//*[@aria-label='Nationality (Citizenship)']"));
		Country.sendKeys(testData.get("country"));
		Country.sendKeys(Keys.DOWN, Keys.RETURN);
	
		//driver.findElement(By.xpath("//*[@id='dropMenuItem']/div/paper-item[1]")).click();
		WebElement Title = driver.findElement(By.xpath("//*[@id='titleDropdown_targetInput']"));
		Title.click();
		Title.sendKeys(Keys.DOWN, Keys.RETURN);
	
	
	//	driver.findElement(By.xpath("//*[@id='titleDropdown_listboxitem0']/div/div/div/div")).click();
	//	driver.findElement(By.xpath("//*[@id='titleDropdown_listboxitem0']/div/div/div/div")).sendKeys(Keys.DOWN, Keys.RETURN);
		//Select Titledd = new Select(ttl);
		//Titledd.selectByIndex(0);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@aria-label='Given name']")).sendKeys(testData.get("givenName"));
		driver.findElement(By.xpath("//*[@aria-label='Family name']")).sendKeys(testData.get("familyName"));
		driver.findElement(By.xpath("//*[@aria-label='Email address']")).sendKeys(testData.get("emailAddress"));
		driver.findElement(By.xpath("//*[@aria-label='Mobile']")).sendKeys(testData.get("mobile"));
		
		WebElement Dob=driver.findElement(By.xpath("//*[@aria-label='Date of birth (dd/mm/yyyy)']"));
		//Dob.click();
		Dob.sendKeys(testData.get("dateOfBirth(dd/mm/yyyy)"));
		
		driver.findElement(By.xpath("//*[@aria-label='Place of birth']")).sendKeys(testData.get("placeOfBirth"));
		WebElement CountryofBirth=driver.findElement(By.xpath("//*[@aria-label='Country of birth']"));
		CountryofBirth.sendKeys(testData.get("country"));
		CountryofBirth.sendKeys(Keys.DOWN, Keys.RETURN);
		
		driver.findElement(By.xpath("//*[@aria-label='Enter address']")).sendKeys(testData.get("address"));
		
		
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//*[@id='dropMenuItem']/div/paper-item")).click();
		driver.findElement(By.xpath("//*[@aria-label='Enter address']")).sendKeys(Keys.DOWN, Keys.RETURN);
		Thread.sleep(1500);
		
	//	driver.findElement(By.xpath("//*[@id='template-checkbox-sameAsResidential']")).click();
		driver.findElement(By.xpath("//*[@id='template-checkbox-sameAsResidential']/div/label[1]")).click();
		
		
		driver.findElement(By.xpath("//*[@id='timeAtAddress']//label[contains(text(),'Three or more years')]")).click();
		driver.findElement(By.xpath("//*[@id='taxResidencyField']//label[contains(text(),'Yes')]")).click();
		driver.findElement(By.xpath("//*[@aria-describedby='securityQuestion_validationErrorSpan']")).sendKeys(testData.get("SecurityQues"));
		
	}

	@When("^Click on Continue button$")
	public void click_on_Continue_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='continueButton']/span")).click();
		//*[@id="continueButton"]/span
	
	}

	@Then("^Validate the Success Message$")
	public void validate_the_Success_Message() throws Throwable {
		
	}
	
	
	
	
	
	

	

	////// PPPPPP**********************************2/6*****************
	String Open_Now = "//section/div[2]//a[contains(text(),'Open now')]";

	@When("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String field) {
		// String field_xpath
		// ="//section/div[2]//a[contains(text(),'"+field+"')]";
		// System.out.println(ConfigFileReader.getlocator(field));
		// WebElement ele=driver.findElement(By.xpath(field_xpath));
		// ele.click();

		// driver.findElement(By.xpath("//section/div[2]//a[contains(text(),'Open
		// now')]")).click();
		System.out.println("Successfully clicked on open now button");

	}
	@When("^Navigate to Orange Everyday bank account$")
	public void navigate_to_Orange_Everyday_bank_account() {
		in.com.hcl.util.WebDriver_Generic.Driver_wait(driver, 10);
		CreateEveryDayNewCustomer NewCustomerobj = PageFactory.initElements(driver, CreateEveryDayNewCustomer.class);
		// CreateEveryDayNewCustomer NewCustomer=new
		// CreateEveryDayNewCustomer(driver);
		/*
		 * //driver.findElement(By.xpath("//a//span[contains(text(),'Bank ')]"
		 * )).click(); login.BankSave(); //
		 * driver.findElement(ConfigFileReader.getlocator("Bank&save")).click();
		 * System.out.println("Successfully clicked Bank and Save");
		 * //driver.findElement(By.xpath(
		 * "//a//span[contains(text(),'Everyday Banking')]")).click();
		 * login.EveryDayBanking.click(); driver.findElement(By.xpath(
		 * "//*[@id='menu-everyday-banking']/ul/li[1]/a/div/h6")).click();
		 * System.out.println("Successfully clicked on menu-everyday-banking");
		 */

		NewCustomerobj.navigate_to_Orange_Everyday_bank_account();

		// NewCustomer.navigate_to_Orange_Everyday_bank_account();
	}

	@When("^Click on Open Now button$")
	public void click_on_Open_Now_button() {
		CreateEveryDayNewCustomer NewCustomerobj = PageFactory.initElements(driver, CreateEveryDayNewCustomer.class);
		// CreateEveryDayNewCustomer NewCustomer=new
		// CreateEveryDayNewCustomer(driver);
		// driver.findElement(By.xpath("//section/div[2]//a[contains(text(),'Open
		// now')]")).click();
		NewCustomerobj.click_on_Open_Now_button();
		// System.out.println("Successfully clicked on open now button");
	}

	@When("^Click on New Custmer button$")
	public void click_on_New_Custmer_button() {
		CreateEveryDayNewCustomer NewCustomerobj = PageFactory.initElements(driver, CreateEveryDayNewCustomer.class);
		// CreateEveryDayNewCustomer NewCustomer=new
		// CreateEveryDayNewCustomer(driver);
		// driver.findElement(By.xpath("//a[contains(text(),'New
		// customer')]")).click();
		NewCustomerobj.click_on_New_Custmer_button();
		System.out.println("Successfully clicked on new customer button");

	}

}