package in.com.hcl.StepDefinition;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import in.com.hcl.Utilities.GenericMethods;
import junit.framework.Assert;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.junit.runner.RunWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Pages.homepage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;



	@RunWith(Cucumber.class)
	public class INGBankingStepDefinition {
		
	
		
	



		public static WebDriver driver;
		
		
		GenericMethods gen=new GenericMethods();
		
		
		
		Properties prop=new Properties();
		
		
	    @Given("^user is on Homepage$")
	    public void user_is_on_homepage() throws Throwable {
	    	String absolutepath = System.getProperty("user.dir");
			String filepath = absolutepath+"\\Drivers"+"\\chromedriver1.exe";
			System.setProperty("webdriver.chrome.driver", filepath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			FileInputStream fis=new FileInputStream(absolutepath+"\\file.properties");
			prop.load(fis);
			driver.get(prop.getProperty("URL"));
	    }

	    @When("^clicks on Bank and Save$")
	    public void clicks_on_bank_and_Save() throws Throwable {
	    	
	    	driver.findElement(By.xpath("//span[contains(text(),'Bank & Save')]")).click();
	    	String title=driver.getTitle();
	    	System.out.println(title);
	    	
	    	
	    }


	    @And("^user click on Personal Term Deposit$")
	    public void user_click_on_personal_Term_Deposit() throws Throwable {
	    	homepage home=new homepage(driver);
	    	homepage hp = PageFactory.initElements(driver, homepage.class);
	    	
	    	/*WebElement element=driver.findElement(By.xpath("//li[@class='menu-cell active']//div[@class='column intro bg-gray']//li[2]//a[1]//div[1]"));
	    			element.click();
	    	Actions action=new Actions(driver);
		    
	    	action.moveToElement(element).build().perform();
	    	
	    
	    	WebElement el=driver.findElement(By.xpath("//h6[contains(text(),'Personal Term Deposit')]"));
	    	el.click();*/
	    	
	    	homepage.PTM();
	    
	    	
	    
	    	
	    	
	    }
	    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	
	    }
	    

	    @Then("^Personal Term Deposit Page is populated$")
	    public void personal_term_deposit_page_is_populated() throws Throwable {
	    	String title=driver.getTitle();
	    	System.out.println(title);
	    	Assert.assertEquals("Term Deposits. Bank Term Deposits - ING", title);
	    	
	    }
	    
	    

	    @Given("^user is on Personal Deposit Page$")
	    public void user_is_on_personal_deposit_page() throws Throwable {
	       String url=  driver.getCurrentUrl();
	       System.out.println(url);
	    }

	    @When("^user clicks on OpenNow$")
	    public void user_clicks_on_opennow() throws Throwable {
	    	//driver.findElement(By.xpath("//div[@class='savings-main']//a[@class='ING-button blue'][contains(text(),'Open now')]")).click();
	    	homepage home=new homepage(driver);
	    	homepage hp = PageFactory.initElements(driver, homepage.class);
	    	hp.pop();
	    	
	    	Thread.sleep(1000);
	        
	       
	        //driver.findElement(By.xpath("//a[@class='ING-button blue applyFormButton-New']")).click();
	    	hp.customer();
	        String title=driver.getTitle();
	        System.out.println(title);
	        String url=driver.getCurrentUrl();
	        System.out.println(url);
	        
	        




	    }

	    @Then("^Open a Personal Term Deposit$")
	    public void open_a_personal_term_deposit() throws Throwable {
	      
	    }

	  

	    @And("^User enters with following details$")
	    public void user_enters_with_following_details(DataTable data) throws Throwable {
	    	
	    	List<List<String>> obj = data.raw();
	      
	    	homepage home=new homepage(driver);
	    	homepage hp = PageFactory.initElements(driver, homepage.class);
	    	
	    	
	    	hp.single();
	    	
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        js.executeScript("window.scrollBy(0,200)");
	        
	        driver.findElement(By.xpath("//input[@aria-label='Nationality (Citizenship)']")).sendKeys(obj.get(0).get(0));
	        
	        //driver.findElement(By.xpath("//*[@id='dropMenuItem']/div/paper-item[1]")).click();
	        hp.gendertitle();
	        //driver.findElement(By.xpath("//input[@id='titleDropdown_targetInput']")).click();
	        hp.gendert();
	        
	        //driver.findElement(By.xpath("//span[text()='Professor']")).click();
	        hp.gender();
	        
	        //driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	        hp.gendertype();
	        
	        driver.findElement(By.cssSelector("input[aria-label='Given name']")).sendKeys(obj.get(0).get(1));
	        
	        driver.findElement(By.cssSelector("input[aria-label='Middle name (if you have one)']")).sendKeys(obj.get(0).get(2));
	        
	        driver.findElement(By.cssSelector("input[aria-label='Family name']")).sendKeys(obj.get(0).get(3));
	        
	       driver.findElement(By.cssSelector("input[aria-label='Date of birth (dd/mm/yyyy)']")).sendKeys(obj.get(0).get(4));
	        driver.findElement(By.cssSelector("input[aria-label='Place of birth']")).sendKeys(obj.get(0).get(5));
	        
	        driver.findElement(By.cssSelector("input[aria-label='Country of birth']")).sendKeys(obj.get(0).get(6));
	        
	       driver.findElement(By.cssSelector("input[aria-label='Email address']")).sendKeys(obj.get(0).get(7));
	        
	        driver.findElement(By.cssSelector("input[aria-label='Mobile']")).sendKeys(obj.get(0).get(8));
	        driver.findElement(By.cssSelector("input[aria-label='Other phone (optional)']")).sendKeys(obj.get(0).get(9));
	        driver.findElement(By.cssSelector("input[aria-label='Enter address']")).sendKeys(obj.get(0).get(10));
	       
	         Thread.sleep(3000);
	         
	           Actions act=new Actions(driver);
	            act.sendKeys(Keys.TAB).build().perform();
	            act.sendKeys(Keys.ENTER).build().perform();
	            
	            driver.findElement(By.xpath("//span[text()='Same as residential address']")).click();
	           hp.unittype();
	           
	            
	            WebElement restradio =driver.findElement(By.cssSelector("label[for='greaterThanThree']"));
	            restradio.click();
		    	//Boolean radiobt = restradio.isSelected();
	            WebElement tax =driver.findElement(By.xpath("//label[contains(text(),'No')]"));
	            tax.click();
	            driver.findElement(By.cssSelector("[aria-describedby='securityQuestion_validationErrorSpan']")).sendKeys(obj.get(0).get(11));
	            //driver.findElement(By.cssSelector("//span[text()='Continue']")).click();
		    	

	       
	        


	        
	    	
	    }
        
        
       

	}
	
	