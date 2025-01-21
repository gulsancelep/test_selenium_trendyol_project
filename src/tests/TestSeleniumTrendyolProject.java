package tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class TestSeleniumTrendyolProject{

    /**
     * Test Case:
     * 1. Go to Trendyol website
     * 2. Search for a word and click the product
     * 3. Add item to cart
     * 4. Go to the basket and delete the product
     */

    @Test
    public void test_selenium_trendyol_project() throws InterruptedException {
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.trendyol.com/");
        obj.manage().window().maximize();

        HomePage homePage = new HomePage(obj);
        homePage.isTrendyol();
        homePage.closePopUp();
        homePage.searching();

        CategoryPage categoryPage = new CategoryPage(obj);
        categoryPage.isSearchingPage();
        categoryPage.productClick();

        ProductPage productPage = new ProductPage(obj);
        productPage.checkProductDetail();
        productPage.addToCart();
        productPage.goToCartPage();
    }

}
