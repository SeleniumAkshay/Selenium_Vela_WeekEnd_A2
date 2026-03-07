package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {

//		ChromeDriver driver = new ChromeDriver();
//
//		EdgeDriver driver1 = new EdgeDriver();
//
//		FirefoxDriver driver2 = new FirefoxDriver();

		// We can access 13 methods 11 from webdriver 2 from searchcontext
		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver = new EdgeDriver();

	}

}
