package board.testing.software.testbase;


import board.testing.software.propertyreader.PropertyReader;
import board.testing.software.utilites.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utilities {


    String browser = PropertyReader.getInstance().getProperty("browser");


    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }



    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
