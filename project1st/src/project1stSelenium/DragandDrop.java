package project1stSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.driver.chrome", "C://Users//mohsin//eclipse-workspace//project1st//chromedriver.exe");
        //Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
      //ImplicitWait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*driver.get("https://jqueryui.com/droppable/");
        //Location of drag 
       
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        //Location of drop
            
        Thread.sleep(2000);
        //Actions to move
        Actions action = new Actions(driver);
        Thread.sleep(3000);
      
        action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();*/
        
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        //Location of drag 
       
        Thread.sleep(2000);
        //driver.switchTo().frame(0);
        //Location of drop
            
        Thread.sleep(2000);
        //Actions to move
        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.clickAndHold(driver.findElement(By.id("sourceImage"))).moveToElement(driver.findElement(By.id("targetDiv"))).release().build().perform();
        //action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

	}

}
