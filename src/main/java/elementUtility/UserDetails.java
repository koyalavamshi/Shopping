package elementUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserDetails {
    public WebDriver driver;

    public UserDetails(WebDriver driver){
        this.driver = driver;
    }

    private By firstN = By.id("BillingNewAddress_FirstName");
    private By lastN = By.id("BillingNewAddress_LastName");
    private By email = By.id("BillingNewAddress_Email");
    private By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    private By city    = By.id("BillingNewAddress_City");
    private By Address = By.id("BillingNewAddress_Address1");
    private By postcode = By.id("BillingNewAddress_ZipPostalCode");
    private By phoneN = By.id("BillingNewAddress_PhoneNumber");
    private By continuebtn = By.xpath("//button[@onclick='Billing.save()']");


    public void enterfirstname(String First_Name){
        driver.findElement(firstN).sendKeys(First_Name);
    }
    public void enterlastname(String Last_Name){
        driver.findElement(lastN).sendKeys(Last_Name);
    }
    public void enterEmail(String Email){
        driver.findElement(email).sendKeys(Email);
    }
    public void entercountryN(){
        Select select = new Select(driver.findElement(country));
        select.selectByVisibleText("India");
    }
    public void entercityN(String City){
        driver.findElement(city).sendKeys(City);
    }
    public void enteraddress(String Address_1){
        driver.findElement(Address).sendKeys(Address_1);
    }
    public void enterpostcode(String postal_code){
        driver.findElement(postcode).sendKeys(postal_code);
    }
    public void enterphoneN(String Phone_number){
        driver.findElement(phoneN).sendKeys(Phone_number);
    }
    public void clickoncontinuebtn(){
        driver.findElement(continuebtn).click();
    }

}
