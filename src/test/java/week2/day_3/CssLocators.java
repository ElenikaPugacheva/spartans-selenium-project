package week2.day_3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com");
        driver.findElement(By.cssSelector("#signinLink")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("elenavin5@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Mona3yo#");
        driver.findElement(By.cssSelector("#loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#accountLink")).click();
        String emailAcc = driver.findElement(By.cssSelector("#accountInformation > div.account__information-detail-wrapper > div > h1.account__information-email")).getText();
        System.out.println(emailAcc);
        driver.quit();
    }
}
