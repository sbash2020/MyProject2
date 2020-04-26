package project1stSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("WebDriver.driver.chrome", "C://Users//mohsin//eclipse-workspace//project1st//chromedriver.exe");
        //Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //ImplicitWait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://register.freecrm.com/register/");
    //to Check if Element is Displayed or not: If Displayed it will be true otherwise false
       boolean SignUpButton = driver.findElement(By.name("action")).isDisplayed();
        System.out.println(SignUpButton);
        
        // to check SignUp Button is Enabled
        
        boolean SignUpButton2 = driver.findElement(By.name("action")).isEnabled();
        System.out.println(SignUpButton2);
        
        driver.findElement(By.linkText("I Agree to the terms and conditions")).click();
        boolean SignUpButton3 = driver.findElement(By.name("action")).isEnabled();
        System.out.println(SignUpButton3);
        
        driver.findElement(By.linkText("I Agree to the terms and conditions"));
        boolean SignUpButton4 = driver.findElement(By.name("action")).isEnabled();
        System.out.println(SignUpButton4);
        
    //to check if checkboxs is selected:   
        boolean CheckBox = driver.findElement(By.linkText("I Agree to the terms and conditions")).isSelected();
        System.out.println(CheckBox);
            driver.quit();
	}

}
