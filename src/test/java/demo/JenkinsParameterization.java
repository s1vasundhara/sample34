package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsParameterization {
	@Test
	public void demo() throws InterruptedException
	{
		WebDriver driver=null;
	String browser=	System.getProperty("browser");
	switch(browser)
	{
	case "chrome":
		System.getProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		
	driver =new ChromeDriver();
	break;
	case "firefox":
	driver= new FirefoxDriver();
	break;
	case "edge":
	driver= new EdgeDriver();
	
	default:
		System.out.println("invalid browser info");
	
	
	}
	Thread.sleep(2000);
	driver.quit();
	}

}
