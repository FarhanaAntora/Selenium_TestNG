package TestRunner;

import Pages.SaleProduct;
import Pages.ShopProduct;
import Setup.Setup;
import org.testng.annotations.Test;

public class ShopTestRunner extends Setup {
    @Test(priority=0)
    public void ClickOnShopTab() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        ShopProduct shop = new ShopProduct(driver);
        shop.ClickOnShop();

    }
    @Test(priority=1)
    public void SelectTheValidProduct() throws InterruptedException {
        ShopProduct shop = new ShopProduct(driver);
        shop.searchProductByValidName();
    }
    @Test(priority=2)
    public void SelectTheInvalidProduct() throws InterruptedException {
        ShopProduct shop = new ShopProduct(driver);
        shop.searchProductByInvalidName();
    }
    @Test(priority=3)
    public void SelectTheValidColor() throws InterruptedException {
        ShopProduct shop = new ShopProduct(driver);
        shop.searchProductByValidColor();
    }
    @Test(priority=4)
    public void SelectTheInvalidColor() throws InterruptedException {
        ShopProduct shop = new ShopProduct(driver);
        shop.searchProductByInvalidColor();
    }



}


