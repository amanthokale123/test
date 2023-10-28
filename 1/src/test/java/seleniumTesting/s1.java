package seleniumTesting;
import org.openqa.selenium.WebDriver;
import org.testng.*;

import io.github.bonigarcia.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class s1 {
 public void testLogin(){
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://google.com");
	 driver.close()
	 
 }
}
