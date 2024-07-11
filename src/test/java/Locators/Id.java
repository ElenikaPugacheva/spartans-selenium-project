package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        // locate the element
        By searchInput = By.id("searchInput");
        // find th element
        WebElement searchInputElement = driver.findElement(searchInput);
        // action
        searchInputElement.sendKeys("plug");

        By searchBtn =By.id("searchBtn");
        WebElement searchBtnElement = driver.findElement(searchBtn);
        searchBtnElement.click();

    }
}
