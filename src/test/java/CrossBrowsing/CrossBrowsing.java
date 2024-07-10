package CrossBrowsing;

import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowsing {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();

        driver.manage().window().minimize();
        driver.get("http://google.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }
}
