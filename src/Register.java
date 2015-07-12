
//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.webloadmpstore.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://www.webloadmpstore.com/");
   // This line will maximize the window
    driver.manage().window().maximize();
    // put wait time second
    Thread.sleep(1000);
    driver.findElement(By.linkText("LOGIN")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    driver.findElement(By.xpath("//input[@name='name']")).clear();
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("tep selenium6");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[name=\"email\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("tep.selenium6@tep.com");
    driver.findElement(By.xpath("//input[@name='phone']")).clear();
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9732343234");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("tepselenium7");
    Thread.sleep(1000);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("team1234");
    Thread.sleep(1000);
    driver.findElement(By.name("password2")).clear();
    driver.findElement(By.name("password2")).sendKeys("team1234");
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(5000);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private void fail(String verificationErrorString) {
	// TODO Auto-generated method stub
	
}

private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
