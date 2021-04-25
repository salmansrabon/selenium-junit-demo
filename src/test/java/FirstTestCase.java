import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
    WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Test1() {

        driver.get("https://www.roadtosdet.com/selenium//");
        String text=driver.findElement(By.className("site-title")).getText();
        Assert.assertEquals(text.contains("Road to SDET"),true);

    }
    @After
    public void finishTest(){
        driver.close();
    }
}
