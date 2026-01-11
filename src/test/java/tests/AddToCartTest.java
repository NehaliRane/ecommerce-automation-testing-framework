package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.addProductToCart();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("view_cart"),
                "User is not navigated to cart page");
    }
}
