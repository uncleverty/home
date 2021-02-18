package exercise1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.common.loadWebDriver;

public class ShoppingCartTest {

    private final String SHOPPING_SITE_URL = "http://automationpractice.com";
    private final String PRODUCT_NAME = "Faded Short Sleeve T-shirts";

    private final WebDriver webDriver = loadWebDriver();

    /**
     * Steps:
     * 1) Open shopping site
     * 2) Search for product named Faded Short Sleeve T-shirts
     * 3) Click on product
     * 4) Select size M
     * 5) Click add to cart
     * 6) verify added successfully to cart
     */
    @Test
    public void addMediumShirtToCart() {

    }

}