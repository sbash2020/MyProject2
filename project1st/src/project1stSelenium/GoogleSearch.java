package project1stSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohsin\\Desktop\\Driver\\chromedriver.exe");
		driver.get("https://google.com/");
		String title = driver.getTitle();
		System.out.print(title);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("corona cases in MD");
		//driver.findElement(By.name("btnK")).click();
		//how to click enter
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test completed successfully");

	}

}
