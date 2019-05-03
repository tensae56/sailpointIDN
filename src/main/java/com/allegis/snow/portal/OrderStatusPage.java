package com.allegis.snow.portal;

import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;

/**
 * Order Status
 * 
 * @author kpremkumar
 * @version 2.0
 * @since 10-19-2018
 */
public class OrderStatusPage extends PortalRequestDetailsPage {
	private static String REQUESTNUMBER = null;
	private static String NEWHIRENUM = null;

	/** Constructor **/
	public OrderStatusPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}

	/**
	 * Capture the request number
	 * 
	 * @param None.
	 * @return RequestNumber
	 */
	public String captureRequestNumber() {
		TestReporter.logStep("verify the request number and store the request number");
		WaitAllegis.hardWait(MAX_TIMEOUT);
		requestNum.syncVisible(20);
		TestReporter.assertTrue(requestNum.existsInFrame(), "Request is displayed");
		requestNum.highlight();
		REQUESTNUMBER = requestNum.getText();
		TestReporter.assertTrue(requestNum.existsInFrame(), "Request: " + REQUESTNUMBER + " is created");
		return REQUESTNUMBER;
	}

	/**
	 * verify the Onboard Employee -Checkout process and store the new Hire request
	 * Number
	 * 
	 * @param None.
	 * @return RequestNumber
	 */
	public String checkoutAndCaptureRequest() {
		TestReporter.logStep("Click Checkout");
		btnCheckOut.scrollToAndCickOnSync();
		requestNum.syncVisible(20);
		TestReporter.assertTrue(requestNum.existsInFrame(), "Request is displayed");
		requestNum.highlight();
		NEWHIRENUM = requestNum.getText();
		TestReporter.assertTrue(requestNum.existsInFrame(), "Request: " + NEWHIRENUM + " is created");
		return NEWHIRENUM;
	}

	/**
	 * logout from user.
	 * 
	 * @param None.
	 * @return None
	 */
	public void logoutByServicePortal() {
		wbeUser.syncVisible(10);
		wbeUser.click();
		wbeLogout.syncVisible(10);
		wbeLogout.clickOnSync();
	}
}
