package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	// Background

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement TestEnvironment;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccBttn;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement inputPass;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBttn;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccTextOnUI;

	// Scenario 1

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affiliateAccLink;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteName;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement paymentMethod;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clickOnRegContinueBttn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement regSuccesMssg;

	// Scenario 2

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editUrAffiliateAccInf;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement bankTransperRadioBttn;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement inputBankName;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumber;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumb;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBttn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement editInfoSuccessMssgOnUi;

	// Scenario 3 ;
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editUrAccInfo;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement afterEditeContinueBttn;

	@FindBy(xpath = "//*[@id='account-account']/div[1]")
	private WebElement successMessageEditAccountInfo;

	// Methods for Background

	public boolean isLogoDisplayed() {
		if (TestEnvironment.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnMyAccBttn() {
		myAccBttn.click();
	}

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public void userName(String userEmail) {
		userName.sendKeys(userEmail);
	}

	public void enterPassword(String password) {
		inputPass.sendKeys(password);
	}

	public void clickOnLoginBttn() {
		loginBttn.click();
	}

	public String getMyAccTextFromUI() {
		String myAccontTextFromUI = myAccTextOnUI.getText();
		return myAccontTextFromUI;
	}

	// Methods for Scenario 1

	public void clickOnAffiliateAccLink() {
		affiliateAccLink.click();
	}

	public void enterCompanyName(String company) {
		companyName.sendKeys(company);
	}

	public void enterWebsiteName(String website) {
		websiteName.sendKeys(website);
	}

	public void enterTaxID(String Tax) {
		taxID.sendKeys(Tax);
	}

	public void paymentMethod(String payment) {
		paymentMethod.sendKeys(payment);
	}

	public void checkCheckBox() {
		checkCheckBox.click();
	}

	public void clickOnRegContinueBttn() {
		clickOnRegContinueBttn.click();
	}

	public void succesTexOnUI() {
		regSuccesMssg.isDisplayed();

	}

	// Methods for Scenario 2

	public void clickEditYourAffiliateInfo() {
		editUrAffiliateAccInf.click();
	}

	public void clickBankTransferRadioBttn() {
		bankTransperRadioBttn.click();
	}

	public void enterBankName(String bankName) {
		inputBankName.sendKeys(bankName);

	}

	public void enterAbaNumber(String abaNum) {
		abaNumber.sendKeys(abaNum);
	}

	public void enterSwiftCode(String swiftCodeNumber) {
		swiftCode.sendKeys(swiftCodeNumber);
	}

	public void enterAccountName(String accName) {
		accountName.sendKeys(accName);
	}

	public void enterAcountNumber(String accNumber) {
		accountNumb.sendKeys(accNumber);
	}

	public void clickOnCountinueBttn() {
		continueBttn.click();
	}

	public String afterEditToBankTransper() {
		String myAccontTextFromUI = editInfoSuccessMssgOnUi.getText();
		return myAccontTextFromUI;
	}

	// Methods for Scenario 3
	public void clickOnEditeAccInformation() {
		editUrAccInfo.click();
	}

	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void enterLastName(String urLastName) {
		lastName.sendKeys(urLastName);
	}

	public void enterEmailAdd(String emailAdd) {
		email.clear();
		email.sendKeys(emailAdd);
	}

	public void enterPhonNum(String telephoneNumber) {
		telephone.clear();
		telephone.sendKeys(telephoneNumber);
	}

	public void clickOnContinueButton() {
		afterEditeContinueBttn.click();
	}

	public boolean isEditAccountInfoSuccessMessagePresent() {

		if (successMessageEditAccountInfo.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}
