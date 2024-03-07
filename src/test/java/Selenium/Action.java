package Selenium;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action {
    WebDriver driver;
    @BeforeMethod
    public void Driver(){
        driver = new ChromeDriver();
    }
    @Test
    public void contextClick() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        Actions actions = new Actions(driver);
        actions.contextClick(pass).perform();
    }
    @Test
    public void dragAndDrop1(){
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
        WebElement des = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
        Actions action = new Actions(driver);
        // here action cursor will go to src then click and hold
        action.moveToElement(src).clickAndHold().perform();
        // here action cursor will release to des
        action.release(des).perform();
    }
    @Test
    public void dragAndDrop2() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
        WebElement des = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        // here pre-defined single function is use to drag and drop
        action.dragAndDrop(src,des).perform();
    }
    @Test
    public void doubleClick() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        action.doubleClick(email).perform();
        action.sendKeys("prakash.zodge@bridgelabz.com").perform();
        Thread.sleep(1000);
        action.doubleClick(pass).perform();
    }
    @Test
    public void keyboardMethod() throws InterruptedException {
        driver.get("https://github.com/prakash-zodge-bridgelabz");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(500);
        action.sendKeys(Keys.DOWN).perform();
    }
    @Test
    public void googleShortcuts() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.name("q"));
        Actions action = new Actions(driver);
        action.sendKeys("blockchain based voting system ppt").perform();
        Thread.sleep(500);
        action.keyDown(Keys.CONTROL).sendKeys("A").perform();
        action.keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);
        action.keyDown(Keys.CONTROL).sendKeys("X").perform();
        action.keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);


//        action.keyDown(Keys.CONTROL).sendKeys("T").keyUp(Keys.CONTROL).perform();             Not working

//        driver.switchTo().newWindow(WindowType.TAB);

        Thread.sleep(500);
        action.keyDown(Keys.CONTROL).sendKeys("A").perform();
        action.keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);
        action.keyDown(Keys.CONTROL).sendKeys("V").perform();
        action.keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);
        action.keyDown(Keys.ENTER).perform();

    }
}
