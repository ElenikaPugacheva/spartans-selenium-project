package week2.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class TagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        By anchorsTag = By.tagName("a");

        // method findElements return list<WebElements> contains all the elements finds with By strategy
        List<WebElement> anchorsTagElm= driver.findElements(anchorsTag);
        System.out.println(anchorsTagElm.size());

        // print all the links from the page
        for (WebElement element: anchorsTagElm){
            System.out.println(element.getText());
        }
        // find how many images in the web page
        By imageTag = By.tagName("img");
        List<WebElement> imageTagElm = driver.findElements(imageTag);
        System.out.println(imageTagElm.size());

        // find how many buttons are there
        By buttons = By.tagName("button");
        List<WebElement> buttonElm = driver.findElements(buttons);
        System.out.println(buttonElm.size());

        // print all the buttons
        for(WebElement button: buttonElm){
            // if we want to print only buttons with the text use if statement
            //String text = element.getText();
            //if(!text.isEmpty())
            //Sout(text);
            System.out.println("Button text- " + button.getText());
        }
        driver.quit();
    }
}
