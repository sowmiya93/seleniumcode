package day07;



		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Program1 {

			public static void main(String[] args) throws Exception{
				WebDriver driver;
				driver = new ChromeDriver();
				
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				WebElement src = driver.findElement(By.xpath("//span[text()='right click me']"));
				Thread.sleep(3000);
				WebElement cpy =driver.findElement(By.xpath("//span[text()='Copy']"));
				Actions action = new Actions(driver);
				action.contextClick(src).click(cpy).build().perform();
				
				driver.switchTo().alert().accept();
			}

		}
	




