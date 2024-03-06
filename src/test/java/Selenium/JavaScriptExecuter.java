package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecuter {
    WebDriver driver;
    @Test
    public void enterTextIntoDisabledTextField() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("D:\\Quality Kiosk SDET\\Application Interface & E2E QA\\AutomationScripts\\FrontEnd\\JavaScriptExecuter\\DisabledTextbox.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t1').value='Prakash'");
        Thread.sleep(2000);
        // clear
        js.executeScript("document.getElementById('t1').value=''");
        Thread.sleep(2000);
        // updating disabled textfield text
        js.executeScript("document.getElementById('t2').value='Zodge'");
    }

    @Test
    public void ScrollUpAndDown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumhq.org/download");
        //typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
            //scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
            //scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
    }
    @Test
    public void Frame_Demo() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("D:\\Quality Kiosk SDET\\Application Interface & E2E QA\\AutomationScripts\\FrontEnd\\JavaScriptExecuter\\Frame2.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        Thread.sleep(1000);

        driver.findElement(By.id("t1")).sendKeys("1");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        driver.findElement(By.id("t2")).sendKeys("2");
        Thread.sleep(1000);

        //using id attribute of the frame -string
        driver.switchTo().frame("f1");
        Thread.sleep(1000);

        driver.findElement(By.id("t1")).sendKeys("3");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("4");
        Thread.sleep(1000);

        //using name attribute of the frame -string
        driver.switchTo().frame("n1");
        Thread.sleep(1000);

        driver.findElement(By.id("t1")).sendKeys("5");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("6");
        Thread.sleep(1000);

        //using address of the frame -webelement
        WebElement f = driver.findElement(By.className("c1"));
        driver.switchTo().frame(f);
        driver.findElement(By.id("t1")).sendKeys("7");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("8");
        Thread.sleep(1000);

        driver.close();
    }
}
