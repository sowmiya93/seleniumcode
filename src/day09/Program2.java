package day09;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement x= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		js.executeScript("document.getElementById('imagesrc').click();");
		js.executeScript("arguments[0].click()",x);
		js.executeScript("arguments[0].value='testing'",x);//it will give value like testing that firstname webelment x
		js.executeScript("location.reload();");// this command is used to reload the entire page
		
	
	
	}

}