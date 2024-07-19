package week2.day_4_lab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.findElement(By.cssSelector("#signinLink")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement emailInp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login__input")));
        emailInp.sendKeys("elenavin5@gmail.com");

        WebElement passwordInp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='password']")));
        passwordInp.sendKeys("Mona3yo#");

        driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();

        WebElement accountClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#accountLink")));
        accountClick.click();

        WebElement addPhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"personalPhoneInput\"]")));
        addPhoneNumber.clear();
        addPhoneNumber.sendKeys("347-123-1234");

        driver.findElement(By.xpath("//button[@id=\"personalUpdateBtn\"]")).click();

        WebElement successUpdateMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'Toastify__toast-body')]//div[text()='Personal Information Updated Successfully']\n")));
        System.out.println(successUpdateMsg.getText());

        driver.quit();
    }
}
