package week2.UsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PS5Activity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(2000);

        By videoGames = By.xpath("//img[@alt='Video Games']");
        driver.findElement(videoGames).click();

        Thread.sleep(2000);

        By ps5 = By.xpath("//img[@alt='PlayStation 5 Console']");
        driver.findElement(ps5).click();

        Thread.sleep(2000);

        By addToCart = By.xpath("//button[@id='addToCartBtn']");
        driver.findElement(addToCart).click();

        driver.quit();





    }
}
