package week2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        By signIn = By.className("top-nav__btn");
        WebElement signInBtn = driver.findElement(signIn);
        signInBtn.click();

        By createNewAccount = By.linkText("Create New Account");
        WebElement createNewAccountElm = driver.findElement(createNewAccount);
        createNewAccountElm.click();

        By name = By.id("nameInput");
        WebElement nameElm = driver.findElement(name);
        nameElm.sendKeys("Elena P");

        By email = By.name("email");
        String emailprefix = "elnPg";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailprefix + number + "@gmail.com";
        WebElement emailElm = driver.findElement(email);
        emailElm.sendKeys(randomEmail);

        By password = By.name("password");
        WebElement passwordElm = driver.findElement(password);
        passwordElm.sendKeys("123456789Elena#");
        By confirmPassword = By.name("confirmPassword");
        WebElement confirmPasswordElm = driver.findElement(confirmPassword);
        confirmPasswordElm.sendKeys("123456789Elena#");
        By signupBtn = By.id("signupBtn");
        WebElement signupBtnElm = driver.findElement(signupBtn);
        signupBtnElm.click();

        driver.quit();
    }
}
