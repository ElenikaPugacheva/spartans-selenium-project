package CrossBrowsing;

//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsing {
    public static void main(String[] args) {
        //EdgeDriver driver = new EdgeDriver();
        FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().minimize();
        driver.get("http://google.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }
}
