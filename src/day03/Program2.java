package day03;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class Program2 {

			public static void main(String[] args) {
				WebDriver driver;
				driver = new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Register.html");
				
				
				Select dobDropdown = new Select(driver.findElement(By.xpath("//select[@ng-model='yearbox']")));
				Select dobDropdown1 = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
				Select dobDropdown2 = new Select(driver.findElement(By.xpath("//select[@ng-model='daybox']")));

				dobDropdown1.selectByIndex(6);
				
				
				dobDropdown.selectByValue("1993");
				
				
				dobDropdown2.selectByVisibleText("6");
				
	}

}
