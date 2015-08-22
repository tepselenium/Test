package Tep;

//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.tepeople.com/Contact.php";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://www.tepeople.com/Contact.php");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
   // driver.findElement(By.linkText("Contact US")).click();
    /*
    driver.findElement(By.xpath("//input[@name='firstname']")).clear();
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tep");
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("Selenium");
    driver.findElement(By.cssSelector("input[name=\"phone_no\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"phone_no\"]")).sendKeys("9735575158");
    driver.findElement(By.xpath("//input[@name='email']")).clear();
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tep.selenium@tep.com");
    driver.findElement(By.name("training_program")).clear();
    driver.findElement(By.name("training_program")).sendKeys("selenium");
    */
    driver.findElement(By.name("comment")).clear();
    driver.findElement(By.name("comment")).sendKeys("I am interested in Selenium Course.");
    driver.findElement(By.cssSelector("div.btn > input[type=\"submit\"]")).click();
    Thread.sleep(5000);
   // Alert alert = 
    System.out.println(driver.switchTo().alert().getText());
   // driver.switchTo().alert().getText()
    driver.switchTo().alert().accept();
    driver.findElement(By.xpath("//input[@name='firstname']")).clear();
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tep");
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("Selenium");
    driver.findElement(By.cssSelector("input[name=\"phone_no\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"phone_no\"]")).sendKeys("9735575158");
    driver.findElement(By.xpath("//input[@name='email']")).clear();
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tep.selenium@tep.com");
    driver.findElement(By.name("training_program")).clear();
    driver.findElement(By.name("training_program")).sendKeys("selenium");
    driver.findElement(By.name("comment")).clear();
    driver.findElement(By.name("comment")).sendKeys("I am interested in Selenium Course.");
    driver.findElement(By.cssSelector("div.btn > input[type=\"submit\"]")).click();
    
    System.out.println("Successfully send the contact request");
    driver.quit();
    
    
  }
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
