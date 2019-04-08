package JavaProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.net.MalformedURLException; 
import java.util.Properties; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.remote.LocalFileDetector; 
import org.openqa.selenium.remote.RemoteWebElement; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 



public class UploadFile {

	Properties prop = null; 

	@BeforeTest 
	public void loadObject() throws FileNotFoundException, IOException { 
		prop = new Properties(); 
		prop.load(new FileInputStream("C:\\Users\\sysd\\Desktop\\PatternObjectModel\\FRG.properties")); 
	}	 

	@Test 
	public void upload() throws MalformedURLException{ 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("https://www.naukri.com/"); 
		System.out.println(prop.getProperty("Myhome.leads.Link")); 
		WebElement upload = driver.findElementByXPath(prop.getProperty("Myhome.leads.Link")); 

	}

	@Test
	public void uploadFileUsingRobot() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.naukri.com/");	 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
		driver.findElementById("input_resumeParser").click(); 
		Thread.sleep(10000); 
		
		// Store the copied text in the clipboard 
		StringSelection stringSelection = new StringSelection("C:\\Users\\TestLeaf\\Desktop\\ALERT.pptx"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null); 
		
		// Paste it using Robot class 
		Robot robot = new Robot(); 
		
		// Enter to confirm it is uploaded 
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_V); 


		robot.keyRelease(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 

		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER); 

	}
}

