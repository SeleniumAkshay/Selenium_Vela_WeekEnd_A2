package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByInAndDep {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi" + Keys.ENTER);
		String text = driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]/../../div[2]/div[1]/div/div[1]"))
				.getText();
		System.out.println(text);

		Thread.sleep(3000);
		driver.quit();

	}

}
