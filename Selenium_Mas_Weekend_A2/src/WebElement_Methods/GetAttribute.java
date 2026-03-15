package WebElement_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		String att = driver.findElement(By.id("small-searchterms")).getAttribute("class");
		System.out.println(att);

		driver.get("https://www.flipkart.com");

		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {

//			String value = links.get(i).getAttribute("href");
//			String value = links.get(i).getDomProperty("href");
			String value = links.get(i).getDomAttribute("href");
			System.out.println(value);

		}

		Thread.sleep(3000);
		driver.quit();

	}

}
