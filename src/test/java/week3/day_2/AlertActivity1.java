package week3.day_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertActivity1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("promptBtn")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello Elena");
        alert.accept();
        WebElement messageElm = driver.findElement(By.id("message"));
        String messageTxt = messageElm.getText();
        System.out.println(messageTxt);
        driver.quit();

    }
}
