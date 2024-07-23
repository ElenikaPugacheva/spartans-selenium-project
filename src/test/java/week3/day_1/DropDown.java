package week3.day_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
        WebElement  element = driver.findElement(By.id("programmingLanguageSelect"));
        Select programmingSelect = new Select(element);
        //option 1 select by index number
        programmingSelect.selectByIndex(2);
        // option 2 select by value attribute
        programmingSelect.selectByValue("cPlusPlus");
        // option 3 by visible text
        programmingSelect.selectByVisibleText("C#");
    }
}
