package board.testing.software.pages;

import board.testing.software.utilites.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utilities {


    By consentButton = By.xpath("//p[contains(text(),'Consent')]");
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By topsTab = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsTab = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By productsName = By.id("sorter");
    By productNameText = By.xpath("//li//div[1]//div[1]//strong[1]/a");
    By priceFilter = By.id("sorter");
    By lowToHighDisplay = By.xpath("//span[@class='price-wrapper ']");


    public void clickOnConsentButton(){
        clickOnElement(consentButton);
    }
    public void hoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void hoverOnTopsTab(){
        mouseHoverToElement(topsTab);
    }
    public void clickOnJacketsTab(){
        clickOnElement(jacketsTab);
    }
    public void selectTheSortByName(){
        WebElement dropDown = driver.findElement(productsName);
        Select select = new Select(dropDown);
        select.selectByVisibleText("Product Name");
    }
    public void nameDisplayInAlphabeticalOrder(){
        List<WebElement> productNames = driver.findElements(productNameText);

        //store product name in the actualProductName List.
        List<String> actualProductsName = new ArrayList<>();
        for (WebElement product : productNames) {
//            System.out.println(product.getText());
            actualProductsName.add(product.getText());


        }
    }
    public void sortByLowToHigh(){
        WebElement dropDown = driver.findElement(priceFilter);
        Select select = new Select(dropDown);
        select.selectByVisibleText("Price");
    }
    public void productPriceDisplayInOrder(){
        List<WebElement> priceElements = driver.findElements(lowToHighDisplay);

        List<String> actualPrice = new ArrayList<>(); // add actual price in this list
        for (WebElement price : priceElements) {
            actualPrice.add(price.getText());
        }

        List<String> expectedPriceOrder = new ArrayList<>(actualPrice);
        Collections.sort(expectedPriceOrder);
        Assert.assertEquals("Price are not displayed in the Low to High order", expectedPriceOrder, actualPrice);

    }
    }


