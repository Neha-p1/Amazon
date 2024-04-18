package devopsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonwithEdge {

	public static void main(String[] args) {
		
			String baseUrl = "https://www.amazon.in/";
			System.setProperty("webdriver.edge.driver","C:\\Software\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(baseUrl);
			
			WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
			Select select = new Select(ddown);
	        select.selectByVisibleText("Electronics");
			driver.findElement(By.id("nav-search-submit-button")).click();
		

	}

}
