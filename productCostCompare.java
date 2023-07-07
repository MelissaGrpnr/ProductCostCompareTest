package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Factory;

public class productCostCompare {
	
	@Test
	public void t1() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://www.teknosa.com/");
		Thread.sleep(3);
		driver.findElement(By.cssSelector("#site-header > div > div.hdr-block2 > div.hb2-col2 > div > form > div.sbx-header > div.sbx-input > button"))
		.click();
		WebElement element =driver.findElement(By.id("search-input"));
		element.sendKeys("Apple iPhone 14 Pro 1TB Altın Cep Telefonu");
		Thread.sleep(3);
		element.submit();
		Thread.sleep(9);
		driver.get("https://www.teknosa.com/apple-iphone-14-pro-1tb-altin-cep-telefonu-mq2v3tua-p-125078772");
		
		driver.close();
	}
	 
	@Test
	public void t2() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://www.mediamarkt.com.tr/");
		Thread.sleep(3);
		driver.manage (). getCookies (); 
		driver.findElement(By.cssSelector("#search-autocomplete > form > input.ms-textfield.ms-textfield--search.ms-autosugestions__search-input"))
		.click();
		WebElement element =driver.findElement(By.cssSelector("#search-autocomplete > form > input.ms-textfield.ms-textfield--search.ms-autosugestions__search-input"));
		element.sendKeys("APPLE iPhone 14 Pro 1TB Akıllı Telefon Silver");
		Thread.sleep(3);
		element.submit();
		Thread.sleep(10);
		driver.get("https://www.mediamarkt.com.tr/tr/product/_apple-iphone-14-pro-1tb-ak%C4%B1ll%C4%B1-telefon-silver-mq2n3tu-a-1223399.html?waw_keyword=13%20pro");
		driver.findElement(By.cssSelector("#cookie-info-layer > div.cookie-info-first-layer.js-cookie-info-first-layer > div > div.cookie-info-buttons > a > span"))
		.click();
        
		driver.close();
	
	}
	
	@Test
	public void t3() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://www.amazon.com.tr/");
		Thread.sleep(3);
		driver.findElement(By.cssSelector("#sp-cc-accept")).click(); 
		driver.findElement(By.cssSelector("body")).click();
		WebElement element =driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		element.sendKeys("Apple iPhone 14 Pro (1 TB) - Gümüş Rengi");
		Thread.sleep(3);
		element.submit();
		Thread.sleep(10);
		driver.get("https://www.amazon.com.tr/Apple-iPhone-14-Pro-TB/dp/B0BDJ8YZRC/ref=sr_1_1?__mk_tr_TR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1QE9TJLXHI36F&keywords=APPLE%2BiPhone%2B14%2BPro%2B1TB&qid=1672173510&sprefix=apple%2Biphone%2B14%2Bpro%2B1tb%2Caps%2C337&sr=8-1&th=1");
		
		 driver.close();
	}
	
	@AfterTest
    public void reportReady()
    {
        System.out.println("Report is ready to be shared, with screenshots of tests");
    }

}

