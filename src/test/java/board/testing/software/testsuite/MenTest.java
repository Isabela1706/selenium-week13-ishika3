package board.testing.software.testsuite;

import board.testing.software.pages.MenPage;
import board.testing.software.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenPage menPage = new MenPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {

        Thread.sleep(3000);

        menPage.clickOnConsentButton();


        //Mouse Hover on the ‘Men’ Menu
        menPage.hoverOnMenTab();

        //Mouse Hover on the ‘Bottoms’
        menPage.hoverOnBottoms();

        //Click on the ‘Pants’
        menPage.clickOnPants();

        //Mouse Hover on Product
        menPage.hoverOnProduct();

        //Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the size 32.
        menPage.hoverAndClickSize();

        //Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the Color Black.
        menPage.hoverAndClickColor();

        //Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the ‘Add To Cart’ Button.
        menPage.hoverAndClickOnCart();

        //Verify the text
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = menPage.getTextMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Wrong message display");

        //Click on the ‘shopping cart’ Link into message
        menPage.shoppingButton();

        //Verify the text ‘Shopping Cart.’
        String expectedCartMessage = "Shopping Cart";
        String actualCartMessage = menPage.productName();
        Assert.assertEquals(actualCartMessage, expectedCartMessage, "Wrong message display");

        //Verify the product name ‘Cronus Yoga Pant’
        String expectedProductMessage = "Cronus Yoga Pant";
        String actualProductMessage = menPage.getProductName();
        Assert.assertEquals(actualProductMessage, expectedProductMessage, "Wrong message display");

        //Verify the product size ‘32’
        String expectedSizeMessage = "Build your own computer";
        String actualSizeMessage = menPage.productNameSize();
        Assert.assertEquals(actualSizeMessage, expectedSizeMessage, "Wrong message display");

        //Verify the product color ‘Black’
        String expectedColorMessage = "32";
        String actualColorMessage = menPage.productNameColor();
        Assert.assertEquals(actualColorMessage, expectedColorMessage, "Wrong message display");




    }
}
