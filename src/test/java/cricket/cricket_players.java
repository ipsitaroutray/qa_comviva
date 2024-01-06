package cricket;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cricket_players {
	
	public static void main(String args[]) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-2nd-test-1387604/full-scorecard");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[contains(.,'India 1st Innings')])[last()]")).click();
	
	List<WebElement> players=driver.findElements(By.xpath("(//span[contains(.,'1st Innings')][last()]/ancestor::div)[last()-1]/following-sibling::div/table[1]/tbody/tr[@class='']/td/div/a"));
	List<WebElement> playersscore=driver.findElements(By.xpath("(//span[contains(.,'1st Innings')][last()]/ancestor::div)[last()-1]/following-sibling::div/table[1]/tbody/tr[@class='']/td[3]/strong"));

	for(int i=0;i<players.size();i++) {
		System.out.println(players.get(i).getText()+"  score: "+playersscore.get(i).getText());
	}
	driver.quit();
	}
}
