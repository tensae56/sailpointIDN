package com.allegis.sailpoint;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.allegis.snow.base.BasePage;
import com.allegis.utilities.ExcelApiTest;
import com.framework.core.interfaces.Button;
import com.framework.core.interfaces.Checkbox;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Textbox;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;

public class PeopleSoftEmployeeAddPersonPage extends BasePage {
	
	private static String regulatoryRegion = null;
	private static String addressDetail = null;
	private static String employeeID = null;
	private static String userName = null;
	private String dateOfBirth = "03/05/1995";
	private String userID = "TSHANKO";
	private String passWord = "pass123";
	private String addressLine1 = "abc street";
	private String city = "Silver Spring";
	private String state = "MD";
	private String postalCode = "20910";
	private String county = "Montgomery";
	private String refferralSource = "17";
	private String refferralSubSource = "1153";
	private String bonusType = "Not Elig";
	
/** Web Elements**/
	@FindBy(xpath = "//input[@id='userid']")
	private Textbox txtUserID;

	@FindBy(xpath = "//input[@id='pwd']")
	private Textbox txtPassWord;

	@FindBy(xpath = "//input[@class='ps-button']")
	private Button btnSignIn;

	@FindBy(xpath = "//li[@id='pthnavbc_PORTAL_ROOT_OBJECT']/a[contains(text(),'Main Menu')]")
	private Element wbeMainMenu;

	@FindBy(xpath = "//li[@id='HC_WORKFORCE_ADMINISTRATION']/a[contains(text(),'Workforce Administration')]")
	private Element wbeWorkForceAdministration;

	@FindBy(xpath = "//li[@id='CO_PERSONAL_INFORMATION']/a[contains(text(),'Personal Information')]")
	private Element wbePersonalInformation;

	@FindBy(xpath = "//li[@id='crefli_HC_ADD_PERSON_2']/a[contains(text(),'Add a Person')]")
	private Element wbeAddPerson;

	@FindBy(xpath = "//input[@id='DERIVED_HCR_PER_ADD_PERSON_LINK']")
	private Element wbeAddPersonButton;

	@FindBy(xpath = "//input[@id='DERIVED_NM_LVL2_UPDATE_NAME_BTN$0']")
	private Element wbeAddName;

	@FindBy(xpath = "//input[@id='HCR_UPDNAME_DVW_FIRST_NAME$1']")
	private Textbox txtFirstName;

	@FindBy(xpath = "//input[@id='HCR_UPDNAME_DVW_MIDDLE_NAME$2']")
	private Textbox txtMiddleName;

	@FindBy(xpath = "//input[@id='HCR_UPDNAME_DVW_LAST_NAME$3']")
	private Textbox txtLastName;

	@FindBy(xpath = "//input[@id='DERIVED_NM_LVL2_OK_PB']")
	private Button btnOkButton;

	@FindBy(xpath = "//input[@id='PERSON_BIRTHDATE']")
	private Textbox txtBirthDate;

	@FindBy(xpath = "//select[@id='PERS_DATA_EFFDT_SEX$0']")
	private Element wbeGender;

	@FindBy(xpath = "//input[@id='DERIVED_HR_NID_SPECIAL_CHAR$0']")
	private Textbox txtNationalID;

	@FindBy(xpath = "//a[@id='ICTAB_1']/span")
	private Element wbeContactInformation;

	@FindBy(xpath = "//span[@id='ADDR_HISTORY_BTN$span$0']/a[@id='ADDR_HISTORY_BTN$0']")
	private Element wbeAddAddressDetail;

	@FindBy(xpath = "//input[@id='ADDRESSES_COUNTRY$0']")
	private Textbox txtAddressCountry;

	@FindBy(xpath = "//a[@id='DERIVED_ADDR_UPDATE_ADDRESS$0']")
	private Element wbeAddAddress;

	@FindBy(xpath = "//span[@id='DERIVED_ADDRESS_COUNTRY$36$']")
	private Element wbeAddressCountryLabel;

	@FindBy(xpath = "//input[@id='DERIVED_ADDRESS_ADDRESS1']")
	private Textbox txtAddressLine1;

	@FindBy(xpath = "//input[@id='DERIVED_ADDRESS_ADDRESS2']")
	private Textbox txtAddressLine2;

	@FindBy(xpath = "//input[@id='DERIVED_ADDRESS_CITY']")
	private Textbox txtCityLine;

	@FindBy(xpath = "//input[@id='DERIVED_ADDRESS_STATE']")
	private Textbox txtStateLine;

	@FindBy(xpath = "//input[@id='DERIVED_ADDRESS_POSTAL']")
	private Textbox txtPostalLine;

	@FindBy(xpath = "//input[@id='DERIVED_ADDRESS_COUNTY']")
	private Textbox txtCountyLine;

	@FindBy(xpath = "//input[@id='DERIVED_ADDRESS_OK_PB']")
	private Button btnAddressOk;

	@FindBy(xpath = "//input[@id='#ICSave']")
	private Button btnAddressOk2;

	@FindBy(xpath = "//a[@id='ICTAB_2']/span")
	private Element wbeRegional;

	@FindBy(xpath = "//input[@id='DIVERS_ETHNIC_ETHNIC_GRP_CD$32$$0']")
	private Textbox txtEthnicGroup;

	@FindBy(xpath = "//select[@id='PERS_DATA_USA_MILITARY_STATUS$0']")
	private Element wbeMilitaryStatusOption;

	@FindBy(xpath = "//a[@id='ICTAB_3']/span")
	private Element wbeCustomPersonalData;

	@FindBy(xpath = "//input[@id='PERS_DATA_XX_HRS_SOURCE_ID']")
	private Textbox txtRefferralSource;

	@FindBy(xpath = "//input[@id='PERS_DATA_XX_HRS_SUBSOURCE_ID']")
	private Textbox txtRefferralSubSource;

	@FindBy(xpath = "//img[@title='Show following tabs']")
	private Element wbeShowMoreTabsIcon;

	@FindBy(xpath = "//a[@id='ICTAB_6']/span")
	private Element wbeOrganizationalRelationships;

	@FindBy(xpath = "//input[@id='DERIVED_HCR_PER_DERIVED_EMP']")
	private Checkbox chkEmployee;

	@FindBy(xpath = "//input[@id='DERIVED_HCR_PER_DERIVED_CWR']")
	private Checkbox chkContingentWorker;

	@FindBy(xpath = "//input[@id='DERIVED_HCR_PER_DERIVED_POI']")
	private Checkbox chkPersonOfInterest;

	@FindBy(xpath = "//input[@id='DERIVED_HCR_PER_ADD_INSTANCE_LINK']")
	private Element wbeAddRelationship;

	@FindBy(xpath = "//span[@id='DERIVED_NAME_DISPLAY_NAME']")
	private Element wbeUserNameLabel;

	@FindBy(xpath = "//span[@id='PER_ORG_ASGN_EMPLID']")
	private Element wbeUserAssignedEmpID;

	@FindBy(xpath = "//input[@id='JOB_REG_REGION$0']")
	private Textbox txtRegulatoryRegion;

	@FindBy(xpath = "//input[@id='JOB_COMPANY$0']")
	private Textbox txtCompany;

	@FindBy(xpath = "//input[@id='JOB_DEPTID$0']")
	private Textbox txtDepartment;

	@FindBy(xpath = "//input[@id='JOB_LOCATION$0']")
	private Textbox txtLocation;

	@FindBy(xpath = "//a[@id='ICTAB_1']/span")
	private Element wbeCustomData;

	@FindBy(xpath = "//select[@id='JOB_XX_BONUS_TYPE_XX$0']")
	private Element wbeBonusType;

	@FindBy(xpath = "//input[@id='JOB_XX_PLATEAU_REQ_XX$0']")
	private Checkbox chkPLMSrequired;

	@FindBy(xpath = "//input[@id='JOB_XX_INT_USER_ACCT_XX$0']")
	private Checkbox chkInternalUserAccount;

	@FindBy(xpath = "//a[@id='ICTAB_2']/span")
	private Element wbeJobInformation;

	@FindBy(xpath = "//input[@id='JOB_JOBCODE$0']")
	private Textbox txtJobCode;

	@FindBy(xpath = "//input[@id='JOB_SUPERVISOR_ID$0']")
	private Textbox txtSupervisorID;

	@FindBy(xpath = "//select[@id='JOB_REG_TEMP$0']")
	private Element wbeRegularOrTemporary;

	@FindBy(xpath = "//select[@id='JOB_EMPL_CLASS$0']")
	private Element wbeEmployeeClass;

	@FindBy(xpath = "//a[@id='ICTAB_4']/span")
	private Element wbePayroll;

	@FindBy(xpath = "//select[@id='JOB_PAY_SYSTEM_FLG$0']")
	private Element wbePayrollSystem;

	@FindBy(xpath = "//input[@id='JOB_PAYGROUP$0']")
	private Textbox txtPayGroup;

	@FindBy(xpath = "//input[@id='JOB_EMPL_TYPE$0']")
	private Textbox txtEmployeeType;

	@FindBy(xpath = "//input[@id='JOB_TAX_LOCATION_CD$0']")
	private Textbox txtTaxLocationCode;

	@FindBy(xpath = "//input[@id='COMPENSATION_COMP_RATECD$0']")
	private Textbox txtRateCode;

	@FindBy(xpath = "//input[@id='JOB_HOLIDAY_SCHEDULE$0']")
	private Textbox txtHolidaySchedule;

	@FindBy(xpath = "//a[@id='ICTAB_6']/span")
	private Element wbeCompensation;

	@FindBy(xpath = "//input[@id='DERIVED_HR_CMP_CALC_COMP_BTN$0']")
	private Button btnCalculateCompensation;

	@FindBy(xpath = "//a[@id='DERIVED_HR_JOB_DATA_BTN4']")
	private Element wbeBenefitsProgramParticipation;

	@FindBy(xpath = "//select[@id='JOB_BENEFIT_SYSTEM$0']")
	private Element wbeBenefitSystem;

	@FindBy(xpath = "//input[@id='BEN_PROG_PARTIC_BENEFIT_PROGRAM$0']")
	private Textbox txtBenefitProgram;

	@FindBy(xpath = "//input[@id='#ICOK']")
	private Button btnAlertOk;

	@FindBy(xpath = "//input[@id='#ICSave']")
	private Button btnSave;
	
	@FindBy(xpath = "//span[@id='PERSON_EMPLID']")
	private Element wbeEmployeeIDfinal;

	public PeopleSoftEmployeeAddPersonPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Access Peoplesoft website
	 */

	public void accessPeopleSoft() {
		TestReporter.logStep("Validating UserID field");
		TestReporter.assertTrue(txtUserID.existsInFrame(), "UserID is a text field");
		WaitAllegis.hardWait(MAX_TIMEOUT * 2);
		txtUserID.set(userID);
		TestReporter.logStep("Validating Password field");
		TestReporter.assertTrue(txtPassWord.existsInFrame(), "Password is a text field");
		WaitAllegis.hardWait(MAX_TIMEOUT * 2);
		txtPassWord.set(passWord);
		TestReporter.logStep("Clicking Sign in Button");
		btnSignIn.clickOnSync();
	}
/**
 * Add a new person
 */
	public void addPerson() {
		TestReporter.logStep("Validating Main Menu");
		TestReporter.assertTrue(wbeMainMenu.existsInFrame(), "Main Menu Option Validated");
		wbeMainMenu.clickOnSync();
		TestReporter.logStep("Validating Workforce Adminstration");
		TestReporter.assertTrue(wbeWorkForceAdministration.existsInFrame(),
				"Workforce Administration option validated");
		wbeWorkForceAdministration.clickOnSync();
		TestReporter.logStep("Validating Personal Information");
		TestReporter.assertTrue(wbePersonalInformation.existsInFrame(), "Personal Information Option validated");
		wbePersonalInformation.clickOnSync();
		TestReporter.logStep("Validating Add a Prson");
		TestReporter.assertTrue(wbeAddPerson.existsInFrame(), "Add a Person Option validated");
		wbeAddPerson.clickOnSync();
		TestReporter.logStep("Validating Add Person Button");
		TestReporter.assertTrue(wbeAddPersonButton.existsInFrame(), "Add Person Button validated");
		wbeAddPersonButton.clickOnSync();

	}
/**
 * 
 * @param firstName
 * @param middleName
 * @param lastName
 * Add user first, middle and last name
 */
	public void addName(String firstName, String middleName, String lastName) {

		TestReporter.logStep("Validating Add Name Button");
		TestReporter.assertTrue(wbeAddName.existsInFrame(), "Add Name Validated");
		wbeAddName.clickOnSync();
		TestReporter.assertTrue(txtFirstName.existsInFrame(), "First Name is a Textbox");
		txtFirstName.set(firstName);
		TestReporter.logStep(firstName + ": set as First Nmae");
		TestReporter.assertTrue(txtMiddleName.existsInFrame(), "Middle Name is a Textbox");
		txtMiddleName.set(middleName);
		TestReporter.logStep(middleName + ": set as Middle Name");
		TestReporter.assertTrue(txtLastName.existsInFrame(), "Last Name is a Textbox");
		txtLastName.set(lastName);
		TestReporter.logStep(lastName + ": set as Last Name");
		TestReporter.logStep("Clicking Ok Button");
		btnOkButton.clickOnSync();

	}
/**
 * Fill in birth data
 */
	public void setAge() {
		TestReporter.logStep("Validating Date of Birth");
		TestReporter.assertTrue(txtBirthDate.existsInFrame(), "Date of Birth is a Text Field");
		txtBirthDate.set(dateOfBirth);
		TestReporter.logStep(dateOfBirth + ": is set as date of birth");
	}
/**
 * 
 * @param gender
 * enter gender
 */
	public void setGender(String gender) {
		TestReporter.logStep("Validating Gender field");
		TestReporter.assertTrue(wbeGender.existsInFrame(), "Gender field is displayed");
		wbeGender.clickOnSync();
		new Select(driver.findElement(By.id("PERS_DATA_EFFDT_SEX$0"))).selectByVisibleText(gender);
		TestReporter.logStep(gender + ": is set as Gender");

	}
/**
 * 
 * @param nationalID
 * enter national ID
 */
	public void setNationalID(String nationalID) {
		TestReporter.logStep("Validating National ID field");
		TestReporter.assertTrue(txtNationalID.existsInFrame(), "National ID field is a text field");
		txtNationalID.set(nationalID);
		TestReporter.logStep(nationalID + ": is set as the national ID");
	}
/**
 * click contact Info tab
 */
	public void clickContactInfo() {
		TestReporter.logStep("Validating Contact Information Tab");
		TestReporter.assertTrue(wbeContactInformation.existsInFrame(), "contact Information Tab is displayed");
		wbeContactInformation.highlight();
		wbeContactInformation.clickOnSync();
		TestReporter.logStep("Contact Information Clicked");
	}
/**
 * click address detail
 */
	public void clickAddAddressDetail() {
		TestReporter.logStep("Validating Add Address Detail Button");
		TestReporter.assertTrue(wbeAddAddressDetail.existsInFrame(), "Add Address Detail button shows");
		WaitAllegis.hardWait(MAX_TIMEOUT);
		wbeAddAddressDetail.syncInFrame();
		wbeAddAddressDetail.clickOnSync();

	}
/**
 * click add address button
 */
	public void clickAddAddress() {
		TestReporter.logStep("Validating Add Address Link");
		TestReporter.assertTrue(wbeAddAddress.existsInFrame(), "Add Address link Validated");
		wbeAddAddress.clickOnSync();
	}
/**
 * enter address for user
 */
	public void editAddress() {
		TestReporter.logStep("Validating Address Line 1 ");
		TestReporter.assertTrue(txtAddressLine1.existsInFrame(), "Address Line 1 is a text field");
		txtAddressLine1.set(addressLine1);
		TestReporter.logStep("Validating City field");
		TestReporter.assertTrue(txtCityLine.existsInFrame(), "City is a text field");
		txtCityLine.set(city);
		TestReporter.logStep("Validating State field");
		TestReporter.assertTrue(txtStateLine.existsInFrame(), "State is a text field");
		txtStateLine.set(state);
		TestReporter.logStep("Validating Postal field");
		TestReporter.assertTrue(txtPostalLine.existsInFrame(), "Postal code is a text field");
		txtPostalLine.set(postalCode);
		TestReporter.logStep("Validating County field");
		TestReporter.assertTrue(txtCountyLine.existsInFrame(), "County is a text field");
		txtCountyLine.set(county);
		TestReporter.assertTrue(btnAddressOk.existsInFrame(), "Ok button Validated");
		btnAddressOk.clickOnSync();
		Element wbeAddressDetail = driver.findElement(By.id("win0divDERIVED_ADDR_ADDRESSLONG$0"));
		addressDetail = wbeAddressDetail.getText();
		TestReporter.logStep(addressDetail);
		TestReporter.assertTrue(btnAddressOk2.existsInFrame(), "Ok button number 2 validated");
		btnAddressOk2.clickOnSync();
	}
/**
 * click regional tab
 */
	public void clickRegional() {
		TestReporter.logStep("Validating Regional Tab");
		TestReporter.assertTrue(wbeRegional.existsInFrame(), "Regional Tab Validated");
		wbeRegional.highlight();
		wbeRegional.clickOnSync();
	}
/**
 * 
 * @param ethnicGroup
 * set ethnic group
 */
	public void selectRegion(String ethnicGroup) {
		TestReporter.logStep("Validating Ethnic group");
		TestReporter.assertTrue(txtEthnicGroup.existsInFrame(), "Ethnic group is a text field");
		txtEthnicGroup.scrollAndSet(ethnicGroup);
		TestReporter.logStep("Validating Military Status");
		TestReporter.assertTrue(wbeMilitaryStatusOption.existsInFrame(), "Military Status is a drop down option");
		wbeMilitaryStatusOption.clickOnSync();
		new Select(driver.findElement(By.id("PERS_DATA_USA_MILITARY_STATUS$0")))
				.selectByVisibleText("Prefer Not To Answer");
		TestReporter.logStep("Military Status set to Prefer not to answer");

	}
/**
 * click customer personal data tab
 */
	public void clickCustomPersonalData() {
		TestReporter.logStep("Validating custom personal data tab");
		TestReporter.assertTrue(wbeCustomPersonalData.existsInFrame(), "Custom Personal Data tab validated");
		wbeCustomPersonalData.highlight();
		wbeCustomPersonalData.clickOnSync();
	}
/*
 * set custom personal data 
 */
	public void setCustomPersonalData() {
		TestReporter.logStep("Validating Refferral Source and Refferal Sub Source");
		TestReporter.assertTrue(txtRefferralSource.existsInFrame(), "Refferral Source is a text field");
		txtRefferralSource.set(refferralSource);
		txtRefferralSource.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtRefferralSubSource.existsInFrame(), "Refferral sub source is a text field");
		txtRefferralSubSource.set(refferralSubSource);
		txtRefferralSubSource.sendKeys(Keys.TAB);
	}
/*
 * click on the show more tabs icon
 */
	public void clickShowMoreTabsIcon() {
		TestReporter.logStep("Validating Show more tabs Button");
		TestReporter.assertTrue(wbeShowMoreTabsIcon.existsInFrame(), "show more tabs validated");
		wbeShowMoreTabsIcon.highlight();
		wbeShowMoreTabsIcon.clickOnSync();
	}
/*
 * click organizational relationship tab
 */
	public void clickOrganizationalRelationship() {
		TestReporter.logStep("Validating Organizational Tab");
		TestReporter.assertTrue(wbeOrganizationalRelationships.existsInFrame(),
				"Organizational Relationships tab validated");
		wbeOrganizationalRelationships.highlight();
		wbeOrganizationalRelationships.clickOnSync();
	}
	/*
	 * set relationship as employee
	 */
	public void setOrganizationalRelationShipEmployee() {
		TestReporter.logStep("Validating Organizational Relationship Option for Employee");
		TestReporter.assertTrue(chkEmployee.existsInFrame(), "Employee Checkbox is validated");
		chkEmployee.clickOnSync();

	}
	/*
	 * set relationship as Contingent worker
	 */
	public void setOrganizationalRelationshipCWR() {
		TestReporter.logStep("Validating organizational Relationship for CWR");
		TestReporter.assertTrue(chkContingentWorker.existsInFrame(), "Contingent Worker Checkbox is validated");
		chkContingentWorker.clickOnSync();
	}
	/*
	 * set relationship as POI
	 */
	public void setOrganizationalRelationshipPOI() {
		TestReporter.logStep("Validatin organizational Relationship for POI");
		TestReporter.assertTrue(chkPersonOfInterest.existsInFrame(), "POI checkbox is validated");
		chkPersonOfInterest.clickOnSync();
	}
	
	/*
	 * click add relationship button
	 */
	public void clickAddRelationShipAndCaptureEmployeeId() {
		TestReporter.logStep("Validating Add Relationship button");
		TestReporter.assertTrue(wbeAddRelationship.existsInFrame(), "Add Relationship Button validated");
		wbeAddRelationship.highlight();
		wbeAddRelationship.clickOnSync();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.logStep("Validating Employee ID is created");
		TestReporter.assertTrue(wbeUserAssignedEmpID.existsInFrame(), "Employee ID is Validated for user");
		TestReporter.assertTrue(wbeUserNameLabel.existsInFrame(), "Name of New Hire is Validated");
		employeeID = wbeUserAssignedEmpID.getText();
		userName = wbeUserNameLabel.getText();
		TestReporter.logStep(userName);
		TestReporter.logStep(employeeID);
	}
	/*
	 * set work location 
	 */
	public void setWorkLocation(String region, String opco, String department, String location) throws IOException {
		regulatoryRegion = txtRegulatoryRegion.getText();
		if (region.contentEquals("USA")) {

		} else {
			txtRegulatoryRegion.sendKeys(Keys.CLEAR);
			txtRegulatoryRegion.set(region);
			txtRegulatoryRegion.sendKeys(Keys.TAB);
		}
			TestReporter.logStep("Validaing Regulatory region");
			TestReporter.logStep(regulatoryRegion + ": is set as the Regulatory Region");
		
		TestReporter.logStep("Validating Company field");
		TestReporter.assertTrue(txtCompany.existsInFrame(), "Company field is a text field");
		txtCompany.set(opco);
		txtCompany.sendKeys(Keys.TAB);
		TestReporter.logStep(txtCompany.getText());
		TestReporter.logStep("Validating Department field");
		TestReporter.assertTrue(txtDepartment.existsInFrame(), "Department field is a text field");
		txtDepartment.set(department);
		txtDepartment.sendKeys(Keys.TAB);
		TestReporter.logStep(txtDepartment.getText());
		TestReporter.logStep("Validating location field");
		TestReporter.assertTrue(txtLocation.existsInFrame(), "Location field is a text field");
		txtLocation.set(location);
		txtLocation.sendKeys(Keys.TAB);
		TestReporter.logStep(txtLocation.getText());

	}
/*
 * click custom data tab and set bonus
 *
 */
	public void clickAndSetCustomData() {
		TestReporter.logStep("Validating Custom Data Tab");
		TestReporter.assertTrue(wbeCustomData.existsInFrame(), "Custom Data Tab validated");
		wbeCustomData.highlight();
		wbeCustomData.clickOnSync();
		TestReporter.assertTrue(wbeBonusType.existsInFrame(), "Bonus Type is a drop down option");
		wbeBonusType.scrollIntoView();
		wbeBonusType.clickOnSync();
		new Select(driver.findElement(By.id("" + "JOB_XX_BONUS_TYPE_XX$0"))).selectByVisibleText(bonusType);
		TestReporter.logStep("Bonus Type set to Not Elig");
	}

	/*
	 * @param jobCode
	 * @param supervisorID
	 * @param jobType
	 * click job information tab and set job info
	 */
	public void clickAndSetJobInformation(String jobCode, String supervisorID, String jobType) {
		TestReporter.logStep("Validating Job Information Tab");
		TestReporter.assertTrue(wbeJobInformation.existsInFrame(), "Job Information Tab validated");
		wbeJobInformation.highlight();
		wbeJobInformation.clickOnSync();
		TestReporter.assertTrue(txtJobCode.existsInFrame(), "Job Code is a text field");
		txtJobCode.set(jobCode);
		txtJobCode.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtSupervisorID.existsInFrame(), "Supervisor ID is a text field");
		txtSupervisorID.set(supervisorID);
		txtSupervisorID.sendKeys(Keys.TAB);
		new Select(driver.findElement(By.id("JOB_REG_TEMP$0"))).selectByVisibleText("Regular");
		TestReporter.logStep("Job Status set to Regular");
		new Select(driver.findElement(By.id("JOB_EMPL_CLASS$0"))).selectByVisibleText(jobType);
		TestReporter.logStep("Job Type set to: " + jobType);
	}
	/*
	 * @param payGroup
	 * @param employeeType
	 * @param taxLocationCode
	 * click payroll tab and set payroll for north america
	 */
	public void clickAndSetPayroll(String payGroup, String employeeType, String taxLocationCode,
			String holidaySchedule) {
		TestReporter.logStep("Validating Payroll Tab");
		TestReporter.assertTrue(wbePayroll.existsInFrame(), "Payroll Tab validated");
		wbePayroll.highlight();
		wbePayroll.clickOnSync();
		TestReporter.assertTrue(wbePayrollSystem.existsInFrame(), "payroll system is a drop down");
		wbePayrollSystem.clickOnSync();
		new Select(driver.findElement(By.id("JOB_PAY_SYSTEM_FLG$0"))).selectByVisibleText("Payroll for North America");
		TestReporter.logStep("Payroll for North America selected as Payroll System");
		TestReporter.assertTrue(wbePayroll.existsInFrame(), "payroll Tab validated");
		wbePayroll.clickOnSync();
		TestReporter.assertTrue(txtPayGroup.existsInFrame(), "Pay Group is a text Field");
		txtPayGroup.set(payGroup);
		txtPayGroup.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtEmployeeType.existsInFrame(), "Employee type is a text field");
		txtEmployeeType.set(employeeType);
		txtEmployeeType.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtTaxLocationCode.existsInFrame(), "Tax Location Code is a text field");
		txtTaxLocationCode.set(taxLocationCode);
		txtTaxLocationCode.sendKeys(Keys.TAB);
		TestReporter.assertTrue(txtHolidaySchedule.existsInFrame(), "Holiday Schedule is text field");
		txtHolidaySchedule.set(holidaySchedule);
		txtHolidaySchedule.sendKeys(Keys.TAB);
	}
/*
 * @param rateCode
 * click compensation tab and set pay rate
 */
	public void clickAndSetCompensation(String rateCode) {
		TestReporter.logStep("Validating Compensation tab");
		TestReporter.assertTrue(wbeCompensation.existsInFrame(), "Compensation tab validated");
		wbeCompensation.highlight();
		wbeCompensation.clickOnSync();
		TestReporter.assertTrue(txtRateCode.existsInFrame(), "Rate Code is a text field");
		txtRateCode.set(rateCode);
		txtRateCode.sendKeys(Keys.TAB);
		TestReporter.assertTrue(btnCalculateCompensation.existsInFrame(), "Calculate Compensation Button validated");
		btnCalculateCompensation.clickOnSync();
	}
	/*
	 * @param benefits
	 * @param benefitProgram
	 * set benefit options for user
	 */
	public void setBenefitProgramParticipation(String benefits, String benefitProgram) {
		TestReporter.logStep("Validating benefit program participation");
		TestReporter.assertTrue(wbeBenefitsProgramParticipation.existsInFrame(),
				"Benefits program participation validated");
		wbeBenefitsProgramParticipation.highlight();
		wbeBenefitsProgramParticipation.clickOnSync();
		TestReporter.assertTrue(wbeBenefitSystem.existsInFrame(), "Benefits System is a drop down option");
		wbeBenefitSystem.clickOnSync();
		new Select(driver.findElement(By.id("JOB_BENEFIT_SYSTEM$0"))).selectByVisibleText(benefits);
		TestReporter.logStep("Base Benefits selected");
		TestReporter.assertTrue(txtBenefitProgram.existsInFrame(), "Benefit Program is a text field");
		txtBenefitProgram.set(benefitProgram);
		txtBenefitProgram.sendKeys(Keys.TAB);
		Element btnOk = driver.findElement(By.id("#ICSave"));
		btnOk.clickOnSync();

	}
/*
 * method to handle pop up 
 */
	public void handlePopUp() throws IOException {

		if (btnAlertOk.existsInFrame()) {
			btnAlertOk.syncInFrame();
			TestReporter.assertTrue(btnAlertOk.existsInFrame(), "Alert Ok button Validated");
			btnAlertOk.clickOnSync();
			WaitAllegis.hardWait(MIN_TIMEOUT);
		}
	}
/*
 * validate save button is clicked 
 */
	public void verifyAccountCreation() {
		btnSave.syncInFrame();
		TestReporter.assertTrue(btnSave.existsInFrame(), "Save Button Validated");
		btnSave.highlight();
		btnSave.clickOnSync();
	}
	/*
	 * capture employee id and return value
	 */
	public String captureEmployeeID () {
		TestReporter.logStep("Validating Employee ID is created");
		wbeEmployeeIDfinal.syncVisible(1000);
		wbeEmployeeIDfinal.syncInFrame();
		TestReporter.assertTrue(wbeEmployeeIDfinal.existsInFrame(), "Employee ID is Validated for user");
		employeeID = wbeEmployeeIDfinal.getText();
		return employeeID;
	}
	/*
	 * write back to excel sheet 
	 */
	public void writeTo(String resource,String sheetName, String columnName,int rowc,String text ) {
	 	  
		ExcelApiTest et;
			try {
		         et = new ExcelApiTest(resource);
		         et.setCellData(sheetName,columnName,rowc,text);
		               TestReporter.log("Data:"+text+" and row is :"+rowc);
		
		        } catch (Exception e) {
		               e.printStackTrace();
		        }
	 }
}
