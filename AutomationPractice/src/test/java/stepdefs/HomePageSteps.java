package stepdefs;

/*** Step Definition - Methods to define the test case ****/

import java.io.IOException;

import org.testng.Assert;

import com.pageObjects.CartPage;
import com.pageObjects.HomePage;
import com.utils.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase {

	HomePage homePage = new HomePage();
	CartPage cartPage = new CartPage();

	// constructor
	public HomePageSteps() {
		super();
	}

	// Initialises the browser configurations
	@Before
	public void before() {
		initialization();
	}

	@And("Navigate to checkout page$")
	public void navigateToCheckoutPage() {
		homePage.clickOnCart();
	}

	@Then("Remove evening dress from cart$")
	public void removeDressFromCart() {
		homePage.removeEveDress();
		homePage.refreshPage();
	}

	@Then("Add tshirt from cart$")
	public void addTshirtFromCart() {
		homePage.addTshirt();
		homePage.refreshPage();
	}

	// Method to assert the price and total checkout in the cart
	@And("Assert the price of each item in the cart$")
	public void assertEachPrice() throws IOException {
		homePage.refreshPage();
		double firstUnitPrice = Double.parseDouble(cartPage.getFirstRwPrice().substring(1, 6));
		double secondUnitPrice = Double.parseDouble(cartPage.getSecondRwPrice().substring(1, 6));
		String secondTotalPriceActual = cartPage.getFirstRwTotal().substring(1, 6);
		String firstTotalPriceActual = cartPage.getSecondRwTotal().substring(1, 6);

		double firstQuantity = Double.parseDouble(cartPage.getFirstRwQty());
		double secQuantity = Double.parseDouble(cartPage.getSecondRwQty());

		double expectedFirstTotalPrice = firstUnitPrice * firstQuantity;
		double expectedSecTotalPrice = secondUnitPrice * secQuantity;

		Assert.assertEquals(firstTotalPriceActual, String.valueOf(expectedFirstTotalPrice));
		Assert.assertEquals(secondTotalPriceActual, String.valueOf(expectedSecTotalPrice));

		double checkoutActualPrice = Double.parseDouble(cartPage.getFinalCheckoutPrice().substring(1, 6));
		double shippingPrice = Double.parseDouble(cartPage.getShippingPrice().substring(1, 5));
		double ExpectedCheckoutPrice = expectedFirstTotalPrice + expectedSecTotalPrice + shippingPrice;
		Assert.assertEquals(checkoutActualPrice, ExpectedCheckoutPrice);
	}

	// Method to select the items and move to cart
	@And("Add the items to the cart \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void addItemToCart(String item, String size, String color, String itemName) throws InterruptedException {
		homePage.selectBreadCrumb(item);
		if (item.equalsIgnoreCase("Dresses")) {
			homePage.clickOnEveDress();
		}
		if (item.equalsIgnoreCase("Women")) {
			homePage.clickOnDresses();
			homePage.clickOnSummerDress();
		}
		homePage.selectSize(size);
		homePage.selectColor(color);
		String itemNameActual = homePage.getItemName();
		System.out.println("Item selected : " + itemNameActual);
		Assert.assertEquals(itemNameActual, itemName);
		homePage.clickOnAddCart();
		homePage.clickOnContinueShop();
	}

	// Closes the driver instance after the test execution
	@After
	public void closeDriver() {
		driver.close();
	}

}
