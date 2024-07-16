package week2.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Tek school");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.partialLinkText("TEK SCHOOL")).click();
        driver.quit();
    }
}
