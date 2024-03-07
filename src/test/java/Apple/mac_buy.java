package Apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class mac_buy {
    public WebDriver driver;
    @Test
    public void buy() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"globalnav-list\"]/li[2]/div/div/div[2]/ul/li[1]/a/span[1]")));

        WebElement mac = driver.findElement(By.xpath("//*[@id=\"globalnav-list\"]/li[2]/div/div/div[2]/ul/li[1]/a/span[1]"));
        mac.click();

        Thread.sleep(3000);
        WebElement macAir = driver.findElement(By.xpath("//*[@id=\"chapternav\"]/div/ul/li[1]/a/span[1]"));
        macAir.click();

        Thread.sleep(5000);

        WebElement starlight = driver.findElement(By.xpath("//*[@id=\"finishes-gallery\"]/div[1]/fieldset/ul/li[2]/label/span"));
        starlight.click();

        WebElement buy_mac_14 = driver.findElement(By.xpath("//*[@id=\"main\"]/section[2]/div/div/div[4]/div/div/div/div[2]/a"));
        buy_mac_14.click();
    }
}
