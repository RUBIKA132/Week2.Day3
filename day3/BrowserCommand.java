package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommand {

	public BrowserCommand() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.navigate().to("https://www.flipkart.com/");
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().refresh();
		
	}

}
