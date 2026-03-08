package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");

		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("4.41.0 (February 20, 2026)")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
