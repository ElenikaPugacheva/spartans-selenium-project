package tek.intro;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBrowser {
    public static void main(String[] args) {
        // open browser chrome driver
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://google.com");
        chromeDriver.quit();
    }
}
