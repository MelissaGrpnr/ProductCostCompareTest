package tests;
import org.testng.annotations.*;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class loginMail {

	@Test
	public void webmailLoginChrome() throws InterruptedException {    
		 WebDriver driver = new ChromeDriver();
		 driver.manage();
		 Thread.sleep(20);
	      driver.get("https://webmailstudent.cankaya.edu.tr/");
	      WebElement username = driver.findElement(By.name("_user"));
	      username.sendKeys("xxxx");
	      Thread.sleep(10);
	      WebElement passwrd = driver.findElement(By.name("_pass"));
	      passwrd.sendKeys("******");
	      Thread.sleep(10);
	      WebElement button = driver.findElement(By.id("rcmloginsubmit"));
	      button.click();
	      Thread.sleep(200);
	      driver.close();
	    }
	@Test
	public void mailLoginMicrosoftEdge() throws InterruptedException {    
		WebDriver driver = new EdgeDriver();
		 driver.manage();
		 Thread.sleep(20);
	      driver.get("https://webmailstudent.cankaya.edu.tr/");
	      WebElement username = driver.findElement(By.name("_user"));
	      username.sendKeys("xxxxx");
	      Thread.sleep(10);
	      WebElement passwrd = driver.findElement(By.name("_pass"));
	      passwrd.sendKeys("******");
	      Thread.sleep(10);
	      WebElement button = driver.findElement(By.id("rcmloginsubmit"));
	      button.click();
	      Thread.sleep(200);
	      driver.close();
	    }

	}


