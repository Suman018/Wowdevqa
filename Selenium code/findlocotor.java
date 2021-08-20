package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findlocotor {

	public static void main(String[] args) throws InterruptedException{
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(800);
		 
		 
		 driver.get("https://www.demoqa.com/automation-practice-form");
		 driver.findElement(By.id("firstName"));
		
	
		 driver.get("https://www.demoqa.com/automation-practice-form");
		 driver.findElement(By.name("gender"));
		 
		 
		 driver.get("https://www.demoqa.com/automation-practice-form");
		 driver.findElement(By.className("practice-form-wrapper"));
		
		 
		 driver.get("https://www.demoqa.com/links");
		 driver.findElement(By.linkText("Home"));
		 driver.findElement(By.partialLinkText("Ho"));
		
		
		 
		 driver.get("https://www.demoqa.com/text-box");
		 driver.findElement(By.cssSelector("input[id= ‘userName’]"));
		 
		 
		 driver.get("https://www.demoqa.com/text-box");
		 driver.findElement(By.xpath("//input[@id='userName']"));
		 
		 

	}

}