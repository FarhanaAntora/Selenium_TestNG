package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SaleProduct {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Sale')]")
    List<WebElement> sale;
    @FindBy(xpath = "//h1[contains(text(),'Sale')]")
    WebElement saleText;

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement btnAddCart;
    @FindBy(xpath = "//a[contains(text(),\"View cart\")]")
    List<WebElement> viewCart;
    @FindBy(xpath = "//a[contains(text(),\"Proceed to checkout\")]")
    WebElement btnCheckout;
    @FindBy(css = "img")
    List<WebElement> imgProducts;
    @FindBy(xpath = "//h2[contains(text(),'Modern')]")
    WebElement ProductName;
    public SaleProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickOnSale(){
        sale.get(1).click();
        String text = saleText.getText();
        Assert.assertEquals(text, "SALE");

    }
    public void SelectProduct(){
        sale.get(1).click();
        String name = ProductName.getText();
        Assert.assertEquals(name, "Single Shirt");

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
