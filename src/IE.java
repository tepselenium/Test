import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_2.46.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.seleniumhq.org/download/");

	}

}
