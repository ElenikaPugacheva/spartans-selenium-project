package week1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fixing_Jawid_Code {
    public static void main(String[] args) throws InterruptedException {
        /*
        In the Retail app, click on sign in then click on Create new Account,
        then fill up the form and sign up. Expectation is to Create a new Account.
        Once an account is created, make sure profile picture is displayed. (isDisplayed)
        And print result of isDisplayed method.
        Push to your repository
        */

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By createNewAccountLocator = By.linkText("Create New Account");
        WebElement createNewAccountElement = driver.findElement(createNewAccountLocator);
        createNewAccountElement.click();

        By inputNameLocator = By.id("nameInput");
        WebElement inputNameElement = driver.findElement(inputNameLocator);
        inputNameElement.sendKeys("Jawid");

       // add this line before string - By email = By.id("emailInput");
        String emailPrefix = "jawid_spartans"; // this URL system is not letting us use '_' this element
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";
        // u need to find web element before U send keys. Use this line - WebElement emailElm = driver.findElement(email);
        inputNameElement.sendKeys(randomEmail); // U cannot use input name element in the email block

        // you don't need this part anymore, it gives u a duplication in your email

        /*By inputEmailLocator = By.id("emailInput");
        WebElement inputEmailElement = driver.findElement(inputEmailLocator);
        inputEmailElement.sendKeys(randomEmail);*/

        By inputPasswordLocator = By.id("passwordInput");
        WebElement inputPasswordElement = driver.findElement(inputPasswordLocator);
        inputPasswordElement.sendKeys("Jawid4321@$$");

        By confirmPasswordInputLocator = By.id("confirmPasswordInput");
        WebElement confirmPasswordInputElement = driver.findElement(confirmPasswordInputLocator);
        confirmPasswordInputElement.sendKeys("Jawid4321@$$");

        By signupBtnLocator = By.id("signupBtn");
        WebElement signupBtnElement = driver.findElement(signupBtnLocator);
        signupBtnElement.click();

        Thread.sleep(2000);
        By profileImageLocator = By.id("profileImage");
        WebElement profileImageElement = driver.findElement(profileImageLocator);
        boolean profile = profileImageElement.isDisplayed();
        System.out.println(profile);


        driver.quit();

    }
}