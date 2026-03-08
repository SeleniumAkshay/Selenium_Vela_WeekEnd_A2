package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");

//		driver.findElement(By.name("Gender")).click();

		List<WebElement> elements = driver.findElements(By.name("Gender"));
		System.out.println(elements.size());
		elements.get(1).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
