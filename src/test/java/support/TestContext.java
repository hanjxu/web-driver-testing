package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.maven.surefire.shared.lang3.SystemUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestContext {
    private static WebDriver driver;
    public static WebDriver getDriver() { return driver;}
    public static void initialize() {
        initialize("chrome", "local", false);
    }
    public static void teardown() { driver.quit();}
    public static void initialize(String browser, String testEnv, boolean isHeadless) {
        Dimension size = new Dimension(1920, 1080);
        Point position = new Point(0,0);
        if (testEnv.equals("local")) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    Map<String, Object> chromePreferences = new HashMap<>();
                    //0-disable/block, 1-enable/allow, 2-ask/prompt for permission
                    chromePreferences.put("profile.default_content_settings.geolocation", 2);
                    chromePreferences.put("profile.default_content_settings.popups", 0);  //block popup
                    chromePreferences.put("download.prompt_for_download", false);
                    /*Chrome should handle directory upgrades for downloads, potentially upgrading the download directory
                    if needed for improved security or usability. */
                    chromePreferences.put("download.directory_upgrade", true);
                    chromePreferences.put("download.default_directory", System.getProperty("user.dir") + "/src/test/resources/downloads");
                    chromePreferences.put("safebrowsing.enabled", false);
                    chromePreferences.put("plugins.always_open_pdf_externally", true);
                    chromePreferences.put("plugins.plugins_disabled", new ArrayList<String>(){{ add("Chrome PDF Viewer"); }});
                    chromePreferences.put("credentials_enable_service", false);
                    chromePreferences.put("password_manager_enabled", false);
                    // for EMEA(Europe, the Middle East, and Africa) only - disable cookies
//                    chromePreferences.put("profile.default_content_setting_values.cookies", 2);
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    chromeOptions.setExperimentalOption("prefs", chromePreferences);
                    /* ChromeDriver's logging output is suppressed, which means that some of the verbose messages or
                    logs that would usually be printed to the console or log files during test execution might not be displayed.
                    This property can be particularly useful when running tests in a production environment or when you
                    don't need detailed driver logs cluttering your console output or logs.*/
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                    if (SystemUtils.IS_OS_MAC) {
                        chromeOptions.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
                    } else if (SystemUtils.IS_OS_WINDOWS) {
                        chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                    } else if (SystemUtils.IS_OS_LINUX) {
                        chromeOptions.setBinary("/opt/google/chrome/chrome");
                    }
                    /*using a headless browser with Selenium, the browser operates entirely in memory, allowing automated scripts to
                    interact with web pages, execute JavaScript, perform tests, and simulate user interactions without the need for
                    a physical browser window to be opened.fast,resource efficient(no need to render UI elements),server-side CI/CD*/
                    if (isHeadless) {
                        chromeOptions.setHeadless(true);
                        chromeOptions.addArguments("--window-size=" + size.getWidth() + "," + size.getHeight());
                        /*hardware acceleration is disabled using --disable-gpu, the Chrome browser uses software rendering instead of
                        relying on the GPU for rendering graphics and visual elements. This can sometimes be useful in troubleshooting
                        graphics-related issues or when running Chrome in headless mode, as some environments or setups might have
                        compatibility issues with GPU acceleration.*/
                        chromeOptions.addArguments("--disable-gpu");
                    }
                    ChromeDriverService service = new ChromeDriverService.Builder()
                            .withLogOutput(System.out)
                            .build();
                    driver = new ChromeDriver(service, chromeOptions);
                    break;
                default:
                    throw new RuntimeException("Driver is not implemented for: " + browser);
            }
        }
    }
    public static Map<String, String> getDataFromFile(String fileName) {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/data/" + fileName;
            InputStream stream = new FileInputStream(path);
            return new Yaml().load(stream);
        } catch (FileNotFoundException ex) {
            throw new Error(ex);
        }
    }
    public static int ageCalculator(int year, int month, int day) {
        LocalDate birthDate = LocalDate.of(year,month,day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate,currentDate);
        return period.getYears();
    }
 }
