package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ShopProduct {
    WebDriver driver;

    WebElement searchBtn;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement shop;
    @FindBy(xpath = "//h1[contains(text(),'Shop')]")
    WebElement shopText;
    @FindBy(className = "orderby")
    WebElement sort;

    @FindBy(className = "select2-search__field")
    WebElement SearchByColor;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    WebElement applyBtn;
    @FindBy(xpath = "//li[contains(text(),'White')]")
    WebElement whiteColor;
    @FindBy(xpath = "//h2[contains(text(),'Black pants')]")
    WebElement whiteProduct;
    @FindBy(className = "header-search-input")
    WebElement search;

    @FindBy(xpath = "//h2[contains(text(),'Single Shirt')]")
    WebElement shirt;
    @FindBy(xpath = "//h1[contains(text(),'Black pants')]")
    WebElement productText;
    @FindBy(xpath = "//p[contains(text(),'No products were found matching your selection.')]")
    WebElement invalidProduct;
    //@FindBy(xpath ="//h1[contains(text(),'Nothing Found')]")
    //WebElement invalidProduct;

    @FindBy(xpath = "//h1[contains(text(),'Top pants upper')]")
    WebElement productTitle;

    public ShopProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickOnShop(){
        shop.click();
        String title = shopText.getText();
        Assert.assertEquals(title,"Shop");
    }

    public void searchProductByValidName() throws InterruptedException {


        search.sendKeys("Black pants");
        Thread.sleep(3000);
        searchBtn.click();
        String p = productText.getText();
        Assert.assertEquals(p,"Black pants");
    }
    public void searchProductByInvalidName() throws InterruptedException {
        search.sendKeys("Shoe");
        Thread.sleep(3000);
        searchBtn.click();
        String p = invalidProduct.getText();
        Assert.assertEquals(p,"No products were found matching your selection.");
    }
    public void searchProductByValidColor() throws InterruptedException {

        shop.click();
        SearchByColor.click();
        whiteColor.click();
        Thread.sleep(3000);
        applyBtn.click();
        String p = whiteProduct.getText();
        Assert.assertEquals(p,"Black pants");
        }
    public void searchProductByInvalidColor() throws InterruptedException {
        search.sendKeys("Yellow");
        Thread.sleep(3000);
        searchBtn.click();
        String p = invalidProduct.getText();
        Assert.assertEquals(p,"No products were found matching your selection.");
    }


}
