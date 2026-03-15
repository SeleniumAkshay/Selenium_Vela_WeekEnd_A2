package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.cssSelector("input#Email")).sendKeys("qspiders2596@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Qsp@1234");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.cssSelector("input.ui-autocomplete-input[value='Search store']"))
				.sendKeys("Book" + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
