package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NewWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.amazon.com");

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com");

		Thread.sleep(3000);
		driver.quit();
//		driver.close();

	}

}
