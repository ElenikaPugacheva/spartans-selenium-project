package week2.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class SelfPracticing {
       public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://fireflyworlds.com/categories/all-games/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"post-9892\"]/div/div[2]/div/a")));
        driver.findElement(By.cssSelector("#post-9892 > div > div.menu-content-pro > div > div > a:nth-child(3) > div")).click();
           WebElement mainLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#main-logo > img")));
           if(mainLogo.isDisplayed()){
               System.out.println("Pass");
           }else {
               System.out.println("Fail");
           }
        driver.quit();
    }
}
