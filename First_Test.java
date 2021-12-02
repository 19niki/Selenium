package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 02/12/2021
 * ->Their are two ways to run the selenium web driver this is the example for without
 * using any Build in tool
 * We need to download the selenium standalone server and add it in the Exterrnal JAR's
 * Then we need to download the driver for the respective browser and provide the Path
 * 
 * ->Another way is by using Build in tool which is done by Maven (Udemy course) 
 */
public class First_Test {

	public static void main(String[] args) 
	{
		
		String key = "webdriver.chrome.driver";
		String value = "E:\\Software\\Selenium\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.wattpad.com");
		String webtitle = driver.getCurrentUrl();
		System.out.println("The title of the web page is:"+ webtitle);
		driver.close();
	}

}
