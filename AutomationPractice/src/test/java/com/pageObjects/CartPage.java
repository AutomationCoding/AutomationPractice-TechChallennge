package com.pageObjects;

/*** Pageobjects and methods to operate on the objects of Cart Page ****/

import org.openqa.selenium.By;

import com.utils.TestBase;

public class CartPage extends TestBase {

	private By cartBox = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a");
	private By removeEveDress = By.id("cart_quantity_down_4_16_0_0");
	private By addTshirt = By.id("cart_quantity_up_1_1_0_0");
	private By firstRowTotal = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[6]/span");
	private By secondRowTotal = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[6]/span");
	private By firstRowPrice = By.xpath("//*[@id='product_1_1_0_0']/td[4]");
	private By secondRowPrice = By.xpath("//*[@id='product_5_19_0_0']/td[4]");
	private By firstQuantity = By.xpath("//*[@id='product_1_1_0_0']/td[5]/input[2]");
	private By secondQuantity = By.xpath("//*[@id='product_5_19_0_0']/td[5]/input[2]");
	private By finalPrice = By.id("total_price");
	private By shippingPrice = By.id("total_shipping");

	// To get text of the element
	public String getFirstRwTotal() {
		return driver.findElement(firstRowTotal).getText();
	}

	public String getShippingPrice() {
		return driver.findElement(shippingPrice).getText();
	}

	public String getFinalCheckoutPrice() {
		return driver.findElement(finalPrice).getText();
	}

	public String getSecondRwTotal() {
		return driver.findElement(secondRowTotal).getText();
	}

	public String getFirstRwPrice() {
		return driver.findElement(firstRowPrice).getText();
	}

	public String getSecondRwPrice() {
		return driver.findElement(secondRowPrice).getText();
	}

	// To get the value of the element
	public String getFirstRwQty() {
		return driver.findElement(firstQuantity).getAttribute("value");
	}

	public String getSecondRwQty() {
		return driver.findElement(secondQuantity).getAttribute("value");
	}

	public CartPage clickOnCart() {
		driver.findElement(cartBox).click();
		return this;
	}

	// Clicks on element
	public CartPage removeEveDress() {
		driver.findElement(removeEveDress).click();
		return this;
	}

	public CartPage addTshirt() {
		driver.findElement(addTshirt).click();
		return this;
	}

}