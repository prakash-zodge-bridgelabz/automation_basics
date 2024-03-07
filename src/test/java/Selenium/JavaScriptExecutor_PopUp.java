package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor_PopUp {
    WebDriver driver;
    @BeforeMethod
    public void Driver(){
        driver = new ChromeDriver();
    }
    @Test
    public void simpleAlert() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();
    }
    @Test
    public void simpleAlert2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();
    }
    @Test
    public void confirmationPopUp() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("confirmButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.dismiss();
    }
    @Test
    public void promptPopUp() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Prakash Zodge");
        Thread.sleep(2000);
        alert.accept();
    }
}
