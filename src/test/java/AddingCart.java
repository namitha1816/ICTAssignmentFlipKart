import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.LoginPageObject;
public class AddingCart {

     @Test
    public  void AddingCart(){


         System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
         WebDriver driver;
         driver=new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         PageFactory.initElements(driver,CartPageObject.class);
         CartPageObject.credentials.sendKeys("9562983240");

        CartPageObject.password.sendKeys("Flipcart@18");

         CartPageObject.submit.click();


         CartPageObject.value.sendKeys("iphone 11"+ Keys.ENTER);

         CartPageObject.search.click();

         CartPageObject.item.click();

        // CartPageObject.pin.sendKeys("682041"+ Keys.ENTER);
         //CartPageObject.check.click();


         CartPageObject.addCart.click();
     }

}
