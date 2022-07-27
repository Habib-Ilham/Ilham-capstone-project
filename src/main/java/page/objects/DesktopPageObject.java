package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);

	}

	// Scenario 1 Xpaths

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	// Scenario 2 Xpaths
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement clickAddToCartHpLp3065;

	@FindBy(id = "input-quantity")
	private WebElement inputQuantity;

	@FindBy(id = "button-cart")
	private WebElement addToCartBttnHpLp3065;

	@FindBy(xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement HpLpSuccessMesg;

	// Scenario 3 Xpaths

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;

	@FindBy(xpath = "//select[@id='input-option226']//child::option[2]")
	private WebElement redColorFromDropdown;


	@FindBy(xpath = "(//a[text()='Canon EOS 5D Camera'])[3]")
	private WebElement canonCameraSuccessMesg;

	// Xpaths for scenario 4

	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement clickOnCanonEOS5DCamera;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReview;

	@FindBy(id = "input-name")
	private WebElement nameField;

	@FindBy(id = "input-review")
	private WebElement reviewField;

	@FindBy(xpath = "//input[@value='3']")
	private WebElement ratingField;

	@FindBy(id = "button-review")
	private WebElement reviewCountinueBttn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageAfterReview;

// Methods for Scenario 1 
	public void clickOnDesktopsTab() {
		desktopsTab.click();

	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();

	}

	public List<WebElement> desktopsItmes() {
		List<WebElement> deskItmes = items;
		return deskItmes;

	}

	// Methods for Scenario 2
	public void addToTheCartHpLp3065() {
		clickAddToCartHpLp3065.click();
	}

	public void quantityOfHpLp3065(String quantityValue) {
		inputQuantity.clear();
		inputQuantity.sendKeys(quantityValue);
	}

	public void clickAddToCardBttnHpLp3065() {
		addToCartBttnHpLp3065.click();

	}

	public boolean successMessageForHpLpOnUI() {
		if (HpLpSuccessMesg.isDisplayed())
			return true;
		else
			return false;
	}

	// Methods for Scenario 3
	public void addToCartCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}

	public void selectRedColorFromDropdown() {
		redColorFromDropdown.click();
	}

	public boolean succesMessgForCanonCamera5D() {
		if (canonCameraSuccessMesg.isDisplayed())
			return true;
		else
			return false;
	}

	// Methods for Scenario 4

	public void clickOnCanonEOS5dCamera() {
		clickOnCanonEOS5DCamera.click();
	}

	public void clickOnWriteReview() {
		writeReview.click();
	}

	public void enterName(String yourname) {
		nameField.sendKeys(yourname);

	}

	public void writeReview(String yourReview) {
		reviewField.sendKeys(yourReview);
	}

	public void giveRate() {
		ratingField.click();

	}

	public void clickAfterReviewOnContinueBttn() {
		reviewCountinueBttn.click();
	}

	public boolean successMessageAfterReviewOnUI() {
		if (messageAfterReview.isDisplayed())
			return true;
		else
			return false;
	}

}
