package week3.day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Accessories']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Logitech MK270 Wireless Keyboard And Mouse Combo']"))).click();
        WebElement quantityElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product__select")));
        Select selectQuantity = new Select(quantityElm);
        selectQuantity.selectByVisibleText("5");
    }
}
