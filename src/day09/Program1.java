package day09;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Actions action= new Actions(driver);
		action.click(driver.findElement(By.xpath("//input[@id='imagesrc']"))).build().perform();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\testing\\fileupload.exe");
	
	}

}
