package buyItem;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AfterSignInPage;
import pages.CheckoutPage;
import pages.OptionForBuyPage;
import pages.SignInPage;

public class BuyItemsTests extends BaseTests {
    @Test
    public void BuyItemTest(){
        SignInPage signInPage = homePage.clickSignin();
        signInPage.setEmailForm("giangkybo@gmail.com");
        signInPage.setPasswordForm("123456");
        AfterSignInPage afterSignInPage = signInPage.clickSignInButton();
        afterSignInPage.clickWomenField();
        OptionForBuyPage option = afterSignInPage.chooseItem();
        CheckoutPage checkoutPage = option.clicktoCheckout();
        checkoutPage.proceedToCheckout();
        String alert = checkoutPage.getAlert();
        Assert.assertTrue(alert.contains("Your order on My Store is complete."),"Error in buy");
    }
}
