package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Login {
	public static WebDriver driver;
	
	public static void login(String un, String pwd) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(un);;
		driver.findElement(By.name("password")).sendKeys(pwd);;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:/New_Selenium_June 2017/chromedriver.exe");
		ChromeOptions oprions = new ChromeOptions();
		oprions.addArguments("disable-infobars");
		oprions.addArguments("--start-maximized");
		driver = new ChromeDriver(oprions);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://wfh.transteel.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.xpath("//div[@id='om-huxdqlc8y30azkhgebk4-optin']/div/button")).click();
		//driver.findElement(By.xpath("//button[@title='Close'])[2]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/span[2]")).click();
		//driver.findElement(By.xpath("//div[@class='container']//descendant::a/span[2][contains(text(),'Login / Register')])[1]")).click();
	//	driver.findElement(By.id("username")).sendKeys("vinaybhaskar2000@yahoo.com");;
	//	driver.findElement(By.name("password")).sendKeys("Hyderabad@123");;
	//	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		//button[contains(text(),'Log in')]
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[contains(text(),'close')])[1]")).click();
		driver.findElement(By.id("username")).sendKeys("vinaybhaskar2000@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Bhaskar@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit' and @name='login']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='container']//descendant::a/span[contains(text(),'My Account')])[1]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(driver.findElement(By.xpath("(//strong[contains(text(),'vinaybhaskar2000')])[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("(//strong[contains(text(),'vinaybhaskar2000')])[1]")).getText());
		
	}

}
