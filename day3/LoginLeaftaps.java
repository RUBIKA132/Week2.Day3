package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {

	public LoginLeaftaps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().fullscreen();
		
		
		Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		Driver.findElement(By.xpath("//a[text()='Leads']")).click();
		Driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		Driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("MG");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rubika");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("B");
		Driver.findElement(By.xpath("//input[@id='smallSubmit']")).click();


	}

}
