package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
     WebDriver driver;
     driver = new ChromeDriver();
     driver.get("https://demo.automationtesting.in/Alerts.html");
     driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
     driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
     driver.switchTo().alert().sendKeys("Selenium Java");
     System.out.println(driver.switchTo().alert().getText());

     driver.switchTo().alert().accept();
		

	}

}

