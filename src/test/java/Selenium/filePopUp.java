package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class filePopUp {
    WebDriver driver;
    @BeforeMethod
    public void Driver(){
        driver = new ChromeDriver();
    }
    // au3 code :
//    ControlFocus("Open","","[CLASS:Edit;INSTANCE:1]")
//    ControlSetText("Open","","[CLASS:Edit;INSTANCE:1]","C:\Users\praka\Downloads\Polymosphism.pdf")
//    ControlClick("Open","","[CLASS:Button;INSTANCE:1]")
    @Test
    public void fileUpload() throws InterruptedException, IOException {
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Quality Kiosk SDET\\Application Interface & E2E QA\\au3 files\\Polymorphism_pdf.exe");
        Thread.sleep(3000);
    }
    @Test
    public void getChromeID(){
        driver.get("https://leetcode.com/user4417TL/");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
    }
}
