package week2.UsingXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingXpathLogin_1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com");

        driver.findElement(By.xpath("//*[@id=\"signinLink\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"newAccountBtn\"]")).click();

        By name = By.xpath("//input[@id='nameInput']");
        WebElement nameElm = driver.findElement(name);
        nameElm.sendKeys("Elena Vi");

        By email = By.xpath("//input[@id='emailInput']");
        String emailprefix = "elenavin";
        int number = (int) (Math.random()*100);
        String randomEmail=emailprefix+number+"@gmail.com";
        WebElement emailElm = driver.findElement(email);
        emailElm.sendKeys(randomEmail);

        driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Mona3yo#");
        driver.findElement(By.xpath("//input[@id='confirmPasswordInput']")).sendKeys("Mona3yo#");

        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        driver.quit();




    }
}
