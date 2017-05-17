import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
public class SeleniumProjectClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/Viggi/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://www.apple.com");
		WebElement link = driver.findElement(By.xpath(".//*[@id='ac-globalnav']/div/ul[2]/li[2]/a"));
		Thread.sleep(2000);
		
		link.click();
		Thread.sleep(2000);
		WebElement link2 = driver.findElement(By.xpath(".//*[@id='ac-globalnav']/div/ul[2]/li[9]/a"));
		
		
		link2.click();
		Thread.sleep(3000);
		
		WebElement link3 = driver.findElement(By.xpath(".//*[@id='ac-gn-searchform-input']"));
		link3.sendKeys("iphone 7");
     	Thread.sleep(2000);
     	link3.sendKeys(Keys.ENTER);
     	
     	Thread.sleep(2000);
	    WebElement link4 =driver.findElement(By.xpath(".//*[@id='exploreCurated']/div[1]/div[2]/ul/li[2]/a"));
	    
	    link4.click();
		
	    Thread.sleep(2000);
		WebElement link5 = driver.findElement(By.xpath(".//*[@id='tabs_dimensionScreensize']/fieldset/div/div[1]/div[2]/div[2]/div[2]/span"));
		System.out.println( link5.getText());
		System.out.println("VERIFIED SUCESSFULLY");
		Thread.sleep(9000);
		driver.quit();

}

	

}
