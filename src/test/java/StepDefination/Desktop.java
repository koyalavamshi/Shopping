package StepDefination;

import base.TestBase;
import elementUtility.Locators;
import elementUtility.ShippingMethod;
import elementUtility.UserDetails;
import io.cucumber.java.en.*;
import org.example.Main;

import java.io.IOException;

public class Desktop extends Main {
    Locators locators = new Locators(webDriverManager());
    UserDetails userDetails = new UserDetails(webDriverManager());

    ShippingMethod shippingMethod = new ShippingMethod(webDriverManager());

    public Desktop() throws IOException {
    }


    @Given("mouse over on computer and select the item desktops")
    public void mouse_over_on_computer_and_select_the_item_desktops() throws InterruptedException {
        locators.mouseoverOnComputers();
        Thread.sleep(5000);
        locators.selectDesktop();

    }

    @When("click on add to cart")
    public void click_on_add_to_cart() throws InterruptedException {
        locators.clickOnAddtoCart1();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());

    }

    @When("Select processer and RAM from dropdown options and also from HOD select the radio button options")
    public void select_processer_and_ram_from_dropdown_options_and_also_from_hod_select_the_radio_button_options() throws InterruptedException {
        locators.selectprocessor();
        System.out.println(driver.getTitle());
        locators.selectRAM();
        Thread.sleep(3000);
        locators.selectHod();

    }

    @Then("click on ADD TO CART btn")
    public void click_on_add_to_cart_btn() throws InterruptedException {
         locators.clickonaddtocart2();
         Thread.sleep(6000);

    }

    @Then("mouseover on shopping cart and click on GO TO CART btn")
    public void mouseover_on_shopping_cart_and_click_on_go_to_cart_btn() {
        locators.mouseoveronshippingcart();
        locators.clickongotocartbtn();

    }

    @Then("click on check box I agree and click on checkout btn")
    public void click_on_check_box_i_agree_and_click_on_checkout_btn() throws InterruptedException {
       locators.clickOnagreeandcheckoutbtn();
    }

    @Then("click on check out as guest btn")
    public void click_on_check_out_as_guest_btn() throws InterruptedException {
     locators.clickOncheckoutasGuest();
     Thread.sleep(3000);
    }
    @When("enter user details {string} {string} {string} {string} {string} {string} {string}")
    public void enter_user_details(String First_Name, String Last_Name, String Email, String City, String Address_1, String postal_code, String Phone_number) throws InterruptedException {
        userDetails.enterfirstname(First_Name);
        Thread.sleep(3000);
        userDetails.enterlastname(Last_Name);
        userDetails.enterEmail(Email);
        userDetails.entercityN(City);
        userDetails.enteraddress(Address_1);
        userDetails.enterpostcode(postal_code);
        userDetails.enterphoneN(Phone_number);
        userDetails.entercountryN();
        userDetails.clickoncontinuebtn();

    }

    @When("select on Ground radio button and click on continue and select check_money btn and click on cintinue btn")
    public void select_on_ground_radio_button_and_click_on_continue_and_select_check_money_btn_and_click_on_cintinue_btn() throws InterruptedException {
        shippingMethod.clickongroundbtn();
        Thread.sleep(3000);
        shippingMethod.clickoncontinuebtn();
        shippingMethod.clickoncmoneyorderbtn();
        Thread.sleep(3000);
        shippingMethod.clickoncontibtn();
        Thread.sleep(3000);
        shippingMethod.clickonconbtn();
    }

    @Then("click on confirm Button and print order successful")
    public void click_on_confirm_button_and_print_order_successful() throws InterruptedException {
        shippingMethod.clickonconfirmbtn();
        Thread.sleep(3000);
        shippingMethod.verifytext();
    }




}
