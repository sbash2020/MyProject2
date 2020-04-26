package project1stSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandles {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.geicko.driver", "C://Users//mohsin//eclipse-workspace//POMSelenium//chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	Thread.sleep(2000);
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	Thread.sleep(5000);
	String text = alert.getText();
    //System.out.println(alert.getText());
	System.out.println(text);
	
	//Validation Conditions
	if(text.equals("Please enter a valid user name")) {
		System.out.println("Correct Alert Message");
	}
	else{
		System.out.println("InCorrect Alert Message");}
    Thread.sleep(2000);
    alert.accept();
	//alert.dismiss();
	driver.quit();
	

	}

}
