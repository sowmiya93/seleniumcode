package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame("SingleFrame");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

	}

}