package devopsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AmazonWithFirefox {

	public static void main(String[] args) {
		String baseUrl = "https://www.amazon.in/";
		System.setProperty("webdriver.gecko.driver","C:\\Software\\Gecko\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		
		WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(ddown);
        select.selectByVisibleText("Electronics");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
