package step.definition;

import java.util.List;
import java.util.Map;
import org.testng.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;
import step.definition.retailStepDefinition;

public class retailStepDefinition extends Base {
	RetailPageObject retailpageobj = new RetailPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(retailpageobj.isLogoDisplayed());
		logger.info("user is on Home Page");
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailpageobj.clickOnMyAccBttn();
		logger.info(" Click on my account bttn Succcessfuly ");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailpageobj.clickOnLoginLink();
		logger.info(" Click on my Login Link Succcessfuly ");

	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		retailpageobj.userName("alham@gmail.com");
		retailpageobj.enterPassword("haroonjan");
		logger.info(" Email and Passwrod enter Successfully");

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobj.clickOnLoginBttn();
		logger.info("User click on Login bttn Successfully");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		String actualText = retailpageobj.getMyAccTextFromUI();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Expected text is Equal to Actual text");

	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailpageobj.clickOnAffiliateAccLink();
		logger.info("User click on register fo an affiliate acc link Successfully");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterCompanyName(data.get(0).get("company"));
		retailpageobj.enterWebsiteName(data.get(0).get("website"));
		retailpageobj.enterTaxID(data.get(0).get("taxID"));
		retailpageobj.paymentMethod(data.get(0).get("paymentMethod"));
		logger.info("User fillout affiliate from successfully");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobj.checkCheckBox();
		logger.info("Check box checked successfully ");

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailpageobj.clickOnRegContinueBttn();
		logger.info("User click on Continue button successfully");

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailpageobj.succesTexOnUI();
		logger.info("Expected text is Equal to Actual text ");

	}

	// //Scenario 2

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailpageobj.clickEditYourAffiliateInfo();
		logger.info("User click on ‘Edit your affiliate informationlink Successfully");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobj.clickBankTransferRadioBttn();
		logger.info("user click on Bank Transfer radio button Successfully");

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> bankAccData = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterBankName(bankAccData.get(0).get("bankName"));
		retailpageobj.enterAbaNumber(bankAccData.get(0).get("abaNumber"));
		retailpageobj.enterSwiftCode(bankAccData.get(0).get("swiftCode"));
		retailpageobj.enterAccountName(bankAccData.get(0).get("accountName"));
		retailpageobj.enterAcountNumber(bankAccData.get(0).get("accountNumber"));
		logger.info("User fill Bank information Successfully");
	}

	@And("User click on Continue button1")
	public void User_click_on_Continue_button1() {
		retailpageobj.clickOnCountinueBttn();
		logger.info("User click on Continue button1 Successfully");

	}

	// Scenario 3

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retailpageobj.clickOnEditeAccInformation();
		logger.info("User click on ‘Edit your account information’ link\" Successfully");

	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> personData = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterFirstName(personData.get(0).get("firstname"));
		retailpageobj.enterLastName(personData.get(0).get("lastName"));
		retailpageobj.enterEmailAdd(personData.get(0).get("email"));
		retailpageobj.enterPhonNum(personData.get(0).get("telephone"));
		logger.info("User was able to enter personal information ");

	}

	@When("User click on continue button2")
	public void user_click_on_continue_button2() {
		retailpageobj.clickOnContinueButton();
		logger.info("User click on continue button2 Successfully");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(retailpageobj.isEditAccountInfoSuccessMessagePresent());
		logger.info("Expected Message is equal to Actual Message");

	}
}
