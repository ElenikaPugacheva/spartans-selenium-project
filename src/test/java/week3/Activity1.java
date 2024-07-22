package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);

        WebElement countryElm = driver.findElement(By.id("countrySelect"));
        Select countrySelect = new Select(countryElm);
        countrySelect.selectByIndex(2);
        Thread.sleep(1000);
        WebElement languageElm = driver.findElement(By.id("languageSelect"));
        Select languageSelect = new Select(languageElm);
        languageSelect.selectByValue("Italian");


    }
}
