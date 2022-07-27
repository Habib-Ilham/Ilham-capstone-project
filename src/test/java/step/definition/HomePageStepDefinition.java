package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;

public class HomePageStepDefinition extends Base {
	HomePageObject homePageObj = new HomePageObject();

	// Scenario 1

	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
		homePageObj.clickOnCurrncy();
		Thread.sleep(3000);
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws InterruptedException {
		homePageObj.clickOnEuro();
		logger.info("user click on euro");
		Thread.sleep(3000);
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws InterruptedException {
		homePageObj.euroCurrency();
		logger.info("User See The Euro Currency");
		Thread.sleep(3000);
	}
	// *************Shopping Cart************///

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
		homePageObj.clickOnShoppingCart();
		logger.info("user click on shopping cart");
		Thread.sleep(3000);

	}

	@Then("{string} message should display")
	public void message_should_display(String string) throws InterruptedException {
		homePageObj.shoppCartIsEmpty();
		Thread.sleep(3000);

	}
}
