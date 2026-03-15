package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAriaRole {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);
		String aria = driver.findElement(By.name("pass")).getAriaRole();
		System.out.println(aria);

		String access = driver.findElement(By.name("email")).getAccessibleName();
		System.out.println(access);

		Thread.sleep(3000);
		driver.quit();

	}

}
