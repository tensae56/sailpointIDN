package com.allegis.snow.portal;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import com.allegis.snow.base.BasePage;
import com.allegis.utilities.FetchData;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Textbox;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;
import com.framework.utils.date.DateTimeConversion;

/**
 * 
 * @author kpremkumar
 * @version 2.0
 * @since 10-19-2018
 */
public class OrderGuideDescribeNeedsPage extends BasePage {

	private String PERSONALEMAIL= "test@test.com";
	private static String[] computerOptionsUK= {"-- None --","Standard desktop","Standard laptop","Travel laptop","No services required"};	
	private static String[] computerOptionsUS= {"-- None --","Standard desktop","Standard laptop","Travel laptop","Non-standard computer","No services required"};	
	private static String[] computerOptionsUSTEK= {"-- None --","Standard desktop","Standard laptop","Travel laptop","Non-standard computer","TEK BOA Desktop","No services required"};	
	private static String[] monitorOptions= {"-- None --","Yes","No"};	
	private static String[] headSetOptions= {"-- None --","USB headset","Wired headset"};	
	private static String[] headSetOptionsMLA= {"-- None --","USB headset","Wired headset","Wireless headset"};	
	private static String[] mobileOptions= {"-- None --","Yes","No"};		
	private static String[] phoneOptionsUK= {"-- None --","New extension","No services required"};	
	private static String[] phoneOptionsUS= {"-- None --","New phone","New extension","Reassign extension","No services required"};
	private static String[] vdiAccessOptions= {"-- None --","Yes","No"};	
	private static String[] applicationAccessOptions= {"Contract Logix","Hyperion","OnBase","Onboarding Automation","PeopleSoft FS","Peoplesoft HR","PeopleSoft nVision","PeopleSoft Oasis","SalesForce","Time and Expense","Time Central","VDI","WebFocus","WSSRD"};
	private static String[] applicationAccessOptionsTEK= {"OnBase","PeopleSoft FS","PeopleSoft Oasis","Time and Expense"};
	private static String[] applicationAccessOptionsAEROTEK= {"OnBase","PeopleSoft FS","Peoplesoft HR","PeopleSoft Oasis","Time and Expense"};
	private static String[] applicationAccessOptionsMLA= {"Contract Logix","Hyperion","MaxHire","OnBase","Onboarding Automation","PeopleSoft FS","Peoplesoft HR","PeopleSoft Oasis","SalesForce","Time and Expense","Time Central","VDI","WebFocus","WSSRD"};
	private static String[] headSetOptionsAerotek= {"-- None --","USB headset","Wired headset","Wireless headset"};	
	
	//EMEA specific
	private static String[] computerOptionsUKEMEA= {"-- None --","Standard desktop","Standard laptop","Travel laptop"};	
	private static String[] computerOptionsUSEMEA= {"-- None --","Standard desktop","Standard laptop","Travel laptop","Non-standard computer"};	
	private static String[] phoneOptionsUKEMEA= {"-- None --","New extension"};	
	private static String[] phoneOptionsUSEMEA= {"-- None --","New phone","New extension","Reassign extension"};
	
	/** Page Elements **/
	@FindBy(xpath = "//div[@class='text-muted item-short-desc break-word ng-binding'][contains(text(),'Onboard a new or returning employee')]")
	private Element wbeOnboardingEmployee;
	
	@FindBy(xpath = "//h2[@title='Onboard Employee (APAC India/SailPoint)']/following-sibling::div[contains(text(),'Onboard a new or returning employee')]")
	private Element wbeOnboardingEmployeeAPAC;
	
	@FindBy(xpath = "//h1[@class='h2 m-n font-thin ng-binding ng-scope']")
	private Element wbeOnboardingEmployeeLabel;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Describe Needs')]/preceding-sibling::div")
	private Element wbeDescribeNeedsIcon;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Describe Needs')]")
	private Element wbeDescribeNeeds;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Choose Options')]/preceding-sibling::div")
	private Element wbeChooseOptionsIcon;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Choose Options')]")
	private Element wbeChooseOptions;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Summary')]/preceding-sibling::div")
	private Element wbeSummaryIcon;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Summary')]")
	private Element wbeSummary;
	
	@FindBy(xpath = "//legend[contains(text(),'Employee Information')]")
	private Element wbeEmployeeInfo;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'First name')]")
	private Element lblFirstName;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'First name')]/following-sibling::span//input")
	private Textbox txtFieldSetFirstName;

	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Middle name')]")
	private Element lblMiddleName;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Middle name')]/following-sibling::span//input")
	private Textbox txtFieldSetMiddleName;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Last name')]")
	private Element lblLastName;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Last name')]/following-sibling::span//input")
	private Textbox txtFieldSetLastName;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Personal email address')]")
	private Element lblPersonalEmail;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Personal email address')]/following-sibling::span//input")
	private Textbox txtFieldSetPersonalEmail;
	
	@FindBy(xpath = "//*[contains(text(),'Preferred Display Name')]")
	private Element lblPDName;
		
	@FindBy(xpath = "//fieldset//label[contains(text(),'Preferred Display Name')]/following-sibling::span//input")
	private Textbox txtFieldSetPDName;
	
	@FindBy(xpath = "//label[contains(text(),'Will the employee need a default email domain that differs from the primary domain?')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element lblDefaultEmailDomainMandatory;
	
	@FindBy(xpath = "//*[contains(text(),'Will the employee need a default email domain that differs from the primary domain?')]")
	private Element lblDefaultEmailDomain;
			
	@FindBy(xpath = "//fieldset//label[contains(text(),'Will the employee need a default email domain that differs from the primary domain?')]/following-sibling::span//a")
	private Textbox txtDefaultEmailDomain;
	
	@FindBy(xpath = "//label[contains(text(),'Does the external employee have a .net account?')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element lblNetAccountMandatory;
	
	@FindBy(xpath = "//*[contains(text(),'Does the external employee have a .net account?')]")
	private Element lblNetAccount;
			
	@FindBy(xpath = "//fieldset//label[contains(text(),'Does the external employee have a .net account?')]/following-sibling::span//a")
	private Textbox txtNetAccount;
	
	@FindBy(xpath = "//label[contains(text(),'First name')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element lblFirstNameMandatory;
	
	@FindBy(xpath = "//label[contains(text(),'Last name')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element lblLastNameMandatory;
	
	@FindBy(xpath = "//label[contains(text(),'Personal email address')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element lblPersonalEmailMandatory;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Middle name')]")
	private Textbox wbeMiddleName;
	
	@FindBy(xpath = ".//*[@id='select2-drop']//input")
	private Textbox txtDropdownSearch;
	
	@FindBy(xpath = ".//*[@id='select2-drop']//ul")
	private Textbox txtDropdownSearchApplicationAccess;
	
	@FindBy(xpath = "//legend[contains(text(),'Office Information')]")
	private Element wbeOfficeInfo;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Country')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeCountry;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Country')]/following-sibling::span//a")
	private Textbox txtCountry;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Office location')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeOfficeLocation;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Office location')]/following-sibling::span//a")
	private Textbox txtOfficeLocation;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Operating company')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeOperatingCompany;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Operating company')]/following-sibling::span//a")
	private Textbox txtOperatingCompany;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Department')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeDepartmentsection;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Department')]/following-sibling::span//a")
	private Textbox txtDepartment;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Program')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeOfficeProgram;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Program')]/following-sibling::span//a")
	private Textbox txtOfficeProgram;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Building access')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeOfficeBuildingAccess;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Building access')]/following-sibling::span//a")
	private Textbox txtOfficeBuildingAccess;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Will the new hire be located in a remote location or client site (i.e. vendor on premise)?')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeOfficeRemote;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Will the new hire be located in a remote location or client site (i.e. vendor on premise)?')]/following-sibling::span//a")
	private Textbox txtOfficeRemote;
	
	@FindBy(xpath = "//legend[contains(text(),'Job Information')]")
	private Element wbeJobInfo;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Start date')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeStartDate;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Start date')]/following-sibling::span/div/input")
	private Textbox txtStartDate;
	
	@FindBy(xpath = "//div[@ng-show='field.messages']/div[contains(text(),'Start date must be at least 3 days in the future')]")
	private Element wbeStartDateValdiationMessage;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Supervisor')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeSupervisor;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Supervisor')]/following-sibling::span//a")
	private Textbox txtSupervisor;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Job code')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeJobTitle;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Job code')]/following-sibling::span//a")
	private Textbox txtJobTitle;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Business title')]")
	private Textbox wbeBusinessTitle;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Rehire')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeRehire;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Rehire')]/following-sibling::span//a")
	private Textbox txtRehire;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Employee ID')]")
	private Element lblEmployeeID;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Employee ID')]/following-sibling::span//input")
	private Textbox txtFieldSetEmployeeID;
	
	@FindBy(xpath = "//label[contains(text(),'Employee ID')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element lblEmployeeIDMandatory;
	
	@FindBy(xpath = "//div[@ng-show='field.messages']/div[contains(text(),'Employee ID must be an 8-digit numeric value (ex: 12345678)')]")
	private Element wbeEmployeeIDValdiationMessage;
	
	@FindBy(xpath = "//legend[contains(text(),'Equipment Requirements')]")
	private Element wbeEquipmentInfo;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Computer')]//span[@ng-show='field.mandatory']")
	private Textbox wbeComputer;
		
	@FindBy(xpath = "//fieldset//label[contains(text(),'Computer')]")
	private Textbox wbeComputerOptional;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Computer')]/following-sibling::span//a")
	private Textbox txtComputer;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'External monitor')]//span[@ng-show='field.mandatory']")
	private Element wbeComputerExternalMonitor;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'External monitor')]/following-sibling::span//a")
	private Textbox txtComputerExternalMonitor;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Phone setup')]//span[@ng-show='field.mandatory']")
	private Textbox wbePhoneSetup;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Phone setup')]")
	private Textbox wbePhoneSetupOptional;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Phone setup')]/following-sibling::span//a")
	private Textbox txtPhoneSetup;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Mobile phone')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMobilePhone;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Mobile phone')]/following-sibling::span//a")
	private Textbox txtMobilePhone;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Headset')]")
	private Textbox wbeHeadSet;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Headset')]/following-sibling::span//a")
	private Textbox txtHeadSet;
	
	@FindBy(xpath = "//legend[contains(text(),'Access Requirements')]")
	private Element wbeApplicationInfo;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'VDI Access')]//span[@ng-show='field.mandatory']")
	private Element wbeVDIAccessReq;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'VDI Access')]/following-sibling::span//a")
	private Textbox txtVDIAccessReq;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Application access')]")
	private Textbox wbeApplicationAccess;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Application access')]/following-sibling::span/div[2]/ul/li/input")
	private Textbox txtApplicationAccess;
	
	@FindBy(xpath = "//label[contains(text(),'Are there additional items not listed here that the employee will need for their first day?')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element lblAdditonalItemsMandatory;
	
	@FindBy(xpath = "//*[contains(text(),'Are there additional items not listed here that the employee will need for their first day?')]")
	private Element lblAdditonalItems;
			
	@FindBy(xpath = "//fieldset//label[contains(text(),'Are there additional items not listed here that the employee will need for their first day?')]/following-sibling::span//a")
	private Textbox txtAdditonalItems;
	
	@FindBy(xpath = ".//button[@id='submit'][contains(text(),'Next')]")
	private Element btnNext;
	
	@FindBy(xpath = ".//button[@id='submit'][contains(text(),'Previous')]")
	private Element btnPrevious;
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private Element btnOrderNow;
	
	private By txtDropDown=By.xpath("//ul[@class='select2-results']/li/div");

	/** Constructor **/
	public OrderGuideDescribeNeedsPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}
		
	
	/**
	 * verify the Onboard Employee Option
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBoard() {
		
		TestReporter.logStep("Verify OnBoard Employee");
		TestReporter.assertTrue(wbeOnboardingEmployee.existsInFrame(), "OnBoard Employee option is displayed");
		wbeOnboardingEmployee.click();
	}

	/**
	 * verify the Onboard Employee Option for APAC
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBoardAPAC() {
		
		TestReporter.logStep("Verify OnBoard Employee APAC");
		TestReporter.assertTrue(wbeOnboardingEmployeeAPAC.existsInFrame(), "OnBoard Employee option is displayed for APAC");
		wbeOnboardingEmployeeAPAC.click();
	}
	
	/**
	 * verify the Onboard Employee page Describe needs tab Option
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBoardEmployeeSection() {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.logStep("Verify OnBoard Employee Page opens");
		TestReporter.assertTrue(wbeOnboardingEmployeeLabel.existsInFrame(), "OnBoard Employee page is displayed");
		TestReporter.logStep("Verify Describe Needs option active");
		TestReporter.assertTrue(wbeDescribeNeedsIcon.getAttribute("class").contains("circle_icon step_active")
				,"Describe Needs Tab active as expected");
		TestReporter.assertTrue(wbeChooseOptionsIcon.getAttribute("class").contains("circle_icon step_inactive")
				,"ChooseOptions Tab Inactive as expected");
		TestReporter.assertTrue(wbeSummaryIcon.getAttribute("class").contains("circle_icon step_inactive")
				,"Summary Tab Inactive as expected");
	}
	
	/**
	 * verify the Onboard Employee page Text Section area
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBoardEmployeeSectionTextVerification(){
		
		TestReporter.logStep("Verify OnBoard Employee Text Section");
		try {
			FetchData fet=new FetchData();
			List<String> textOnBoard1=new ArrayList<>();
			textOnBoard1.add(0, fet.text("NewHireText1"));
			textOnBoard1.add(1, fet.text("NewHireText2"));
			textOnBoard1.add(2, fet.text("NewHireText3"));
			List<Element> myText2=driver.findElements(By.xpath("//div[@class='m-t guide-description ng-binding']/div/p"));
				for(int i=0;i<myText2.size();i++) {	
				TestReporter.log("Expected text:");
				TestReporter.log(textOnBoard1.get(i));
				TestReporter.log("Actual text:");
				TestReporter.log(myText2.get(i).getText());
				TestReporter.assertEquals(myText2.get(i).getText(), textOnBoard1.get(i), "Text verified -"+myText2.get(i).getText());		
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	/**
	 * verify the Onboard Employee Information Section firstname
	 * 
	 * @param firstName
	 * 				Mandatory Text box Firstname 
	 * 				
	 * @return None
	 */
	public void employeeInformationFirstName(String firstName) {
		
		TestReporter.logStep("Validating Employee Information section");
		TestReporter.assertTrue(wbeEmployeeInfo.existsInFrame(),"'Employee Information' Section is displayed");
		TestReporter.logStep("Validating FirstName field");
		TestReporter.assertTrue(lblFirstName.existsInFrame(),"Name section field - First Name is displayed");
		TestReporter.logStep("Verify First Name field is a mandatory field");
		TestReporter.assertTrue(lblFirstNameMandatory.existsInFrame(), "First Name field is a mandatory field");
		TestReporter.logStep("Verify First Name field is a text field");
		TestReporter.assertTrue(txtFieldSetFirstName.existsInFrame(), "First Name field is a text field");
		TestReporter.logStep("Enter First Name in the text field");
		txtFieldSetFirstName.set(firstName);
		TestReporter.assertTrue(txtFieldSetFirstName.getText().contains(firstName),firstName + " is entered in the text field");
	}
	
	/**
	 * verify the Onboard Employee Information Section middlename
	 * 				
	 * @return None
	 */
	public void employeeInformationMiddleName() {
		
		TestReporter.logStep("Validating MiddleName field");
		TestReporter.assertTrue(wbeMiddleName.existsInFrame(),"Middle name displayed as a Optional field");
	}
	
	/**
	 * verify the Onboard Employee Information Section lastname
	 * 
	 * @param lastname
	 * 				Mandatory Text box LastName 
	 * 				
	 * @return None
	 */
	public void employeeInformationlastName(String lastName) {
		TestReporter.logStep("Validating LastName field");
		TestReporter.assertTrue(lblLastName.existsInFrame(),"Name section field - Last Name is displayed");
		TestReporter.logStep("Verify Last Name field is a mandatory field");
		TestReporter.assertTrue(lblLastNameMandatory.existsInFrame(), "Last Name field is a mandatory field");
		TestReporter.logStep("Verify Last Name field is a text field");
		TestReporter.assertTrue(txtFieldSetLastName.existsInFrame(), "Last Name field is a text field");
		TestReporter.logStep("Enter Last Name in the text field");
		txtFieldSetLastName.clickOnSync();
		txtFieldSetLastName.set(lastName);
		TestReporter.assertTrue(txtFieldSetLastName.getText().contains(lastName),lastName + " is entered in the text field");
	}
	
	/**
	 * verify the Onboard Employee Information Section middlename
	 * 				
	 * @return None
	 */
	public void employeeInformationMiddleName(String middleName) {
		
		TestReporter.logStep("Validating MiddleName field");
		TestReporter.assertTrue(wbeMiddleName.existsInFrame(),"Middle name displayed as a Optional field");
		TestReporter.assertTrue(txtFieldSetMiddleName.existsInFrame(), "First Name field is a text field");
		TestReporter.logStep("Enter First Name in the text field");
		txtFieldSetMiddleName.set(middleName);
		TestReporter.assertTrue(txtFieldSetMiddleName.getText().contains(middleName),middleName+ " is entered in the text field");
	}
	
	/**
	 * verify the Onboard Employee Information Section operatingCompany
	 * 
	 * 
	 * @return None
	 */
	public void employeeInformationPersonalEmailAddress() {
	
		TestReporter.logStep("Validating Personal Email Address  field");
		TestReporter.assertTrue(lblPersonalEmail.existsInFrame(),"Name section field - Personal Email address  is displayed");
		TestReporter.logStep("Verify Personal Email address field is a mandatory field");
		TestReporter.assertTrue(lblPersonalEmailMandatory.existsInFrame(), "Personal Email address field is a mandatory field");
		TestReporter.logStep("Verify Personal Email address field is a text field");
		TestReporter.assertTrue(txtFieldSetPersonalEmail.existsInFrame(), "Personal Email address field is a text field");
		TestReporter.logStep("Enter Personal Email address in the text field");
		txtFieldSetPersonalEmail.clickOnSync();
		txtFieldSetPersonalEmail.set(PERSONALEMAIL);
		TestReporter.assertTrue(txtFieldSetPersonalEmail.getText().contains(PERSONALEMAIL),PERSONALEMAIL + " is entered in the Personal Email address field");
	}
 	/**
	 * Verify Perferred Display name field
	 * 
	 * @param None
	 * 
	 * @return None
	 */
	public void employeeInformationPrefferedDisplayName(String preferredDisplayName) {
		TestReporter.logStep("Validating Preffered Display Name field");
		TestReporter.assertTrue(lblPDName.existsInFrame(),"Name section field - Preffered Display Name is displayed");
		TestReporter.assertTrue(txtFieldSetPDName.existsInFrame(), "Preffered Display name is a text field");
		txtFieldSetPDName.clickOnSync();
		txtFieldSetPDName.set(preferredDisplayName);
		TestReporter.assertTrue(txtFieldSetPDName.getText().contains(preferredDisplayName),preferredDisplayName + " is the Preferred Display Name");
	}
	
 	/**
	 * Verify Email Default Domain field
	 * 
	 * @param None
	 * 
	 * @return None
	 */
	public void employeeInformationDefaultEmailDomain(String emailDomain) {

		TestReporter.logStep("Verify Default email Domain is a mandatory field");
		TestReporter.assertTrue(lblDefaultEmailDomainMandatory.existsInFrame(), "Default email Domain field is a mandatory field");
		TestReporter.assertTrue(lblDefaultEmailDomain.existsInFrame(), "Default email Domain field label is verified");
		TestReporter.logStep("Select Default email Domain " + emailDomain);
		txtDefaultEmailDomain.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(emailDomain);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtDefaultEmailDomain.syncVisible(20);
		TestReporter.assertTrue(txtDefaultEmailDomain.getAttribute("text").contains(emailDomain),emailDomain + " is selected in Default email Domain  field");
	}
	
 	/**
	 * Verify Email Default Domain field
	 * 
	 * @param None
	 * 
	 * @return None
	 */
	public void employeeInformationNetAccount(String netAccount) {

		TestReporter.logStep("Verify External employee .net account  is a mandatory field");
		TestReporter.assertTrue(lblNetAccountMandatory.existsInFrame(), " External employee .net account  is a mandatory field");
		TestReporter.assertTrue(lblNetAccount.existsInFrame(), " External employee .net account  field label is verified");
		TestReporter.logStep("Select  External employee .net account  " + netAccount);
		txtNetAccount.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(netAccount);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtNetAccount.syncVisible(20);
		TestReporter.assertTrue(txtNetAccount.getAttribute("text").contains(netAccount),netAccount + " is selected in  External employee .net account   field");
	}
	
	/**
	 * verify the Onboard Office Information Section country
	 * 
	 * @param country
	 * 				Mandatory Drop down box Country
	 * 
	 * @return None
	 */
	public void officeInformationCountry(String country) {
		
		TestReporter.logStep("Verify Office Information section");
		TestReporter.assertTrue(wbeOfficeInfo.existsInFrame(), "Office Information section is displayed");
		TestReporter.logStep("Verify Country field is a mandatory field");
		TestReporter.assertTrue(wbeCountry.existsInFrame(), "Country field is a mandatory field");
		TestReporter.logStep("Select Country as " + country);
		txtCountry.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(country);
		Element wbeCountry=driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(), '"+country+"')]"));
		wbeCountry.click();
		txtCountry.syncVisible(30);
		TestReporter.assertTrue(txtCountry.getAttribute("text").contains(country),country + " is selected in Country field");
	}
	
	/**
	 * verify the Onboard Office Information Section office location
	 * 
	 * @param officeLocation
	 * 				Mandatory Drop down box Office location	
	 * 
	 * @return None
	 */
	public void officeInformationOfficeLocation(String officeLocation) {
		
		TestReporter.logStep("Verify Office Location field is a mandatory field");
		TestReporter.assertTrue(wbeOfficeLocation.existsInFrame(), "Office Location field is a mandatory field");
		TestReporter.logStep("Select Office Location as " + officeLocation);
		txtOfficeLocation.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(officeLocation);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtOfficeLocation.syncVisible(20);
		TestReporter.assertTrue(txtOfficeLocation.getAttribute("text").contains(officeLocation)
				,officeLocation + " is selected in Office Location field");
	}
	
	/**
	 * verify the Onboard Office Information Section operatingCompany
	 * 
	 * @param operatingCompany
	 * 	  			Mandatory Drop down box Operating Company
	 * 
	 * @return None
	 */
	public void officeInformationOperatingCompany(String operatingCompany) {
			
		TestReporter.logStep("Verify Operating Company field is a mandatory field");
		TestReporter.assertTrue(wbeOperatingCompany.existsInFrame(), "Operating Company field is a mandatory field");
		TestReporter.logStep("Select Operating Company as " + operatingCompany);
		txtOperatingCompany.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(operatingCompany);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		txtOperatingCompany.syncVisible(20);
		TestReporter.assertTrue(txtOperatingCompany.getAttribute("text").contains(operatingCompany)
				,operatingCompany + " is selected in Operating Company field");
		
	}
		
	/**
	 * verify the Onboard Office Information Section program
	 * 
	 * @param program
	 * 				Mandatory Drop down box program
	 * 
	 * @return None
	 */
	public void officeInformationProgram( String program) {

		TestReporter.logStep("Verify Program is a mandatory field");
		TestReporter.assertTrue(wbeOfficeProgram.existsInFrame(), "Program field is a mandatory field");
		TestReporter.logStep("Select program as " + program);
		txtOfficeProgram.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(program);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtOfficeProgram.syncVisible(20);
		TestReporter.log(program);
		TestReporter.assertTrue(txtOfficeProgram.getAttribute("text").contains(program),program + " is selected in Program field");
	}
	
	/**
	 * verify the Onboard Office Information Section buidlingAccess
	 * 
	 * @param buidlingAccess
	 * 				Mandatory Drop down box buidlingAccess
	 * @return None
	 */
	public void officeInformationBuildingAccess(String buildingAccess) {
	
		TestReporter.logStep("Verify Building Access is a mandatory field");
		TestReporter.assertTrue(wbeOfficeBuildingAccess.existsInFrame(), "Building Access field is a mandatory field");
		TestReporter.logStep("Select Building access as " + buildingAccess);
		txtOfficeBuildingAccess.click();
		txtDropdownSearch.syncInFrame();
		if(buildingAccess.contentEquals("No")) {
			txtDropdownSearch.set(buildingAccess);
			txtDropdownSearch.sendKeys(Keys.ARROW_DOWN);
			txtDropdownSearch.sendKeys(Keys.ENTER);
		}
		else {
			txtDropdownSearch.set(buildingAccess);
			txtDropdownSearch.sendKeys(Keys.ENTER);
		}
		txtOfficeBuildingAccess.syncVisible(20);
		TestReporter.assertTrue(txtOfficeBuildingAccess.getAttribute("text").contains(buildingAccess),buildingAccess + " is selected in Building access field");
	}
	
	/**
	 * verify the Onboard Office Information Section department
	 * 
	 * @param department
	 * 				Mandatory Drop down box Department
	 * 
	 * @return None
	 */
	public void officeInformationDepartment(String department) {
			
		TestReporter.logStep("Verify Department field is a mandatory field");
		TestReporter.assertTrue(wbeDepartmentsection.existsInFrame(), "Department field is a mandatory field");
		TestReporter.logStep("Select Department as " + department);
		txtDepartment.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(department);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtDepartment.syncVisible(20);
		TestReporter.assertTrue(txtDepartment.getAttribute("text").contains(department),department + " is selected in Department field");
	}
	
	/**
	 * Verify remote field for the onboard Jon Information
	 * 
	 * @param remote
	 */
	public void officeInformationRemote(String remote) {
		
		TestReporter.logStep("Verify new hire remote field is a mandatory field");
		TestReporter.assertTrue(wbeOfficeRemote.existsInFrame(), "office Remote field is a mandatory field");
		TestReporter.logStep("Select remote fields as " + remote);
		txtOfficeRemote.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(remote);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtOfficeRemote.syncVisible(20);
		TestReporter.assertTrue(txtOfficeRemote.getAttribute("text").contains(remote),remote+ " is selected in New Hire Remote field");
	}
	
	/**
	 * verify the Onboard Job Information Start date with validaton
	 *
	 * @param None.
	 * @return None
	 */
	public void jobInformationStartDateEMEA() {
		
		TestReporter.logStep("Verify OnBoard Employee Job Information Section");
		TestReporter.logStep("Verify Start Date Field");
		DateTimeConversion date = new DateTimeConversion();
		String currentDate = date.getSystemDate("dd/MM/yyyy");	
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar future = Calendar.getInstance();
		future.add(Calendar.DAY_OF_YEAR, 4);  
		Calendar past = Calendar.getInstance();
		past.add(Calendar.DAY_OF_YEAR, -3);  
		String futureDate = dateFormat.format(future.getTime()); 
		String pastDate = dateFormat.format(past.getTime()); 
		TestReporter.assertTrue(wbeJobInfo.existsInFrame(),"'Job Information' Section is displayed");
		TestReporter.logStep("Verify Job Information section");
		TestReporter.assertTrue(wbeJobInfo.existsInFrame(), "Job Information section is displayed");
		TestReporter.logStep("Verify Start Date field is a mandatory field");
		TestReporter.assertTrue(wbeStartDate.existsInFrame(), "Start Date field is a mandatory field");
		TestReporter.logStep("Select Start Date as " + currentDate);
		txtStartDate.set(currentDate);
		txtStartDate.syncVisible(20);
		txtStartDate.sendKeys(Keys.TAB);
		TestReporter.logStep("Verify validation message for current Start Date");
		wbeStartDateValdiationMessage.syncVisible(10);
		TestReporter.assertTrue(wbeStartDateValdiationMessage.existsInFrame(), "Validation message for Start date displayed");
		TestReporter.assertEquals(wbeStartDateValdiationMessage.getText()
				,"Start date must be at least 3 days in the future", "Validation displayes matches as expected:"+wbeStartDateValdiationMessage.getText());
		TestReporter.logStep("Select Start Date as " + pastDate);
		txtStartDate.set(pastDate);
		txtStartDate.syncVisible(20);
		txtStartDate.sendKeys(Keys.TAB);
		TestReporter.logStep("Verify validation message for past Start Date");
		wbeStartDateValdiationMessage.syncVisible(10);
		TestReporter.assertTrue(wbeStartDateValdiationMessage.existsInFrame(), "Validation message for Start date displayed");
		TestReporter.assertEquals(wbeStartDateValdiationMessage.getText()
				,"Start date must be at least 3 days in the future", "Validation displayes matches as expected:"+wbeStartDateValdiationMessage.getText());
		TestReporter.logStep("Entering start date more than 3 days: "+futureDate);
		txtStartDate.set(futureDate);
		txtStartDate.syncVisible(20);
		TestReporter.assertTrue(txtStartDate.getAttribute("value").contains(futureDate),futureDate + " is selected in Start Date field");
	}
	
	/**
	 * verify the Onboard Job Information Start date without validaton
	 *
	 * @param None.
	 * @return None
	 */
	public void jobInformationStartDateWithoutValidation() {
		
		TestReporter.logStep("Verify OnBoard Employee Job Information Section");
		TestReporter.logStep("Verify Start Date Field");
		DateTimeConversion date = new DateTimeConversion();
		String currentDate = date.getSystemDate("MM/dd/yyyy");
		TestReporter.logStep("Verify Job Information section");
		TestReporter.assertTrue(wbeJobInfo.existsInFrame(), "Job Information section is displayed");
		TestReporter.logStep("Verify Start Date field is a mandatory field");
		TestReporter.assertTrue(wbeStartDate.existsInFrame(), "Start Date field is a mandatory field");
		TestReporter.logStep("Select Start Date as " + currentDate);
		txtStartDate.set(currentDate);
		txtStartDate.syncVisible(20);
		txtStartDate.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtStartDate.getAttribute("value").contains(currentDate),currentDate + " is selected in Start Date field");
	}
	
	
	/**
	 * verify the Onboard Job Information Start date without validaton
	 *
	 * @param None.
	 * @return None
	 */
	public void jobInformationStartDateWithoutValidationSLA(int days) {
		
		TestReporter.logStep("Verify OnBoard Employee Job Information Section");
		TestReporter.logStep("Verify Start Date Field");
		DateTimeConversion date = new DateTimeConversion();
		String currentDate = date.getSystemDate("MM/dd/yyyy");
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar future = Calendar.getInstance();
		for (int i=0;i<days;i++) {
			do {
				future.add(Calendar.DAY_OF_MONTH, 1);
			} while(!nonWorkingDays(future));
		} 
		String futureDate = dateFormat.format(future.getTime()); 
		TestReporter.logStep("Verify Job Information section");
		TestReporter.assertTrue(wbeJobInfo.existsInFrame(), "Job Information section is displayed");
		TestReporter.logStep("Verify Start Date field is a mandatory field");
		TestReporter.assertTrue(wbeStartDate.existsInFrame(), "Start Date field is a mandatory field");
		TestReporter.logStep("Select Start Date as " + futureDate);
		txtStartDate.set(futureDate);
		txtStartDate.syncVisible(20);
		txtStartDate.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtStartDate.getAttribute("value").contains(futureDate),futureDate + " is selected in Start Date field");
	}
	
	
	/**
	 * verify the Onboard Job Information Start date without validaton
	 *
	 * @param None.
	 * @return None
	 */
	public String jobInformationStartDateSLA(int days) {
		
		TestReporter.logStep("Verify OnBoard Employee Job Information Section");
		TestReporter.logStep("Verify Start Date Field");
		DateTimeConversion date = new DateTimeConversion();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar future = Calendar.getInstance();
		for (int i=0;i<days;i++) {
			do {
				future.add(Calendar.DAY_OF_MONTH, 1);
			} while(!nonWorkingDays(future));
		} 
		String futureDate = dateFormat.format(future.getTime()); 
		TestReporter.logStep("Verify Job Information section");
		TestReporter.assertTrue(wbeJobInfo.existsInFrame(), "Job Information section is displayed");
		TestReporter.logStep("Verify Start Date field is a mandatory field");
		TestReporter.assertTrue(wbeStartDate.existsInFrame(), "Start Date field is a mandatory field");
		TestReporter.logStep("Select Start Date as " + futureDate);
		txtStartDate.set(futureDate);
		txtStartDate.syncVisible(20);
		txtStartDate.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtStartDate.getAttribute("value").contains(futureDate),futureDate + " is selected in Start Date field");
		return futureDate;
	}
	
	
	/**
	 * verify the Onboard Job Information Start date without validaton
	 *
	 * @param None.
	 * @return None
	 */
	public String jobInformationEMEAStartDateSLA(int days) {
		
		TestReporter.logStep("Verify OnBoard Employee Job Information Section");
		TestReporter.logStep("Verify Start Date Field");
		DateTimeConversion date = new DateTimeConversion();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar future = Calendar.getInstance();
		for (int i=0;i<days;i++) {
			do {
				future.add(Calendar.DAY_OF_MONTH, 1);
			} while(!nonWorkingDays(future));
		} 
		String futureDate = dateFormat.format(future.getTime()); 
		TestReporter.logStep("Verify Job Information section");
		TestReporter.assertTrue(wbeJobInfo.existsInFrame(), "Job Information section is displayed");
		TestReporter.logStep("Verify Start Date field is a mandatory field");
		TestReporter.assertTrue(wbeStartDate.existsInFrame(), "Start Date field is a mandatory field");
		TestReporter.logStep("Select Start Date as " + futureDate);
		txtStartDate.set(futureDate);
		txtStartDate.syncVisible(20);
		txtStartDate.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtStartDate.getAttribute("value").contains(futureDate),futureDate + " is selected in Start Date field");
		return futureDate;
	}
		
	/**
	 * method to handle non Working Days
	 * 
	 * @param sla
	 * @return
	 */
	public static boolean nonWorkingDays(Calendar sla) {
        int dayOfWeek = sla.get(Calendar.DAY_OF_WEEK);
       // String holidayDate= dateFormatSLAHolidays.format(sla.getTime()); 
        if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY){ return false;}
/*        for (int i=0; i<HOLIDAYS.length; i++) {
        	if(HOLIDAYS[i].equals(holidayDate)){ return false;}
        }*/
        return true;
	}

	
	/**
	 * verify the Onboard Job Information Section hiringManager
	 * 
	 * @param hiringManager
	 * 				Mandatory Drop down box Hiring Manager
	 * 
	 * @return None
	 */
	public void jobInformationHiringManager(String hiringManager) {
		
		TestReporter.logStep("Verify Hiring Manager field is a mandatory field");
		TestReporter.assertTrue(wbeSupervisor.existsInFrame(), "Hiring Manager field is a mandatory field");
		TestReporter.logStep("Select Hiring Manager as " + hiringManager);
		txtSupervisor.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(hiringManager);
		retryAttempt(By.xpath("//div[@class='select2-result-label']/div[contains(text(),'"+hiringManager+"')]"));
		txtSupervisor.sendKeys(Keys.ENTER);
	   	txtSupervisor.syncVisible(20);
		TestReporter.assertTrue(txtSupervisor.getAttribute("text").contains(hiringManager)
				,hiringManager + " is selected in Hiring Manager field");
	}
	
	/**
	 * verify the Onboard Job Information Section jobTitle
	 * 
	 * @param jobTitle
	 * 				Mandatory Drop down box Job Title	
	 * 
	 * @return None
	 */
	public void jobInformationJobTitle(String jobTitle) {
		
		TestReporter.logStep("Verify 'Job Title' field is a mandatory field");
		TestReporter.assertTrue(wbeJobTitle.existsInFrame(), "'Job Title' field is a mandatory field");
		TestReporter.logStep("Select 'Job Title' as " + jobTitle);
		txtJobTitle.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(jobTitle);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtJobTitle.syncVisible(20);
		TestReporter.assertTrue(txtJobTitle.getAttribute("text").contains(jobTitle),jobTitle + " is selected in 'Job Title' field");
	}
	
 	/**
	 * Verify Employee ID name field
	 * 
	 * @param None
	 * 
	 * @return None
	 */
	public void jobInformationEmployeeID(String employeeID) {
		TestReporter.logStep("Validating Empoyee ID field");
		TestReporter.assertTrue(lblEmployeeID.existsInFrame(),"employeeID field   is displayed");
		TestReporter.assertTrue(txtFieldSetEmployeeID.existsInFrame(), "employeeID field is a text field");
		txtFieldSetEmployeeID.clickOnSync();
		txtFieldSetEmployeeID.set(employeeID);
		TestReporter.assertTrue(txtFieldSetEmployeeID.getText().contains(employeeID),employeeID + " is the employee ID");
	}
	
	/**
	 * verify the Onboard Job Information Section Business title
	 *
	 * @param None.
	 * @return None
	 */
	public void jobInformationBusinessTitle() {		
		
		TestReporter.logStep("Validating Business Title field");
		TestReporter.assertTrue(wbeBusinessTitle.existsInFrame(),"BusinessTitle displayed as a Optional field");
	}

	/**
	 * verify the Onboard Job Information Section isRehire
	 * 
	 * @param isRehire
	 * 	  			Mandatory Drop down box Rehire
	 * 
	 * @return None
	*/
	public void jobInformationRehire(String isRehire) {		
		
		TestReporter.logStep("Verify 'Rehire' field is a mandatory field");
		TestReporter.assertTrue(wbeRehire.existsInFrame(), "'Is this Rehire?' field is a mandatory field");
		TestReporter.logStep("Select 'Rehire' as " + isRehire);
		txtRehire.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(isRehire);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtRehire.syncVisible(20);
		TestReporter.assertTrue(txtRehire.getAttribute("text").contains(isRehire),isRehire + " is selected in 'Rehire' field");
	}

	
	/**
	 * verify the Onboard Equipment Requirment section for MLA
	 * 
	 * @param selectComputer
	 * @param monitor
	 * @param headSet
	 */
	public void equipmentReqMLA(String selectComputer, String monitor, String headSet) {
		
		TestReporter.logStep("Verify Default equipment options for MLA");
		TestReporter.assertTrue(txtComputer.getAttribute("text").contains(selectComputer)
				,"Selected value: " + selectComputer + " is displayed in 'Computer field' by default");
		TestReporter.assertTrue(txtComputerExternalMonitor.getAttribute("text").contains(monitor)
				,"Selected value: " + monitor + " is displayed in 'External monitor field'");
		TestReporter.assertTrue(txtHeadSet.getAttribute("text").contains(headSet)
				,"Selected value: " +headSet + " is selected in 'Head Set' field  by default");	
	}
	
	/**
	 * verify the Onboard Equipment Requirment section for AeroTEK
	 * 
	 * @param selectComputer
	 * @param monitor
	 * @param headSet
	 */
	public void equipmentReqAEROTEK(String selectComputer, String monitor, String phoneSetup) {
		
		TestReporter.logStep("Verify Default equipment options for AEROTEK");
		TestReporter.assertTrue(txtComputer.getAttribute("text").contains(selectComputer)
				,"Selected value: " + selectComputer + " is displayed in 'Computer field' by default");
		TestReporter.assertTrue(txtComputerExternalMonitor.getAttribute("text").contains(monitor)
				,"Selected value: " + monitor + " is displayed in 'External monitor field'");
		TestReporter.assertTrue(txtPhoneSetup.getAttribute("text").contains(phoneSetup)
				,"Selected value: " + phoneSetup + " is displayed in 'PhoneSetup field'");
	}
	
	/**
	 * verify the Onboard Equipment Requirment section for TEK
	 * 
	 * @param selectComputer
	 * @param monitor
	 * @param headSet
	 */
	public void equipmentReqTEK(String selectComputer, String monitor, String phoneSetup) {
		
		TestReporter.logStep("Verify Default equipment options for TEK");
		TestReporter.assertTrue(txtComputer.getAttribute("text").contains(selectComputer)
				,"Selected value: " + selectComputer + " is displayed in 'Computer field' by default");
		TestReporter.assertTrue(txtComputerExternalMonitor.getAttribute("text").contains(monitor)
				,"Selected value: " + monitor + " is displayed in 'External monitor field'");
		TestReporter.assertTrue(txtPhoneSetup.getAttribute("text").contains(phoneSetup)
				,"Selected value: " + phoneSetup + " is displayed in 'PhoneSetup field'");
	}
	
	/**
	 * verify the Onboard Equipment Need Section selectComputer
	 * 
	 * @param selectComputer
	 * 				Drop down box Computer
	 * 
	 * @return None
	 */
	public void equipmentNeedsComputer(String selectComputer, String country) {
		
		TestReporter.logStep("Verify OnBoard Employee Equipment needs Section");
		TestReporter.assertTrue(wbeEquipmentInfo.existsInFrame(),"'Equipment Needs' Section is displayed");
		TestReporter.logStep("Verify 'Computer' field");
		TestReporter.assertTrue(wbeComputer.existsInFrame(),"Computer field displayed as a Mandatory field");
		txtComputer.click();
		TestReporter.logStep("Verify 'Computer' field Dropdown Options");
		if(country.equals("United Kingdom"))
		{
		dropdown(txtDropDown,computerOptionsUK, computerOptionsUK.length);
		}
		else if(country.equals("United States"))
		{	
			dropdown(txtDropDown,computerOptionsUS,computerOptionsUS.length);
		}
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(selectComputer);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtComputer.syncVisible(20);
		TestReporter.assertTrue(txtComputer.getAttribute("text").contains(selectComputer)
				,"Selected value: " + selectComputer + " is displayed in 'Computer field'");
	}
	
	
	
	/**
	 * verify the Onboard Equipment Need Section selectComputer TEK BOA
	 * 
	 * @param selectComputer
	 * 				Drop down box Computer
	 * 
	 * @return None
	 */
	public void equipmentNeedsComputerTEK(String selectComputer, String country) {
		
		TestReporter.logStep("Verify OnBoard Employee Equipment needs Section");
		TestReporter.assertTrue(wbeEquipmentInfo.existsInFrame(),"'Equipment Needs' Section is displayed");
		TestReporter.logStep("Verify 'Computer' field");
		TestReporter.assertTrue(wbeComputer.existsInFrame(),"Computer field displayed as a Mandatory field");
		txtComputer.click();
		TestReporter.logStep("Verify 'Computer' field Dropdown Options");
		if(country.equals("United Kingdom"))
		{
		dropdown(txtDropDown,computerOptionsUK, computerOptionsUK.length);
		}
		else if(country.equals("United States"))
		{	
			dropdown(txtDropDown,computerOptionsUSTEK,computerOptionsUSTEK.length);
		}
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(selectComputer);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtComputer.syncVisible(20);
		TestReporter.assertTrue(txtComputer.getAttribute("text").contains(selectComputer)
				,"Selected value: " + selectComputer + " is displayed in 'Computer field'");
	}

	
	/* verify the Onboard Equipment Need Section selectComputer for EMEA
	 * 
	 * @param selectComputer
	 * 				Drop down box Computer
	 * 
	 * @return None
	 */
	public void equipmentNeedsComputerEMEA(String selectComputer, String country) {
		
		TestReporter.logStep("Verify OnBoard Employee Equipment needs Section");
		TestReporter.assertTrue(wbeEquipmentInfo.existsInFrame(),"'Equipment Needs' Section is displayed");
		TestReporter.logStep("Verify 'Computer' field");
		TestReporter.assertTrue(wbeComputerOptional.existsInFrame(),"Computer field displayed as a Optional field");
		txtComputer.scrollIntoView();
		txtComputer.click();
		TestReporter.logStep("Verify 'Computer' field Dropdown Options");
		if(country.equals("United Kingdom"))
		{
		dropdown(txtDropDown,computerOptionsUKEMEA, computerOptionsUKEMEA.length);
		}
		else if(country.equals("United States"))
		{	
			dropdown(txtDropDown,computerOptionsUSEMEA,computerOptionsUSEMEA.length);
		}
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(selectComputer);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtComputer.syncVisible(20);
		TestReporter.assertTrue(txtComputer.getAttribute("text").contains(selectComputer)
				,"Selected value: " + selectComputer + " is displayed in 'Computer field'");
	}
	
	
	/**
	 * verify the Onboard Equipment Need Section Monitor
	 * 
	 * @param monitor
	 * 				Drop down box monitor
	 * 
	 * @return None
	 */
	public void equipmentNeedsMonitor(String monitor) {

		TestReporter.logStep("Verify 'Monitor' field");
		TestReporter.assertTrue(wbeComputerExternalMonitor.existsInFrame(),"External Monitor field displayed as a Mandatory field");
		txtComputerExternalMonitor.click();
		TestReporter.logStep("Verify 'External Monitor' field Dropdown Options");
		dropdown(txtDropDown,monitorOptions,monitorOptions.length );
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(monitor);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtComputerExternalMonitor.syncVisible(20);
		TestReporter.assertTrue(txtComputerExternalMonitor.getAttribute("text").contains(monitor)
				,"Selected value: " + monitor + " is displayed in 'External Monitor field'");
		txtComputerExternalMonitor.scrollIntoView();
	}
	
	/**
	 * verify the Onboard Equipment Need Section selectPhoneSetup
	 * 
	 * @param selectPhoneSetup
	 * 				Drop down box Phone setup
	 * 	
	 * @return None
	 */
	public void equipmentNeedsPhoneSetup(String selectPhoneSetup, String country) {
		
		TestReporter.logStep("Verify 'PhoneSetup' field");
		TestReporter.assertTrue(wbePhoneSetup.existsInFrame(),"PhoneSetup field displayed as a Mandatory field");
		txtPhoneSetup.click();
		TestReporter.logStep("Verify 'PhoneSetup' field DropDown Options");
		if(country.equals("United Kingdom")) {		
			dropdown(txtDropDown,phoneOptionsUK,phoneOptionsUK.length );
		}
		else if(country.equals("United States")) {
			dropdown(txtDropDown,phoneOptionsUS,phoneOptionsUS.length );
		}
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(selectPhoneSetup);
		Element wbePhoneOption=driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(), '"+selectPhoneSetup+"')]"));
		wbePhoneOption.click();
		txtPhoneSetup.syncVisible(20);
		TestReporter.assertTrue(txtPhoneSetup.getAttribute("text").contains(selectPhoneSetup)
				,"Selected value: " + selectPhoneSetup + " is displayed in 'PhoneSetup field'");
	}
	
	/**
	 * verify the Onboard Equipment Need Section selectPhoneSetup
	 * 
	 * @param selectPhoneSetup
	 * 				Drop down box Phone setup
	 * 	
	 * @return None
	 */
	public void equipmentNeedsPhoneSetupEMEA(String selectPhoneSetup, String country) {
		
		TestReporter.logStep("Verify 'PhoneSetup' field");
		TestReporter.assertTrue(wbePhoneSetupOptional.existsInFrame(),"PhoneSetup field displayed as a Optional field");
		txtPhoneSetup.click();
		TestReporter.logStep("Verify 'PhoneSetup' field DropDown Options");
		if(country.equals("United Kingdom")) {		
			dropdown(txtDropDown,phoneOptionsUKEMEA,phoneOptionsUKEMEA.length );
		}
		else if(country.equals("United States")) {
			dropdown(txtDropDown,phoneOptionsUSEMEA,phoneOptionsUSEMEA.length );
		}
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(selectPhoneSetup);
		Element wbePhoneOption=driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(), '"+selectPhoneSetup+"')]"));
		wbePhoneOption.click();
		txtPhoneSetup.syncVisible(20);
		TestReporter.assertTrue(txtPhoneSetup.getAttribute("text").contains(selectPhoneSetup)
				,"Selected value: " + selectPhoneSetup + " is displayed in 'PhoneSetup field'");
	}
	
	/**
	 * verify the Onboard Equipment Need Section Mobile
	 * 
	 * @param isMobile	
	 * 	  			Mandatory Drop down box Mobile
	 * 
	 * @return None
	 */
	public void equipmentNeedsMobile(String isMobile) {
		
		TestReporter.logStep("Verify 'Mobile phone' field is a mandatory field");
		TestReporter.assertTrue(wbeMobilePhone.existsInFrame(), "'Mobile phone' field is a mandatory field");
		TestReporter.logStep("Select 'Mobile phone' as " + isMobile);
		txtMobilePhone.click();
		TestReporter.logStep("Verify 'Mobile phone' field DropDown Options");
		dropdown(txtDropDown,mobileOptions,mobileOptions.length );
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(isMobile);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtMobilePhone.syncVisible(20);
		TestReporter.assertTrue(txtMobilePhone.getAttribute("text").contains(isMobile),isMobile + " is selected in 'Mobile Phone' field");	
	}
	
	/**
	 * verify the Onboard Equipment Need Section Head Set
	 * 
	 * @param headSet
	 * 	  			Mandatory Drop down box headSet
	 * @return None
	 */
	public void equipmentNeedsHeadSet(String headSet) {
		
		TestReporter.logStep("Verify 'HeadSet' field is a mandatory field");
		TestReporter.assertTrue(wbeHeadSet.existsInFrame(), "'HeadSet' field is a mandatory field");
		TestReporter.logStep("Select 'HeadSet' as " + headSet);
		txtHeadSet.click();
		TestReporter.logStep("Verify 'HeadSetMobile phone' field DropDown Options");
		dropdown(txtDropDown,headSetOptions,headSetOptions.length );
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(headSet);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtHeadSet.syncVisible(20);
		TestReporter.assertTrue(txtHeadSet.getAttribute("text").contains(headSet),headSet + " is selected in 'Head Set' field");	
	}
	
	/**
	 * verify the Onboard Equipment Need Section Head Set for MLA
	 * 
	 * @param headSet
	 * 	  			Mandatory Drop down box headSet
	 * @return None
	 */
	public void equipmentNeedsHeadSetMLA(String headSet) {
		
		TestReporter.logStep("Verify 'HeadSet' field is a mandatory field");
		TestReporter.assertTrue(wbeHeadSet.existsInFrame(), "'HeadSet' field is a mandatory field");
		TestReporter.logStep("Select 'HeadSet' as " + headSet);
		txtHeadSet.click();
		TestReporter.logStep("Verify 'HeadSetMobile phone' field DropDown Options");
		dropdown(txtDropDown,headSetOptionsMLA,headSetOptionsMLA.length );
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(headSet);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtHeadSet.syncVisible(20);
		TestReporter.assertTrue(txtHeadSet.getAttribute("text").contains(headSet),headSet + " is selected in 'Head Set' field");	
	}
	
	/**
	 * verify the Onboard Equipment Need Section Head Set for Aerotek
	 * 
	 * @param headSet
	 * 	  			Mandatory Drop down box headSet
	 * @return None
	 */
	public void equipmentNeedsHeadSetAerotek(String headSet, String operatingCompany) {
		
		TestReporter.logStep("Verify 'HeadSet' field is a mandatory field");
		TestReporter.assertTrue(wbeHeadSet.existsInFrame(), "'HeadSet' field is a mandatory field");
		TestReporter.logStep("Select 'HeadSet' as " + headSet);
		txtHeadSet.click();
		TestReporter.logStep("Verify 'HeadSetMobile phone' field DropDown Options");
		if(operatingCompany.contentEquals("")) { dropdown(txtDropDown,headSetOptionsAerotek,headSetOptionsAerotek.length );}
		else {dropdown(txtDropDown,headSetOptions,headSetOptions.length ); }
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(headSet);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtHeadSet.syncVisible(20);
		TestReporter.assertTrue(txtHeadSet.getAttribute("text").contains(headSet),headSet + " is selected in 'Head Set' field");	
	}
	

	/**
	 * verify the Onboard Employee VDI access for MLA
	 * 
	 * @param vdiAccess
	 * @return None
	 */
	public void vdiAccess(String vdiAccess ) {
		
		TestReporter.logStep("Verify VDI Access  field");
		if(vdiAccess.contains("Yes")) {
		TestReporter.assertTrue(txtVDIAccessReq.getAttribute("text").contains(vdiAccess)
				,"Selected value: " + vdiAccess + " is displayed in VDI ACCESS field by default");}
		TestReporter.assertTrue(wbeVDIAccessReq.existsInFrame(),"VDI ACCESS field displayed as a mandatory field");
		txtVDIAccessReq.scrollIntoView();
		txtVDIAccessReq.click();
		TestReporter.logStep("Verify 'VDI ACCESS' field Dropdown Options");
		dropdown(txtDropDown,vdiAccessOptions,vdiAccessOptions.length );
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(vdiAccess);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtVDIAccessReq.syncVisible(20);
		TestReporter.assertTrue(txtVDIAccessReq.getAttribute("text").contains(vdiAccess)
				,"Selected value: " + vdiAccess + " is displayed in VDI ACCESS field");
	}
	
	/**
	 * verify the Onboard Employee Application Needs Section area
	 * 
	 * @param None.
	 * @return None
	 */
	public void applicationNeedsAccess() {
		
		TestReporter.logStep("Verify OnBoard Employee Application Needs Section");
		TestReporter.assertTrue(wbeApplicationInfo.existsInFrame(),"'Application Needs' Section is displayed");
		TestReporter.logStep("Verify 'Application access' field");
		TestReporter.assertTrue(wbeApplicationAccess.existsInFrame(),"Application access field displayed as a Optional field");
		txtApplicationAccess.scrollIntoView();
		txtApplicationAccess.click();
		TestReporter.logStep("Verify 'Applicatiion Access' field DropDown Options");
		String lastOption=applicationAccessOptions[applicationAccessOptions.length-1];	
		dropdown(txtDropDown,applicationAccessOptions,applicationAccessOptions.length);
		for (String options:applicationAccessOptions)
		{
			driver.findElement(By.xpath(".//*[@id='select2-drop']//ul/li/div[contains(text(),'"+options+"')]")).click();
			WaitAllegis.hardWait(MIN_TIMEOUT);
			if(options.equals(lastOption)) {
				break;
			}
			txtApplicationAccess.click();
		}	
	}
	
	/**
	 * verify the Onboard Employee Application Needs Section area for MLA
	 * 
	 * @param None.
	 * @return None
	 */
	public void applicationNeedsAccessMLA() {
		
		TestReporter.logStep("Verify OnBoard Employee Application Needs Section for MLA");
		TestReporter.assertTrue(wbeApplicationInfo.existsInFrame(),"'Application Needs' Section is displayed");
		TestReporter.logStep("Verify 'Application access' field");
		TestReporter.assertTrue(wbeApplicationAccess.existsInFrame(),"Application access field displayed as a Optional field");
		txtApplicationAccess.scrollIntoView();
		txtApplicationAccess.click();
		TestReporter.logStep("Verify 'Applicatiion Access' field DropDown Options");
		String lastOption=applicationAccessOptionsMLA[applicationAccessOptionsMLA.length-1];	
		dropdown(txtDropDown,applicationAccessOptionsMLA,applicationAccessOptionsMLA.length);
		for (String options:applicationAccessOptionsMLA)
		{
			driver.findElement(By.xpath(".//*[@id='select2-drop']//ul/li/div[contains(text(),'"+options+"')]")).click();
			WaitAllegis.hardWait(MIN_TIMEOUT);
			if(options.equals(lastOption)) {
				break;
			}
			txtApplicationAccess.click();
		}	
	}
	
	/**
	 * verify the Onboard Employee Application Needs Section area for TEK BOA
	 * 
	 * @param None.
	 * @return None
	 */
	public void applicationNeedsAccessTEK() {
		
		TestReporter.logStep("Verify OnBoard Employee Application Needs Section");
		TestReporter.assertTrue(wbeApplicationInfo.existsInFrame(),"'Application Needs' Section is displayed");
		TestReporter.logStep("Verify 'Application access' field");
		TestReporter.assertTrue(wbeApplicationAccess.existsInFrame(),"Application access field displayed as a Optional field");
		txtApplicationAccess.scrollIntoView();
		
		
		List<Element> values=driver.findElements(By.xpath("//ul[@class='select2-choices']/li/div"));
		int applicationAccessCount=values.size();
		TestReporter.assertEquals(applicationAccessCount, applicationAccessOptionsTEK.length, "Application Access options Display verification");
			for(int i=0;i<values.size();i++) {
					TestReporter.assertEquals(values.get(i).getText(), applicationAccessOptionsTEK[i], 
							"Drop down values for Field verified -"+values.get(i).getText());		
					}	
	}
	
	/**
	 * verify the Onboard Employee Application Needs Section area for AEROTEK
	 * 
	 * @param None.
	 * @return None
	 */
	public void applicationNeedsAccessAEROTEK() {
		
		TestReporter.logStep("Verify OnBoard Employee Application Needs Section");
		TestReporter.assertTrue(wbeApplicationInfo.existsInFrame(),"'Application Needs' Section is displayed");
		TestReporter.logStep("Verify 'Application access' field");
		TestReporter.assertTrue(wbeApplicationAccess.existsInFrame(),"Application access field displayed as a Optional field");
		txtApplicationAccess.scrollIntoView();
		List<Element> values=driver.findElements(By.xpath("//ul[@class='select2-choices']/li/div"));
		int applicationAccessCount=values.size();
		TestReporter.assertEquals(applicationAccessCount, applicationAccessOptionsAEROTEK.length, "Application Access options Display verification");
			for(int i=0;i<values.size();i++) {
				TestReporter.logStep(values.get(i).getText());
				TestReporter.logStep(applicationAccessOptionsAEROTEK[i]);
					TestReporter.assertEquals(values.get(i).getText(), applicationAccessOptionsAEROTEK[i], 
							"Drop down values for Field verified -"+values.get(i).getText());		
					}	
	}
	
	/**
	 * verify the Onboard Employee Application Needs Section area
	 * 
	 * @param applicationNeedsAccess.
	 * @return None
	 */
	public void applicationNeedsAccess(String applicationNeedsAccess) {
		
		TestReporter.logStep("Verify OnBoard Employee Application Needs Section");
		TestReporter.assertTrue(wbeApplicationInfo.existsInFrame(),"'Application Needs' Section is displayed");
		TestReporter.logStep("Verify 'Application access' field");
		TestReporter.assertTrue(wbeApplicationAccess.existsInFrame(),"Application access field displayed as a Optional field");
		txtApplicationAccess.scrollIntoView();
		txtApplicationAccess.click();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		txtApplicationAccess.set(applicationNeedsAccess);
		WaitAllegis.hardWait(TIMEOUT);
		txtApplicationAccess.sendKeys(Keys.ENTER);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		Element wbeapplicationaccess = driver.findElement(By.xpath("//fieldset//label[contains(text(),'Application access')]/following-sibling::span/div[2]/ul/li/div"));
		TestReporter.assertTrue(wbeapplicationaccess.getText().contains(applicationNeedsAccess), "application need access was selected");
	}
	
 	/**
	 * Verify Email Default Domain field
	 * 
	 * @param None
	 * 
	 * @return None
	 */
	public void additionalItems(String addItems) {
	
		TestReporter.logStep("Verify Additional Items field");
		TestReporter.assertTrue(lblAdditonalItems.existsInFrame(), "Additional Items field label is verified");
		TestReporter.logStep("Select Additional Items " + addItems);
		txtAdditonalItems.syncInFrame(20);
		txtAdditonalItems.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(addItems);
		txtDropdownSearch.sendKeys(Keys.DOWN);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtAdditonalItems.syncVisible(20);
		TestReporter.assertTrue(txtAdditonalItems.getAttribute("text").contains(addItems),addItems + " is selected in Additional Items  field");
	}
	
	/**
	 * verify by clicking Next on each tab
	 * 
	 * @param None.
	 * @return None
	 */
	public void next() {
		TestReporter.logStep("Click Next");
		btnNext.scrollToAndCickOnSync();	
	}
	
	/**
	 * method to validate drop down options
	 * 
	 * @param by,drop
	 * 				locator by 
	 * 				array drop
	 * @return None
	 */
	public void dropdown(By by, String [] drop, int dropDownSizeExpected) {

		List<Element> values=driver.findElements(by);
		int dropDownSizeActual=values.size();
		TestReporter.assertEquals(dropDownSizeActual, dropDownSizeExpected, "Drop down size verification");
			for(int i=0;i<values.size();i++) {
					TestReporter.assertEquals(values.get(i).getText(), drop[i], 
							"Drop down values for Field verified -"+values.get(i).getText());		
					}	
	}
	
}
