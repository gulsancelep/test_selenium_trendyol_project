package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Actions {

    private  static  final String search_input = "kablosuz kulaklik";
    private  static  final By SEARCHING = By.id("autoCompleteAppWrapper");
    private  static  final By SEARCH_CLICK = By.cssSelector("input[data-testid='suggestion']");
    private  static  final By CLOSE_POPUP = By.cssSelector("div[title='Kapat']");



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void isTrendyol() {
        Assert.assertEquals("https://www.trendyol.com/", driver.getCurrentUrl());
    }

    public void closePopUp() {
        click(CLOSE_POPUP);
    }

    public void searching() {
        click(SEARCHING);
        input(SEARCHING, search_input);
        click(SEARCH_CLICK);
    }
}