import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.LoginPageObject;
public class InvalidLogin {

    @Test
    public void InvalidLogin(){

        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        PageFactory.initElements(driver,LoginPageObject.class);


        LoginPageObject.credentials.sendKeys("9188431645");

        LoginPageObject.password.sendKeys("Namitha@1");

        LoginPageObject.submit.click();
        System.out.println("Invalid Password or Username");



    }
}
