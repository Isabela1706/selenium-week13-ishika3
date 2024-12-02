package board.testing.software.pages;

import board.testing.software.utilites.Utilities;
import org.openqa.selenium.By;

public class MenPage extends Utilities {


    By consentButton = By.xpath("//p[contains(text(),'Consent')]");
    By menMenu = By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]");
    By bottomsTab = By.cssSelector("#ui-id-18");
    By pantsTab = By.xpath("//a[@id='ui-id-23']");
    By mouseHoverOnProductName= By.linkText("Cronus Yoga Pant");
    By yogaPant32Tab = By.xpath("//div[@id='option-label-size-143-item-175']");
    By yogaPantBlackTab = By.xpath("//div[@id='option-label-color-93-item-49']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By addedText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By getShoppingCart = By.xpath("//span[@class='base']");
    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize = By.xpath("//dd[contains(text(),'32')]");
    By productColor = By.xpath("//dd[contains(text(),'Black')]");



    public void clickOnConsentButton(){
        clickOnElement(consentButton);
    }
    public void hoverOnMenTab(){
        mouseHoverToElementAndClick(menMenu);
    }
    public void hoverOnBottoms(){
        mouseHoverToElementAndClick(bottomsTab);
    }
    public void clickOnPants(){
        clickOnElement(pantsTab);
    }
    public void hoverOnProduct(){
        mouseHoverToElementAndClick(mouseHoverOnProductName);
    }
    public void hoverAndClickSize(){
        mouseHoverToElementAndClick(yogaPant32Tab);
    }
    public void hoverAndClickColor(){
        mouseHoverToElementAndClick(yogaPantBlackTab);
    }
    public void hoverAndClickOnCart(){
        mouseHoverToElementAndClick(addToCartButton);
    }
    public String getTextMessage(){
        return  getTextFromElement(addedText);
    }
    public void shoppingButton(){
        clickOnElement(shoppingCart);
    }
    public String productName(){
        return getTextFromElement(getShoppingCart);
    }
    public String getProductName(){
        return getTextFromElement(cronusYogaPant);
    }
    public String productNameSize(){
        return getTextFromElement(productSize);
    }
    public String productNameColor(){
        return getTextFromElement(productColor);
    }




}
