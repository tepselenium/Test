import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Register3 {

	
	
	public static void main(String[] args) throws Exception {
		
		// open the FF Browser
		// Print "Open the FF Browser"
		System.out.println("Open the FF Browser");
		WebDriver driver = new FirefoxDriver();
		
		// make the window maximize
		driver.manage().window().maximize();
		// This line open the webloadmpstore site
		//driver.get("http://www.webloadmpstore.com/");
		driver.get("http://www.webloadmpstore.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[2]/td[2]/input")).sendKeys("Tep Selenium");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td[2]/input")).sendKeys("tep.selenium@gmail.com");
		
		Thread.sleep(10000);
	   
		/*
	     System.out.println("Please wait for 5 secs");
		Thread.sleep(5000);
		System.out.println("close the ff Browser");
		System.out.println("The test is pass");
	     */
		System.out.println("Please wait for 5 secs");
		Thread.sleep(5000);
		System.out.println("close the ff Browser");
		System.out.println("The test is pass");
		driver.quit();
		

	}

}
