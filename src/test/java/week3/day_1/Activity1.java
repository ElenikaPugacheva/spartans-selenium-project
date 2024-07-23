package week3.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;

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
        List<WebElement> options= languageSelect.getOptions();
        int size = options.size();
        languageSelect.selectByIndex(size-1);
        //languageSelect.selectByValue("Italian");



    }
}
