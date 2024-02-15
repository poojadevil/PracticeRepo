package genericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	WebDriver driver;
	
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bc(/*String browser*/)
	{
		//if(browser.contains("chrome"))
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
//	@Parameters("browser")
//	@BeforeClass(alwaysRun = true)
	public void bcc(String browser)
	{
		if(browser.contains("chrome"))
		{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		}
		else if(browser.contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}
	@BeforeMethod(alwaysRun = true)
	public void bm()
	{
		System.out.println("before method");
	}
	@AfterClass(alwaysRun = true)
	public void ac()
	{
	System.out.println("after class");	
	}
	
	@AfterMethod(alwaysRun = true)
	public void am()
	{
		System.out.println("after method");
	}
}
