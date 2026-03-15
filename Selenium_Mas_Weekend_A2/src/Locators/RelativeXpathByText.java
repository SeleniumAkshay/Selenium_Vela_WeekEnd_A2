package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Prime']")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'Join Prime Shopping')]")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
