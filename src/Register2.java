//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register2 {
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
    driver.manage().window().maximize();
   long currentTime = System.currentTimeMillis();
    
    driver.findElement(By.linkText("LOGIN")).click();
    driver.findElement(By.linkText("Register")).click();
    
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("geo salas1");
    
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("geo@salas.com");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("2123456767");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("Tep" + currentTime);
    Thread.sleep(10000);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("tep123");
    driver.findElement(By.name("password2")).clear();
    driver.findElement(By.name("password2")).sendKeys("tep123");
    driver.findElement(By.name("Submit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
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

