package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.DesktopPageObject;

public class DesktopPageStepDefinition extends Base {
	DesktopPageObject desktopPage = new DesktopPageObject();

	// Background

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPage.clickOnDesktopsTab();
		logger.info("User click on Desktops Tab successfully");

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.clickOnShowAllDesktops();
		logger.info("User click on Show All Desktops successfully");

	}

	// Scenario 1
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopElements = desktopPage.desktopsItmes();
		for (WebElement element : desktopElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title" + " is present"));

		}

	}

	// Scenario 2

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPage.addToTheCartHpLp3065();
		logger.info("User click on add to cart hplp3065 successfully");

	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.quantityOfHpLp3065(string);
		logger.info("The quantity selected successfully");

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickAddToCardBttnHpLp3065();
		logger.info("User add to cart Hp Lp3065  ");
	}

	@Then("User should see a message1 {string}")
	public void user_should_see_a_message1(String expectedMessageValue) throws InterruptedException {
		Assert.assertTrue(desktopPage.successMessageForHpLpOnUI());
		logger.info("Expected text is Equal to Actual text ");

	}
	// Scenario 3

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopPage.addToCartCanonEOS5DCamera();
		logger.info("User add to cart Canon EOS 5D  ");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.selectRedColorFromDropdown();
		logger.info("User select red color from dropdown  ");
	}

	@Then("User should see a message2 {string}")
	public void user_should_see_a_message2(String expectedMessageValue) throws InterruptedException {
		Assert.assertTrue(desktopPage.succesMessgForCanonCamera5D());
		logger.info("Expected text is Equal to Actual text ");

	}

	// Scenario 4

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickOnCanonEOS5dCamera();
		logger.info("Canon camera clicked successfully");

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnWriteReview();

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewData = dataTable.asMaps(String.class, String.class);
		desktopPage.enterName(reviewData.get(0).get("yourname"));
		desktopPage.writeReview(reviewData.get(0).get("yourReview"));
		desktopPage.giveRate();
		logger.info("User fillout Review form successfully");

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.clickAfterReviewOnContinueBttn();

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		Assert.assertTrue(desktopPage.successMessageAfterReviewOnUI());
		logger.info("Expected text is Equal to Actual text ");

	}
}
