package week1.CrossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class CrossBrowsingHandling {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Choose browser: chrome, firefox, edge - ");
        String browserType = scn.next();
        // WebDriver interface
        WebDriver driver;
        if(browserType.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equals("firefox")){
            driver =new FirefoxDriver();
        } else if (browserType.equals("edge")){
            driver = new EdgeDriver();
        } else{
            throw new RuntimeException("wrong driver");
        }
        driver.get("http://google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
