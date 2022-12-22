package e_commerce_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	protected static WebDriver driver;//add static keyword for unicness
	public void launchBrowser() throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\AtomationSelen\\chromedriverr\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com");
	System.out.println("Lounch Browser");
	Thread.sleep(2000);
}}
