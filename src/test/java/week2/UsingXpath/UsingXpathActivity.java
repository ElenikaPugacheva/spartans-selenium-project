package week2.UsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathActivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        By computerNameElm = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/h1");
        String text = driver.findElement(computerNameElm).getText();
        System.out.println(text);
        driver.quit();
    }
}
