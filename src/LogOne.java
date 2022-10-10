import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOne {
			public static void main(String[] args) {
			org.apache.logging.log4j.Logger log = LogManager.getLogger(LogOne.class.getName());
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Ak\\eclipse-workspace\\Log4j2\\Driver\\chromedriver.exe");
				log.debug("Test execution has started");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				log.debug("Chrome broweser started");
				driver.get("http://omayo.blogspot.com/");
				log.debug("Naviaget to the url successfully");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("blogsmenu")).click();
			log.debug("Test execution has started");
			driver.navigate().back();
			driver.navigate().forward();
			if(driver.getTitle().equals("omayo (QAFox.com) - Atom"))
			{
				log.info("Success: The Correct title got displayed");
			}
			else {
				log.error("wrong title displayed");
			}
					
			driver.close();
		}


	}


