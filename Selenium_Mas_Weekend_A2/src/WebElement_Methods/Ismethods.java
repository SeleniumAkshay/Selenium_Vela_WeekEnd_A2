package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ismethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(1000);
		boolean dis = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(dis);

		boolean sel = driver.findElement(By.id("pollanswers-1")).isSelected();
		System.out.println(sel);

		boolean ena = driver.findElement(By.id("newsletter-subscribe-button")).isEnabled();
		System.out.println(ena);

		Thread.sleep(3000);
		driver.quit();

	}

}
