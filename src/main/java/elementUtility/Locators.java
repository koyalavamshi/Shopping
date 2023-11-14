package elementUtility;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Locators {
    public WebDriver driver;

    public Locators(WebDriver driver) {
        this.driver = driver;
    }

    private By computers = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    private By desktop = By.xpath(("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']"));
    private By addtocart1 = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private By processor = By.xpath("//select[@id='product_attribute_1']");
    private By RAM = By.xpath("//select[@id='product_attribute_2']");
    private By HOD = By.id("product_attribute_3_7");
    private By addtocart2 = By.id("add-to-cart-button-1");
    private By shopping_cart = By.xpath("//span[@class='cart-label']");
    private By gotocart = By.xpath("//button[normalize-space()='Go to cart']");

    private By agree = By.id("termsofservice");
    private By checkout = By.id("checkout");
    private  By checkoutasguest = By.xpath("//button[normalize-space()='Checkout as Guest']");


    public void mouseoverOnComputers() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(computers)).build().perform();
    }

    public void selectDesktop(){
        driver.findElement(desktop).click();
    }
    public void clickOnAddtoCart1(){
        driver.findElement(addtocart1).click();
    }
    public void selectprocessor(){
        Select select = new Select(driver.findElement(processor));
        List<WebElement> options = select.getOptions();
        for (WebElement w:options)
        {
            System.out.println(w.getText());
        }
        select.selectByIndex(1);

    }
    public void selectRAM(){
        Select select = new Select(driver.findElement(RAM));
       List<WebElement> options = select.getOptions();
        for (WebElement w:options)
        {
            System.out.println(w.getText());
        }
        select.selectByIndex(2);
    }
    public void selectHod(){
        WebElement radio = driver.findElement(HOD);
        radio.click();
    }
    public void clickonaddtocart2(){
        driver.findElement(addtocart2).click();
    }
    public void mouseoveronshippingcart(){

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(shopping_cart)).build().perform();

    }
    public void clickongotocartbtn(){
        driver.findElement(gotocart).click();
    }
    public void clickOnagreeandcheckoutbtn() throws InterruptedException {
        driver.findElement(agree).click();
        Thread.sleep(2000);
        driver.findElement(checkout).click();
    }
    public void clickOncheckoutasGuest(){
        driver.findElement(checkoutasguest).click();
    }


}
