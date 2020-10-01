
package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageObject {


    @FindBy( xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input" )
    public static WebElement credentials;

    @FindBy ( xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
    public static WebElement password;

    @FindBy( xpath=" /html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button " )
    public static WebElement submit;




}

