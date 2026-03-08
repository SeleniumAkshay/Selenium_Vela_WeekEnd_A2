package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");

//		WebElement ele = driver.findElement(By.id("FirstName"));
//		ele.sendKeys("qsp");

		driver.findElement(By.id("FirstName")).sendKeys("Qsp");

		Thread.sleep(3000);
		driver.quit();

	}

}
