package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("redmi" + Keys.ENTER);
//		driver.findElement(By.className("RG5Slk")).click();

//		List<WebElement> ele = driver.findElements(By.className("RG5Slk"));
//		ele.get(2).click();

		driver.findElements(By.className("RG5Slk")).get(2).click();

		Thread.sleep(3000);
		driver.quit();
//		driver.close();

	}

}
