package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);

	}

	// Background Xpaths

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickOnlaptopNotebooksTab;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement clickeOnMacBookitem;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickToAddToCart;

	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement theSuccessMassage;

	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRemovetheitems;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement noItemsAddtothecart;

	// Scenario 2 Xpaths

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macBookCompareButton;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement makBookAirCompareButton;

	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	private WebElement succesAddMacBookAirtoProductCompare;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement clickOnproductComprison;

	@FindBy(xpath = "/html/body/div[2]")
	private WebElement productCompareItem;
	// Scenario 3 Xpaths

	@FindBy(xpath = "(//button[@data-toggle='tooltip'])[11]")
	private WebElement wishListForSonyVaIO;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement addToWishListMssgOnUI;

	// Scenario 4 Xpaths

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;

	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement tagForMacBookPro;

	// Background Methods

	public void clickOnlaptopNotebooksTab() {
		clickOnlaptopNotebooksTab.click();
	}

	public void clickOnshowAllLaptopsNoteBooks() {
		showAllLaptopsAndNotebooks.click();

	}

	public void clickeOnMacBookitem() {
		clickeOnMacBookitem.click();
	}

	public void clickToAddToCart() {
		clickToAddToCart.click();

	}

	public boolean theSuccessMassage() {
		if (theSuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}

	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}

	public void clickOnRemovetheitems() {
		clickOnRemovetheitems.click();
	}

	public void noItemsAddtothecart() {
		noItemsAddtothecart.isDisplayed();
	}

	// Scenario 2 Methods
	public void clickOnProductComparisonMacBook() {
		macBookCompareButton.click();
	}

	public void clickOnProductComparisonMacBookAir() {
		makBookAirCompareButton.click();
	}

	public void succesAddMacBookAirtoProductComparee() {
		succesAddMacBookAirtoProductCompare.isDisplayed();
	}

	public void clickOnComprison() {
		clickOnproductComprison.click();
	}

	public void productCompareItem() {
		productCompareItem.isDisplayed();
	}

	public void succesAddMacBookAirtoProductCompare() {
		succesAddMacBookAirtoProductCompare.isDisplayed();
	}

	// Scenario 3 Methods

	public void clickOnWishListSonyVaIO() {
		wishListForSonyVaIO.click();

	}

	public boolean addToWishListMessageOnUI() {
		if (addToWishListMssgOnUI.isDisplayed())
			return true;
		else
			return false;
	}

	// Scenario 4 Methods

	public void clickOnMacBookPro() {
		macBookPro.click();
	}

	public boolean tagPriceForMacBookPro() {
		if (tagForMacBookPro.isDisplayed())
			return true;
		else
			return false;
	}

}
