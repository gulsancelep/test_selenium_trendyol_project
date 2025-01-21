package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends Actions {

    private  static  final By OVERLAY = By.className("gap-overlay");
    private  static  final By PRODUCT_NAME = By.className(("product-brand-name-without-link"));
    private  static  final By PRODUCT_PRICE = By.cssSelector(".featured-prices .prc-dsc");
    private  static  final By PRODUCT_STOCK = By.cssSelector(".add-to-basket .add-to-basket-button-text");
    private  static  final By CART_PAGE = By.className("link account-basket");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void  checkProductDetail() {
        click(OVERLAY);
        Assert.assertEquals("2.nesil Beyaz Ios Ve Android Uyumlu Kablosuz Bluerooth Kulaklık", PRODUCT_NAME);
        Assert.assertEquals("319,90 TL", PRODUCT_PRICE.toString());
        Assert.assertEquals("Sepete Ekle", PRODUCT_STOCK.toString());
    }

    public void  addToCart() {
        click(PRODUCT_STOCK);
    }

    public void  goToCartPage() {
        click(CART_PAGE);
    }
}