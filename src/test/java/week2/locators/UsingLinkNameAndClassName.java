package week2.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsingLinkNameAndClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By signInLocator = By.linkText("Sign in");
        WebElement signInElm= driver.findElement(signInLocator);
        signInElm.click();

        By emailLocator = By.name("email");
        WebElement emailLocatorElm = driver.findElement(emailLocator);
        emailLocatorElm.sendKeys("wrong@gmail.com");

        By password = By.name("password");
        WebElement passwordElm = driver.findElement(password);
        passwordElm.sendKeys("123456789Elena#");

        By login = By.id("loginBtn");
        WebElement loginBtn = driver.findElement(login);
        loginBtn.click();

        Thread.sleep(3000);
        // getText() method will return error message // wrong username or password
        By error = By.className("error");
        WebElement errorMsg = driver.findElement(error);

        String errorText = errorMsg.getText();
        System.out.println(errorText);
        driver.quit();
    }
}
