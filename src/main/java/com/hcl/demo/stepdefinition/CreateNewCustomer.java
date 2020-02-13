package com.hcl.demo.stepdefinition;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebTestBase.driver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeTestBase.driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.Key;
import com.hcl.demo.basepage.TestBase;
import com.hcl.demo.pages.CreateEveryDayNewCustomerPage;
import com.hcl.demo.pages.HomePage;
import com.hcl.demo.utilities.ConfigFileReader;
import com.hcl.demo.utilities.ScreenShot;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import in.com.hcl.util.WebTestBase.driver_Generic;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateNewCustomer {

	ConfigFileReader configFileReader;

	@Given("^launch the ING browser$")
	public void launch_the_ING_browser() {
		TestBase.initialization();
		
	}

	@When("^Fill the form Details$")
	public void fill_the_form_Details(DataTable dataField) throws Exception {

		List<Map<String, String>> testData = dataField.asMaps(String.class, String.class);
		
		CreateEveryDayNewCustomerPage newCustObj=new CreateEveryDayNewCustomerPage(TestBase.driver);
		
		newCustObj.fillDetailsInOrangeEverydayPage(testData);
		
//		TestBase.driver.findElement(By.xpath("//*[@id='singleOrJointButtons']//label[contains(text(),'Single')]"))
//				.click();
//		System.out.println("Clicked on Single Radio button");
//
//		WebElement Country = TestBase.driver.findElement(By.xpath("//*[@aria-label='Nationality (Citizenship)']"));
//		Country.sendKeys(testData.get("country"));
//		Country.sendKeys(Keys.DOWN, Keys.RETURN);
//
//		// TestBase.driver.findElement(By.xpath("//*[@id='dropMenuItem']/div/paper-item[1]")).click();
//		WebElement Title = TestBase.driver.findElement(By.xpath("//*[@id='titleDropdown_targetInput']"));
//		Title.click();
//		Title.sendKeys(Keys.DOWN, Keys.RETURN);

		// TestBase.driver.findElement(By.xpath("//*[@id='titleDropdown_listboxitem0']/div/div/div/div")).click();
		// TestBase.driver.findElement(By.xpath("//*[@id='titleDropdown_listboxitem0']/div/div/div/div")).sendKeys(Keys.DOWN,
		// Keys.RETURN);
		// Select Titledd = new Select(ttl);
		// Titledd.selectByIndex(0);
		/*Thread.sleep(1500);
		TestBase.driver.findElement(By.xpath("//*[@aria-label='Given name']")).sendKeys(testData.get("givenName"));
		TestBase.driver.findElement(By.xpath("//*[@aria-label='Family name']")).sendKeys(testData.get("familyName"));
		TestBase.driver.findElement(By.xpath("//*[@aria-label='Email address']"))
				.sendKeys(testData.get("emailAddress"));
		TestBase.driver.findElement(By.xpath("//*[@aria-label='Mobile']")).sendKeys(testData.get("mobile"));

		WebElement Dob = TestBase.driver.findElement(By.xpath("//*[@aria-label='Date of birth (dd/mm/yyyy)']"));
		// Dob.click();
		Dob.sendKeys(testData.get("dateOfBirth(dd/mm/yyyy)"));

		TestBase.driver.findElement(By.xpath("//*[@aria-label='Place of birth']"))
				.sendKeys(testData.get("placeOfBirth"));
		WebElement CountryofBirth = TestBase.driver.findElement(By.xpath("//*[@aria-label='Country of birth']"));
		CountryofBirth.sendKeys(testData.get("country"));
		CountryofBirth.sendKeys(Keys.DOWN, Keys.RETURN);

		TestBase.driver.findElement(By.xpath("//*[@aria-label='Enter address']")).sendKeys(testData.get("address"));

		Thread.sleep(7000);
		// TestBase.driver.findElement(By.xpath("//*[@id='dropMenuItem']/div/paper-item")).click();
		TestBase.driver.findElement(By.xpath("//*[@aria-label='Enter address']")).sendKeys(Keys.DOWN, Keys.RETURN);
		Thread.sleep(1500);

		// TestBase.driver.findElement(By.xpath("//*[@id='template-checkbox-sameAsResidential']")).click();
		TestBase.driver.findElement(By.xpath("//*[@id='template-checkbox-sameAsResidential']/div/label[1]")).click();

		TestBase.driver.findElement(By.xpath("//*[@id='timeAtAddress']//label[contains(text(),'Three or more years')]"))
				.click();
		TestBase.driver.findElement(By.xpath("//*[@id='taxResidencyField']//label[contains(text(),'Yes')]")).click();
		TestBase.driver.findElement(By.xpath("//*[@aria-describedby='securityQuestion_validationErrorSpan']"))
				.sendKeys(testData.get("SecurityQues"));*/

	}

	@When("^Click on Continue button$")
	public void click_on_Continue_button() {
		CreateEveryDayNewCustomerPage createObj=new CreateEveryDayNewCustomerPage(TestBase.driver);
		createObj.getContinueButton().click();
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
		// WebElement ele=TestBase.driver.findElement(By.xpath(field_xpath));
		// ele.click();

		// TestBase.driver.findElement(By.xpath("//section/div[2]//a[contains(text(),'Open
		// now')]")).click();
		System.out.println("Successfully clicked on open now button");

	}

	@When("^Navigate to Orange Everyday bank account$")
	public void navigate_to_Orange_Everyday_bank_account() {
		// TestBase.driver_wait(TestBase.driver, 10);
		// CreateEveryDayNewCustomer NewCustomerobj =
		// PageFactory.initElements(TestBase.driver,
		// CreateEveryDayNewCustomer.class);
		// CreateEveryDayNewCustomer NewCustomer=new
		// CreateEveryDayNewCustomer(TestBase.driver);
		/*
		 * //TestBase.driver.findElement(By.xpath(
		 * "//a//span[contains(text(),'Bank ')]" )).click(); login.BankSave();
		 * //
		 * TestBase.driver.findElement(ConfigFileReader.getlocator("Bank&save"))
		 * .click(); System.out.println("Successfully clicked Bank and Save");
		 * //TestBase.driver.findElement(By.xpath(
		 * "//a//span[contains(text(),'Everyday Banking')]")).click();
		 * login.EveryDayBanking.click(); TestBase.driver.findElement(By.xpath(
		 * "//*[@id='menu-everyday-banking']/ul/li[1]/a/div/h6")).click();
		 * System.out.println("Successfully clicked on menu-everyday-banking");
		 */

		// NewCustomerobj.navigate_to_Orange_Everyday_bank_account();

		// NewCustomer.navigate_to_Orange_Everyday_bank_account();
	}

	@When("^Click on Open Now button$")
	public void click_on_Open_Now_button() {
		CreateEveryDayNewCustomerPage NewCustomerobj = PageFactory.initElements(TestBase.driver,
		CreateEveryDayNewCustomerPage.class);
		// CreateEveryDayNewCustomer NewCustomer=new
		// CreateEveryDayNewCustomer(TestBase.driver);
		// TestBase.driver.findElement(By.xpath("//section/div[2]//a[contains(text(),'Open
		// now')]")).click();
		NewCustomerobj.click_on_Open_Now_button();
		// System.out.println("Successfully clicked on open now button");
	}

	@When("^Click on New Custmer button$")
	public void click_on_New_Custmer_button() {
		CreateEveryDayNewCustomerPage NewCustomerobj = PageFactory.initElements(TestBase.driver,
				CreateEveryDayNewCustomerPage.class);
		// CreateEveryDayNewCustomer NewCustomer=new
		// CreateEveryDayNewCustomer(TestBase.driver);
		// TestBase.driver.findElement(By.xpath("//a[contains(text(),'New
		// customer')]")).click();
		NewCustomerobj.click_on_New_Custmer_button();
		System.out.println("Successfully clicked on new customer button");

	}

}