package day02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program2 {

	public static void main(String[] args) {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sowmi");
    
	}

}
