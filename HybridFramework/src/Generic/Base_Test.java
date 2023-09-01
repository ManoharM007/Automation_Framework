package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_Constant
{
	
public WebDriver driver;
@BeforeMethod
public void openApp()
{
System.setProperty(Chrome_key, chrome_val);
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get(baseURL);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
public void closeApp()
{
	driver.close();
}
}
