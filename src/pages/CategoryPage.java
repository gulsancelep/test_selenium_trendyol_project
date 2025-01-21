package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends Actions {

    private  static  final By PRODUCT = By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[4]/div[1]/div/div[1]");
    private  static  final String IS_SEARCHING_PAGE = "https://www.trendyol.com/sr?q=kablosuz%20kulaklik&qt=kablosuz%20kulaklik&st=kablosuz%20kulaklik&os=1";


    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void  productClick() {
        click(PRODUCT);
    }

    public void  isSearchingPage() {
        Assert.assertEquals(IS_SEARCHING_PAGE, driver.getCurrentUrl());
    }
}
