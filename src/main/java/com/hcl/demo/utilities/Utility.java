package com.hcl.demo.utilities;

import org.openqa.selenium.By;

import com.hcl.demo.basepage.TestBase;

public class Utility {

	public static  void selectRadioButtonResponse(String radioResponse)
	{
		String[] responseList=radioResponse.split(";");
		for(int i=0;i<responseList.length;i++)
		{
			String response=responseList[i];
			TestBase.driver.findElement(By.xpath("//label[contains(text(),'"+response+"')]")).click();
		}
}
	
	public static  void selectOption(String input)
	{
			//String response=responseList[i];
			TestBase.driver.findElement(By.xpath("//span[(text()='"+input+"')]")).click();
}
	
}
