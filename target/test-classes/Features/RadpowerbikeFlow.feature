@Radpowerbike
Feature: This feature is to test Radpowerflow 

@Login
Scenario: login to account
    Given clicks on login link 
    And  User Enter the crendtails
    When clicks on login button
    Then user logged in successfully 

    
@Config-builditself
Scenario: build it your self-conf
    When user clicking on Ebike option in mainmenu
    And  Selecting on any ebike and scroll down the page
    Then clicking on Shopnow and Buynow button then click on SkipStep Button
    Then select on ebike color and click on Nextbutton
    When user Select Free delivery optoin and clicking on Buy now button
    And  increasing product quanity Then verify the quanity "2 Items"
    And  clicks on being checkout and check out 

@getItDelivery      
Scenario: Get it delivery option in configurator flow
   When  user clicking on Buynow butt
   And  clicking on skipStep butt
   Then User selecting on coloroption
   When User enter the postal code and clicks on ViewOptionsbutton
   Then selecting deliveryoptions 
   And Clicking on BuyNow and Beigncheckout and checkout CTAbutton
   
@PickItDelivery
Scenario: Pick ItUp delivery option in configurator flow
    When User clicking on Buynow and SkipStep CTA button
    And select color option
    Then user enter the postal code and clicks on viewoption
    And Navigate to pickup section and select any delivery option
    Then Selecting on any showroom and click on AddToCart CTA button
    And clicking on BuyNow,BeignCheckout and checkout    
    Then Enter the information in Paymetpage and clicking on contiuneShipping
    
    
 @Startbasemodel
 Scenario: Start with base model in customizer flow
     When user clicking on Ebike link and selecting on bike
     And  Clicking on shopnow and customizer my own CTA button
     Then Clicking on StartWithBase model and NextStep and Finish CTA button 
     And  Clicks on SelectDeliveryoptions and AddToCart and Checkout  CTA button
     Then Entering information and clicking on contiune shopping CTA button
     
     
@StartbaseWithAccessory
Scenario: Star with base model added with accessories
     When user clicking on Ebikelink and selecting on anybike 
     And Clicking on Shopnow and CustomizerMyOwn and Clicking on StarwithBase model 
     Then Clicking on NextStep and select accessories and clicking on Additems
     And Clicking on Finshbutton and selectDeliveryOptions
     Then Entering postal code and clicks on viewOption
     And Select delivery options and clicks on AddToCart button
     And clicks on checkout and Enter information and clicks on countine shipping
     
 @PreBulitPackage
 Scenario: PreBulitPackage flow via customizemyown
     When user clicking on Ebike in mainmenu
     And Clicking On Shopnow and CustomizeMyown and select package
     Then clicking on next and finish and selectDeliveryOption button
     And  Selecting on delivery options and showroom and clicks on saveselection
     And clicking on AddtoCart and checkout button 
     Then Enter All information and click to Coutiune shopping button
     
     
     
     