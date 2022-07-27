package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject laptopNoteBook = new LaptopNoteBooksPageObject();

	// Background

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
		laptopNoteBook.clickOnlaptopNotebooksTab();
		logger.info("user clicked on laptop &NoteBook tab");
		Thread.sleep(2000);
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
		laptopNoteBook.clickOnshowAllLaptopsNoteBooks();
		logger.info("user click on show all Laptop &NoteBook option");
		Thread.sleep(2000);
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() throws InterruptedException {
		laptopNoteBook.clickeOnMacBookitem();
		logger.info("user click on MacBook item");
		Thread.sleep(2000);
	}

	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() throws InterruptedException {
		laptopNoteBook.clickToAddToCart();
		logger.info("user Add MacBook To Cart");
		Thread.sleep(2000);
	}

	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string) throws InterruptedException {
		Assert.assertTrue(laptopNoteBook.theSuccessMassage());
		Thread.sleep(2000);

	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		laptopNoteBook.SeeOneItemInItemsOption();
		logger.info("user can see one Item in the items");
		Thread.sleep(2000);
		Utils.takeScreenShot();
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		laptopNoteBook.ClickOnCartOption();
		logger.info("user click on item Button");
		Thread.sleep(2000);
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
		laptopNoteBook.clickOnRemovetheitems();
		logger.info("user can click on remove button");
		Thread.sleep(2000);
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws InterruptedException {
		laptopNoteBook.noItemsAddtothecart();
		logger.info("user see their is no items add to the cart");
		Thread.sleep(2000);
	}

	// Scenario 2

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		laptopNoteBook.clickOnProductComparisonMacBook();
		logger.info("macbook product comparison button clicked");
		Thread.sleep(2000);
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		laptopNoteBook.clickOnProductComparisonMacBookAir();
		logger.info("user click on macbookAir comparison button");
		Thread.sleep(2000);
	}

	@Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String string) throws InterruptedException {
		laptopNoteBook.succesAddMacBookAirtoProductCompare();
		logger.info("user can see add successfulle to product comparison");
		Thread.sleep(2000);
	}

	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptopNoteBook.clickOnComprison();
		logger.info("user can click on product comparison");
		Thread.sleep(2000);
	}

	@Then("User should see Product Comparison Chartt")
	public void user_should_see_product_comparison_chartt() throws InterruptedException {
		laptopNoteBook.productCompareItem();
		logger.info("user can see items in product compare chart");
		Thread.sleep(2000);
	}

	// Scenario 3

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptopNoteBook.clickOnWishListSonyVaIO();
		logger.info("User clicked on Wish list successfully");

	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		Assert.assertTrue(laptopNoteBook.addToWishListMessageOnUI());
		logger.info("Wish list message is displayed on UI");

	}
	// Scenario 4

	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopNoteBook.clickOnMacBookPro();
		logger.info("User click on MacBook Pro successfully");
	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		Assert.assertTrue(laptopNoteBook.tagPriceForMacBookPro());
		logger.info("Price tag for MacBookPro is displayed on UI");

	}

}
