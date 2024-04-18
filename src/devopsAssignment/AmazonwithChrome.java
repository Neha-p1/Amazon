package devopsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonwithChrome {

	public static void main(String[] args) {
		String baseUrl = "https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver123.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(ddown);
        select.selectByVisibleText("Electronics");
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
