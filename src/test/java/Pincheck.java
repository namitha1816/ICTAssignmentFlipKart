import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Pincheck {
    @Test
    public void Pincheck(){

        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        PageFactory.initElements(driver,PincheckPageObject.class);
        PincheckPageObject.credentials.sendKeys("9562983240");

        PincheckPageObject.password.sendKeys("Flipcart@18");

        PincheckPageObject.submit.click();


        PincheckPageObject.value.sendKeys("laptop"+ Keys.ENTER);

        PincheckPageObject.search.click();

        PincheckPageObject.item.click();

        PincheckPageObject.pin.sendKeys("682041"+ Keys.ENTER);
        PincheckPageObject.check.click();

    }



}
