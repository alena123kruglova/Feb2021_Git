package classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	static WebDriver driver;
	
	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negetiveLoginTest();
		tearDown();
		
		launchBrowser();
		negetiveLoginTest1();
		tearDown();
		
		launchBrowser();
		negetiveLoginTest2();
		tearDown();
	
	}
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alena_000\\eclipse-workspace1\\classs\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=login/");
	}
	
	public static void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	
	public static void negetiveLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
	}
	
	public static void negetiveLoginTest1() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
	}
	
	public static void negetiveLoginTest2() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
	}
	
	public static void tearDown() {
		driver.close();
	}


}
