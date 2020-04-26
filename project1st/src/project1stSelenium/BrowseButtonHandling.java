package project1stSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseButtonHandling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.chrome.driver", "C://Users//mohsin//eclipse-workspace//project1st//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://html.com/input-type-file/");
    Thread.sleep(2000);
    //Switch to Windows popUp
    
    driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\mohsin\\Desktop\\Notes.txt");
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
    Thread.sleep(2000);
    driver.quit();
    
	}

}
