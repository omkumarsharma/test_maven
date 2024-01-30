package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Class 
{
	public static void main(String []args) throws InterruptedException
	{
		
		WebDriver driver;
		
		String base_url= "https://app.acadally.com/login/index.php";
		String username="acuser13@gmail.com";
		String password= "July@123";
		driver= new ChromeDriver();
		
		driver.get(base_url);
		Thread.sleep(2000);
		driver.getCurrentUrl();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("loginbtn")).click();
		driver.close();
		
		
		
		System.out.println("Welcome back: JAVA");
	}

}
