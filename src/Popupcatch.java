import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Popupcatch {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("http://www.tdbank.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='td-layout-contentarea']/div/div[2]/div[2]/div/div/div/div/ul[1]/li[1]/a/span")).click();
		Thread.sleep(2000);
driver.findElement(By.xpath(".//*[@id='Button2']")).click();
//driver.findElement(By.name("formSubmit")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
