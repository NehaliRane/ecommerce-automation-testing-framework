package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLink;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    WebElement firstProductAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    WebElement continueShoppingBtn;

    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement viewCartLink;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addProductToCart() {
        productsLink.click();
        firstProductAddToCart.click();
        continueShoppingBtn.click();
        viewCartLink.click();
    }
}
