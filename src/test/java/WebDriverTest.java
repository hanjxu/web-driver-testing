import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverTest {
    WebDriver driver;
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    @Before
    public void commonBefore() {
        System.out.println("Hello world from junit test.");
        WebDriverManager.chromedriver().setup();     //download webdriver
        ChromeOptions options = new ChromeOptions();  //define options to give bin path
        if (SystemUtils.IS_OS_WINDOWS) {
            options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        } else if (SystemUtils.IS_OS_MAC) {
            options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        }
        driver = new ChromeDriver(options);  //create driver with options
        System.out.println("Here is common before functions.");
    }

   @Test
    public void endToEnd() throws InterruptedException {
       driver.get("https://skryabin.com/market/quote.html");
       Thread.sleep(2000);
       driver.findElement(By.name("username")).sendKeys("jdoe");
       Thread.sleep(2000);
    }
    @Test
    public void negativeTest() throws InterruptedException {
        driver.get("https://skryabin.com/market/quote.html");
        Thread.sleep(2000);
        driver.findElement(By.id("formSubmit")).click();
        Thread.sleep(2000);
    }
    @After
    public void commonAfter() {
        driver.quit();
        System.out.println("Here is common after functions.");
    }

}
