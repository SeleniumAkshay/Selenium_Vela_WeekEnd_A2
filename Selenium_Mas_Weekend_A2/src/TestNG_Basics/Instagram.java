package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instagram {

	@Test
	public void instagram() throws InterruptedException {
		System.out.println("This is Instagram");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");

		driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
