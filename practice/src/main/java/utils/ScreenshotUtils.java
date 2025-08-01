package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	public static String takeScreenshot(WebDriver driver,String testName)
	{
		String timestamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = testName+"_"+timestamp+".png";
        String destination = "practice/screenshot/" + screenshotName;
        
        File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
        	FileUtils.copyFile(scr,new File(destination));
        }
        catch(IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
	}
        return destination;

}
}