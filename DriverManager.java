package JavaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static void main(String[] args) {

		/*WebDriverManager.firefoxdriver().setup(); 
		 		FirefoxDriver driver = new FirefoxDriver();*/ 
		//WebDriverManager.chromedriver().setup();	 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.irctc.co.in"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize(); 
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click(); 
		driver.findElementById("loginbutton").click(); 


	}

}
