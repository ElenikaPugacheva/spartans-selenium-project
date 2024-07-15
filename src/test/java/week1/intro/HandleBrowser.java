package week1.intro;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBrowser {
    public static void main(String[] args) {
        // open browser chrome driver
        ChromeDriver chromeDriver = new ChromeDriver();
        // use this method to maximize the browser
        chromeDriver.manage().window().maximize();
        // use this method to minimize the browser
        chromeDriver.manage().window().minimize();
        // navigate to URL
        chromeDriver.get("http://google.com");
        // return string of application title
        String title = chromeDriver.getTitle();
        System.out.println(title);
        // close the browser
        chromeDriver.quit();
    }
}
