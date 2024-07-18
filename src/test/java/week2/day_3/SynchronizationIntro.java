package week2.day_3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SynchronizationIntro {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com");

        //Applying Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Apply Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink")));
        element.click();

        WebElement inputElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        inputElm.sendKeys("wrong@gmail.com");

        WebElement passwordElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordElm.sendKeys("wrong123#");

        driver.findElement(By.cssSelector("#loginBtn")).click();

        WebElement errorElm = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("error")));
        System.out.println(errorElm.getText());

        driver.quit();





    }
}
