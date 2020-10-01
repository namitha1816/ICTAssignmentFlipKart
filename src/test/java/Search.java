import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.LoginPageObject;
public class Search {

    @Test
    public void Search(){

        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        PageFactory.initElements(driver,SearchPageObject.class);


        SearchPageObject.credentials.sendKeys("9188431645");

        SearchPageObject.password.sendKeys("Namitha@18");

        SearchPageObject.submit.click();

        SearchPageObject.value.sendKeys("iphone"+ Keys.ENTER);

        SearchPageObject.search.click();
    }
}
