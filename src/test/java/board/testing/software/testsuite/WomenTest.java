package board.testing.software.testsuite;

import board.testing.software.pages.WomenPage;
import board.testing.software.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){

        womenPage.clickOnConsentButton();

        //Mouse Hover on the ‘Women’ Menu
        womenPage.hoverOnWomenMenu();

        //Mouse Hover on the ‘Tops’
        womenPage.hoverOnTopsTab();

        //Click on the ‘Jackets’
        womenPage.clickOnJacketsTab();

        //Select Sort By filter “Product Name”
        womenPage.selectTheSortByName();

        //Verify the product name displayed in alphabetical order
        womenPage.nameDisplayInAlphabeticalOrder();

    }
    @Test
    public void verifyTheSortByPriceFilter(){

        womenPage.clickOnConsentButton();

        //Mouse Hover on the ‘Women’ Menu
        womenPage.hoverOnWomenMenu();

        //Mouse Hover on the ‘Tops’
        womenPage.hoverOnTopsTab();

        //Click on the ‘Jackets’
        womenPage.clickOnJacketsTab();


        //Select Sort By filter “Price”
        womenPage.sortByLowToHigh();

        //Verify the product price displayed in Low to High
        womenPage.productPriceDisplayInOrder();




    }
}
