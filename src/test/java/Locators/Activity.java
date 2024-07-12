package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        // find the login button and click on it
        By signIn= By.id("signinLink");
        WebElement signInBtn = driver.findElement(signIn);
        signInBtn.click();
        // input user email
        By emailUser = By.id("email");
        WebElement emailUserInput = driver.findElement(emailUser);
        emailUserInput.sendKeys("agml@gmail.com");
        // input user password
        By passwordUser = By.id("password");
        WebElement passwordUserInput = driver.findElement(passwordUser);
        passwordUserInput.sendKeys("123456abcd");
        // press login buttonW
        By loginBtn = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtn);
        loginBtnElement.click();


    }
}
