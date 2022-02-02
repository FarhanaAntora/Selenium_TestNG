package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPurchase {
    WebDriver driver;
    @FindBy(css = "img")
    List<WebElement> imgProducts;
    //@FindBy(name = "add-to-cart")
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement btnAddCart;
    @FindBy(xpath = "//a[contains(text(),\"View cart\")]")
    List<WebElement> viewCart;
    @FindBy(xpath = "//a[contains(text(),\"Proceed to checkout\")]")
    WebElement btnCheckout;
    @FindBy(name = "product_cat")
    WebElement dropdown;
    @FindBy(className = "fa-search")
    WebElement searchIcon;
    public ProductPurchase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectProduct() throws InterruptedException {
        imgProducts.get(2).click();
        Thread.sleep(2000);
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        searchIcon.click();
        imgProducts.get(2).click();
    }
    public void addCart() throws InterruptedException {

        Thread.sleep(3000);
        btnAddCart.click();
        Thread.sleep(2000);
        viewCart.get(2).click();
        Thread.sleep(2000);
        btnCheckout.click();

    }
}
