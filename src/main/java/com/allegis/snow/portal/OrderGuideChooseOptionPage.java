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

public class OrderGuideChooseOptionPage extends BasePage {
	
	private static String[] keyBoardOptions= {"-- None --","Dutch","English - UK","English - US","French","French Belgium","German","Polish","Swedish"};
	private static String[] powerCableOptions= {"-- None --","Europe","United Kingdom","United States"};
	private static String[] badgeTypeOptions= {"-- None --","Standard","Biometric"};
	private static String[] sDriveAccessOptions= {"-- None --","Read only","Write"};
	private static String[] salesForceAccessOptions= {"-- None --","Read","Write"};
	private static String[] requiredSoftware= {"eCopy","ScanSoft"};	
	
	/** Page Elements **/
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
	
	@FindBy(xpath = "//div[@class='m-b-lg font-bold'][contains(text(),'Included Items')]")
	private Element wbeIncludedItems;
		
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'User Account')]")
	private Element wbeUserAccount;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Active Directory account')]")
	private Element wbeUserAccountLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service is required for all new employees.')]")
	private Element wbeUserAccountLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Access to company systems and applications')]")
	private Element wbeUserAccountLabelDesc2;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'A company email address is setup')]")
	private Element wbeUserAccountLabelDesc3;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Please note: this service contains manual processes')]")
	private Element wbeUserAccountLabelDesc4;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'SailPoint User Account')]")
	private Element wbeSailPointUserAccount;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Request a user account')]")
	private Element wbeSailPointUserAccountLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Provisions a user in ServiceNow and SailPoint')]")
	private Element wbeSailPointUserAccountLabelDesc1;
	
	@FindBy(xpath = "//label[@aria-label=' Required - Select primary email domain']/span[@class='field-decorations']/span[@class='fa fa-asterisk mandatory']")
	private Element wbeSailPointPrimaryEmailDomainMandatory;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Select primary email domain')]/following-sibling::span//div/a")
	private Textbox txtSailPointPrimaryEmailDomain;

	@FindBy(xpath = "//label[contains(text(),'Select primary email domain')]/following-sibling::input")
	private Textbox txtSailPointPrimaryEmailDomainInput;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Select primary email domain')]/following-sibling::span//div/a/span[@class='select2-chosen']")
	private Element wbeSailPointPrimaryEmailDomainOutput;
	
	@FindBy(xpath = "//label[@for='sp_formfield_an_email_address']/span[@class='field-decorations']/span[@class='fa fa-asterisk mandatory']")
	private Element wbeSailPointNeedEmaildAddressMandatory;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Does the new hire require an')]/following-sibling::span//div/a")
	private Textbox txtSailPointNeedEmaildAddress;
	
	@FindBy(xpath = "//label[contains(text(),'Does the new hire only need an email address')]/following-sibling::input")
	private Textbox txtSailPointNeedEmaildAddressInput;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Does the new hire only need an email address')]/following-sibling::span//div/a/span[@class='select2-chosen']")
	private Element wbeSailPointNeedEmaildAddressOutput;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Printer')]")
	private Element wbePrinterAccess;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Printer access pin')]")
	private Element wbePrinterAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a printer access pin')]")
	private Element wbePrinterAccessLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Building access')]")
	private Element wbeBuildingAccess;
	
	@FindBy(xpath = "//*[contains(text(),'Building access')]/ancestor::node()[7]/div//div[@class='ng-isolate-scope']")
	private Element wbeBuildingAccessFrame;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'MarketSource building access')]")
	private Element wbeBuildingAccessLabel;

	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with required building access')]")
	private Element wbeBuildingAccessLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Select the type of access required in the field below')]")
	private Element wbeBuildingAccessLabelDesc2;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Disable AD account')]")
	private Element wbeDisableADAccount;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Deprovision external Active Directory account.')]")
	private Element wbeDisableADAccountLabel;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Enter the employee full name')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeDisableADAccountEmployeeName;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Enter the employee full name')]/following-sibling::span/span/input")
	private Textbox txtDisableADAccountEmployeeName;
	
	@FindBy(xpath = "//*[contains(text(),'Disable AD account')]/ancestor::node()[7]//fieldset//label[contains(text(),'Start date')]/following-sibling::span/div/input")
	private Textbox txtDisableADAccountStartDate;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Enter the employee id')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeDisableADAccountEmployeeId;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Enter the employee id')]/following-sibling::span/span/input")
	private Textbox txtDisableADAccountEmployeeId;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Enter the .net email address of the external employee')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeDisableADAccountEmailAddress;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Enter the .net email address of the external employee')]/following-sibling::span/span/input")
	private Textbox txtDisableADAccountEmailAddress;

	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Preferred Display Name')]")
	private Element wbePreferredName;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Submit a request for a display name on your user profile')]")
	private Element wbePreferredNameLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Service to add a display name on the user account provisioned')]")
	private Element wbePreferredNameLabelDesc1;
	
	@FindBy(xpath = "//div[@class='form-group ng-scope ng-isolate-scope form-group-has-focus']/label[contains(text(),'Preferred Display Name')]/following-sibling::span/span/input")
	private Textbox txtPreferredName;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Default Email Domain')]")
	private Element wbeDefaultEmailDomain;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Changing the primary email address for an employee.')]")
	private Element wbeDefaultEmailDomainLabel;
	
	@FindBy(xpath = "//label[contains(text(),'Enter the default domain for this users email.')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element wbeDefaultEmailDomainContentMandatory;
	
	@FindBy(xpath = "//label[contains(text(),'Enter the default domain for this users email.')]/following-sibling::span/span/input")
	private Textbox txtDefaultEmailDomainContent;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Additional Items')]")
	private Element wbeAdditionalItems;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Ordering items for new employees that are not listed as options on the onboarding form.')]")
	private Element wbeAdditionalItemsLabel;
	
	@FindBy(xpath = "//label[contains(text(),'Please list any additional items that are needed on the employee')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element wbeAdditionalItemsContentMandatory;
	
	@FindBy(xpath = "//label[contains(text(),'Please list any additional items that are needed on the employee')]/following-sibling::span/textarea")
	private Textbox txtAdditionalItemsContent;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Access type')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeBadgeType;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Access type')]/following-sibling::span//div/a/span[1]")
	private Textbox txtBadgeType;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Standard Desktop')]")
	private Element wbeStandardDesktop;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Standard desktop computer')]")
	private Element wbeStandardDesktopLabel;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'MarketSource Standard Desktop')]")
	private Element wbeStandardDesktopNAMSU;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'MarketSource standard desktop computer')]")
	private Element wbeStandardDesktopLabelNAMSU;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Desktop Computer')]")
	private Element wbeStandardDesktopLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/strong[contains(text(),'Accessories')]")
	private Element wbeStandardDesktopLabelDesc2;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/strong[contains(text(),'Specifications')]")
	private Element wbeStandardDesktopLabelDesc3;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'TEK BOA Desktop')]")
	private Element wbeTekBOADesktop;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Request a desktop')]")
	private Element wbeTekBOADesktopLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Desktop Computer')]")
	private Element wbeTekBOADesktopLabelDesc1;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Required Software')]")
	private Element wbeTEKRequiredSoftware;
		
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Required Software')]/following-sibling::span/div/ul/li/div[contains(text(),'eCopy')]")
	private Element wbeTEKRequiredSoftwareECopy;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Required Software')]/following-sibling::span/div/ul/li/div[contains(text(),'ScanSoft')]")
	private Element wbeTEKRequiredSoftwareScanSoft;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Standard Laptop')]")
	private Element wbeStandardLaptop;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Standard laptop computer')]")
	private Element wbeStandardLaptopLabel;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'MarketSource Standard Laptop')]")
	private Element wbeStandardLaptopNAMSU;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'MarketSource standard laptop computer')]")
	private Element wbeStandardLaptopLabelNAMSU;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'T Series')]")
	private Element wbeStandardLaptopLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/strong[contains(text(),'Accessories')]")
	private Element wbeStandardLaptopLabelDesc2;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/strong[contains(text(),'Specifications')]")
	private Element wbeStandardLaptopLabelDesc3;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Travel Laptop')]")
	private Element wbeTravelLaptop;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Travel laptop computer')]")
	private Element wbeTravelLaptopLabel;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'MarketSource Travel Laptop')]")
	private Element wbeTravelLaptopNAMSU;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'MarketSource travel laptop computer')]")
	private Element wbeTravelLaptopLabelNAMSU;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Travel X Series')]")
	private Element wbeTravelLaptopLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/strong[contains(text(),'Accessories')]")
	private Element wbeTravelLaptopLabelDesc2;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/strong[contains(text(),'Specifications')]")
	private Element wbeTravelLaptopLabelDesc3;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Keyboard language')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeKeyboardLanguage;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Keyboard language')]/following-sibling::span//a")
	private Textbox txtKeyboardLanguage;
	
	@FindBy(xpath = "//div[@ng-show='field.messages']/div[contains(text(),'This selection will take a minimum of four weeks to arrive')]")
	private Element wbeKeyBoardlanguageValdiationMessage;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Power cable')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbePowerCable;

	@FindBy(xpath = "//fieldset//label[contains(text(),'Power cable')]/following-sibling::span//a")
	private Textbox txtPowerCable;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Non-Standard Computer')]")
	private Element wbeNonStandardComputer;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Non-standard computer')]")
	private Element wbeNonStandardComputerLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a non-standard computer.')]")
	private Element wbeNonStandardComputerLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Use the fields below to provide requirements and justification for the computer.')]")
	private Element wbeNonStandardComputerLabelDesc2;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Please note that a non-standard computer requires additional approval and may take longer to fulfill than a standard computer.')]")
	private Element wbeNonStandardComputerLabelDesc3;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Requirements')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeNonStandardRequirements;
	
	@FindBy(xpath = "//label[contains(text(),'Requirements')]/following-sibling::span/textarea")
	private Textbox txtNonStandardRequirements;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Justification')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeNonStandardJustification;
	
	@FindBy(xpath = "//label[contains(text(),'Justification')]/following-sibling::span/textarea")
	private Textbox txtNonStandardJustification;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'External Monitor')]")
	private Element wbeMonitor;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'External computer monitor')]")
	private Element wbeMonitorLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee a 22-inch LCD monitor with power and VGA cables.')]")
	private Element wbeMonitorLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'New Extension')]")
	private Element wbeNewExtension;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'New desk phone extension')]")
	private Element wbeNewExtensionLabel;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Reassign Extension')]")
	private Element wbeReassignExtension;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Reassigned desk phone extension')]")
	private Element wbeReassignExtensionLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a reassigned desk phone extension.')]")
	private Element wbeReassignExtensionLabelDesc1;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Phone number')]")
	private Textbox wbePhoneNumber;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Phone number')]/following-sibling::span/span/input")
	private Textbox txtPhoneNumber;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Display name')]//span[@class='fa fa-asterisk mandatory']")
	private Textbox wbeDisplayName;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Display name')]")
	private Textbox wbeDisplayNameNotMandatory;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Display name')]/following-sibling::span/span/input")
	private Textbox txtDisplayName;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Extension')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeReExtension;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Extension')]/following-sibling::span/span/input")
	private Textbox txtReExtension;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'MAC address')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMACAddress;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'MAC address')]")
	private Element wbeMACAddressNotMandatory;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'MAC address')]/following-sibling::span/span/input")
	private Textbox txtMACAddress;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Desk Phone')]")
	private Element wbeDeskPhone;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Desk phone with extension')]")
	private Element wbeDeskPhoneLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a desk phone and a new extension')]")
	private Element wbeDeskPhoneLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'If the new employee only needs a new extension, go back to the previous page and select ')]")
	private Element wbeDeskPhoneLabelDesc2;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Phone model')]")
	private Textbox wbePhoneModel;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Phone model')]/following-sibling::span/span/input")
	private Textbox txtPhoneModelNumber;
		
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Wired Headset')]")
	private Element wbeWiredHeadSet;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Wired headset for phone or PC')]")
	private Element wbeWiredHeadSetLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a wired headset that connects to a desk phone.')]")
	private Element wbeWiredHeadSetLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Wireless Headset')]")
	private Element wbeWirelessHeadSet;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Wireless headset for phone or PC')]")
	private Element wbeWirelessHeadSetLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a wireless headset.')]")
	private Element wbeWirelessHeadSetLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'USB Headset')]")
	private Element wbeUSBHeadset;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'USB headset')]")
	private Element wbeUSBHeadsetLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a USB headset that connects to a desktop or laptop computer.')]")
	private Element wbeUSBHeadsetLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Mobile Phone')]")
	private Element wbeMobilePhoneItem;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Mobile smart phone')]")
	private Element wbeMobilePhoneItemLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with a mobile phone')]")
	private Element wbeMobilePhoneLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'EchoSign')]")
	private Element wbeEchoSignAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'EchoSign')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeEchoSignAccessLabel;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'OnBase')]")
	private Element wbeOnBaseAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'OnBase')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeOnBaseAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'OnBase is Allegis Group')]")
	private Element wbeOnBaseAccessLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'OnBase is used by all')]")
	private Element wbeOnBaseAccessLabelDesc2;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'OnBase has a workflow')]")
	private Element wbeOnBaseAccessLabelDesc3;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'MaxHire')]")
	private Element wbeMaxHireAccess;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'MaxHire application access')]")
	private Element wbeMaxHireAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with access to MaxHire')]")
	private Element wbeMaxHireLabelDesc1;
	
	@FindBy(xpath = "//*[contains(text(),'MaxHire')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserMaxHire;
	
	@FindBy(xpath = "//*[contains(text(),'MaxHire')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserMaxHire;

	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft FS')]")
	private Element wbePeopleSoftFSAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft FS')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbePeopleSoftFSAccessLabel;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft FS')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/span[contains(text(),'Capture')]")
	private Element wbePeopleSoftFSAccessLabelDesc1;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft FS')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/span[contains(text(),'Note:')]")
	private Element wbePeopleSoftFSAccessLabelDesc2;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft FS')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserFS;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft FS')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserFS;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft HR')]")
	private Element wbePeopleSoftHRAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft HR')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbePeopleSoftHRAccessLabel;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft HR')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/span[contains(text(),'Capture')]")
	private Element wbePeopleSoftHRAccessLabelDesc1;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft HR')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/span[contains(text(),'Note:')]")
	private Element wbePeopleSoftHRAccessLabelDesc2;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft HR')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserHR;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft HR')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserHR;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft nVision')]")
	private Element wbePeopleSoftNVAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft nVision')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbePeopleSoftNVAccessLabel;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft nVision')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserNV;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft nVision')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserNV;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft Oasis')]")
	private Element wbePeopleSoftOAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'PeopleSoft Oasis')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbePeopleSoftOAccessLabel;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft Oasis')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/span[contains(text(),'Capture')]")
	private Element wbePeopleSoftOAccessLabelDesc1;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft Oasis')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p/span[contains(text(),'Note:')]")
	private Element wbePeopleSoftOAccessLabelDesc2;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft Oasis')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserO;
	
	@FindBy(xpath = "//*[contains(text(),'PeopleSoft Oasis')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserO;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Onboarding Automation')]")
	private Element wbeOnboardingAutomationAccess;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),' Onboarding Automation application access')]")
	private Element wbeOnboardingAutomationAccessLabel;
	
	@FindBy(xpath = "//*[contains(text(),'Onboarding Automation')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Provides the new employee with access to Onboarding Automation.')]")
	private Element wbeOnboardingAutomationAccessLabelDesc1;
	
	@FindBy(xpath = "//span[contains(text(),'Onboarding Automation')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Select the employee whose access will be mirrored to the new employee.')]")
	private Element wbeOnboardingAutomationAccessLabelDesc2;
	
	@FindBy(xpath = "//span[contains(text(),'Onboarding Automation')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserSmartERP;
	
	@FindBy(xpath = "//span[contains(text(),'Onboarding Automation')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserSmartERP;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Time and Expense')]")
	private Element wbeTimeExpenseAccess;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Time and Expense application access')]")
	private Element wbeTimeExpenseAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with access to Time and Expense')]")
	private Element wbeTimeExpenseAccessLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Time Central')]")
	private Element wbeTimeCentralAccess;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Time Central application access')]")
	private Element wbeTimeCentralAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides the new employee with access to Time Central.')]")
	private Element wbeTimeCentralAccessLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'WSSRD')]")
	private Element wbeWSSRDAccess;

	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'WSSRD')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeWSSRDAccessLabel;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Groups to Add')]")
	private Element wbeGroupsToAdd;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Groups to Add')]/following-sibling::span//input")
	private Textbox txtGroupsToAdd;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'WSSRD')]/ancestor::node()[6]/following-sibling::div//div[@class='select2-container select2-container-multi ng-scope ng-isolate-scope select2-reference ng-form-element']/ul[@class='select2-choices']/li/div")
	private Element wbeGroupsToAddRetreive;
	
	@FindBy(xpath = "//label[contains(text(),'Groups to Add')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element wbeGroupsToAddMandatory;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Date Needed')]")
	private Element wbeDateNeeded;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Date Needed')]/following-sibling::span//input")
	private Textbox txtDateNeeded;
	
	@FindBy(xpath = "//label[contains(text(),'Date Needed')]/span/span[@class='fa fa-asterisk mandatory']")
	private Element wbeDateNeededMandatory;
	
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Notes')]")
	private Element wbeWSSRDNotes;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Notes')]/following-sibling::span//textarea")
	private Textbox txtWSSRDNotes;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'S Drive')]")
	private Element wbeSDriveAccess;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Request read/write access for S Drive folders')]")
	private Element wbeSDriveAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'This service provides access to S drive folders.')]")
	private Element wbeSDriveAccessLabelDesc1;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'EFT')]")
	private Element wbeDriveAccess1;

	@FindBy(xpath = "//fieldset//label[contains(text(),'EFT')]/following-sibling::span//a")
	private Textbox txtDriveAccess1;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'EFT')]/following-sibling::span/div/span[contains(text(),'Please select the')]")
	private Element wbeDriveAccesslabel1;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Company Aging')]")
	private Element wbeDriveAccess2;

	@FindBy(xpath = "//fieldset//label[contains(text(),'Company Aging')]/following-sibling::span//a")
	private Textbox txtDriveAccess2;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Company Aging')]/following-sibling::span/div/span[contains(text(),'Please select the')]")
	private Element wbeDriveAccesslabel2;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Component Services')]")
	private Element wbeDriveAccess3;

	@FindBy(xpath = "//fieldset//label[contains(text(),'Component Services')]/following-sibling::span//a")
	private Textbox txtDriveAccess3;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Component Services')]/following-sibling::span/div/span[contains(text(),'Please select the')]")
	private Element wbeDriveAccesslabel3;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Wires')]")
	private Element wbeDriveAccess4;

	@FindBy(xpath = "//fieldset//label[contains(text(),'Wires')]/following-sibling::span//a")
	private Textbox txtDriveAccess4;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Wires')]/following-sibling::span/div/span[contains(text(),'Please select the')]")
	private Element wbeDriveAccesslabel4;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'VDI')]")
	private Element wbeVDIAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'VDI')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeVDIAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Access a Windows desktop on the VMware')]")
	private Element wbeVDIAccessLabelDesc1;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Salesforce')]")
	private Element wbeSalesForceAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Salesforce')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeSalesForceAccessLabel;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Salesforce is the CRM')]")
	private Element wbeSalesForceAccessLabelDesc1;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Important')]")
	private Element wbeSalesForceAccessLabelDesc2;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul/li[contains(text(),'If you are with AGS')]")
	private Element wbeSalesForceAccessLabelDesc3;
	
	@FindBy(xpath = "//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul/li[contains(text(),'If you are with MarketSource')]")
	private Element wbeSalesForceAccessLabelDesc4;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Candidate Tracker')]")
	private Element wbeCandidateTrackerAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Candidate Tracker')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeCandidateTrackerAccessLabel;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Type of access required')]/following-sibling::span//a")
	private Textbox txtSalesForceAccess;
	
	@FindBy(xpath = "//span[contains(text(),'Salesforce')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserSalesForce;
	
	@FindBy(xpath = "//span[contains(text(),'Salesforce')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserSalesForce;

	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Web Focus BI')]")
	private Element wbeWebFocusBI;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Web Focus BI')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeWebFocusBILabel;
	
	@FindBy(xpath = "//span[contains(text(),'Web Focus BI')]/ancestor::node()[7]//fieldset//label[@for='sp_formfield_report_dashboard']//span[@class='fa fa-asterisk mandatory']")
	private Element wbeWebFocusBIReportDashboard;
	
	@FindBy(xpath = "//span[contains(text(),'Web Focus BI')]/ancestor::node()[7]//fieldset//label[@for='sp_formfield_report_dashboard']/following-sibling::span//textarea")
	private Textbox txtWebFocusBIReportDashboard;
	

	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Global Delivery Portal')]")
	private Element wbeGlobalDeliveryPortal;
	
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Request access for GDP website')]")
	private Element wbeGlobalDeliveryPortalLabel;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Hyperion')]")
	private Element wbeHyperion;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Hyperion')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeHyperionLabel;
	
	@FindBy(xpath = "//*[contains(text(),'Hyperion')]/ancestor::node()[7]//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'A request is made when a new employee joins Allegis or an existing employee needs to update his/her access.')]")
	private Element wbeHyperionLabelDesc1;
	
	@FindBy(xpath = "//span[contains(text(),'Hyperion')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]//span[@class='fa fa-asterisk mandatory']")
	private Element wbeMirrorUserHyperion;
	
	@FindBy(xpath = "//span[contains(text(),'Hyperion')]/ancestor::node()[7]//fieldset//label[contains(text(),'Mirror user')]/following-sibling::span//a")
	private Textbox txtMirrorUserHyperion;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Contract Logix')]")
	private Element wbeContractLogixAccess;
	
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Contract Logix')]/ancestor::node()[1]/following-sibling::div[contains(text(),'Request access')]")
	private Element wbeContractLogixAccessLabel;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Required Software')]")
	private Element wbeRequiredSoftware;
	
	@FindBy(xpath = "//fieldset//label[contains(text(),'Required Software')]/following-sibling::span/div[2]/ul/li/input")
	private Textbox txtRequiredSoftware;
	
	@FindBy(xpath = ".//button[@id='submit'][contains(text(),'Next')]")
	private Element btnNext;
	
	@FindBy(xpath = ".//button[@id='submit'][contains(text(),'Previous')]")
	private Element btnPrevious;
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private Element btnOrderNow;
	
	@FindBy(xpath = ".//*[@id='select2-drop']//input")
	private Textbox txtDropdownSearch;
	
	@FindBy(xpath = "//input[@id='sp_formfield_vdi_pool_name']")
	private Textbox txtVDIPoolName;
	
	private By txtDropDown=By.xpath("//ul[@class='select2-results']/li/div");

	/** Constructor **/
	public  OrderGuideChooseOptionPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}
	
	/**
	 * verify the Onboard Employee Choose Option tab area
	 * 
	 * @param None.
	 * @return None
	 */
	public void chooseOptionsTabValidation() {
		
		TestReporter.logStep("Verify Choose Options tab active");
		TestReporter.assertTrue(wbeDescribeNeedsIcon.getAttribute("class").contains("circle_icon step_inactive")
				,"Describe Needs Tab Inactive as expected");
		TestReporter.assertTrue(wbeChooseOptionsIcon.getAttribute("class").contains("circle_icon step_active")
				,"ChooseOptions Tab active as expected");
		TestReporter.assertTrue(wbeSummaryIcon.getAttribute("class").contains("circle_icon step_inactive")
				,"Summary Tab Inactive as expected");
	}
	
	/**
	 * verify the Onboard Employee Choose Option  total no of included items
	 * 
	 * @param None.
	 * @return None
	 */
	public int getItemCounts()
	{
		List<Element> itemCount=driver.findElements(By.xpath("//span[@class='break-word ng-binding']"));
		return itemCount.size();
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NormalWorkflow
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCode(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9935")
				|| jobTitle.contains("9954")|| jobTitle.contains("7738")
				|| jobTitle.contains("8999")|| jobTitle.contains("9934"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 20, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			buildingAccessItem();
			standardLaptopItemNAMSU();
			monitorItem();
			deskPhone();
			wiredHeadSetItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
			onboardingAutomationAccessItem();
			timeAndExpenseAccessItem();
			timeCentralAccessItem();
			wssrdAccessItem();
			salesForceAccessItem();
			webFocusBIItem();
			hyperionItem();
			contractLogixAccessItem();
			vdiAccessItem();
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());

		}
	}
	public void includedItemsSailPointValidationCode(String jobTitle, String primaryEmailDomain, String needEmailAddress) throws IOException {
		
		if(jobTitle.contains("9935")
				|| jobTitle.contains("9954")|| jobTitle.contains("7738")
				|| jobTitle.contains("8999")|| jobTitle.contains("9934"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 20, "Items Matched and Count:"+getItemCounts());
			sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
			buildingAccessItem();
			standardLaptopItemNAMSU();
			monitorItem();
			deskPhone();
			wiredHeadSetItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
			onboardingAutomationAccessItem();
			timeAndExpenseAccessItem();
			timeCentralAccessItem();
			wssrdAccessItem();
			salesForceAccessItem();
			webFocusBIItem();
			hyperionItem();
			contractLogixAccessItem();
			vdiAccessItem();
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());

		}
	}
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code No Services
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeNoServices(String operatingCompany, String primaryEmailDomain, String needEmailAddress) throws IOException {
	
		if(operatingCompany.contains("| MSU"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 2, "Items Matched and Count:"+getItemCounts());
			sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
			buildingAccessItem();
		}

		else if(operatingCompany.contains("| MLA"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 2, "Items Matched and Count:"+getItemCounts());
			sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
			wirelessHeadSetItem();
		}
		else if(operatingCompany.contains("| ONS"))
		{		
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 6, "Items Matched and Count:"+getItemCounts());
			sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();
		}
		else if(operatingCompany.contains("| EFI"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 6, "Items Matched and Count:"+getItemCounts());
			sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();
			sDriveAccessItem();
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 1, "Items Matched and Count:"+getItemCounts());
			sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
		}
	}

	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code DisableADAccount WF
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeDisableADAccount(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9935")|| jobTitle.contains("9954")
				|| jobTitle.contains("7738")|| jobTitle.contains("8999")
				|| jobTitle.contains("9934"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 2, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			// Commenting as of now due to production issue- will uncomment later
			// disableADAccountItem();
			standardLaptopItemNAMSU();
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code Default Email domain and Addition Items
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeEmailAddItems(String operatingCompany) throws IOException {
	
		if(operatingCompany.contains("| MSU"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			defaultEmailDomainItem(); 
			additionalItemsItem();
		}
		else if(operatingCompany.contains("| MLA"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			defaultEmailDomainItem(); 
			additionalItemsItem();
			wirelessHeadSetItem();
		}
		else if(operatingCompany.contains("| ONS"))
		{		
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 8, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			defaultEmailDomainItem(); 
			additionalItemsItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();
		}
		else if(operatingCompany.contains("| EFI"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 8, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			defaultEmailDomainItem(); 
			additionalItemsItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();
			sDriveAccessItem();
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code Preferred name
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodePrefName(String operatingCompany) throws IOException {
	
		if(operatingCompany.contains("| MSU"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			preferredNameItem();
			buildingAccessItem();
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
		}
	}
	

	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA Standard Laptop with workflow which doesn't Requires approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeStandardLaptopNAmonitorNA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9935")|| jobTitle.contains("8999")
				|| jobTitle.contains("7076")|| jobTitle.contains("9929") 
				|| jobTitle.contains("9937") || jobTitle.contains("9926")
				|| jobTitle.contains("9941") || jobTitle.contains("9929")
				|| jobTitle.contains("900026"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			buildingAccessItem();
			standardLaptopItemNAMSU();
			monitorItem();			
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA Standard Laptop with workflow which Requires approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeStandardLaptopAmonitorA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9954")|| jobTitle.contains("7076")
				|| jobTitle.contains("7079")|| jobTitle.contains("9899")
				|| jobTitle.contains("9945")|| jobTitle.contains("9953")
				|| jobTitle.contains("5874") || jobTitle.contains("3407") 
				|| jobTitle.contains("9944") || jobTitle.contains("7090")
				|| jobTitle.contains("9963"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			standardLaptopItemNAMSU();
			monitorItem();	
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for Standard Laptop approval , monitor no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeStandardLaptopAmonitorNA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("8999")|| jobTitle.contains("9937"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			standardLaptopItemNAMSU();
			monitorItem();			
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for Standard Laptop No approval , monitor approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeStandardLaptopNAmonitorA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("7076")|| jobTitle.contains("3021")
				|| jobTitle.contains("7738")|| jobTitle.contains("1800")
				|| jobTitle.contains("1098"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			standardLaptopItemNAMSU();
			monitorItem();			
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for Travel Laptop with workflow which doesn't Requires approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeTravelLaptopNAmonitorNA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9929")|| jobTitle.contains("8999")
				|| jobTitle.contains("900026")|| jobTitle.contains("9937")
				|| jobTitle.contains("0322"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			travelLaptopItemNAMSU();
			monitorItem();			
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for Travel Laptop with workflow which  Requires approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeTravelLaptopAmonitorA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("7076")|| jobTitle.contains("9934")
				|| jobTitle.contains("5874")|| jobTitle.contains("7090")
				|| jobTitle.contains("1098"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			travelLaptopItemNAMSU();
			monitorItem();			
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for Travel Laptop approval , monitor no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeTravelLaptopAmonitorNA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9935")|| jobTitle.contains("0322")
				|| jobTitle.contains("5869")|| jobTitle.contains("2252")
				|| jobTitle.contains("9955"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			travelLaptopItemNAMSU();
			monitorItem();			
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for Travel Laptop No approval , monitor approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeTravelLaptopNAmonitorA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9954")|| jobTitle.contains("1098")
				|| jobTitle.contains("8999")|| jobTitle.contains("9174")
				|| jobTitle.contains("9934"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			travelLaptopItemNAMSU();
			monitorItem();			
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for desk phone No Approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeStandardDesktopNADeskPhoneNA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("9929")|| jobTitle.contains("0322")
				|| jobTitle.contains("9958")|| jobTitle.contains("9954")
				|| jobTitle.contains("2252"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 3, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			standardDesktopItemNAMSU();
			deskPhone();		
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItemNAMSU();
			newExtensionItem();
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for non Standard, new extension and USB No Approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeNonStandardNANewExtensionNAUSBNA(String jobTitle) throws IOException {
		
		if(jobTitle.contains("9929")|| jobTitle.contains("8999")
				|| jobTitle.contains("9174")|| jobTitle.contains("9954")
				|| jobTitle.contains("9937"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			nonStandardComputerItem();
			newExtensionItem();
			usbHeadSetItem();	
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for MLA workflow
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeMLA(String jobTitle) throws IOException {
		
		if(jobTitle.contains("000001")|| jobTitle.contains("000008")
				|| jobTitle.contains("40058")|| jobTitle.contains("592")
				|| jobTitle.contains("9044"))
		{	
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 19, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			standardLaptopItem();
			monitorItem();
			newExtensionItem();
			wirelessHeadSetItem();
			maxHireAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			onboardingAutomationAccessItem();
			timeAndExpenseAccessItem();
			timeCentralAccessItem();
			wssrdAccessItem();
			salesForceAccessItem();
			webFocusBIItem();
			hyperionItem();
			contractLogixAccessItem();
			vdiAccessItem();
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for TEK BOA workflow
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeTEKBOA(String jobTitle) throws IOException {
		
		if(jobTitle.contains("117")|| jobTitle.contains("000118")
				|| jobTitle.contains("4024")|| jobTitle.contains("7781")
				|| jobTitle.contains("7782"))
		{	
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 10, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			tekBOADesktopItem();
			monitorItem();
			deskPhone();
			wiredHeadSetItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();
			sDriveAccessItem();
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for AEROTEK workflow
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeAEROTEKBOA(String jobTitle, String primaryEmailDomain, String needEmailAddress) throws IOException {
		
		if(jobTitle.contains("117")|| jobTitle.contains("000118")
				|| jobTitle.contains("4024"))
		{	
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 10, "Items Matched and Count:"+getItemCounts());
			//userAccountItem();
			sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
			standardDesktopItem();
			monitorItem();
			deskPhone();
			usbHeadSetItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NA for reassign extension and wired No Approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @throws IOException
	 * @return None
	 */
	public void includedItemsValidationCodeReassignExtensionNAWiredNA(String jobTitle) throws IOException {
		
		if(jobTitle.contains("9954")|| jobTitle.contains("6946")
				|| jobTitle.contains("9929")|| jobTitle.contains("900026")
				|| jobTitle.contains("7076"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			standardDesktopItemNAMSU();
			reassignExtensionItem();
			wiredHeadSetItem();	
	
		}		
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
		}
	}
	
	//EMEA options:
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for normal job code
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationEMEA() throws IOException {

			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeEMEA(String jobTitle) throws IOException {
	
		if(jobTitle.contains("1100"))
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 10, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
		}
		else if(jobTitle.contains("1056"))
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 7, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			echoSignAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("163002"))
		{
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 11, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else if(jobTitle.contains("1101"))
		{
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 7, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			peopleSoftFSAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
		}
		
		else if(jobTitle.contains("5136"))
		{
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 7, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			peopleSoftFSAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("900037"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 11, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else if(jobTitle.contains("9935"))
		{		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 12, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			buildingAccessItem();
			standardLaptopItem();
			monitorItem();
			deskPhone();
			wiredHeadSetItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
			timeCentralAccessItem();
		}
		else
		{
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code for Standard Desktop EMEA no approval
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeStandardDesktopEMEA(String jobTitle) throws IOException {
		
		if(jobTitle.contains("163002")){
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 12, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			mobilePhoneItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else if(jobTitle.contains("1051")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 8, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			mobilePhoneItem();
			echoSignAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("600052")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 10, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			mobilePhoneItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
		}
		else if(jobTitle.contains("592")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 7, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			mobilePhoneItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("000008")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 12, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
			mobilePhoneItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else {
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardDesktopItem();
			newExtensionItem();
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code for Standard laptop EMEA
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeStandardLaptopEMEA(String jobTitle) throws IOException {
		
		if(jobTitle.contains("163002")){
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 12, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardLaptopItem();
			newExtensionItem();
			mobilePhoneItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else if(jobTitle.contains("1051")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 8, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardLaptopItem();
			newExtensionItem();
			mobilePhoneItem();
			echoSignAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("600052")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 10, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardLaptopItem();
			newExtensionItem();
			mobilePhoneItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
		}
		else if(jobTitle.contains("592")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 7, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardLaptopItem();
			newExtensionItem();
			mobilePhoneItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("000008")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 12, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardLaptopItem();
			newExtensionItem();
			mobilePhoneItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else {
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			standardLaptopItem();
			newExtensionItem();
		}
	}
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code for travel laptop EMEA
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeTravelLaptopEMEA(String jobTitle) throws IOException {
		
		if(jobTitle.contains("163002")){
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 11, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else if(jobTitle.contains("1051")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 7, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			echoSignAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("600052")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 9, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
		}
		else if(jobTitle.contains("592")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 6, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("000008")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 11, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			echoSignAccessItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
			timeCentralAccessItem();
		}
		else if(jobTitle.contains("40074")||jobTitle.contains("60076")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
		}
		else if(jobTitle.contains("1101")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 7, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			peopleSoftFSAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
		}
		else if(jobTitle.contains("1100")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 10, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftnVisionAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
		}
		else if(jobTitle.contains("117")) {
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 9, "Items Matched and Count:"+getItemCounts());
			userAccountItem();
			printerAccessItem();
			travelLaptopItem();
			newExtensionItem();
			onBaseAccessItem();
			peopleSoftFSAccessItem();
			peopleSoftHRAccessItem();
			peopleSoftOasisAccessItem();
			timeAndExpenseAccessItem();	
		}
		else {
			wbeIncludedItems.syncVisible(30);
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 4, "Items Matched and Count:"+getItemCounts());
		}
	}
	
	
	/**
	 * verify the Onboard Employee Choose Option Included Items Section area for parmaterized job code NormalWorkflow for APAC
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void includedItemsValidationCodeAPAC() throws IOException {
		
			TestReporter.logStep("Included Items page tab displayed");
			TestReporter.assertEquals(getItemCounts(), 1, "Items Matched and Count:"+getItemCounts());
			userAccountSailPointItem();
	}
	
	
	/**
	 * verify the OnBoard Employee user account item area
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void userAccountItem() throws IOException {
		
		TestReporter.assertTrue(wbeUserAccount.existsInFrame(),"'User Account' Item is displayed");
		TestReporter.assertEquals(wbeUserAccount.getText(), "User Account", "User Account title Validated:"+wbeUserAccount.getText());
		TestReporter.assertTrue(wbeUserAccountLabel.existsInFrame(),"'User Account' Label is displayed");
		TestReporter.assertEquals(wbeUserAccountLabel.getText(),"Active Directory account", "User Account label Validated:"+wbeUserAccountLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee user account item area
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void userAccountSailPointItem() throws IOException {
		TestReporter.assertTrue(wbeSailPointUserAccount.existsInFrame(),"'sail Point User Account' Item is displayed");
		TestReporter.assertEquals(wbeSailPointUserAccount.getText(), "SailPoint User Account", "SailPoint User Account title Validated:"+wbeSailPointUserAccount.getText());
		TestReporter.assertTrue(wbeSailPointUserAccountLabel.existsInFrame(),"SailPoint User Account Label is displayed");
		TestReporter.assertEquals(wbeSailPointUserAccountLabel.getText(),"Request a user account", "SailPoint User Account label Validated:"+wbeSailPointUserAccountLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee Building Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void buildingAccessItem() {
		
		TestReporter.assertTrue(wbeBuildingAccess.existsInFrame(),"'Building access' Item is displayed");
		TestReporter.assertEquals(wbeBuildingAccess.getText(), "Building access", "Building Access title Validated:"+wbeBuildingAccess.getText());
		TestReporter.assertTrue(wbeBuildingAccessLabel.existsInFrame(),"'Building access' Label is displayed");
		TestReporter.assertEquals(wbeBuildingAccessLabel.getText(),"MarketSource building access", "Building Access label Validated:"+wbeBuildingAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee Disable AD account item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void disableADAccountItem() {
		
		TestReporter.assertTrue(wbeDisableADAccount.existsInFrame(),"'Disable AD Account' Item is displayed");
		TestReporter.assertEquals(wbeDisableADAccount.getText(), "Disable AD account", "Disable AD account title Validated:"+wbeDisableADAccount.getText());
		TestReporter.assertTrue(wbeDisableADAccountLabel.existsInFrame(),"'Disable AD account' Label is displayed");
		TestReporter.assertEquals(wbeDisableADAccountLabel.getText(),"Deprovision external Active Directory account.", "Disable AD account label Validated:"+wbeDisableADAccountLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee Building Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void preferredNameItem() {
		
		TestReporter.assertTrue(wbePreferredName.existsInFrame(),"'Preferred Display Name' Item is displayed");
		TestReporter.assertEquals(wbePreferredName.getText(), "Preferred Display Name", "Preferred Display Name title Validated:"+wbePreferredName.getText());
		TestReporter.assertTrue(wbePreferredNameLabel.existsInFrame(),"'Preferred Display Name' Label is displayed");
		TestReporter.assertEquals(wbePreferredNameLabel.getText(),"Submit a request for a display name on your user profile", "Preferred Display Name label Validated:"+wbePreferredNameLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee Default Email Domain Item
	 * 
	 * @param None.
	 * @return None
	 */
	public void defaultEmailDomainItem() {
		
		TestReporter.assertTrue(wbeDefaultEmailDomain.existsInFrame(),"'Default Email Domain' Item is displayed");
		TestReporter.assertEquals(wbeDefaultEmailDomain.getText(), "Default Email Domain", "Default Email Domain title Validated:"+wbeDefaultEmailDomain.getText());
		TestReporter.assertTrue(wbeDefaultEmailDomainLabel.existsInFrame(),"'Default Email Domain' Label is displayed");
		TestReporter.assertEquals(wbeDefaultEmailDomainLabel.getText(),"Changing the primary email address for an employee.", "Default Email Domain label Validated:"+wbeDefaultEmailDomainLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee Additional Items
	 * 
	 * @param None.
	 * @return None
	 */
	public void additionalItemsItem() {
		
		TestReporter.assertTrue(wbeAdditionalItems.existsInFrame(),"'Additional Items' Item is displayed");
		TestReporter.assertEquals(wbeAdditionalItems.getText(), "Additional Items", "Additional Items title Validated:"+wbeAdditionalItems.getText());
		TestReporter.assertTrue(wbeAdditionalItemsLabel.existsInFrame(),"'Additional Items' Label is displayed");
		TestReporter.assertEquals(wbeAdditionalItemsLabel.getText(),"Ordering items for new employees that are not listed as options on the onboarding form.", "Additional Items label Validated:"+wbeAdditionalItemsLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee printer access  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void printerAccessItem() {
		
		TestReporter.assertTrue(wbePrinterAccess.existsInFrame(),"'Printer Access' Item is displayed");
		TestReporter.assertEquals(wbePrinterAccess.getText(), "Printer", "Printer Access  title Validated:"+wbePrinterAccess.getText());
		TestReporter.assertTrue(wbePrinterAccessLabel.existsInFrame(),"'Printer Access' Label is displayed");
		TestReporter.assertEquals(wbePrinterAccessLabel.getText(), "Printer access pin", "Printer Access label Validated:"+wbePrinterAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee standard desktop  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void standardDesktopItem() {
		
		TestReporter.assertTrue(wbeStandardDesktop.existsInFrame(),"'Standard Desktop' Item is displayed");
		TestReporter.assertEquals(wbeStandardDesktop.getText(), "Standard Desktop", "Standard Desktop title Validated:"+wbeStandardDesktop.getText());
		TestReporter.assertTrue(wbeStandardDesktopLabel.existsInFrame(),"'Standard Desktop computer' Label is displayed");
		TestReporter.assertEquals(wbeStandardDesktopLabel.getText(), "Standard desktop computer", "Standard Desktop label Validated:"+wbeStandardDesktopLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee standard desktop  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void standardDesktopItemNAMSU() {
		
		TestReporter.assertTrue(wbeStandardDesktopNAMSU.existsInFrame(),"'MarketSource Standard Desktop' Item is displayed");
		TestReporter.assertEquals(wbeStandardDesktopNAMSU.getText(), "MarketSource Standard Desktop", "Standard Desktop title Validated:"+wbeStandardDesktopNAMSU.getText());
		TestReporter.assertTrue(wbeStandardDesktopLabelNAMSU.existsInFrame(),"'MarketSource standard Desktop computer' Label is displayed");
		TestReporter.assertEquals(wbeStandardDesktopLabelNAMSU.getText(), "MarketSource standard desktop computer", "Standard Desktop label Validated:"+wbeStandardDesktopLabelNAMSU.getText());
	}
	
	/**
	 * verify the OnBoard Employee TEK BOA desktop  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void tekBOADesktopItem() {

		TestReporter.assertTrue(wbeTekBOADesktop.existsInFrame(),"'TEK BOA Desktop' Item is displayed");
		TestReporter.assertEquals(wbeTekBOADesktop.getText(), "TEK BOA Desktop", "TEK BOA Desktop title Validated:"+wbeTekBOADesktop.getText());
		TestReporter.assertTrue(wbeTekBOADesktopLabel.existsInFrame(),"'TEK BOA Desktop computer' Label is displayed");
		TestReporter.assertEquals(wbeTekBOADesktopLabel.getText(), "Request a desktop", "TEK BOA Desktop label Validated:"+wbeTekBOADesktopLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee standard laptop  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void standardLaptopItem() {
		
		TestReporter.assertTrue(wbeStandardLaptop.existsInFrame(),"'Standard Laptop' Item is displayed");
		TestReporter.assertEquals(wbeStandardLaptop.getText(), "Standard Laptop", "Standard laptop title Validated:"+wbeStandardLaptop.getText());
		TestReporter.assertTrue(wbeStandardLaptopLabel.existsInFrame(),"'Standard laptop computer' Label is displayed");
		TestReporter.assertEquals(wbeStandardLaptopLabel.getText(), "Standard laptop computer", "Standard laptop computer label Validated:"+wbeStandardLaptopLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee standard laptop  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void standardLaptopItemNAMSU() {
		
		TestReporter.assertTrue(wbeStandardLaptopNAMSU.existsInFrame(),"'Standard Laptop' Item is displayed");
		TestReporter.assertEquals(wbeStandardLaptopNAMSU.getText(), "MarketSource Standard Laptop", "Standard laptop title Validated:"+wbeStandardLaptopNAMSU.getText());
		TestReporter.assertTrue(wbeStandardLaptopLabelNAMSU.existsInFrame(),"'MarketSource Standard laptop computer' Label is displayed");
		TestReporter.assertEquals(wbeStandardLaptopLabelNAMSU.getText(), "MarketSource standard laptop computer", "Standard laptop computer label Validated:"+wbeStandardLaptopLabelNAMSU.getText());
	}
	
	/**
	 * verify the OnBoard Employee Travel laptop  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void travelLaptopItem() {
		
		TestReporter.assertTrue(wbeTravelLaptop.existsInFrame(),"'Travel Laptop' Item is displayed");
		TestReporter.assertEquals(wbeTravelLaptop.getText(), "Travel Laptop", "Travel Desktop title Validated:"+wbeTravelLaptop.getText());
		TestReporter.assertTrue(wbeTravelLaptopLabel.existsInFrame(),"'Travel laptop computer' Label is displayed");
		TestReporter.assertEquals(wbeTravelLaptopLabel.getText(), "Travel laptop computer", "Travel laptop computer label Validated:"+wbeTravelLaptopLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee Travel laptop  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void travelLaptopItemNAMSU() {
		
		TestReporter.assertTrue(wbeTravelLaptopNAMSU.existsInFrame(),"'MarketSource Travel Laptop' Item is displayed");
		TestReporter.assertEquals(wbeTravelLaptopNAMSU.getText(), "MarketSource Travel Laptop", "Travel Desktop title Validated:"+wbeTravelLaptopNAMSU.getText());
		TestReporter.assertTrue(wbeTravelLaptopLabelNAMSU.existsInFrame(),"'MarketSource Travel Laptop' Label is displayed");
		TestReporter.assertEquals(wbeTravelLaptopLabelNAMSU.getText(), "MarketSource travel laptop computer", "Travel laptop computer label Validated:"+wbeTravelLaptopLabelNAMSU.getText());
	}
	
	
	/**
	 * verify the OnBoard Employee standard monitor  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void monitorItem() {
		
		TestReporter.assertTrue(wbeMonitor.existsInFrame(),"'Monitor' Item is displayed");
		TestReporter.assertEquals(wbeMonitor.getText(), "External Monitor", "Monitor title Validated:"+wbeMonitor.getText());
		TestReporter.assertTrue(wbeMonitorLabel.existsInFrame(),"'Monitor label' Label is displayed");
		TestReporter.assertEquals(wbeMonitorLabel.getText(), "External computer monitor", "Monitor label Validated:"+wbeMonitorLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee Non Standard Computer item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void nonStandardComputerItem() {
		
		TestReporter.assertTrue(wbeNonStandardComputer.existsInFrame(),"'Non-Standard Computer' Item is displayed");
		TestReporter.assertEquals(wbeNonStandardComputer.getText(), "Non-Standard Computer", "Non-Standard Computer title Validated:"+wbeNonStandardComputer.getText());
		TestReporter.assertTrue(wbeNonStandardComputerLabel.existsInFrame(),"'Non-standard computer' Label is displayed");
		TestReporter.assertEquals(wbeNonStandardComputerLabel.getText(), "Non-standard computer", "Non-standard computer label Validated:"+wbeNonStandardComputerLabel.getText());
	}

	/**
	 * verify the OnBoard Employee standard desk phone item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void deskPhone() {
		
		TestReporter.assertTrue(wbeDeskPhone.existsInFrame(),"'Desk Phone' Item is displayed");
		TestReporter.assertEquals(wbeDeskPhone.getText(), "Desk Phone", "Desk Phone title Validated:"+wbeDeskPhone.getText());
		TestReporter.assertTrue(wbeDeskPhoneLabel.existsInFrame(),"'Desk phone' Label is displayed");
		TestReporter.assertEquals(wbeDeskPhoneLabel.getText(), "Desk phone with extension", "Desk Phone label Validated:"+wbeDeskPhoneLabel.getText());
	}
		
	/**
	 * verify the OnBoard Employee standard wired headset item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void wiredHeadSetItem() {
		
		TestReporter.assertTrue(wbeWiredHeadSet.existsInFrame(),"'Wired HeadSet' Item is displayed");
		TestReporter.assertEquals(wbeWiredHeadSet.getText(), "Wired Headset", "Wired HeadSet title Validated:"+wbeWiredHeadSet.getText());
		TestReporter.assertTrue(wbeWiredHeadSetLabel.existsInFrame(),"'Wired HeadSet' Label is displayed");
		TestReporter.assertEquals(wbeWiredHeadSetLabel.getText(), "Wired headset for phone or PC", "Wired HeadSet label Validated:"+wbeWiredHeadSetLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee standard wireless headset item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void wirelessHeadSetItem() {
		
		TestReporter.assertTrue(wbeWirelessHeadSet.existsInFrame(),"'Wireless HeadSet' Item is displayed");
		TestReporter.assertEquals(wbeWirelessHeadSet.getText(), "Wireless Headset", "Wireless HeadSet title Validated:"+wbeWirelessHeadSet.getText());
		TestReporter.assertTrue(wbeWirelessHeadSetLabel.existsInFrame(),"'Wireless HeadSet' Label is displayed");
		TestReporter.assertEquals(wbeWirelessHeadSetLabel.getText(), "Wireless headset for phone or PC", "Wireless HeadSet label Validated:"+wbeWirelessHeadSetLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee standard USB Head item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void usbHeadSetItem() {
		
		TestReporter.assertTrue(wbeUSBHeadset.existsInFrame(),"'USB Headset' Item is displayed");
		TestReporter.assertEquals(wbeUSBHeadset.getText(), "USB Headset", "USB Headset title Validated:"+wbeUSBHeadset.getText());
		TestReporter.assertTrue(wbeUSBHeadsetLabel.existsInFrame(),"'USB headset' Label is displayed");
		TestReporter.assertEquals(wbeUSBHeadsetLabel.getText(), "USB headset", "USB headset label Validated:"+wbeUSBHeadsetLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee new Extension  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void newExtensionItem() {
		
		TestReporter.assertTrue(wbeNewExtension.existsInFrame(),"'New Extension' Item is displayed");
		TestReporter.assertEquals(wbeNewExtension.getText(), "New Extension", "New Extension title Validated:"+wbeNewExtension.getText());
		TestReporter.assertTrue(wbeNewExtensionLabel.existsInFrame(),"'New extension' Label is displayed");
		TestReporter.assertEquals(wbeNewExtensionLabel.getText(), "New desk phone extension", "New extension label Validated:"+wbeNewExtensionLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee reassign Extension item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void reassignExtensionItem() {
		
		TestReporter.assertTrue(wbeReassignExtension.existsInFrame(),"'Reassign Extension' Item is displayed");
		TestReporter.assertEquals(wbeReassignExtension.getText(), "Reassign Extension", "Reassign Extension title Validated:"+wbeReassignExtension.getText());
		TestReporter.assertTrue(wbeReassignExtensionLabel.existsInFrame(),"'Reassign extension' Label is displayed");
		TestReporter.assertEquals(wbeReassignExtensionLabel.getText(), "Reassigned desk phone extension", "Reassign extension label Validated:"+wbeReassignExtensionLabel.getText());		
	}
		
	/**
	 * verify the OnBoard Employee Mobile Phone  item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void mobilePhoneItem() {
		
		TestReporter.assertTrue(wbeMobilePhoneItem.existsInFrame(),"'Mobile Phone' Item is displayed");
		TestReporter.assertEquals(wbeMobilePhoneItem.getText(), "Mobile Phone", "Mobile Phone title Validated:"+wbeMobilePhoneItem.getText());
		TestReporter.assertTrue(wbeMobilePhoneItemLabel.existsInFrame(),"'Mobile phone' Label is displayed");
		TestReporter.assertEquals(wbeMobilePhoneItemLabel.getText(), "Mobile smart phone", "Mobile Phone label Validated:"+wbeMobilePhoneItemLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee EchoSign Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void echoSignAccessItem() {
			
		TestReporter.assertTrue(wbeEchoSignAccess.existsInFrame(),"'EchoSign' Item is displayed");
		TestReporter.assertEquals(wbeEchoSignAccess.getText(), "EchoSign", "EchoSign title Validated:"+wbeEchoSignAccess.getText());
		TestReporter.assertTrue(wbeEchoSignAccessLabel.existsInFrame(),"'EchoSign application' Label is displayed");
		TestReporter.assertEquals(wbeEchoSignAccessLabel.getText(), "Request access for a company application", "EchoSign label Validated:"+wbeEchoSignAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee MaxHire Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void maxHireAccessItem() {
		
		TestReporter.assertTrue(wbeMaxHireAccess.existsInFrame(),"'MaxHire Access' Item is displayed");
		TestReporter.assertEquals(wbeMaxHireAccess.getText(), "MaxHire", "MaxHire Access title Validated:"+wbeMaxHireAccess.getText());
		TestReporter.assertTrue(wbeMaxHireAccessLabel.existsInFrame(),"'MaxHire application access' Label is displayed");
		TestReporter.assertEquals(wbeMaxHireAccessLabel.getText(), "MaxHire application access", "MaxHire Access label Validated:"+wbeMaxHireAccessLabel.getText());		
	}
		
	/**
	 * verify the OnBoard Employee OnBase Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBaseAccessItem() {
		
		TestReporter.assertTrue(wbeOnBaseAccess.existsInFrame(),"'OnBase Access' Item is displayed");
		TestReporter.assertEquals(wbeOnBaseAccess.getText(), "OnBase", "OnBase Access title Validated:"+wbeOnBaseAccess.getText());
		TestReporter.assertTrue(wbeOnBaseAccessLabel.existsInFrame(),"'OnBase application ' Label is displayed");
		TestReporter.assertEquals(wbeOnBaseAccessLabel.getText(), "Request access to an enterprise application", "OnBase Access label Validated:"+wbeOnBaseAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee people soft FS  Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void peopleSoftFSAccessItem() {
		
		TestReporter.assertTrue(wbePeopleSoftFSAccess.existsInFrame(),"'PeopleSoft FS' Item is displayed");
		TestReporter.assertEquals(wbePeopleSoftFSAccess.getText(), "PeopleSoft FS", "PeopleSoft FS title Validated:"+wbePeopleSoftFSAccess.getText());
		TestReporter.assertTrue(wbePeopleSoftFSAccessLabel.existsInFrame(),"'PeopleSoft FS application ' Label is displayed");
		TestReporter.assertEquals(wbePeopleSoftFSAccessLabel.getText(), "Request access to an enterprise application", "PeopleSoft FS application label Validated:"+wbePeopleSoftFSAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee people soft HR Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void peopleSoftHRAccessItem() {
		
		TestReporter.assertTrue(wbePeopleSoftHRAccess.existsInFrame(),"'PeopleSoft HR' Item is displayed");
		TestReporter.assertEquals(wbePeopleSoftHRAccess.getText(), "PeopleSoft HR", "PeopleSoft HR  title Validated:"+wbePeopleSoftHRAccess.getText());
		TestReporter.assertTrue(wbePeopleSoftHRAccessLabel.existsInFrame(),"PeopleSoft HR Label is displayed");
		TestReporter.assertEquals(wbePeopleSoftHRAccessLabel.getText(), "Request access to an enterprise application", "PeopleSoft HR label Validated:"+wbePeopleSoftHRAccessLabel.getText());	
	}
	
	/**
	 * verify the OnBoard Employee people soft nVision Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void peopleSoftnVisionAccessItem() {
		
		TestReporter.assertTrue(wbePeopleSoftNVAccess.existsInFrame(),"'PeopleSoft nVision' Item is displayed");
		TestReporter.assertEquals(wbePeopleSoftNVAccess.getText(), "PeopleSoft nVision", "PeopleSoft nVision title Validated:"+wbePeopleSoftNVAccess.getText());
		TestReporter.assertTrue(wbePeopleSoftNVAccessLabel.existsInFrame(),"'PeopleSoft nVision application' Label is displayed");
		TestReporter.assertEquals(wbePeopleSoftNVAccessLabel.getText(), "Request access to an enterprise application", "PeopleSoft nVision application label Validated:"+wbePeopleSoftNVAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee people soft Oasis Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void peopleSoftOasisAccessItem() {
		
		TestReporter.assertTrue(wbePeopleSoftOAccess.existsInFrame(),"'PeopleSoft Oasis' Item is displayed");
		TestReporter.assertEquals(wbePeopleSoftOAccess.getText(), "PeopleSoft Oasis", "PeopleSoft Oasis title Validated:"+wbePeopleSoftOAccess.getText());
		TestReporter.assertTrue(wbePeopleSoftOAccessLabel.existsInFrame(),"'PeopleSoft Oasis application ' Label is displayed");
		TestReporter.assertEquals(wbePeopleSoftOAccessLabel.getText(), "Request access to an enterprise application", "PeopleSoft Oasis application label Validated:"+wbePeopleSoftOAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee Smart ERP Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void onboardingAutomationAccessItem() {
		
		TestReporter.assertTrue(wbeOnboardingAutomationAccess.existsInFrame(),"Onboarding Automation Item is displayed");
		TestReporter.assertEquals(wbeOnboardingAutomationAccess.getText(), "Onboarding Automation", "Onboarding Automation Acess title Validated:"+wbeOnboardingAutomationAccess.getText());
		TestReporter.assertTrue(wbeOnboardingAutomationAccessLabel.existsInFrame(),"Onboarding Automation Label is displayed");
		TestReporter.assertEquals(wbeOnboardingAutomationAccessLabel.getText(), "Onboarding Automation application access", "Onboarding Automation label Validated:"+wbeOnboardingAutomationAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee Time and Expense Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void timeAndExpenseAccessItem() {
		
		TestReporter.assertTrue(wbeTimeExpenseAccess.existsInFrame(),"'Time and Expense' Item is displayed");
		TestReporter.assertEquals(wbeTimeExpenseAccess.getText(), "Time and Expense", "Time and Expense title Validated:"+wbeTimeExpenseAccess.getText());
		TestReporter.assertTrue(wbeTimeExpenseAccessLabel.existsInFrame(),"'Time Expense' Label is displayed");
		TestReporter.assertEquals(wbeTimeExpenseAccessLabel.getText(), "Time and Expense application access", "Time Expense label Validated:"+wbeTimeExpenseAccessLabel.getText());		
	}

	/**
	 * verify the OnBoard Employee Time and Expense Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void timeCentralAccessItem() {
		
		TestReporter.assertTrue(wbeTimeCentralAccess.existsInFrame(),"'Time Central' Item is displayed");
		TestReporter.assertEquals(wbeTimeCentralAccess.getText(), "Time Central", "Time Central title Validated:"+wbeTimeCentralAccess.getText());
		TestReporter.assertTrue(wbeTimeCentralAccessLabel.existsInFrame(),"'Time Central application access' Label is displayed");
		TestReporter.assertEquals(wbeTimeCentralAccessLabel.getText(), "Time Central application access", "Time Central application access label Validated:"+wbeTimeCentralAccessLabel.getText());		

	}
	
	/**
	 * verify the OnBoard Employee WSSRD Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void wssrdAccessItem() {
		
		TestReporter.assertTrue(wbeWSSRDAccess.existsInFrame(),"'WSSRD' Item is displayed");
		TestReporter.assertEquals(wbeWSSRDAccess.getText(), "WSSRD", "Time Central  title Validated:"+wbeWSSRDAccess.getText());
		TestReporter.assertTrue(wbeWSSRDAccessLabel.existsInFrame(),"'WSSRD application' Label is displayed");
		TestReporter.assertEquals(wbeWSSRDAccessLabel.getText(), "Request access for a company application", "WSSRD application label Validated:"+wbeWSSRDAccessLabel.getText());		
	}
	
	/**
	 * verify the OnBoard Employee WSSRD Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void sDriveAccessItem() {
		
		TestReporter.assertTrue(wbeSDriveAccess.existsInFrame(),"'SDrive' Item is displayed");
		TestReporter.assertEquals(wbeSDriveAccess.getText(), "S Drive", "SDrive Access title Validated:"+wbeSDriveAccess.getText());
		TestReporter.assertTrue(wbeSDriveAccessLabel.existsInFrame(),"'SDrive application access' Label is displayed");
		TestReporter.assertEquals(wbeSDriveAccessLabel.getText(), "Request read/write access for S Drive folders", "SDrive application access label Validated:"+wbeSDriveAccessLabel.getText());		
	}
	
	
	/**
	 * verify the OnBoard Employee VDI Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void vdiAccessItem() {
		TestReporter.assertTrue(wbeVDIAccess.existsInFrame(),"'VDI' Item is displayed");
		TestReporter.assertEquals(wbeVDIAccess.getText(), "VDI", "VDI  title Validated:"+wbeVDIAccess.getText());
		TestReporter.assertTrue(wbeVDIAccessLabel.existsInFrame(),"VDI  Label is displayed");
		TestReporter.assertEquals(wbeVDIAccessLabel.getText(), "Request access to a Virtual Dekstop Infrastructure", "VDI Access label Validated:"+wbeVDIAccessLabel.getText());
	}
	
	
	/**
	 * verify the OnBoard Employee Salesforce Access item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void salesForceAccessItem() {
		TestReporter.assertTrue(wbeSalesForceAccess.existsInFrame(),"Salesforce Item is displayed");
		TestReporter.assertEquals(wbeSalesForceAccess.getText(), "Salesforce", "Salesforce  title Validated:"+wbeSalesForceAccess.getText());
		TestReporter.assertTrue(wbeSalesForceAccessLabel.existsInFrame(),"Salesforce Label is displayed");
		TestReporter.assertEquals(wbeSalesForceAccessLabel.getText(), "Request access to Salesforce", "Salesforce  label Validated:"+wbeSalesForceAccessLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee Web Focus BI item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void webFocusBIItem() {
		TestReporter.assertTrue(wbeWebFocusBI.existsInFrame(),"Web Focus BI Item is displayed");
		TestReporter.assertEquals(wbeWebFocusBI.getText(), "Web Focus BI", "Salesforce Access title Validated:"+wbeWebFocusBI.getText());
		TestReporter.assertTrue(wbeWebFocusBILabel.existsInFrame(),"Web Focus BI Label is displayed");
		TestReporter.assertEquals(wbeWebFocusBILabel.getText(), "Request access for an enterprise application", "Web Focus BI  label Validated:"+wbeWebFocusBILabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee Global Delivery Portal item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void GlobalDeliveryPortalItem() {
		TestReporter.assertTrue(wbeGlobalDeliveryPortal.existsInFrame(),"Global Delivery Portal Item is displayed");
		TestReporter.assertEquals(wbeGlobalDeliveryPortal.getText(), "Global Delivery Portal", "title Validated:"+wbeGlobalDeliveryPortal.getText());
		TestReporter.assertTrue(wbeGlobalDeliveryPortalLabel.existsInFrame(),"GDP website access Label is displayed");
		TestReporter.assertEquals(wbeGlobalDeliveryPortalLabel.getText(), "Request access for GDP website", "label Validated:"+wbeGlobalDeliveryPortalLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee Hyperion item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void hyperionItem() {
		TestReporter.assertTrue(wbeHyperion.existsInFrame(),"Hyperion Item is displayed");
		TestReporter.assertEquals(wbeHyperion.getText(), "Hyperion", "Hyperion  title Validated:"+wbeHyperion.getText());
		TestReporter.assertTrue(wbeHyperionLabel.existsInFrame(),"Hyperion Label is displayed");
		TestReporter.assertEquals(wbeHyperionLabel.getText(), "Request access for an enterprise application", "Hyperion label Validated:"+wbeHyperionLabel.getText());
	}
	
	/**
	 * verify the OnBoard Employee Hyperion item area
	 * 
	 * @param None.
	 * @return None
	 */
	public void contractLogixAccessItem() {
		TestReporter.assertTrue(wbeContractLogixAccess.existsInFrame(),"Contract Logix Item is displayed");
		TestReporter.assertEquals(wbeContractLogixAccess.getText(), "Contract Logix", "Contract Logix Access title Validated:"+wbeContractLogixAccess.getText());
		TestReporter.assertTrue(wbeContractLogixAccessLabel.existsInFrame(),"Contract Logix Label is displayed");
		TestReporter.assertEquals(wbeContractLogixAccessLabel.getText().trim(), "Request access to an enterprise application", "Contract Logix application label Validated:"+wbeContractLogixAccessLabel.getText());
	}



	/**
	 * verify the Onboard Employee Choose Option -User Account Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void userAccountValidation() throws IOException {
		FetchData userAccount= new FetchData();
		TestReporter.logStep("Verify User Account Item");
		wbeUserAccount.clickOnSync();
		wbeUserAccountLabelDesc1.syncVisible(10);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.assertTrue(wbeUserAccountLabelDesc1.existsInFrame(),"User account Description1 is displayed");
		TestReporter.log(wbeUserAccountLabelDesc1.getText());
		TestReporter.log(userAccount.text("UserAccountDescription1"));
		TestReporter.assertEquals(wbeUserAccountLabelDesc1.getText()
				,userAccount.text("UserAccountDescription1"), "User Account Description1 is validated:"+wbeUserAccountLabelDesc1.getText());
		wbeUserAccountLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbeUserAccountLabelDesc2.existsInFrame(),"User account Description2 is displayed");
		TestReporter.log(wbeUserAccountLabelDesc2.getText());
		TestReporter.log(userAccount.text("UserAccountDescription2"));
		TestReporter.assertEquals(wbeUserAccountLabelDesc2.getText()
				,userAccount.text("UserAccountDescription2"), "User Account Description2 is validated:"+wbeUserAccountLabelDesc2.getText());
		wbeUserAccountLabelDesc3.syncVisible(10);
		TestReporter.assertTrue(wbeUserAccountLabelDesc3.existsInFrame(),"User account Description3 is displayed");
		TestReporter.log(wbeUserAccountLabelDesc3.getText());
		TestReporter.log(userAccount.text("UserAccountDescription3"));
		TestReporter.assertEquals(wbeUserAccountLabelDesc3.getText()
				,userAccount.text("UserAccountDescription3"), "User Account Description3 is validated:"+wbeUserAccountLabelDesc3.getText());
		wbeUserAccountLabelDesc4.syncVisible(10);
		TestReporter.assertTrue(wbeUserAccountLabelDesc4.existsInFrame(),"User account Description4 is displayed");
		TestReporter.log(wbeUserAccountLabelDesc4.getText());
		TestReporter.log(userAccount.text("UserAccountDescription4"));
		TestReporter.assertEquals(wbeUserAccountLabelDesc4.getText()
				,userAccount.text("UserAccountDescription4"), "User Account Description3 is validated:"+wbeUserAccountLabelDesc4.getText());	
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Printer access Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void printerAccessValidationEMEA() throws IOException {
		FetchData printerAccess= new FetchData();
		TestReporter.logStep("Verify Printer Access Item");
		wbePrinterAccess.clickOnSync();
		// Description validation commented as of now. Need discussion
/*		wbePrinterAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbePrinterAccessLabelDesc1.existsInFrame(),"PrinterAccess Description is displayed");
		TestReporter.log(wbePrinterAccessLabelDesc1.getText());
		TestReporter.log(printerAccess.text("PrinterAccessDescription"));
		TestReporter.assertEquals(wbePrinterAccessLabelDesc1.getText()
				,printerAccess.text("PrinterAccessDescription"), "PrinterAccess Description1 is validated:"+wbePrinterAccessLabelDesc1.getText());*/
	}
	
	
	/**
	 * verify the Onboard Employee Choose Option -Disable AD account  Validation
	 * 
	 * @param badge.
	 * 				Mandatory drop down box badge type
	 * 
	 * 
	 * @return None.
	 * @throws IOException 
	 */
	public void disableADAccountValidation(String fullName, String employeeID, String emailAddress) throws IOException {
		
		wbeDisableADAccount.clickOnSync();
		TestReporter.logStep("Verify Employee full name is a mandatory field");
		TestReporter.assertTrue(wbeDisableADAccountEmployeeName.existsInFrame(),"Employee full name field is a mandatory field");
		TestReporter.logStep("Select Employee full name  as " + fullName);
		txtDisableADAccountEmployeeName.jsClick();
		txtDisableADAccountEmployeeName.set(fullName);
		txtDisableADAccountEmployeeName.sendKeys(Keys.ENTER);
		txtDisableADAccountEmployeeName.syncVisible(20);
		TestReporter.log(txtDisableADAccountEmployeeName.getText());
		TestReporter.assertTrue(txtDisableADAccountEmployeeName.getText().contains(fullName)
				,"Selected value: " + fullName + " is displayed in Employee full name field");
		
		TestReporter.logStep("Verify Employee ID is a mandatory field");
		TestReporter.assertTrue(wbeDisableADAccountEmployeeId.existsInFrame(),"Employee ID field is a mandatory field");
		TestReporter.logStep("Select Employee ID  as " + employeeID);
		txtDisableADAccountEmployeeId.jsClick();
		txtDisableADAccountEmployeeId.set(employeeID);
		txtDisableADAccountEmployeeId.sendKeys(Keys.ENTER);
		txtDisableADAccountEmployeeId.syncVisible(20);
		TestReporter.log(txtDisableADAccountEmployeeId.getText());
		TestReporter.assertTrue(txtDisableADAccountEmployeeId.getText().contains(employeeID)
				,"Selected value: " + employeeID + " is displayed in Employee ID field");
		
		TestReporter.logStep("Verify Employee .net email Address is a mandatory field");
		TestReporter.assertTrue(wbeDisableADAccountEmailAddress.existsInFrame(),"Employee .net email Address  is a mandatory field");
		TestReporter.logStep("Select Employee .net email Address  as " + emailAddress);
		txtDisableADAccountEmailAddress.jsClick();
		txtDisableADAccountEmailAddress.set(emailAddress);
		txtDisableADAccountEmailAddress.sendKeys(Keys.ENTER);
		txtDisableADAccountEmailAddress.syncVisible(20);
		TestReporter.log(txtDisableADAccountEmailAddress.getText());
		TestReporter.assertTrue(txtDisableADAccountEmailAddress.getText().contains(emailAddress)
				,"Selected value: " + emailAddress + " is displayed in Employee .net email Address field");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Default Email Domain
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void defaultEmailDomainValidation(String emailDomainContent) throws IOException {
		TestReporter.logStep("Verify Default Email Domain Item");
		wbeDefaultEmailDomain.clickOnSync();
		TestReporter.assertTrue(wbeDefaultEmailDomainContentMandatory.existsInFrame(),"Default email domain content is a mandatory field");
		TestReporter.assertTrue(txtDefaultEmailDomainContent.existsInFrame(),"Default email domain content field is displayed");
		txtDefaultEmailDomainContent.syncInFrame();
		txtDefaultEmailDomainContent.set(emailDomainContent);
		TestReporter.assertEquals(txtDefaultEmailDomainContent.getText()
				,emailDomainContent, "Default Email Domain Field is validated  :"+txtDefaultEmailDomainContent.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Additional Items
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void additionalItemsValidation(String addItemsContent) throws IOException {
		TestReporter.logStep("Verify Additional Items Item");
		wbeAdditionalItems.clickOnSync();
		TestReporter.assertTrue(wbeAdditionalItemsContentMandatory.existsInFrame()," Additional Items content is a mandatory field");
		TestReporter.assertTrue(txtAdditionalItemsContent.existsInFrame()," Additional Items content field is displayed");
		txtAdditionalItemsContent.syncInFrame();
		txtAdditionalItemsContent.set(addItemsContent);
		TestReporter.assertEquals(txtAdditionalItemsContent.getText()
				,addItemsContent, " Additional Items Field is validated  :"+txtAdditionalItemsContent.getText());
	}

	/**
	 * method to verify required softwares for computer
	 *  
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void computerSoftwareVerification() {
		TestReporter.assertTrue(wbeRequiredSoftware.existsInFrame(), "Required Software label is displayed");
		TestReporter.assertTrue(txtRequiredSoftware.existsInFrame(), "Required Software field is displayed");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Standard Desktop Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void standardDesktopValidation(String opCo) throws IOException {
	
		FetchData standardDesktop= new FetchData();
		TestReporter.logStep("Verify Standard Desktop Item");
		if (opCo.contentEquals("MSU")) {
		wbeStandardDesktopNAMSU.clickOnSync();}
		else {
			wbeStandardDesktop.clickOnSync();}
		wbeStandardDesktopLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeStandardDesktopLabelDesc1.existsInFrame(),"Standard Desktop Description is displayed");
		TestReporter.log(wbeStandardDesktopLabelDesc1.getText());
		TestReporter.log(standardDesktop.text("StandardDesktopDescription1"));
		TestReporter.assertEquals(wbeStandardDesktopLabelDesc1.getText()
				,standardDesktop.text("StandardDesktopDescription1"), "Standard Desktop Description1 is validated:"+wbeStandardDesktopLabelDesc1.getText());

		List<String> accessories=new ArrayList<>();
		accessories.add(0, standardDesktop.text("StandardDesktopOptionDescription1"));
		accessories.add(1, standardDesktop.text("StandardDesktopOptionDescription2"));
		accessories.add(2, standardDesktop.text("StandardDesktopOptionDescription3"));
		accessories.add(3, standardDesktop.text("StandardDesktopOptionDescription4"));
		accessories.add(4, standardDesktop.text("StandardDesktopOptionDescription5"));
		List<Element> myText1=driver.findElements(By.xpath("//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul[1]/li"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(accessories.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), accessories.get(i), "Text verified -"+myText1.get(i).getText());	
			}	
		computerSoftwareVerification();
	}
	
	/**
	 * verify the Onboard Employee Choose Option -TEK BOA Desktop Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void tekBOADesktopValidation() throws IOException {
		
		FetchData tekBOADesktop= new FetchData();
		TestReporter.logStep("Verify TEK BOA Desktop Item");
		wbeTekBOADesktop.clickOnSync();
		wbeTekBOADesktopLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeTekBOADesktopLabelDesc1.existsInFrame(),"tek BOA Desktop Description is displayed");
		TestReporter.log(wbeTekBOADesktopLabelDesc1.getText());
		TestReporter.log(tekBOADesktop.text("StandardDesktopDescription1"));
		TestReporter.assertEquals(wbeTekBOADesktopLabelDesc1.getText()
				,tekBOADesktop.text("StandardDesktopDescription1"), "tek BOA Desktop Description1 is validated:"+wbeTekBOADesktopLabelDesc1.getText());

		List<String> accessories=new ArrayList<>();
		accessories.add(0, tekBOADesktop.text("StandardDesktopOptionDescription1"));
		accessories.add(1, tekBOADesktop.text("StandardDesktopOptionDescription2"));
		accessories.add(2, tekBOADesktop.text("StandardDesktopOptionDescription3"));
		accessories.add(3, tekBOADesktop.text("StandardDesktopOptionDescription4"));
		accessories.add(4, tekBOADesktop.text("StandardDesktopOptionDescription5"));
		List<Element> myText1=driver.findElements(By.xpath("//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul[1]/li"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(accessories.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), accessories.get(i), "Text verified -"+myText1.get(i).getText());	
			}				
		TestReporter.assertEquals(wbeTEKRequiredSoftwareECopy.getText(), "eCopy", "Required Software eCopy displayed as expected:"+wbeTEKRequiredSoftwareECopy.getText());
		TestReporter.assertEquals(wbeTEKRequiredSoftwareScanSoft.getText(), "ScanSoft", "Required Software ScanSoft displayed as expected:"+wbeTEKRequiredSoftwareScanSoft.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Standard Laptop Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void standardLaptopValidation(String opCo) throws IOException {
		FetchData standardLaptop= new FetchData();
		TestReporter.logStep("Verify Standard Laptop Item");
		if (opCo.contentEquals("MSU")) {
			wbeStandardLaptopNAMSU.clickOnSync();}
		else {
			wbeStandardLaptop.clickOnSync();}

		wbeStandardLaptopLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeStandardLaptopLabelDesc1.existsInFrame(),"Standard laptop Description is displayed");
		TestReporter.log(wbeStandardLaptopLabelDesc1.getText());
		TestReporter.log(standardLaptop.text("StandardLaptopDescription1"));
		TestReporter.assertEquals(wbeStandardLaptopLabelDesc1.getText()
				,standardLaptop.text("StandardLaptopDescription1"), "Standard laptop Description1 is validated:"+wbeStandardLaptopLabelDesc1.getText());
		
		List<String> accessories=new ArrayList<>();
		accessories.add(0, standardLaptop.text("StandardLaptopOptionDescription1"));
		accessories.add(1, standardLaptop.text("StandardLaptopOptionDescription2"));
		accessories.add(2, standardLaptop.text("StandardLaptopOptionDescription3"));
		accessories.add(3, standardLaptop.text("StandardLaptopOptionDescription4"));
		accessories.add(4, standardLaptop.text("StandardLaptopOptionDescription5"));
		accessories.add(5, standardLaptop.text("StandardLaptopOptionDescription6"));
		List<Element> myText1=driver.findElements(By.xpath("//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p[contains(text(),'Standard')]/ancestor::node()[1]/ul[1]/li"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(accessories.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), accessories.get(i), "Text verified -"+myText1.get(i).getText());	
			}	
		computerSoftwareVerification();
	}
	
	/**
	 * verify the Onboard Employee Choose Option -travel Laptop Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void travelLaptopValidation(String opCo) throws IOException {
	
		FetchData travelLaptop= new FetchData();
		TestReporter.logStep("Verify Travel Laptop Item");
		if (opCo.contentEquals("MSU")) {
			wbeTravelLaptopNAMSU.clickOnSync();}
		else {
			wbeTravelLaptop.clickOnSync();}
		wbeTravelLaptopLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeTravelLaptopLabelDesc1.existsInFrame(),"Travel laptop Description is displayed");
		TestReporter.log(wbeTravelLaptopLabelDesc1.getText());
		TestReporter.log(travelLaptop.text("TravelLaptopDescription1"));
		TestReporter.assertEquals(wbeTravelLaptopLabelDesc1.getText()
				,travelLaptop.text("TravelLaptopDescription1"), "Travel laptop Description1 is validated:"+wbeTravelLaptopLabelDesc1.getText());

		List<String> accessories=new ArrayList<>();
		accessories.add(0, travelLaptop.text("TravelLaptopOptionDescription1"));
		accessories.add(1, travelLaptop.text("TravelLaptopOptionDescription2"));
		accessories.add(2, travelLaptop.text("TravelLaptopOptionDescription3"));
		accessories.add(3, travelLaptop.text("TravelLaptopOptionDescription4"));
		accessories.add(4, travelLaptop.text("TravelLaptopOptionDescription5"));
		accessories.add(5, travelLaptop.text("TravelLaptopOptionDescription6"));
		List<Element> myText1=driver.findElements(By.xpath("//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul[1]/li"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(accessories.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), accessories.get(i), "Text verified -"+myText1.get(i).getText());	
			}	
		computerSoftwareVerification();
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Non Standard Computer Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void nonStandardComputerValidation(String requirements, String justification) throws IOException {
		FetchData nonStandardComputer= new FetchData();
		TestReporter.logStep("Verify Non- Standard Computer Item");
		wbeNonStandardComputer.clickOnSync();
		wbeNonStandardComputerLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeNonStandardComputerLabelDesc1.existsInFrame(),"Non- Standard Computer Description is displayed");
		List<String> nonStandardDesc=new ArrayList<>();
		nonStandardDesc.add(0, nonStandardComputer.text("NonStandardComputerDescription1"));
		nonStandardDesc.add(1, nonStandardComputer.text("NonStandardComputerDescription2"));
		nonStandardDesc.add(2, nonStandardComputer.text("NonStandardComputerDescription3"));
		List<Element> myText1=driver.findElements(By.xpath("//span[@class='break-word ng-binding'][contains(text(),'Non-Standard Computer')]/ancestor::node()[6]/following-sibling::div//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(nonStandardDesc.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), nonStandardDesc.get(i), "Text verified -"+myText1.get(i).getText());	
			}
		
		TestReporter.logStep("Verify Requirements field is a mandatory field");
		TestReporter.assertTrue(wbeNonStandardRequirements.existsInFrame(),"Requirements field is a mandatory field");
		TestReporter.logStep("Entering Requirements");
		txtNonStandardRequirements.syncInFrame();
		txtNonStandardRequirements.set(requirements);
		TestReporter.assertTrue(txtNonStandardRequirements.getText().contains(requirements),"Completed Entering Requirements text area");
		
		TestReporter.logStep("Verify Justification field is a mandatory field");
		TestReporter.assertTrue(wbeNonStandardJustification.existsInFrame(),"Justification field is a mandatory field");
		TestReporter.logStep("Entering Justification");
		txtNonStandardJustification.syncInFrame();
		txtNonStandardJustification.set(justification);
		TestReporter.assertTrue(txtNonStandardJustification.getText().contains(justification),"Completed Entering Justification text area");
	}
	
	/**
	 * select required software
	 * 
	 * @param None
	 * @return None
	 */
	public void selectRequiredSoftware() {
		txtRequiredSoftware.click();
		String lastOption=requiredSoftware[requiredSoftware.length-1];	
		for (String options:requiredSoftware)
		{
			driver.findElement(By.xpath(".//*[@id='select2-drop']//ul/li/div[contains(text(),'"+options+"')]")).click();
			WaitAllegis.hardWait(MIN_TIMEOUT);
			if(options.equals(lastOption)) {
				break;
			}
			txtRequiredSoftware.click();
		}	
		txtRequiredSoftware.scrollIntoView();
		List<Element> values=driver.findElements(By.xpath("//ul[@class='select2-choices']/li/div"));
		int requiredSoftwaresCount=values.size();
		TestReporter.assertEquals(requiredSoftwaresCount, requiredSoftware.length, "required Software options Display verification");
		for(int i=0;i<values.size();i++) {
			TestReporter.logStep(values.get(i).getText());
			TestReporter.logStep(requiredSoftware[i]);
				TestReporter.assertEquals(values.get(i).getText(), requiredSoftware[i], "Drop down values for Field verified -"+values.get(i).getText());		
		}
		
	}
	
	//EMEA Validations:
	/**
	 * verify the Onboard Employee Choose Option -Standard Desktop Validation
	 * 
	 * @param keyBoardLanguage,powerCable.
	 * 				Mandatory drop down box Keyboard langauge 
	 * 				Mandatory drop down box powercable	
	 * @return None
	 * @throws Exception 
	 */
	public void standardDesktopValidationEMEA(String keyBoardLanguage, String powerCable) throws Exception {
		
		FetchData standardDesktop= new FetchData();
		TestReporter.logStep("Verify Standard Desktop Item");
		wbeStandardDesktop.clickOnSync();
		wbeStandardDesktopLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeStandardDesktopLabelDesc1.existsInFrame(),"Standard Desktop Description is displayed");
		TestReporter.log(wbeStandardDesktopLabelDesc1.getText());
		TestReporter.log(standardDesktop.text("StandardDesktopDescription1"));
		TestReporter.assertEquals(wbeStandardDesktopLabelDesc1.getText()
				,standardDesktop.text("StandardDesktopDescription1"), "Standard Desktop Description1 is validated:"+wbeStandardDesktopLabelDesc1.getText());

		List<String> accessories=new ArrayList<>();
		accessories.add(0, standardDesktop.text("StandardDesktopOptionDescription1"));
		accessories.add(1, standardDesktop.text("StandardDesktopOptionDescription2"));
		accessories.add(2, standardDesktop.text("StandardDesktopOptionDescription3"));
		accessories.add(3, standardDesktop.text("StandardDesktopOptionDescription4"));
		accessories.add(4, standardDesktop.text("StandardDesktopOptionDescription5"));
		List<Element> myText1=driver.findElements(By.xpath("//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul[1]/li"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(accessories.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), accessories.get(i), "Text verified -"+myText1.get(i).getText());	
			}	
		
		TestReporter.logStep("Verify Standard Desktop Item");
		TestReporter.logStep("Verify Keyboard Language field is a mandatory field");
		TestReporter.assertTrue(wbeKeyboardLanguage.existsInFrame(),"keyBoard Language field is a mandatory field");
		TestReporter.logStep("Select KeyBoard Language as " + keyBoardLanguage);
		txtKeyboardLanguage.click();
		TestReporter.logStep("Verify Keyboard Language field DropDown options");
		dropdown(txtDropDown,keyBoardOptions,keyBoardOptions.length );
		txtKeyboardLanguage.syncInFrame();
		txtDropdownSearch.set(keyBoardLanguage);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtKeyboardLanguage.syncVisible(20);
		TestReporter.assertTrue(txtKeyboardLanguage.getAttribute("text").contains(keyBoardLanguage)
				,keyBoardLanguage + " is selected in Keyboard Language field");
		
		TestReporter.logStep("Verify Power Cable field is a mandatory field");
		TestReporter.assertTrue(wbePowerCable.existsInFrame(), "Power Cable field is a mandatory field");
		TestReporter.logStep("Select Power Cable as " + powerCable);
		txtPowerCable.click();
		TestReporter.logStep("Verify Power Cable field DropDown options");		
		dropdown(txtDropDown,powerCableOptions,powerCableOptions.length );
		txtPowerCable.syncInFrame();
		txtDropdownSearch.set(powerCable);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtPowerCable.syncVisible(20);
		TestReporter.assertTrue(txtPowerCable.getAttribute("text").contains(powerCable)
				,powerCable + " is selected in power cable field");
	}
	
	/**
	 * Verify the OnBoard Employee Candidate Tracker
	 * 
	 * @param None
	 * @return None
	 */
	public void candidateTrackerAccessItem() {
		TestReporter.assertTrue(wbeCandidateTrackerAccess.existsInFrame(),"Candidate Tracker Item is displayed");
		TestReporter.assertEquals(wbeCandidateTrackerAccess.getText(), "Candidate Tracker", "Candidate Tracker Access title Validated:"+wbeCandidateTrackerAccess.getText());
		TestReporter.assertTrue(wbeCandidateTrackerAccessLabel.existsInFrame(),"Candidate Tracker Label is displayed");
		TestReporter.assertEquals(wbeCandidateTrackerAccessLabel.getText().trim(), "Request access for tracking candidates", "Candidate Tracker application label Validated:"+wbeCandidateTrackerAccessLabel.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -standard Laptop Validation for EMEA
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void standardLaptopValidationEMEA(String keyBoardLanguage, String powerCable) throws IOException {
		FetchData standardLaptop= new FetchData();
		TestReporter.logStep("Verify Travel Laptop Item");
		wbeStandardLaptop.clickOnSync();
		wbeStandardLaptopLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeStandardLaptopLabelDesc1.existsInFrame(),"Standard laptop Description is displayed");
		TestReporter.log(wbeStandardLaptopLabelDesc1.getText());
		TestReporter.log(standardLaptop.text("StandardLaptopDescription1"));
		TestReporter.assertEquals(wbeStandardLaptopLabelDesc1.getText()
				,standardLaptop.text("StandardLaptopDescription1"), "Standard laptop Description1 is validated:"+wbeStandardLaptopLabelDesc1.getText());

		List<String> accessories=new ArrayList<>();
		accessories.add(0, standardLaptop.text("StandardLaptopOptionDescription1"));
		accessories.add(1, standardLaptop.text("StandardLaptopOptionDescription2"));
		accessories.add(2, standardLaptop.text("StandardLaptopOptionDescription3"));
		accessories.add(3, standardLaptop.text("StandardLaptopOptionDescription4"));
		accessories.add(4, standardLaptop.text("StandardLaptopOptionDescription5"));
		accessories.add(5, standardLaptop.text("StandardLaptopOptionDescription6"));
		List<Element> myText1=driver.findElements(By.xpath("//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul[1]/li"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(accessories.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), accessories.get(i), "Text verified -"+myText1.get(i).getText());	
			}		
			TestReporter.logStep("Verify Keyboard Language field is a mandatory field");
			TestReporter.assertTrue(wbeKeyboardLanguage.existsInFrame(),"keyBoard Language field is a mandatory field");
			TestReporter.logStep("Select KeyBoard Language as " + keyBoardLanguage);
			txtKeyboardLanguage.click();
			TestReporter.logStep("Verify Keyboard Language field DropDown options");
			dropdown(txtDropDown,keyBoardOptions,keyBoardOptions.length );
			txtKeyboardLanguage.syncInFrame();
			txtDropdownSearch.set(keyBoardLanguage);
			txtDropdownSearch.sendKeys(Keys.ENTER);
			txtKeyboardLanguage.syncVisible(20);
			TestReporter.assertTrue(txtKeyboardLanguage.getAttribute("text").contains(keyBoardLanguage)
					,keyBoardLanguage + " is selected in Keyboard Language field");
					
			TestReporter.logStep("Verify Power Cable field is a mandatory field");
			TestReporter.assertTrue(wbePowerCable.existsInFrame(), "Power Cable field is a mandatory field");
			TestReporter.logStep("Select Power Cable as " + powerCable);
					txtPowerCable.click();
			TestReporter.logStep("Verify Power Cable field DropDown options");		
			dropdown(txtDropDown,powerCableOptions,powerCableOptions.length );
			txtPowerCable.syncInFrame();
			txtDropdownSearch.set(powerCable);
			txtDropdownSearch.sendKeys(Keys.ENTER);
			txtPowerCable.syncVisible(20);
			TestReporter.assertTrue(txtPowerCable.getAttribute("text").contains(powerCable)
					,powerCable + " is selected in power cable field");		
	}
	
	/**
	 * verify the Onboard Employee Choose Option -travel Laptop Validation for EMEA
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void travelLaptopValidationEMEA(String keyBoardLanguage, String powerCable) throws IOException {
		FetchData travelLaptop= new FetchData();
		TestReporter.logStep("Verify Travel Laptop Item");
		wbeTravelLaptop.clickOnSync();
		wbeTravelLaptopLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeTravelLaptopLabelDesc1.existsInFrame(),"Travel laptop Description is displayed");
		TestReporter.log(wbeTravelLaptopLabelDesc1.getText());
		TestReporter.log(travelLaptop.text("TravelLaptopDescription1"));
		TestReporter.assertEquals(wbeTravelLaptopLabelDesc1.getText()
				,travelLaptop.text("TravelLaptopDescription1"), "Travel laptop Description1 is validated:"+wbeTravelLaptopLabelDesc1.getText());

		List<String> accessories=new ArrayList<>();
		accessories.add(0, travelLaptop.text("TravelLaptopOptionDescription1"));
		accessories.add(1, travelLaptop.text("TravelLaptopOptionDescription2"));
		accessories.add(2, travelLaptop.text("TravelLaptopOptionDescription3"));
		accessories.add(3, travelLaptop.text("TravelLaptopOptionDescription4"));
		accessories.add(4, travelLaptop.text("TravelLaptopOptionDescription5"));
		accessories.add(5, travelLaptop.text("TravelLaptopOptionDescription6"));
		List<Element> myText1=driver.findElements(By.xpath("//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/ul[1]/li"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(accessories.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), accessories.get(i), "Text verified -"+myText1.get(i).getText());	
			}		
			TestReporter.logStep("Verify Keyboard Language field is a mandatory field");
			TestReporter.assertTrue(wbeKeyboardLanguage.existsInFrame(),"keyBoard Language field is a mandatory field");
			TestReporter.logStep("Select KeyBoard Language as " + keyBoardLanguage);
			txtKeyboardLanguage.click();
			TestReporter.logStep("Verify Keyboard Language field DropDown options");
			dropdown(txtDropDown,keyBoardOptions,keyBoardOptions.length );
			txtKeyboardLanguage.syncInFrame();
			txtDropdownSearch.set(keyBoardLanguage);
			txtDropdownSearch.sendKeys(Keys.ENTER);
			txtKeyboardLanguage.syncVisible(20);
			TestReporter.assertTrue(txtKeyboardLanguage.getAttribute("text").contains(keyBoardLanguage)
					,keyBoardLanguage + " is selected in Keyboard Language field");
					
			TestReporter.logStep("Verify Power Cable field is a mandatory field");
			TestReporter.assertTrue(wbePowerCable.existsInFrame(), "Power Cable field is a mandatory field");
			TestReporter.logStep("Select Power Cable as " + powerCable);
					txtPowerCable.click();
			TestReporter.logStep("Verify Power Cable field DropDown options");		
			dropdown(txtDropDown,powerCableOptions,powerCableOptions.length );
			txtPowerCable.syncInFrame();
			txtDropdownSearch.set(powerCable);
			txtDropdownSearch.sendKeys(Keys.ENTER);
			txtPowerCable.syncVisible(20);
			TestReporter.assertTrue(txtPowerCable.getAttribute("text").contains(powerCable)
					,powerCable + " is selected in power cable field");			
	}
	
	/**
	 * verify the Onboard Employee Choose Option -External Monitor Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void externalMonitorValidation() throws IOException {
		FetchData externalMonitor= new FetchData();
		TestReporter.logStep("Verify External monitor Item");
		wbeMonitor.clickOnSync();
		// Description validation commented as of now. Need discussion
		/*wbeMonitorLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeMonitorLabelDesc1.existsInFrame(),"External Monitor Description is displayed");
		TestReporter.log(wbeMonitorLabelDesc1.getText());
		TestReporter.log(externalMonitor.text("ExternalMonitorDescription"));
		TestReporter.assertEquals(wbeMonitorLabelDesc1.getText()
				,externalMonitor.text("ExternalMonitorDescription"), "External Monitor Description1 is validated:"+wbeMonitorLabelDesc1.getText());*/

	}
	
	/**
	 * verify the Onboard Employee Choose Option -Preferred Name Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void preferredNameValidation(String prefName) throws IOException {
		FetchData preferredName= new FetchData();
		TestReporter.logStep("Verify Preferred Name Item");
		wbePreferredName.clickOnSync();
		wbePreferredNameLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbePreferredNameLabelDesc1.existsInFrame(),"Preferred Name Description is displayed");
		TestReporter.log(wbePreferredNameLabelDesc1.getText());
		TestReporter.log(preferredName.text("PreferredNameDescription"));
		TestReporter.assertEquals(wbePreferredNameLabelDesc1.getText()
				,preferredName.text("PreferredNameDescription"), "Preferred Name Description1 is validated:"+wbePreferredNameLabelDesc1.getText());
		
		TestReporter.assertEquals(txtPreferredName.getText()
				,prefName, "Preferred Displaye Name Field is validated and automatically filled :"+txtPreferredName.getText());
		
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Building access Validation
	 * 
	 * @param badge.
	 * 				Mandatory drop down box badge type
	 * 
	 * 
	 * @return None.
	 * @throws IOException 
	 */
	public void buildingAccesValidation(String badge) throws IOException {
		
		FetchData buildingAccess= new FetchData();
		TestReporter.logStep("Verify Building Acess Item");
		wbeBuildingAccess.clickOnSync();
		
		wbeBuildingAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeBuildingAccessLabelDesc1.existsInFrame(),"Building access Description1 is displayed");
		TestReporter.log(wbeBuildingAccessLabelDesc1.getText());
		TestReporter.log(buildingAccess.text("BuildingAccessDescription1"));
		TestReporter.assertEquals(wbeBuildingAccessLabelDesc1.getText()
				,buildingAccess.text("BuildingAccessDescription1"), "Building access Description1  is validated:"+wbeBuildingAccessLabelDesc1.getText());
		
		wbeBuildingAccessLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbeBuildingAccessLabelDesc2.existsInFrame(),"Building access Description2 is displayed");
		TestReporter.log(wbeBuildingAccessLabelDesc2.getText());
		TestReporter.log(buildingAccess.text("BuildingAccessDescription2"));
		TestReporter.assertEquals(wbeBuildingAccessLabelDesc2.getText()
				,buildingAccess.text("BuildingAccessDescription2"), "Building access Description2  is validated:"+wbeBuildingAccessLabelDesc2.getText());
		
		TestReporter.logStep("Verify Badge Type field is a mandatory field");
		TestReporter.assertTrue(wbeBadgeType.existsInFrame(),"Badge Type field is a mandatory field");
		TestReporter.logStep("Select Badge Type as " + badge);
		txtBadgeType.click();
		TestReporter.logStep("Verify Badge Type field DropDown options");
		dropdown(txtDropDown,badgeTypeOptions,badgeTypeOptions.length );
		txtBadgeType.syncInFrame();
		txtDropdownSearch.set(badge);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		Element retrievedText= driver.findElement(By.xpath("//fieldset//label[contains(text(),'Access type')]/following-sibling::span//div/a/span[1]"));
		TestReporter.assertTrue(retrievedText.getText().contains(badge)
				,badge + " is selected in Badge Type field");
	}
		
	/**
	 * verify the Onboard Employee Choose Option -Disable AD account  Validation
	 * 
	 * @param badge.
	 * 				Mandatory drop down box badge type
	 * 
	 * 
	 * @return None.
	 * @throws IOException 
	 */
	public void disableADAccountValidation(String fullName, int employeeID, int contactNumber) throws IOException {
		

		wbeDisableADAccount.clickOnSync();
		TestReporter.logStep("Verify Employee full name is a mandatory field");
		TestReporter.assertTrue(wbeDisableADAccountEmployeeName.existsInFrame(),"Employee full name field is a mandatory field");
		TestReporter.logStep("Select Employee full name  as " + fullName);
		txtDisableADAccountEmployeeName.jsClick();
		txtDisableADAccountEmployeeName.set(fullName);
		txtDisableADAccountEmployeeName.sendKeys(Keys.ENTER);
		txtDisableADAccountEmployeeName.syncVisible(20);
		TestReporter.log(txtDisableADAccountEmployeeName.getText());
		TestReporter.assertTrue(txtDisableADAccountEmployeeName.getText().contains(fullName)
				,"Selected value: " + fullName + " is displayed in Employee full name field");

	}
	
	
	/**
	 * verify the Onboard Employee Choose Option -Standard Desktop Validation
	 * 
	 * @param keyBoardLanguage,powerCable.
	 * 				Mandatory drop down box Keyboard langauge 
	 * 				Mandatory drop down box powercable	
	 * @return None
	 */
	public void standardDesktopValidation1(String keyBoardLanguage, String powerCable) {
		
		TestReporter.logStep("Verify Standard Desktop Item");
		wbeStandardDesktop.clickOnSync();
		TestReporter.logStep("Verify Keyboard Language field is a mandatory field");
		TestReporter.assertTrue(wbeKeyboardLanguage.existsInFrame(),"keyBoard Language field is a mandatory field");
		TestReporter.logStep("Select KeyBoard Language as " + keyBoardLanguage);
		txtKeyboardLanguage.click();
		TestReporter.logStep("Verify Keyboard Language field DropDown options");
		dropdown(txtDropDown,keyBoardOptions,keyBoardOptions.length );
		txtKeyboardLanguage.syncInFrame();
		txtDropdownSearch.set(keyBoardLanguage);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtKeyboardLanguage.syncVisible(20);
		TestReporter.assertTrue(txtKeyboardLanguage.getAttribute("text").contains(keyBoardLanguage)
				,keyBoardLanguage + " is selected in Keyboard Language field");
		
		TestReporter.logStep("Verify Power Cable field is a mandatory field");
		TestReporter.assertTrue(wbePowerCable.existsInFrame(), "Power Cable field is a mandatory field");
		TestReporter.logStep("Select Power Cable as " + powerCable);
		txtPowerCable.click();
		TestReporter.logStep("Verify Power Cable field DropDown options");		
		dropdown(txtDropDown,powerCableOptions,powerCableOptions.length );
		txtPowerCable.syncInFrame();
		txtDropdownSearch.set(powerCable);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtPowerCable.syncVisible(20);
		TestReporter.assertTrue(txtPowerCable.getAttribute("text").contains(powerCable)
				,powerCable + " is selected in power cable field");
	}
		
	/**
	 * verify the Onboard Employee Choose Option -New Extension  Validation
	 * 
	 * @param phoneNumber,displayName.
	 * 				drop down box phoneNumber 
	 * 				drop down box display name	
	 * @return None
	 */
	public void newExtensionValidation(String phoneNumber,String displayName, String macAddress ) {
		
		TestReporter.logStep("Verify New Extension Item ");
		wbeNewExtension.clickOnSync();
		TestReporter.assertTrue(wbeNewExtension.existsInFrame(),"'New Extension' Section is displayed");
		TestReporter.logStep("Verify 'Phone Number' field");
		TestReporter.assertTrue(wbePhoneNumber.existsInFrame(),"Phone Number field displayed as a Optional field");
		txtPhoneNumber.jsClick();
		txtPhoneNumber.set(phoneNumber);
		txtPhoneNumber.sendKeys(Keys.ENTER);
		txtPhoneNumber.syncVisible(20);
		TestReporter.log(txtPhoneNumber.getText());
		TestReporter.assertTrue(txtPhoneNumber.getText().contains(phoneNumber)
				,"Selected value: " + phoneNumber + " is displayed in 'Phone Number'");
		TestReporter.logStep("Verify 'Display' field");
		TestReporter.assertTrue(wbeDisplayNameNotMandatory.existsInFrame(),"Display name field displayed as a Optional field");
		txtDisplayName.scrollToAndCickOnSync();
		txtDisplayName.set(displayName);
		txtDisplayName.sendKeys(Keys.ENTER);
		txtDisplayName.syncVisible(20);
		TestReporter.assertTrue(txtDisplayName.getText().contains(displayName)
				,"Selected value: " + displayName + " is displayed in 'Display Name'");
		
		TestReporter.logStep("Verify MAC Address field is a optional field");
		TestReporter.assertTrue(wbeMACAddressNotMandatory.existsInFrame(),"MAC address field is a Optional  field");
		TestReporter.logStep("Entering MAC address");
		txtMACAddress.syncInFrame();
		txtMACAddress.set(macAddress);
		txtMACAddress.sendKeys(Keys.ENTER);
		txtMACAddress.syncVisible(20);
		TestReporter.assertTrue(txtMACAddress.getText().contains(macAddress),"Selected value: " + macAddress + " is displayed in 'MAC address'");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -New Phone  Validation
	 * 
	 * @param phoneModel,phoneNumber,displayName.
	 * 	 			drop down box phoneModel
	 * 				drop down box phoneNumber 
	 * 				drop down box display name	
	 * @return None
	 * @throws Exception 
	 */
	public void deskPhoneValidation(String phoneModel,String phoneNumber,String displayName) throws Exception {
		
		TestReporter.logStep("Verify Desk Phone Item ");
		wbeDeskPhone.clickOnSync();
		TestReporter.assertTrue(wbeDeskPhone.existsInFrame(),"'Desk Phone' Section is displayed");
		TestReporter.logStep("Verify 'Model' field");
		FetchData deskPhone= new FetchData();
	
		wbeDeskPhoneLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeDeskPhoneLabelDesc1.existsInFrame(),"DeskPhone Description1 is displayed");
		TestReporter.log(wbeDeskPhoneLabelDesc1.getText());
		TestReporter.log(deskPhone.text("DeskPhoneDescription1"));
		TestReporter.assertEquals(wbeDeskPhoneLabelDesc1.getText()
				,deskPhone.text("DeskPhoneDescription1"), "DeskPhone Description1  is validated:"+wbeDeskPhoneLabelDesc1.getText());
		
		wbeDeskPhoneLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbeDeskPhoneLabelDesc2.existsInFrame(),"DeskPhone Description2 is displayed");
		TestReporter.log(wbeDeskPhoneLabelDesc2.getText());
		TestReporter.log(deskPhone.text("DeskPhoneDescription2"));
		TestReporter.assertEquals(wbeDeskPhoneLabelDesc2.getText()
				,deskPhone.text("DeskPhoneDescription2"), "DeskPhone Description2  is validated:"+wbeDeskPhoneLabelDesc2.getText());

		TestReporter.logStep("Verify 'Phone Number' field");
		TestReporter.assertTrue(wbePhoneNumber.existsInFrame(),"Phone Number field displayed as a Optional field");
		txtPhoneNumber.jsClick();
		txtPhoneNumber.set(phoneNumber);
		txtPhoneNumber.sendKeys(Keys.ENTER);
		txtPhoneNumber.syncVisible(20);
		TestReporter.log(txtPhoneNumber.getText());
		TestReporter.assertTrue(txtPhoneNumber.getText().contains(phoneNumber)
				,"Selected value: " + phoneNumber + " is displayed in 'Phone Number'");
		
		TestReporter.logStep("Verify 'Display' field");
		TestReporter.assertTrue(wbeDisplayNameNotMandatory.existsInFrame(),"Display name field displayed as a Optional field");
		txtDisplayName.jsClick();
		txtDisplayName.set(displayName);
		txtDisplayName.sendKeys(Keys.ENTER);
		txtDisplayName.syncVisible(20);
		TestReporter.assertTrue(txtDisplayName.getText().contains(displayName)
				,"Selected value: " + displayName + " is displayed in 'Display Name'");
	}
	
	
	/**
	 * verify the Onboard Employee Choose Option -Reassgin Extenison  Validation
	 * 
	 * @param phoneModel,phoneNumber,displayName.
	 * 	 			drop down box phoneModel
	 * 				drop down box phoneNumber 
	 * 				drop down box display name	
	 * @return None
	 * @throws Exception 
	 */
	public void reassignExtensionValidation(String displayName,String extension, String macAddress) throws Exception {

		FetchData reassignExtension= new FetchData();
		TestReporter.logStep("Verify Reassgin Extenison Item ");
		wbeReassignExtension.clickOnSync();
		TestReporter.assertTrue(wbeReassignExtension.existsInFrame(),"'Reassign Extension' Section is displayed");
		
		wbeReassignExtensionLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeReassignExtensionLabelDesc1.existsInFrame(),"Reassign Extension Description is displayed");
		List<String> reassignExt=new ArrayList<>();
		reassignExt.add(0, reassignExtension.text("ReassignExtensionDescription1"));
		reassignExt.add(1, reassignExtension.text("ReassignExtensionDescription2"));
		List<Element> myText1=driver.findElements(By.xpath("//span[@class='break-word ng-binding'][contains(text(),'Reassign Extension')]/ancestor::node()[6]/following-sibling::div//div[@class='col-lg-9 col-md-9 col-xs-12 col-sm-12']/div/p"));
			for(int i=0;i<myText1.size();i++) {	
			TestReporter.log("Expected text:");
			TestReporter.log(reassignExt.get(i));
			TestReporter.log("Actual text:");
			TestReporter.log(myText1.get(i).getText());
			TestReporter.assertEquals(myText1.get(i).getText(), reassignExt.get(i), "Text verified -"+myText1.get(i).getText());	
			}

		TestReporter.logStep("Verify 'Display Name' field");
		TestReporter.assertTrue(wbeDisplayName.existsInFrame(),"Display name  field is a mandatory field");
		txtDisplayName.jsClick();
		txtDisplayName.set(displayName);
		txtDisplayName.sendKeys(Keys.ENTER);
		txtDisplayName.syncVisible(20);
		TestReporter.log(txtDisplayName.getText());
		TestReporter.assertTrue(txtDisplayName.getText().contains(displayName)
				,"Selected value: " + displayName+ " is displayed in 'Phone Number'");
		
		TestReporter.logStep("Verify Extension field is a mandatory field");
		TestReporter.assertTrue(wbeReExtension.existsInFrame(),"Extension field is a mandatory field");
		TestReporter.logStep("Entering Extension");
		txtReExtension.syncInFrame();
		txtReExtension.set(extension);
		txtReExtension.sendKeys(Keys.ENTER);
		txtReExtension.syncVisible(20);
		TestReporter.assertTrue(txtReExtension.getText().contains(extension),"Selected value: " + extension + " is displayed in 'Extension'");
		

		TestReporter.logStep("Verify MAC Address field is a mandatory field");
		TestReporter.assertTrue(wbeMACAddress.existsInFrame(),"MAC address field is a mandatory field");
		TestReporter.logStep("Entering MAC address");
		txtMACAddress.syncInFrame();
		txtMACAddress.set(macAddress);
		txtMACAddress.sendKeys(Keys.ENTER);
		txtMACAddress.syncVisible(20);
		TestReporter.assertTrue(txtMACAddress.getText().contains(macAddress),"Selected value: " + macAddress + " is displayed in 'MAC address'");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -mobile phone Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void mobilePhoneValidationEMEA() throws IOException {
		FetchData mobilePhone= new FetchData();
		TestReporter.logStep("Verify Mobile PhoneItem");
		wbeMobilePhoneItem.clickOnSync();
		// Description validation commented as of now. Need discussion
/*		wbeMobilePhoneLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeMobilePhoneLabelDesc1.existsInFrame(),"Mobile Phone Description is displayed");
		TestReporter.log(wbeMobilePhoneLabelDesc1.getText());
		TestReporter.log(mobilePhone.text("MobilePhoneDescription"));
		TestReporter.assertEquals(wbeMobilePhoneLabelDesc1.getText()
				,mobilePhone.text("MobilePhoneDescription"), "Mobile Phone Description1 is validated:"+wbeMobilePhoneLabelDesc1.getText());*/
	}
	
	/**
	 * verify the Onboard Employee Choose Option -USB HeadSet Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void usbHeadsetValidation() throws IOException {
		FetchData usb= new FetchData();
		TestReporter.logStep("Verify USB Headset Item");
		wbeUSBHeadset.clickOnSync();
		wbeUSBHeadsetLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeUSBHeadsetLabelDesc1.existsInFrame(),"USB HeadSet Description is displayed");
		TestReporter.log(wbeUSBHeadsetLabelDesc1.getText());
		TestReporter.log(usb.text("USBHeadsetDescription"));
		TestReporter.assertEquals(wbeUSBHeadsetLabelDesc1.getText()
				,usb.text("USBHeadsetDescription"), "USB HeadSet Description1 is validated:"+wbeUSBHeadsetLabelDesc1.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Wired HeadSet Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void wiredHeadsetValidation() throws IOException {
		FetchData wired= new FetchData();
		TestReporter.logStep("Verify wired Headset Item");
		wbeWiredHeadSet.clickOnSync();
		wbeWiredHeadSetLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeWiredHeadSetLabelDesc1.existsInFrame(),"Wired HeadSet Description is displayed");
		TestReporter.log(wbeWiredHeadSetLabelDesc1.getText());
		TestReporter.log(wired.text("WiredHeadsetDescription"));
		TestReporter.assertEquals(wbeWiredHeadSetLabelDesc1.getText()
				,wired.text("WiredHeadsetDescription"), "Wired HeadSet Description1 is validated:"+wbeWiredHeadSetLabelDesc1.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Wireless HeadSet Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void wirelessHeadsetValidation() throws IOException {
		FetchData wireless= new FetchData();
		TestReporter.logStep("Verify wireless Headset Item");
		wbeWirelessHeadSet.clickOnSync();
		wbeWirelessHeadSetLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeWirelessHeadSetLabelDesc1.existsInFrame(),"Wireless HeadSet Description is displayed");
		TestReporter.log(wbeWirelessHeadSetLabelDesc1.getText());
		TestReporter.log(wireless.text("WirelessHeadsetDescription"));
		TestReporter.assertEquals(wbeWirelessHeadSetLabelDesc1.getText()
				,wireless.text("WirelessHeadsetDescription"), "Wireless HeadSet Description1 is validated:"+wbeWirelessHeadSetLabelDesc1.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -MaxHire Access Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 * @throws Exception 
	 */
	public void maxHireAccessValidation(String mirrorUser) throws Exception {
		
		TestReporter.logStep("Verify MaxHire Access Item");
		wbeMaxHireAccess.clickOnSync();
		
		// Description validation commented as of now. Need discussion
		/*FetchData maxHire= new FetchData();
		wbeMaxHireLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeMaxHireLabelDesc1.existsInFrame(),"MaxHire Description is displayed");
		TestReporter.log(wbeMaxHireLabelDesc1.getText());
		TestReporter.log(maxHire.text("MaxHireDescription"));
		TestReporter.assertEquals(wbeMaxHireLabelDesc1.getText()
				,maxHire.text("MaxHireDescription"), "MaxHire Description1 is validated:"+wbeMaxHireLabelDesc1.getText());*/
		
		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserMaxHire.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		wbeMaxHireAccess.scrollIntoView();
		txtMirrorUserMaxHire.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserMaxHire.syncVisible(20);
		TestReporter.log(mirrorUser);
		TestReporter.log(txtMirrorUserMaxHire.getAttribute("text"));
		TestReporter.assertTrue(txtMirrorUserMaxHire.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -onBaseAccess Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void onBaseAccessValidation() throws IOException {
		FetchData onBase= new FetchData();
		TestReporter.logStep("Verify OnBase Access Item");
		wbeOnBaseAccess.clickOnSync();
		wbeOnBaseAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeOnBaseAccessLabelDesc1.existsInFrame(),"OnBaseAccess Description 1 is displayed");
		TestReporter.log(wbeOnBaseAccessLabelDesc1.getText());
		TestReporter.log(onBase.text("OnBaseAccessDescription1"));
		//Will be fixed later to resolve apostrophe issue
		/*TestReporter.assertEquals(wbeOnBaseAccessLabelDesc1.getText()
			,onBase.text("OnBaseAccessDescription1"), "OnBaseAccess Description 1 is validated:"+wbeOnBaseAccessLabelDesc1.getText());
		*/
		wbeOnBaseAccessLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbeOnBaseAccessLabelDesc2.existsInFrame(),"OnBaseAccess Description 2 is displayed");
		TestReporter.log(wbeOnBaseAccessLabelDesc2.getText());
		TestReporter.log(onBase.text("OnBaseAccessDescription2"));
		TestReporter.assertEquals(wbeOnBaseAccessLabelDesc2.getText()
				,onBase.text("OnBaseAccessDescription2"), "OnBaseAccess Description 2 is validated:"+wbeOnBaseAccessLabelDesc2.getText());
		
		wbeOnBaseAccessLabelDesc3.syncVisible(10);
		TestReporter.assertTrue(wbeOnBaseAccessLabelDesc3.existsInFrame(),"OnBaseAccess Description 3 is displayed");
		TestReporter.log(wbeOnBaseAccessLabelDesc3.getText());
		TestReporter.log(onBase.text("OnBaseAccessDescription3"));
		TestReporter.assertEquals(wbeOnBaseAccessLabelDesc3.getText()
				,onBase.text("OnBaseAccessDescription3"), "OnBaseAccess Description 3 is validated:"+wbeOnBaseAccessLabelDesc3.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -PeopleSoft FS Access Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 * @throws Exception 
	 */
	public void peopleSoftFSAccessValidation(String mirrorUser) throws Exception {
		
		TestReporter.logStep("Verify PeopleSoft FS Access Item");
		wbePeopleSoftFSAccess.clickOnSync();
		
		FetchData peopleSoftFS= new FetchData();
		wbePeopleSoftFSAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbePeopleSoftFSAccessLabelDesc1.existsInFrame(),"PeopleSoftFSAccess Description 1 is displayed");
		TestReporter.log(wbePeopleSoftFSAccessLabelDesc1.getText());
		TestReporter.log(peopleSoftFS.text("PeopleSoftFSAccessDescription1"));
		TestReporter.assertEquals(wbePeopleSoftFSAccessLabelDesc1.getText()
				,peopleSoftFS.text("PeopleSoftFSAccessDescription1"), "PeopleSoftFSAccess Description1 is validated:"+wbePeopleSoftFSAccessLabelDesc1.getText());

		wbePeopleSoftFSAccessLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbePeopleSoftFSAccessLabelDesc2.existsInFrame(),"PeopleSoftFSAccess Description 2 is displayed");
		TestReporter.log(wbePeopleSoftFSAccessLabelDesc2.getText());
		TestReporter.log(peopleSoftFS.text("PeopleSoftFSAccessDescription2"));
		TestReporter.assertEquals(wbePeopleSoftFSAccessLabelDesc2.getText()
				,peopleSoftFS.text("PeopleSoftFSAccessDescription2"), "PeopleSoftFSAccess Description2 is validated:"+wbePeopleSoftFSAccessLabelDesc2.getText());

		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserFS.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		wbeOnBaseAccess.scrollIntoView();//code added to handle overlap issue
		txtMirrorUserFS.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserFS.syncVisible(20);
		TestReporter.log(mirrorUser);
		TestReporter.log(txtMirrorUserFS.getAttribute("text"));
		TestReporter.assertTrue(txtMirrorUserFS.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -PeopleSoft HR Access Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 * @throws Exception 
	 */
	public void peopleSoftHRAccessValidation(String mirrorUser) throws Exception {
		
		TestReporter.logStep("Verify PeopleSoft HR Access Item");
		wbePeopleSoftHRAccess.clickOnSync();
		
		FetchData peopleSoftHR= new FetchData();
		wbePeopleSoftHRAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbePeopleSoftHRAccessLabelDesc1.existsInFrame(),"PeopleSoftHRAccess Description 1 is displayed");
		TestReporter.log(wbePeopleSoftHRAccessLabelDesc1.getText());
		TestReporter.log(peopleSoftHR.text("PeopleSoftHRAccessDescription1"));
		TestReporter.assertEquals(wbePeopleSoftHRAccessLabelDesc1.getText()
				,peopleSoftHR.text("PeopleSoftHRAccessDescription1"), "PeopleSoftHRAccess Description1 is validated:"+wbePeopleSoftHRAccessLabelDesc1.getText());

		wbePeopleSoftHRAccessLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbePeopleSoftHRAccessLabelDesc2.existsInFrame(),"PeopleSoftHRAccess Description 2 is displayed");
		TestReporter.log(wbePeopleSoftHRAccessLabelDesc2.getText());
		TestReporter.log(peopleSoftHR.text("PeopleSoftHRAccessDescription2"));
		TestReporter.assertEquals(wbePeopleSoftHRAccessLabelDesc2.getText()
				,peopleSoftHR.text("PeopleSoftHRAccessDescription2"), "PeopleSoftHRAccess Description2 is validated:"+wbePeopleSoftHRAccessLabelDesc2.getText());

		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserHR.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		txtMirrorUserHR.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserHR.syncVisible(20);
		TestReporter.assertTrue(txtMirrorUserHR.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -PeopleSoft nVision Access Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 */
	public void peopleSoftNVAccessValidation(String mirrorUser) {
		
		TestReporter.logStep("Verify PeopleSoft nVision Access Item");
		wbePeopleSoftNVAccess.clickOnSync();
		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserNV.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		txtMirrorUserNV.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserNV.syncVisible(20);
		TestReporter.assertTrue(txtMirrorUserNV.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -PeopleSoft Oasis Access Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 * @throws Exception 
	 */
	public void peopleSoftOasisAccessValidation(String mirrorUser) throws Exception {
		
		TestReporter.logStep("Verify PeopleSoft Oasis Access Item");
		wbePeopleSoftOAccess.clickOnSync();
		
		FetchData peopleSoftO= new FetchData();
		wbePeopleSoftOAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbePeopleSoftOAccessLabelDesc1.existsInFrame(),"PeopleSoftOAccess Description 1 is displayed");
		TestReporter.log(wbePeopleSoftOAccessLabelDesc1.getText());
		TestReporter.log(peopleSoftO.text("PeopleSoftOAccessDescription1"));
		TestReporter.assertEquals(wbePeopleSoftOAccessLabelDesc1.getText()
				,peopleSoftO.text("PeopleSoftOAccessDescription1"), "PeopleSoftOAccess Description1 is validated:"+wbePeopleSoftOAccessLabelDesc1.getText());

		wbePeopleSoftOAccessLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbePeopleSoftOAccessLabelDesc2.existsInFrame(),"PeopleSoftOAccess Description 2 is displayed");
		TestReporter.log(wbePeopleSoftOAccessLabelDesc2.getText());
		TestReporter.log(peopleSoftO.text("PeopleSoftOAccessDescription2"));
		TestReporter.assertEquals(wbePeopleSoftOAccessLabelDesc2.getText()
				,peopleSoftO.text("PeopleSoftOAccessDescription2"), "PeopleSoftOAccess Description2 is validated:"+wbePeopleSoftOAccessLabelDesc2.getText());

		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserO.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		WaitAllegis.hardWait(MAX_TIMEOUT*2);
		txtMirrorUserO.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserO.syncVisible(20);
		TestReporter.assertTrue(txtMirrorUserO.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -PeopleSoft Oasis Access Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 * @throws Exception 
	 */
	public void onboardingAutomationAccessValidation(String mirrorUser) throws Exception {
		
		TestReporter.logStep("Verify Onboarding Automation Access Item");
		wbeOnboardingAutomationAccess.scrollIntoView();
		wbeOnboardingAutomationAccess.clickOnSync();
		
		FetchData smartERP= new FetchData();
		wbeOnboardingAutomationAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeOnboardingAutomationAccessLabelDesc1.existsInFrame(),"Onboarding Automation  Description 1 is displayed");
		TestReporter.log(wbeOnboardingAutomationAccessLabelDesc1.getText());
		TestReporter.log(smartERP.text("SmartERPAccessDescription1"));
		TestReporter.assertEquals(wbeOnboardingAutomationAccessLabelDesc1.getText()
				,smartERP.text("SmartERPAccessDescription1"), "Onboarding Automation Description1 is validated:"+wbeOnboardingAutomationAccessLabelDesc1.getText());

		wbeOnboardingAutomationAccessLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbeOnboardingAutomationAccessLabelDesc2.existsInFrame(),"Onboarding Automation  Description 2 is displayed");
		TestReporter.log(wbeOnboardingAutomationAccessLabelDesc2.getText());
		TestReporter.log(smartERP.text("SmartERPAccessDescription2"));
		TestReporter.assertEquals(wbeOnboardingAutomationAccessLabelDesc2.getText()
				,smartERP.text("SmartERPAccessDescription2"), "Onboarding Automation  Description2 is validated:"+wbeOnboardingAutomationAccessLabelDesc2.getText());

		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserSmartERP.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		txtMirrorUserSmartERP.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserSmartERP.syncVisible(20);
		TestReporter.assertTrue(txtMirrorUserSmartERP.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Sail Point User Account Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void sailPointUserAccountValidation(String primaryEmailDomain,String needEmailAddress) throws IOException {
		TestReporter.logStep("Verify Sail Point User Account Item");
		wbeSailPointUserAccount.clickOnSync();
		wbeSailPointUserAccountLabelDesc1.syncVisible(10);
		/*TestReporter.assertTrue(wbeSailPointUserAccountLabelDesc1.existsInFrame(),"Sail Point User account description  is displayed:"+wbeSailPointUserAccountLabelDesc1.getText());
		TestReporter.assertTrue(wbeSailPointPrimaryEmailDomainMandatory.existsInFrame(), "Select Primary Email Domain is mandatory field");
		TestReporter.assertTrue(wbeSailPointNeedEmaildAddressMandatory.existsInFrame(), "Select Need Email Address is mandatory field");
			
		txtSailPointPrimaryEmailDomain.click();
		WaitAllegis.hardWait(MIN_TIMEOUT);
		txtDropdownSearch.syncInFrame(30);
		txtDropdownSearch.set(primaryEmailDomain);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtSailPointPrimaryEmailDomain.syncVisible(20);
		TestReporter.logStep(txtSailPointPrimaryEmailDomain.getAttribute("text"));
		TestReporter.assertTrue(txtSailPointPrimaryEmailDomain.getAttribute("text").contains(primaryEmailDomain),
				"Selected value: " + primaryEmailDomain+ " is displayed in 'product name' field'");
		*/
		txtSailPointNeedEmaildAddress.click();
		WaitAllegis.hardWait(MIN_TIMEOUT);
		txtDropdownSearch.syncInFrame(30);		
		if(needEmailAddress.contentEquals("No")) {
			txtDropdownSearch.set(needEmailAddress);
			txtDropdownSearch.sendKeys(Keys.ARROW_DOWN);
			txtDropdownSearch.sendKeys(Keys.ENTER);
		}
		else {
			txtDropdownSearch.set(needEmailAddress);
			txtDropdownSearch.sendKeys(Keys.ENTER);
		}
		txtSailPointNeedEmaildAddress.syncVisible(20);
		TestReporter.logStep(txtSailPointNeedEmaildAddress.getAttribute("text"));
		TestReporter.assertTrue(txtSailPointNeedEmaildAddress.getAttribute("text").contains(needEmailAddress),
				"Selected value: " +needEmailAddress+ " is displayed in 'product name' field'");
		
	}
	
	/**
	 * verify the Onboard Employee Choose Option -PeopleSoft Oasis Access Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 * @throws Exception 
	 */
	
	public void salesForceAccessValidation(String accessType,String mirrorUser) throws Exception {
		
		TestReporter.logStep("Verify SalesForce Access Item");
		wbeSalesForceAccess.scrollIntoView();
		wbeSalesForceAccess.clickOnSync();

		FetchData salesForce= new FetchData();
		wbeSalesForceAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeSalesForceAccessLabelDesc1.existsInFrame(),"SalesForce Access Description 1 is displayed");
		TestReporter.log(wbeSalesForceAccessLabelDesc1.getText());
		TestReporter.log(salesForce.text("SalesForceAccessDescription1"));
		TestReporter.assertEquals(wbeSalesForceAccessLabelDesc1.getText()
				,salesForce.text("SalesForceAccessDescription1"), "SalesForce Access Description 1 is validated:"+wbeSalesForceAccessLabelDesc1.getText());

		wbeSalesForceAccessLabelDesc2.syncVisible(10);
		TestReporter.assertTrue(wbeSalesForceAccessLabelDesc2.existsInFrame(),"SalesForce Access Description 2 is displayed");
		TestReporter.log(wbeSalesForceAccessLabelDesc2.getText());
		TestReporter.log(salesForce.text("SalesForceAccessDescription2"));
		TestReporter.assertEquals(wbeSalesForceAccessLabelDesc2.getText()
				,salesForce.text("SalesForceAccessDescription2"), "SalesForce Access Description 2 is validated:"+wbeSalesForceAccessLabelDesc2.getText());

		wbeSalesForceAccessLabelDesc3.syncVisible(10);
		TestReporter.assertTrue(wbeSalesForceAccessLabelDesc3.existsInFrame(),"SalesForce Access Description 3 is displayed");
		TestReporter.log(wbeSalesForceAccessLabelDesc3.getText());
		TestReporter.log(salesForce.text("SalesForceAccessDescription3"));
		TestReporter.assertEquals(wbeSalesForceAccessLabelDesc3.getText()
				,salesForce.text("SalesForceAccessDescription3"), "SalesForce Access Description 3 is validated:"+wbeSalesForceAccessLabelDesc3.getText());

		wbeSalesForceAccessLabelDesc4.syncVisible(10);
		TestReporter.assertTrue(wbeSalesForceAccessLabelDesc4.existsInFrame(),"SalesForce Access Description 4 is displayed");
		TestReporter.log(wbeSalesForceAccessLabelDesc4.getText());
		TestReporter.log(salesForce.text("SalesForceAccessDescription4"));
		TestReporter.assertEquals(wbeSalesForceAccessLabelDesc4.getText()
				,salesForce.text("SalesForceAccessDescription4"), "SalesForce Access Description1 is validated:"+wbeSalesForceAccessLabelDesc4.getText());

		TestReporter.logStep("Types of access verification for SalesForce access ");
		wbeSalesForceAccess.scrollIntoView();
		txtSalesForceAccess.click();
		dropdown(txtDropDown,salesForceAccessOptions,salesForceAccessOptions.length );
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(accessType);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtSalesForceAccess.syncVisible(20);
		TestReporter.assertTrue(txtSalesForceAccess.getAttribute("text").contains(accessType)
				,"Selected value: " + accessType + " is displayed in S drive field 3'");

				
		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserSalesForce.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		txtMirrorUserSalesForce.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserSalesForce.syncVisible(20);
		TestReporter.assertTrue(txtMirrorUserSalesForce.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
		
	/**
	 * verify the Onboard Employee Choose Option -Hyperion Validation
	 * 
	 * @param mirrorUser
	 * 				Mandatory drop down box Mirror User
	 * 				
	 * @return None
	 * @throws Exception 
	 */
	public void hyperionValidation(String mirrorUser) throws Exception {
		
		TestReporter.logStep("Verify Hyperion Item");
		wbeHyperion.scrollIntoView();
		wbeHyperion.clickOnSync();
				
		// Description validation commented as of now. Need discussion
		/*FetchData hyperion= new FetchData();
		wbeHyperionLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeHyperionLabelDesc1.existsInFrame(),"Hyperion Description 1 is displayed");
		TestReporter.log(wbeHyperionLabelDesc1.getText());
		TestReporter.log(hyperion.text("HyperionDescription1"));
		TestReporter.assertEquals(wbeHyperionLabelDesc1.getText()
				,hyperion.text("HyperionDescription1"), "Hyperion Description1 is validated:"+wbeHyperionLabelDesc1.getText());*/


		TestReporter.logStep("Verify Mirror User field is a mandatory field");
		TestReporter.assertTrue(wbeMirrorUserHyperion.existsInFrame(),"Mirror User field is a mandatory field");
		TestReporter.logStep("Select Mirror user  as " + mirrorUser);
		txtMirrorUserHyperion.click();
		txtDropdownSearch.syncInFrame();
		txtDropdownSearch.set(mirrorUser);
		retryAttempt(By.xpath("//div[@class='select2-result-cell'][contains(text(),'"+mirrorUser+"')]"));
		txtMirrorUserHyperion.syncVisible(20);
		TestReporter.assertTrue(txtMirrorUserHyperion.getAttribute("text").contains(mirrorUser)
				,mirrorUser+ " is selected in Mirror user field");
	}
	
	
	/**
	 * verify the Onboard Employee Choose Option -Time and Expense Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void timeExpenseAccessValidation() throws IOException {
		FetchData timeExpense= new FetchData();
		TestReporter.logStep("Verify Time Expense Access Item");
		wbeTimeExpenseAccess.clickOnSync();
		// Description validation commented as of now. Need discussion
/*		wbeTimeExpenseAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeTimeExpenseAccessLabelDesc1.existsInFrame(),"TimeExpenseAccess Description is displayed");
		TestReporter.log(wbeTimeExpenseAccessLabelDesc1.getText());
		TestReporter.log(timeExpense.text("TimeExpenseAccessDescription"));
		TestReporter.assertEquals(wbeTimeExpenseAccessLabelDesc1.getText()
				,timeExpense.text("TimeExpenseAccessDescription"), "TimeExpenseAccess Description1 is validated:"+wbeTimeExpenseAccessLabelDesc1.getText());*/
	}
	
	/**
	 * verify the Onboard Employee Choose Option -WSSRD Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void wssrdAccessValidation(String group) throws IOException {
		
		TestReporter.logStep("Verify WSSRD Access Item");
		wbeWSSRDAccess.clickOnSync();
		TestReporter.logStep("Verify Groups to add Field");
		TestReporter.assertTrue(wbeGroupsToAddMandatory.existsInFrame(),"Groups to add is a mandatory field");
		TestReporter.assertTrue(wbeGroupsToAdd.existsInFrame(),"Groups to add field displayed");
		txtGroupsToAdd.clickOnSync();
		txtGroupsToAdd.set(group);	
		retryAttempt(By.xpath("//div[@class='select2-result-label'][contains(text(),'"+group+"')]"));
		TestReporter.log("Data from excel:"+group);
		TestReporter.log("Data from Application:"+wbeGroupsToAddRetreive.getText());
		TestReporter.assertEquals(group, wbeGroupsToAddRetreive.getText(), "Entered Group valdated :"+wbeGroupsToAddRetreive.getText());
		
		TestReporter.logStep("Verify Date Needed Field");
		TestReporter.assertTrue(wbeDateNeededMandatory.existsInFrame(),"Date Needed is a mandatory field");
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar future = Calendar.getInstance();
		future.add(Calendar.DAY_OF_YEAR, 5);  
		String futureDate = dateFormat.format(future.getTime()); 
		txtDateNeeded.set(futureDate);
		
		TestReporter.logStep("Verify Notes Field");
		TestReporter.assertTrue(wbeWSSRDNotes.existsInFrame(),"Notes field is an optional field");
		txtWSSRDNotes.clickOnSync();
		txtWSSRDNotes.set("test notes");
	}
	
	/**
	 * verify the Onboard Employee Choose Option -WSSRD Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void sDriveAccessValidation(String permission,String drive1,String drive2,String drive3,String drive4) throws IOException {
		
		TestReporter.logStep("Verify S Drive Access Item");
		wbeSDriveAccess.clickOnSync();
		// Description validation commented as of now. Need discussion
/*		FetchData sDrive= new FetchData();	
		TestReporter.assertTrue(wbeSDriveAccessLabelDesc1.existsInFrame(), "S Drive access description is displayed");
		TestReporter.log(sDrive.text("SDriveAccess"));
		TestReporter.assertEquals(wbeSDriveAccessLabelDesc1.getText(), sDrive.text("SDriveAccess"), " S Drive access description validated");*/
		
		TestReporter.assertTrue(wbeDriveAccess1.existsInFrame(), "S Drive access 1 Field is displayed");
		TestReporter.log(drive1);
		TestReporter.log(wbeDriveAccess1.getText());
		TestReporter.assertEquals(wbeDriveAccess1.getText(),drive1, "Permission access verified for S Drive access 1");
		
		TestReporter.assertTrue(wbeDriveAccess2.existsInFrame(), "S Drive access 2 Field is displayed");
		TestReporter.log(drive2);
		TestReporter.log(wbeDriveAccess2.getText());
		TestReporter.assertEquals(wbeDriveAccess2.getText(),drive2, "Permission access verified for S Drive access 2");

		TestReporter.assertTrue(wbeDriveAccess3.existsInFrame(), "S Drive access 3 Field is displayed");
		TestReporter.log(drive3);
		TestReporter.log(wbeDriveAccess3.getText());
		TestReporter.assertEquals(wbeDriveAccess3.getText(),drive3, "Permission access verified for S Drive access 3");
			
		TestReporter.assertTrue(wbeDriveAccess4.existsInFrame(), "S Drive access 4 Field is displayed");
		TestReporter.log(drive4);
		TestReporter.log(wbeDriveAccess4.getText());
		TestReporter.assertEquals(wbeDriveAccess4.getText(),drive4, "Permission access verified for S Drive access 4");
		
		TestReporter.logStep("Verify 'S Drive' field Dropdown Options");
		String sDriveLabelExpected="Please select the type of access you need";	
		TestReporter.logStep("Permission access verification for S Drive access 1");
		txtDriveAccess1.click();
		dropdown(txtDropDown,sDriveAccessOptions,sDriveAccessOptions.length );
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(permission);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtDriveAccess1.syncVisible(20);
		TestReporter.assertTrue(txtDriveAccess1.getAttribute("text").contains(permission)
				,"Selected value: " + permission + " is displayed in S drive field 1'");
		//TestReporter.assertEquals(sDriveLabelExpected,wbeDriveAccesslabel1.getText(),"Drive 1 label validated"+wbeDriveAccesslabel1.getText());
	
		TestReporter.logStep("Verify 'S Drive' field Dropdown Options");
		TestReporter.logStep("Permission access verification for S Drive access 2");
		txtDriveAccess2.click();
		dropdown(txtDropDown,sDriveAccessOptions,sDriveAccessOptions.length );
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(permission);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtDriveAccess2.syncVisible(20);
		TestReporter.assertTrue(txtDriveAccess2.getAttribute("text").contains(permission)
				,"Selected value: " + permission + " is displayed in S drive field 2'");
		//TestReporter.assertEquals(sDriveLabelExpected,wbeDriveAccesslabel2.getText(),"Drive 2 label validated"+wbeDriveAccesslabel2.getText());

		
		TestReporter.logStep("Verify 'S Drive' field Dropdown Options");
		TestReporter.logStep("Permission access verification for S Drive access 3");
		txtDriveAccess3.click();
		dropdown(txtDropDown,sDriveAccessOptions,sDriveAccessOptions.length );
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(permission);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtDriveAccess3.syncVisible(20);
		TestReporter.assertTrue(txtDriveAccess3.getAttribute("text").contains(permission)
				,"Selected value: " + permission + " is displayed in S drive field 3'");
		//TestReporter.assertEquals(sDriveLabelExpected,wbeDriveAccesslabel3.getText(),"Drive 3 label validated"+wbeDriveAccesslabel3.getText());
		
		TestReporter.logStep("Verify 'S Drive' field Dropdown Options");
		TestReporter.logStep("Permission access verification for S Drive access 4");
		txtDriveAccess4.scrollIntoView();
		txtDriveAccess4.click();
		dropdown(txtDropDown,sDriveAccessOptions,sDriveAccessOptions.length );
		txtDropdownSearch.syncInFrame();
		TestReporter.logStep("Select required option and Verify ");
		txtDropdownSearch.set(permission);
		txtDropdownSearch.sendKeys(Keys.ENTER);
		txtDriveAccess4.syncVisible(20);
		TestReporter.assertTrue(txtDriveAccess4.getAttribute("text").contains(permission)
				,"Selected value: " + permission + " is displayed in S drive field 4'");
		//TestReporter.assertEquals(sDriveLabelExpected,wbeDriveAccesslabel4.getText(),"Drive 1 label validated"+wbeDriveAccesslabel4.getText());				
	}
	
	/**
	 * verify the Onboard Employee Choose Option -Time and Central Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public void timeCentralAccessValidation() throws IOException {
		FetchData timeCentral= new FetchData();
		TestReporter.logStep("Verify Time Central Access Item");
		wbeTimeCentralAccess.clickOnSync();
		wbeTimeCentralAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeTimeCentralAccessLabelDesc1.existsInFrame(),"TimeCentralAccess Description is displayed");
		TestReporter.log(wbeTimeCentralAccessLabelDesc1.getText());
		TestReporter.log(timeCentral.text("TimeCentralAccessDescription"));
		TestReporter.assertEquals(wbeTimeCentralAccessLabelDesc1.getText()
				,timeCentral.text("TimeCentralAccessDescription"), "TimeCentralAccess Description1 is validated:"+wbeTimeCentralAccessLabelDesc1.getText());
	}
	
	/**
	 * verify the Onboard Employee Choose Option -VDI Access Validation
	 * 
	 * @param None.
	 * @return None
	 * @throws IOException 
	 */
	public String vdiAccessValidation() throws IOException {
		FetchData vdiAccess= new FetchData();
		TestReporter.logStep("Verify VDI Access Item");
		wbeVDIAccess.clickOnSync();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		// Description validation commented as of now. Need discussion
		/*wbeVDIAccessLabelDesc1.syncVisible(10);
		TestReporter.assertTrue(wbeVDIAccessLabelDesc1.existsInFrame(),"VDIAccess Description is displayed");
		TestReporter.log(wbeVDIAccessLabelDesc1.getText());
		TestReporter.log(vdiAccess.text("VDIAccessDescription"));
		TestReporter.assertEquals(wbeVDIAccessLabelDesc1.getText()
				,vdiAccess.text("VDIAccessDescription"), "VDI Access Description1 is validated:"+wbeVDIAccessLabelDesc1.getText());*/
		return txtVDIPoolName.getAttribute("value");
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
