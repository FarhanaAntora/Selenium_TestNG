package TestRunner;

import Pages.ProductPurchase;
import Pages.SaleProduct;
import Setup.Setup;
import org.testng.annotations.Test;

public class SaleTestRunner extends Setup {

        @Test(priority=0)
        public void ClickOnSaleTab() throws InterruptedException {
            driver.get("https://envothemes.com/envo-ecommerce");
            SaleProduct sale = new SaleProduct(driver);
            sale.ClickOnSale();

        }
        @Test(priority=1)
        public void SelectTheProduct() throws InterruptedException {
            SaleProduct sale = new SaleProduct(driver);
            sale.ClickOnSale();

        }
    @Test(priority=3)
    public void addToCart() throws InterruptedException {
        SaleProduct sale = new SaleProduct(driver);
        sale.ClickOnSale();
    }
}
