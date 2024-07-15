package week1.week1_lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        In the Retail app, click on sign in then click on Create new Account,
        then fill up the form and sign up. Expectation is to Create a new Account.
        Once an account is created, make sure profile picture is displayed. (isDisplayed)
        And print result of isDisplayed method.
        Push to your repository
        */
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        By signIn= By.id("signinLink");
        WebElement signInBtn = driver.findElement(signIn);
        signInBtn.click();

        By createNewAccount = By.id("newAccountBtn");
        WebElement createNewAccountElm = driver.findElement(createNewAccount);
        createNewAccountElm.click();

        By name = By.id("nameInput");
        WebElement nameElm = driver.findElement(name);
        nameElm.sendKeys("Elena P");

        By email = By.id("emailInput");

        // teacher code for randomise email, very useful
        String emailprefix = "elenaPug";
        int number = (int) (Math.random()*100);
        String randomEmail=emailprefix+number+"@gmail.com";
        WebElement emailElm = driver.findElement(email);
        emailElm.sendKeys(randomEmail);
        // end point

        By password = By.id("passwordInput");
        WebElement passwordElm = driver.findElement(password);
        passwordElm.sendKeys("123456789Elena#");
        By confirmPassword = By.id("confirmPasswordInput");
        WebElement confirmPasswordElm = driver.findElement(confirmPassword);
        confirmPasswordElm.sendKeys("123456789Elena#");
        By signupBtn= By.id("signupBtn");
        WebElement signupBtnElm = driver.findElement(signupBtn);
        signupBtnElm.click();

        // Teacher way to solve this problem

       /* Thread.sleep(20000);
        By profileImage = By.id("profileImage");
        WebElement profileImageElm = driver.findElement(profileImage);
         if(profileImageElm.isDisplayed()){
            System.out.println("pass");
        }else {
             System.out.println("nt pass");*/

        // end point


        // My way of code
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement profileImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileImage")));
        if(profileImage.isDisplayed()){
            System.out.println("pass");
        }else { System.out.println("fail");
        }
        driver.quit();
    }
}
