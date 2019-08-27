package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenClass
{
    static 
    {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
    
    @Test
    public void launchBrowser() 
    {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://www.google.com/");
    	
    }
}
