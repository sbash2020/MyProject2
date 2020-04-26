package project1stSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.driver.chrome", "C://Users//mohsin//eclipse-workspace//project1st//chromedriver.exe");
        //Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //ImplicitWait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://freecrm.com/");
    
    
        //Click LogIn
        driver.findElement(By.xpath("//span[text()='Log In']")).click();
        driver.findElement(By.name("email")).sendKeys("saadiabashir377@hotmail.com");
        driver.findElement(By.name("password")).sendKeys("Maryland786");
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        Thread.sleep(3000);
        
        //Go to Contact Tab
       driver.switchTo().frame("downloadFrame");
       //driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/iframe[1]")).click();
	}

}
