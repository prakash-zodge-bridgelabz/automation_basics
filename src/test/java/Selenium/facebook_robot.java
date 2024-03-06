package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class facebook_robot {
    WebDriver driver;
    @Test
    public void login(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        // Absolute path - html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input
        driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("abc.def");
        // Relative path - //form/div[1]/div[2]/div/input
        driver.findElement(By.xpath("//form/div[1]/div[2]/div/input")).sendKeys("abc");
        // Expression with relative path
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.navigate().back();

        // Expression using text() function
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        // Expression using multiple selectors
        driver.findElement(By.xpath("//input[@name='firstname'][@type='text']")).sendKeys("Prakash");
        // contains()
        driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Zodge");
        driver.close();
    }
    // Robot login
    @Test
    public void robot_login() throws AWTException, InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Robot robot = new Robot();
        robot.mouseMove(300,300);
        robot.mouseWheel(2);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        //select
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        //copy
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        //paste
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

    }
}
