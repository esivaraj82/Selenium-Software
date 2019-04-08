package JavaProgram;

import java.io.File; 
import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
import javax.imageio.ImageIO; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 



public class FullScreen {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("http://jqueryui.com/draggable/");	 

		//Screenshot page = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver); 
		//ImageIO.write(page.getImage(),"PNG", new File("./snaps/page.png")); 
		Thread.sleep(2000); 
		driver.quit(); 


	}

}
