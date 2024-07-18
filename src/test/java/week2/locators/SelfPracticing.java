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

        driver.findElement(By.xpath("//h3[text()='Stronghold: Definitive Edition']/following-sibling::a[2]")).click();
           ////h3[text()='Stronghold: Definitive Edition']/following-sibling::a[2]
        driver.findElement(By.cssSelector("#main-logo > img"));

           /*if(mainLogo.isDisplayed()){
               System.out.println("Pass");
           }else {
               System.out.println("Fail");
           }
           WebDriver webDriver = new ChromeDriver();
           webDriver.manage().window().maximize();
           webDriver.get("https://retail.tekschool-students.com/");

           webDriver.findElement(By.xpath("//*[@id=\"home\"]")).click();
           Thread.sleep(2000);
           webDriver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[1]/div[1]/div/div/div[2]/img")).click();
           Thread.sleep(2000);
           webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[1]/img")).click();
           */
        driver.quit();
    }
}
