package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testGitHubLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b7c.06.13\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("Chethan289");
		driver.findElement(By.id("password")).sendKeys("Chethan@1a");
		driver.findElement(By.name("commit")).click();
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"GitHub");
		/*if(title.equals("GitHub"))
		{
		System.out.println("Valid user");
		}
		else
		{
			System.out.println("Invalid User
		}*/
		}
		

}
