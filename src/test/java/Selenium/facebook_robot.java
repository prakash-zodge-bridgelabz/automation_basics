package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class facebook_robot {
    WebDriver driver;
    @Test
    public void login() throws InterruptedException {
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
        Thread.sleep(2000);
        // Expression using multiple selectors
        driver.findElement(By.xpath("//input[@name='firstname'][@type='text']")).sendKeys("Prakash");
        // contains()
        driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Zodge");

        // WebElement
        WebElement closeDiv =driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/img"));
        // getX and getY
        int closeDivX = closeDiv.getLocation().getX();
        int closeDivY = closeDiv.getLocation().getY();
        System.out.println("X : "+closeDivX+"\nY : "+closeDivY);
        closeDiv.click();
        Thread.sleep(2000);
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
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
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
