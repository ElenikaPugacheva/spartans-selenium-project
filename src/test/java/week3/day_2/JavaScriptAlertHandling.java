package week3.day_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptAlertHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("alertBtn")).click();
        // option 1 switching to alert, after the alert popped up
        Alert alert = driver.switchTo().alert(); // class
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();

        // Example
        alert.sendKeys("Entering the value for alert");
        alert.dismiss();

    }
}
