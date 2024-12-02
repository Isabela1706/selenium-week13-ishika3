package board.testing.software.testsuite;

import board.testing.software.pages.GearPage;
import board.testing.software.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest  extends BaseTest {


    GearPage gearPage = new GearPage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart(){

        gearPage.clickOnConsentButton();

        //Mouse Hover on the ‘Gear’ Menu
        gearPage.hoverOnConsentButton();

        //Click on the ‘Bags’
        gearPage.clickOnBag();

        //Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();

        //Verify the text ‘Overnight Duffle’
        String expectedMessage = "Overnight Duffle";
        String actualMessage = gearPage.getOnOvernightDuffle();
       Assert.assertEquals(actualMessage, expectedMessage, "Wrong message display");




        //Change the Qty 3
        gearPage.changeQtyThree();
        gearPage.sendQtyThree();


        //Click on the ‘Add to Cart’ Button.
        gearPage.clickOnAddToCart();

        //Verify the text
        //‘You added Overnight Duffle to your shopping cart.’
        String expectedAddedMessage = "You added Overnight Duffle to your shopping cart.";
        String actualAddedMessage = gearPage.addedInCart();
        Assert.assertEquals(actualAddedMessage, expectedAddedMessage, "Wrong message display");




        //Click on the ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCart();


        //Verify the product name ‘Overnight Duffle’
        String expectedProductNameMessage = "Overnight Duffle";
        String actualProductNameMessage = gearPage.productDisplay();
        Assert.assertEquals(actualProductNameMessage, expectedProductNameMessage, "Wrong message display");




        //Verify the Qty is ‘3’
        gearPage.changeTheQtyAgain();



        //Verify the product price ‘$135.00’
        String expectedProductPriceMessage = "$135.00";
        String actualProductPriceMessage = gearPage.productPriceDisplay();
        Assert.assertEquals(actualProductPriceMessage, expectedProductPriceMessage, "Wrong message display");



        //Change the Qty to ‘5’
        gearPage.changeQtyFive();
        gearPage.sendQtyFive();


        //Click on the ‘Update Shopping Cart’ button
        gearPage.updateShoppingCart();


        //Verify the product price ‘$225.00’
        String expectedTotalPriceMessage = "$225.00";
        String actualTotalPriceMessage = gearPage.totalPriceDisplay();
        Assert.assertEquals(actualTotalPriceMessage, expectedTotalPriceMessage, "Wrong message display");




    }



}
