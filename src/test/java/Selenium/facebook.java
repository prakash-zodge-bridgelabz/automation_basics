package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class facebook {
    WebDriver driver;
    @Test
    public void getAllInfo() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String pageResource = driver.getPageSource();

        //backward and forward
        driver.navigate().to("https://leetcode.com/user4417TL/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        System.out.println("Title : "+title+"\nCurrent URL : "+url+"\nPage Resource : "+pageResource);
        driver.close();
    }

    @Test
    public void login() throws IOException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("abc.def");
        driver.findElement(By.id("pass")).sendKeys("abc");
        driver.findElement(By.name("login")).click();
        //taking screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File SFile = ts.getScreenshotAs(OutputType.FILE);
        File DFile = new File("D:\\Quality Kiosk SDET\\Application Interface & E2E QA\\AutomationScripts\\Screenshots\\login\\login.png");
        FileHandler.copy(SFile,DFile);
        driver.close();
    }
    // create new accout -- xpath and with different locators
    @Test
    public void createNewAccount() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Prakash");
        driver.findElement(By.name("lastname")).sendKeys("Zodge");
        driver.findElement(By.name("reg_email__")).sendKeys("abc.def@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Pass@123");
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByValue("11");
        driver.findElement(By.id("day")).click();
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Jun");
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("1999");
//        WebElement maleRadioBtn = driver.findElement(By.);        Error
//        maleRadioBtn.click();

        driver.findElement(By.name("websubmit")).click();
    }
}
