package support;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileOutputStream;
import java.io.IOException;

public interface Screenshot {
    default  void takeScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) TestContext.getDriver();
        byte[] bytes = screenshot.getScreenshotAs(OutputType.BYTES);
        saveToFile(bytes, "screenshot"+TestContext.timeStamp, "png");
    }
    default  void saveToFile(byte[] bytes, String fileName, String format) {
        String path = System.getProperty("user.dir") + "/src/test/resources/data/" + fileName + "." + format;
        try (FileOutputStream stream = new FileOutputStream(path)) {
            stream.write(bytes);
            stream.flush();
        }catch (IOException e) {
            throw new Error(e);
        }
    }
}
