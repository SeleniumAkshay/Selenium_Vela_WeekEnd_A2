package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void demo() throws InterruptedException {
		System.out.println("This is demo method");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void apple() throws InterruptedException {
		System.out.println("This is apple method");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com");

		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("asc")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
