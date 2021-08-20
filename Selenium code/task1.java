package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wowdevqa.com/");
		Thread.sleep(800);

		driver.findElement(By.linkText("Top: 12: Software: Development: QATesting")).click();
		driver.close();
	}
}
