package com.allegis.snow.base;

import java.util.ResourceBundle;
import org.openqa.selenium.support.FindBy;
import com.allegis.snow.base.BasePage;
import com.allegis.utilities.FetchData;
import com.framework.core.interfaces.Button;
import com.framework.core.interfaces.Checkbox;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Textbox;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.Constants;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;

/**
 * Represents an login to service now .
 * 
 * @author Shiva
 * @version 1.0
 * @since 02-20-2018
 */
public class LoginPage extends BasePage {

	/** Page Elements **/
	@FindBy(xpath = "//input[@id='username']")
	private Textbox txtUserName;
	
	@FindBy(xpath = "//input[@id='password']")
	private Textbox txtPassword;
	
	@FindBy(xpath = "//input[@id='remember_me']")
	private Checkbox chkRememberMe;
	@FindBy(css = "button[type='submit']")
	private Button btnLogin;
	
	@FindBy(xpath = "//input[@id='userid']")
	private Textbox txtUserID;

	@FindBy(xpath = "//input[@id='pwd']")
	private Textbox txtPassWord;

	@FindBy(xpath = "//input[@class='ps-button']")
	private Button btnSignIn;
	
	
	/** Constructor **/
	public LoginPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}
	
	/**
	 * Login based on the role.
	 * 
	 * @param role
	 *            User's username and password.
	 * @return None
	 */
	public void loginWithCredentials(String role) {
		refereshPage();
		ResourceBundle userCredentialRepo = ResourceBundle.getBundle(Constants.USER_CREDENTIALS_PATH);
		String name = userCredentialRepo.getString(role.toUpperCase());
		String password = userCredentialRepo.getString(role.toUpperCase() + "_PASSWORD");
		boolean load = true;
		int count = 0;
		while (load) {
			if (txtUserName.existsInFrame()) {
				break;
			} else {
				count++;
				driver.navigate().refresh();
				driver.get(driver.getCurrentUrl());
			}
			if (count == 5) {
				TestReporter.assertTrue(false, "Username field not displayed");
				break;
			}
		}
		txtUserName.syncInFrame(30);
		TestReporter.assertTrue(txtUserName.existsInFrame(), "Login Page Appears");
		txtUserName.set(name);
		txtPassword.setSecure(password);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		boolean blnstatus = btnLogin.existsInFrame(10);
		if (blnstatus == true) {
			chkRememberMe.clickOnSync();
			btnLogin.clickOnSync();
		}
		TestReporter.assertTrue(true, "User: '" + name + "' logged in successfully");
	}
	public void loginWithCredentialsPF(String role) {
		driver.navigate().refresh();
		ResourceBundle userCredentialRepo = ResourceBundle.getBundle(Constants.USER_CREDENTIALS_PATH);
		String name = userCredentialRepo.getString(role.toUpperCase());
		String password = userCredentialRepo.getString(role.toUpperCase() + "_PASSWORD");
		boolean load = true;
		int count = 0;
		while (load) {
			if (txtUserID.existsInFrame()) {
				break;
			} else {
				count++;
				driver.navigate().refresh();
				driver.get(driver.getCurrentUrl());
			}
			if (count == 5) {
				TestReporter.assertTrue(false, "Username field not displayed");
				break;
			}
		}
		txtUserID.syncInFrame(30);
		TestReporter.assertTrue(txtUserID.existsInFrame(), "Login Page Appears");
		txtUserID.set(name);
		txtPassWord.setSecure(password);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		boolean blnstatus = btnSignIn.existsInFrame(10);
		if (blnstatus == true) {
			btnSignIn.clickOnSync();
		}
		TestReporter.assertTrue(true, "User: '" + name + "' logged in successfully");
	}
	
	public void loginWithCredentialServiceNow(String role) {
		loginWithCredentials(role);
	}
	/**
	 * 
	 * Handle console UrL in training environment
	 * 
	 * @param domain
	 * @throws Exception
	 */
	public void handleURL(String domain) throws Exception {
		WaitAllegis.hardWait(MAX_TIMEOUT * 2);
		FetchData fdata = new FetchData();
		String urlExpected = fdata.text(domain);
		System.out.println(urlExpected);
		driver.get(urlExpected);
	}
	 public void refereshPage() {
			driver.navigate().refresh();
	    }

}
