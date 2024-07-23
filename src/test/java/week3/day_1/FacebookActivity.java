package week3.day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class FacebookActivity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Elena");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname"))).sendKeys("P");
        By email = By.name("reg_email__");
        String emailPrefix = "elevi";
        int number = (int)(Math.random()*100);
        String randomEmail = emailPrefix+number+"@yahoo.com";
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(randomEmail);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__"))).sendKeys("Mona#3yo");
        WebElement monthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
        Select monthSelect = new Select(monthElm);
        monthSelect.selectByIndex(1);
        WebElement dayElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
        Select daySelect = new Select(dayElm);
        daySelect.selectByIndex(13);
        WebElement yearElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        Select yearSelect = new Select(yearElm);
        yearSelect.selectByVisibleText("1991");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='1']"))).click();
    }
}
