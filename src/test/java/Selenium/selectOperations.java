package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class selectOperations {
    WebDriver driver;
    @BeforeMethod
    public void Driver(){
        driver = new ChromeDriver();
    }
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
