package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
}
