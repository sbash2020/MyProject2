package POMSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.page.Page;
import org.openqa.selenium.support.ui.Select;


public class ElementCheck {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		
			WebDriver driver = new ChromeDriver();
			

		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mohsin\\Desktop\\Driver\\chromedriver.exe");
			
			driver.get("http://www.facebook.com");
			
			//Form Fillup
			
			
			
			WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		   FirstName.sendKeys("Ayesha");
			
			
			WebElement LastName = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
			LastName.sendKeys("Khan");
			
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
			
			Email.sendKeys("Ayesha@test.com");
			
			WebElement Password = driver.findElement(By.xpath("//*[@id=\"u_0_w\"]"));
			Password.sendKeys("Jenj786!!");
			
			FirstName.clear();
			Thread.sleep(1000);
			LastName.clear();
			Thread.sleep(1000);
			Email.clear();
			Thread.sleep(1000);
			Password.clear();
			Thread.sleep(1000);
			
			//driver.quit();
			
			//DropDown Date of Birth
			
			WebElement Month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
			
		    Select Monthdd = new Select(Month);
		    
		    Monthdd.selectByVisibleText("Sep");
		    Thread.sleep(2000);
			
			WebElement Day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
			
			Select Daydd = new Select(Day);
			
			Daydd.selectByIndex(15);
			Thread.sleep(2000);
			
			WebElement Year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
			
			Select Yeardd = new Select(Year);
			
			Yeardd.selectByValue("1998");
			Thread.sleep(2000);
			
		//Select RadioButtons:
			
			WebElement FemaleRadiobtn = driver.findElement(By.xpath("//*[@id=\"u_0_6\"]"));
			FemaleRadiobtn.click();
			
			Thread.sleep(1000);
			String Text = FemaleRadiobtn.getText();
			
			System.out.println(Text);
			
		//Validation 
			
			WebElement SignUpBtn = driver.findElement(By.id("u_0_13"));
			
			boolean x =SignUpBtn.isDisplayed();
			
			System.out.print(x);
			
			boolean y =SignUpBtn.isEnabled();
			
			System.out.print(y);
			
			WebElement MaleRadioBtn = driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[2]"));
			
			boolean z =MaleRadioBtn.isSelected();
			
			System.out.println(z);
			
			
			
			
			
			
		
			
			
		
			
			

	}

}
