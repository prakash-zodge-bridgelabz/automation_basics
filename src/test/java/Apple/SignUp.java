package Apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUp {
    public WebDriver driver;
    @Test
    public void sign_up() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("globalnav-menubutton-link-bag")));

        WebElement bag_icon = driver.findElement(By.id("globalnav-menubutton-link-bag"));
        bag_icon.click();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Sign in")));

        WebElement sign_in = driver.findElement(By.linkText("Sign in"));
        sign_in.click();

        //Thread.sleep(5000);
        //WebElement create_account = driver.findElement(By.xpath("//*[@id=\"create-link\"]"));
        //create_account.click();
    }
}
