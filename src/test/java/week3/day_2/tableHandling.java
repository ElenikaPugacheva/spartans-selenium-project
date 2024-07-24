package week3.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class tableHandling {
    public static void main(String[] args) {
        /*login with into https://dev.insurance.tekschool-students.com/
username: supervisor
 password: tek_supervisor
 go to plans section
 then print all the price from the table
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        driver.findElement(By.linkText("Plans")).click();
        WebElement motoelm = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));//Motorcycle
        String motValue = motoelm.getText();
        System.out.println("Price moto: " + motValue);
        WebElement boatelm = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));//Boat
        String boatValue = boatelm.getText();
        System.out.println("Price boat: " + boatValue);
        WebElement rentelm = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));//renters
        String rentValue = rentelm.getText();
        System.out.println("Price rent: " + rentValue);
        WebElement autoelm = driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]"));//auto
        String autoValue = autoelm.getText();
        System.out.println("Price auto: " + autoValue);
    }
}
