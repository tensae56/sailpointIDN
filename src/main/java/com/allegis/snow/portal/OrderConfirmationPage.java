package com.allegis.snow.portal;

import java.util.ResourceBundle;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import com.allegis.snow.base.BasePage;
import com.allegis.utilities.ConstantsProperties;
import com.framework.core.interfaces.Button;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Textbox;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.Constants;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;

/**
 * 
 * @author kpremkumar
 * @version 2.0
 * @since 10-19-2018
 */
public class OrderConfirmationPage extends PortalRequestDetailsPage {

	/** Constructor **/
	public OrderConfirmationPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}

	/**
	 * verify the Onboard Employee -Order now Confirmation NA
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderConfirmation(String userRole) {
		String expectedName = null;
		String actualName = null;
		TestReporter.logStep("Order Confirmatiton pop up validation");
		WaitAllegis.hardWait(MAX_TIMEOUT);
		wbeOrderConfirmation.syncVisible(10);
		TestReporter.assertTrue(wbeOrderConfirmation.existsInFrame(), "Order Confirmation Section is displayed");
		TestReporter.assertEquals(wbeOrderConfirmation.getText(), "Order Confirmation",
				"Order Confirmation Label validated:" + wbeOrderConfirmation.getText());
		wbeOrderConfirmationRequestFor.syncVisible(10);
		ResourceBundle userCredentialRepo = ResourceBundle.getBundle(Constants.USER_CREDENTIALS_PATH);
		expectedName = userCredentialRepo.getString(userRole.toUpperCase()).replaceAll("\\s", "");
		actualName = wbeOrderConfirmationRequestFor.getText().replaceAll("\\s", "");
		TestReporter.log("Expected:" + expectedName);
		TestReporter.log("Actual:" + actualName);
		TestReporter.assertEquals(expectedName, actualName,
				"Order Confirmation Request for field validated:" + wbeOrderConfirmationRequestFor.getText());
		TestReporter.logStep("Entering Delivery Information");
		if (!txtDeliveryInformation.existsInFrame()) {
			btnDeliveryInformation.clickOnSync();
		}
		txtDeliveryInformation.syncVisible(10);
		txtDeliveryInformation.set(ConstantsProperties.SHIPPINGTEXT);
		txtDeliveryInformation.sendKeys(Keys.TAB);
		TestReporter.assertEquals(txtDeliveryInformation.getText(), ConstantsProperties.SHIPPINGTEXT,
				"Delivery Information entered " + txtDeliveryInformation.getText());
	}

	/**
	 * verify the Order now Confirmation
	 * 
	 * @param None.
	 * @return None
	 */
	public void verifyOrderConfirmationAndFillOptionalFields(String userRole) {
		TestReporter.logStep("Order Confirmatiton pop up validation");
		wbeOrderConfirmation.syncVisible(10);
		TestReporter.assertTrue(wbeOrderConfirmation.existsInFrame(), "Order Confirmation Section is displayed");
		TestReporter.assertEquals(wbeOrderConfirmation.getText(), "Order Confirmation",
				"Order Confirmation Label validated:" + wbeOrderConfirmation.getText());
		wbeOrderConfirmationRequestFor.syncVisible(10);
		ResourceBundle userCredentialRepo = ResourceBundle.getBundle(Constants.USER_CREDENTIALS_PATH);
		String name = userCredentialRepo.getString(userRole.toUpperCase());
		TestReporter.assertEquals(wbeOrderConfirmationRequestFor.getText(), name,
				"Order Confirmation Request for field validated:" + wbeOrderConfirmationRequestFor.getText());
		TestReporter.logStep("Entering Delivery Information");
		wbeDeliveryInformation.scrollIntoView();
		wbeDeliveryInformation.click();
		WaitAllegis.hardWait(MIN_TIMEOUT);
		txtDeliveryInformation.clear();
		txtDeliveryInformation.set(ConstantsProperties.SHIPPINGTEXT);
		txtDeliveryInformation.sendKeys(Keys.TAB);
		TestReporter.assertEquals(txtDeliveryInformation.getText(), ConstantsProperties.SHIPPINGTEXT,
				"Delivery Information entered " + txtDeliveryInformation.getText());
		TestReporter.logStep("Entering Special Instructions");
		wbeSpecialInstructions.scrollIntoView();
		wbeSpecialInstructions.click();
		WaitAllegis.hardWait(MIN_TIMEOUT);
		txtSpecialInstructions.clear();
		txtSpecialInstructions.set(ConstantsProperties.SPECIALINSTRUCTIONS);
		txtSpecialInstructions.sendKeys(Keys.TAB);
		TestReporter.assertEquals(txtSpecialInstructions.getText(), ConstantsProperties.SPECIALINSTRUCTIONS,
				"Special Instructions entered" + txtSpecialInstructions.getText());
	}

	/**
	 * Handle wait for submitting more requests with time delay
	 * 
	 * @param lastName
	 * @return None
	 */
	public void handleWait(String lastName) {

		if (lastName.equals("Two")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 5);
		} else if (lastName.equals("Three")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 10);
		} else if (lastName.equals("Four")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 15);
		} else if (lastName.equals("Five")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 20);
		} else if (lastName.equals("Six")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 25);
		} else if (lastName.equals("Seven")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 30);
		} else if (lastName.equals("Eight")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 35);
		} else if (lastName.equals("Nine")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 40);
		} else if (lastName.equals("Ten")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 45);
		} else if (lastName.equals("Eleven")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 50);
		} else if (lastName.equals("Twelve")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 55);
		} else if (lastName.equals("Thirteen")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 60);
		} else if (lastName.equals("Fourteen")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 65);
		} else if (lastName.equals("Fifteen")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 70);
		} else if (lastName.equals("Sixteen")) {
			WaitAllegis.hardWait(MAX_TIMEOUT * 75);
		}
	}

	/**
	 * click on order now
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderNow() {
		TestReporter.logStep("Click on Order Now");
		btnOrderNow.clickOnSync();
		WaitAllegis.hardWait(MAX_TIMEOUT);
	}

	/**
	 * click on Proceed To Checkout button
	 * 
	 * @param None.
	 * @return None
	 */
	public void proceedToCheckout() {
		TestReporter.logStep("Click Proceed To Checkout");
		btnProceedToCheckout.syncInFrame(20);
		btnProceedToCheckout.scrollToAndCickOnSync();
		WaitAllegis.hardWait(MAX_TIMEOUT);
	}

	/**
	 * click on Checkout button
	 * 
	 * @param None.
	 * @return None
	 */
	public void checkout() {
		TestReporter.logStep("Click Checkout");
		btnCheckOut.syncInFrame(20);
		btnCheckOut.scrollToAndCickOnSync();
		WaitAllegis.hardWait(MAX_TIMEOUT);
	}

	/**
	 * verify Add attachments link.
	 * 
	 * @param None.
	 * @return None
	 */
	public void verifyAddAttachments() {
		TestReporter.assertTrue(wbeAddAttachments.existsInFrame(), "'Add Attachments' link was displayed");
	}

	/**
	 * verify Add to cart and Order now button.
	 * 
	 * @param None.
	 * @return None
	 */

	public void verifyAddToCartAndOrderNow() {
		TestReporter.assertTrue(btnAddToCart.existsInFrame(), "'Add To Cart' Button was displayed");
		TestReporter.assertTrue(btnOrderNow.existsInFrame(), "'Order Now' Button was displayed");
	}

	/**
	 * click add to cart button.
	 * 
	 * @param None.
	 * @return None
	 */
	public void clickAddToCart() {
		btnAddToCart.click();
		WaitAllegis.hardWait(MAX_TIMEOUT);
	}
	
	/**
	 * click view cart button.
	 * 
	 * @param None.
	 * @return None
	 */
	public void clickViewCart() {
		wbeViewCart.syncVisible(20);
		wbeViewCart.scrollIntoView();
		wbeViewCart.click();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.assertTrue(wbeYourCart.existsInFrame(), "'Your Cart' page was displayed");
	}
	
}
