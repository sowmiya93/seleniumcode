package day02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 
{

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("testA");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("testB");
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).clear();


	}
}
