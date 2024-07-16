package week2.UsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathPracticeFacebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        By facebookSlogan = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/h2");
        String text = driver.findElement(facebookSlogan).getText();
        System.out.println(text);
        driver.quit();
    }
}
