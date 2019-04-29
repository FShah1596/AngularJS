import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Angulartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fenil Shah\\Downloads\\chromedriver.exe");
		ChromeDriver wd = new ChromeDriver();
		
		wd.get("http://jsfiddle.net/Fenil96/3451k6o2/9/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//TestCase1
		//This test case checks for invalid input.
		wd.findElementById("keyword").sendKeys("ffghghgghghghg");
		wd.findElementById("search").click();
		WebElement norecord = wd.findElementByXPath("/html/body/div/div[2]");
		WebElement record = wd.findElementById("product");
		assert(norecord.isDisplayed());
		assert(!record.isDisplayed());
		wd.findElementById("keyword").clear();
		wd.findElementById("keyword").sendKeys("India");
		wd.findElementById("search").click();
		norecord = wd.findElementByXPath("/html/body/div/div[2]");
		record = wd.findElementById("product");
		assert(!norecord.isDisplayed());
		assert(record.isDisplayed());
		
		
		//Testcase 2
		//This checks whether all data is brought to initial state.
		wd.findElementById("reset").click();
		assert(record.isDisplayed());
		
	}

}
