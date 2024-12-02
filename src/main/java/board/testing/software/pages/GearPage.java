package board.testing.software.pages;

import board.testing.software.utilites.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;

public class GearPage extends Utilities {

    By consentButton = By.xpath("//p[contains(text(),'Consent')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagsTab = By.xpath("//span[contains(text(),'Bags')]");
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By getOvernightDuffle = By.xpath("//span[@class='base']");
    By changeQty = By.id("qty");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By getTextCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By getQtyThree = By.xpath("//input[@class='input-text qty']");
    By productPrice = By.xpath("//tbody/tr[1]/td[4]/span[1]/span[1]/span[1]");
    By changeQtyFive = By.xpath("//input[@class='input-text qty']");
    By updateCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By totalPrice = By.xpath("//span[contains(text(),'$225.00')]");




    public void clickOnConsentButton(){
        clickOnElement(consentButton);
    }
    public void hoverOnConsentButton(){
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBag(){
        clickOnElement(bagsTab);
    }
    public void clickOnOvernightDuffle(){
        clickOnElement(overnightDuffle);
    }
    public String getOnOvernightDuffle(){
         return getTextFromElement(getOvernightDuffle);
    }

    public void changeQtyThree(){
        driver.findElement(changeQty).clear();
    }
    public void sendQtyThree(){
        sendTextToElement(changeQty, "3");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String addedInCart(){
        return getTextFromElement(getTextCart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
    public String productDisplay(){
        return getTextFromElement(productName);
    }
    public void changeTheQtyAgain(){
        Assert.assertEquals("3", driver.findElement(getQtyThree).getAttribute("value"));
    }
    public String productPriceDisplay(){
        return getTextFromElement(productPrice);
    }
    public void changeQtyFive(){
        driver.findElement(changeQtyFive).clear();
    }
    public void sendQtyFive(){
        sendTextToElement(changeQtyFive, "5");
    }
    public void updateShoppingCart(){
        clickOnElement(updateCart);
    }
    public String totalPriceDisplay(){
        return getTextFromElement(totalPrice);
    }










}
