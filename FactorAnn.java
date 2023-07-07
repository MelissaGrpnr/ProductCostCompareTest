package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactorAnn  {
	
	@Factory
    public Object[] createInstances() throws InterruptedException {

        Object[] num = new Object[3];

        for (int iter = 0; iter < 3; iter++) {
        	num[iter] = new openPage(new ChromeDriver());
        	num[iter] = new openPage(new EdgeDriver());
        }

        return num;
    }  
}
class openPage {

    private WebDriver driver;

    public openPage(WebDriver page) throws InterruptedException  {
        driver = page;
        driver.manage();
        Thread.sleep(20);
    }
}
