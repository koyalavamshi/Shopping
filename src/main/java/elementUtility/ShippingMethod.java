package elementUtility;

import jdk.javadoc.doclet.Reporter;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static jdk.javadoc.doclet.Reporter.*;
import static utility.Log4j.Log;

public class ShippingMethod {
    public WebDriver driver;

    public ShippingMethod(WebDriver driver) {
        this.driver = driver;

    }

    private By groundbtn = By.id("shippingoption_0");
    private By continuebtn = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private By moneyorderbtn = By.id("paymentmethod_0");
    private By conti = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    private By co = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By confirm = By.xpath("//button[normalize-space()='Confirm']");
    private By text = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");



    public void clickongroundbtn(){
        driver.findElement(groundbtn).click();
    }
    public void clickoncontinuebtn(){
        driver.findElement(continuebtn).click();
    }
    public void clickoncmoneyorderbtn(){
        driver.findElement(moneyorderbtn).click();
    }
    public void clickoncontibtn(){
        driver.findElement(conti).click();
    }
    public void clickonconbtn(){
        driver.findElement(co).click();
    }
    public void clickonconfirmbtn(){
        driver.findElement(confirm).click();
    }
    public void verifytext(){

       WebElement txt =  driver.findElement(text);
       System.out.println(txt.getText());
       driver.quit();
    }

}
