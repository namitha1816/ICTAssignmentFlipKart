import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchPageObject {

    @FindBy( xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input" )
    public static WebElement credentials;

    @FindBy ( xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
    public static WebElement password;

    @FindBy( xpath=" /html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button " )
    public static WebElement submit;

    @FindBy( xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
    public static WebElement value;

    @FindBy( xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
    public static WebElement search;

    @FindBy ( xpath =" //*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div[1]/div/img")
    public static WebElement cart;
}
