Feature: Validating the order successful

  Scenario Outline: Purchasing the desktop item
  #  Given enter the url
    Given mouse over on computer and select the item desktops
    When click on add to cart
    And Select processer and RAM from dropdown options and also from HOD select the radio button options
    Then click on ADD TO CART btn
    And mouseover on shopping cart and click on GO TO CART btn
    And click on check box I agree and click on checkout btn
    Then click on check out as guest btn
    When enter user details "<First_Name>" "<Last_Name>" "<Email>" "<City>" "<Address_1>" "<postal_code>" "<Phone_number>"
    And select on Ground radio button and click on continue and select check_money btn and click on cintinue btn
    Then click on confirm Button and print order successful


    Examples:
      | First_Name | Last_Name | Email                     | City    | Address_1     | postal_code | Phone_number |
      | Vamshi     | Koyala    | koyalavamshi123@gmail.com | Gauteng | silver stream | 1683        | +27710538896 |









