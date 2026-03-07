package WebDriver_Methods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Cookie {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

//		driver.manage().deleteCookieNamed("datr");

//		Cookie delete = new Cookie("fr", "0X8ngdvypk8PVFuky..Bpq7Ic..AAA.0.0.Bpq7Ic.AWfpoy9RA-ZnuTQOrDGLJIWEcIQ");
//		driver.manage().deleteCookie(delete);

//		System.out.println(driver.manage().getCookieNamed("fr"));
//		System.out.println();

//		driver.manage().deleteAllCookies();

		Cookie newCookie = new Cookie("Qspiders", "Selenium_A2");
		driver.manage().addCookie(newCookie);

		Set<Cookie> all = driver.manage().getCookies();
		for (Cookie cookie : all) {
			System.out.println(cookie);
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
