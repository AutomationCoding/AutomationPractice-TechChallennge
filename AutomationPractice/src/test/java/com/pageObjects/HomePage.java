package com.pageObjects;

/*** Pageobjects and methods to operate on the objects of Home Page ****/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.TestBase;

public class HomePage extends TestBase {

	private By tShirtsBreadCrumb = By.xpath("//div[3]/div/div/div[6]/ul/li[3]/a");
	private By dressesBreadCrumb = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
	private By womenBreadCrumb = By.xpath("//*[@title='Women']/parent::li");
	private By pageHeading = By.xpath("//h1");
	private By smallCheckbox = By.xpath("//*[@id='layered_id_attribute_group_1']");
	private By mediumCheckbox = By.xpath("//*[@id='layered_id_attribute_group_2']");
	private By largeCheckbox = By.xpath("//*[@id='layered_id_attribute_group_3']");
	private By colorBlue = By.id("layered_id_attribute_group_14");
	private By colorOrange = By.id("layered_id_attribute_group_13");
	private By getItemName = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a");
	private By addToCart = By.xpath("//div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]");
	private By proceedToCartCart = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");
	private By continueShopping = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span");
	private By eveningDresses = By.xpath("//*[@id='subcategories']/ul/li[2]/div[1]/a");
	private By dresses = By.xpath("//*[@id='subcategories']/ul/li[2]/div[1]/a");
	private By summerDresses = By.xpath("//*[@id='subcategories']/ul/li[3]/div[1]/a/img");
	private By cartBox = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a");
	private By removeEveDress = By.id("cart_quantity_down_4_16_0_0");
	private By addTshirt = By.id("cart_quantity_up_1_1_0_0");
	private By itemPrice = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[1]/span");

	// Method to click on filtered/selected dress to move to cart
	public HomePage mouseHoverOnFirstImg() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		WebElement ele = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")));
		action.moveToElement(ele).perform();
		return this;
	}

	public String getItemPrice() {
		return driver.findElement(itemPrice).getText();
	}

	public HomePage clickOnAddCart() {
		mouseHoverOnFirstImg();
		driver.findElement(addToCart).click();
		return this;
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public HomePage clickOnCart() {
		driver.findElement(cartBox).click();
		return this;
	}

	public HomePage clickOnProceed() {
		driver.findElement(proceedToCartCart).click();
		return this;
	}

	public HomePage clickOnContinueShop() {
		driver.findElement(continueShopping).click();
		return this;
	}

	public HomePage clickOnEveDress() {
		driver.findElement(eveningDresses).click();
		return this;
	}

	public HomePage removeEveDress() {
		driver.findElement(removeEveDress).click();
		return this;
	}

	public HomePage addTshirt() {
		driver.findElement(addTshirt).click();
		return this;
	}

	public HomePage clickOnSummerDress() {
		driver.findElement(summerDresses).click();
		return this;
	}

	public HomePage clickOnDresses() {
		driver.findElement(dresses).click();
		return this;
	}

	public HomePage selectTshirts() {
		driver.findElement(tShirtsBreadCrumb).click();
		return this;
	}

	public HomePage selectDresses() {
		driver.findElement(dressesBreadCrumb).click();
		return this;
	}

	public HomePage selectWomen() {
		driver.findElement(womenBreadCrumb).click();
		return this;
	}

	public HomePage selectSmallSize() {
		driver.findElement(smallCheckbox).click();
		return this;
	}

	public HomePage selectMediumSize() {
		driver.findElement(mediumCheckbox).click();
		return this;
	}

	public HomePage selectLargeSize() {
		driver.findElement(largeCheckbox).click();
		return this;
	}

	public HomePage selectBlueColor() {
		driver.findElement(colorBlue).click();
		return this;
	}

	public HomePage selectOrangeColor() {
		driver.findElement(colorOrange).click();
		return this;
	}

	public String getPageHeading() {
		return driver.findElement(pageHeading).getText();
	}

	public String getItemName() {
		return driver.findElement(getItemName).getText();
	}

	// Method to select the type of item/dress
	public HomePage selectBreadCrumb(String itemLink) {
		if (itemLink.equalsIgnoreCase("T-shirts")) {
			selectTshirts();
		} else if (itemLink.equalsIgnoreCase("Dresses")) {
			selectDresses();
		} else {
			selectWomen();
		}
		return this;
	}

	// Method to select the size of the item
	public HomePage selectSize(String size) {
		if (size.equalsIgnoreCase("small")) {
			selectSmallSize();
		} else if (size.equalsIgnoreCase("medium")) {
			selectMediumSize();
		} else {
			selectLargeSize();
		}
		return this;
	}

	// Method to select the colour of the item
	public HomePage selectColor(String color) {
		if (color.equalsIgnoreCase("blue")) {
			selectBlueColor();
		} else if (color.equalsIgnoreCase("orange")) {
			selectOrangeColor();
		}
		return this;
	}

}
