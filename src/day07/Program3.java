package day07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver;
		driver = new ChromeDriver();		
		driver.get("https://www.selenium.dev/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc = new File("./screenshot/selenium.png");
		
		FileUtils.copyFile(src, desc);		
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		desc = new File("./screenshot/seleniumDownloads.png");
		
		FileUtils.copyFile(src, desc);		
		
	

	}

}
