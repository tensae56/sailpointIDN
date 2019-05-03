package com.allegis.snow.portal;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import com.allegis.snow.base.BasePage;
import com.framework.core.interfaces.Button;
import com.framework.core.interfaces.Checkbox;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Label;
import com.framework.core.interfaces.Link;
import com.framework.core.interfaces.Textbox;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;

/**
 * Portal Elements.
 * 
 * @author Shiva
 * @version 1.0
 * @since 04-01-2019
 */
public class PortalRequestDetailsPage extends BasePage {
	/** Page Elements **/
		@FindBy(xpath = "//a[@id='cart-dropdown']//span[@class='ng-binding'][contains(text(),'Cart')]")
	protected Element wbeCart;
	@FindBy(xpath = "//h1[contains(text(),'Allegis Group Service Portal')]")
	protected Label lblAllegisPortal;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'General Request')]")
	protected Element wbeGeneralRequest;
	@FindBy(xpath = "//h2[@class='h4 m-t-none m-b-xs text-overflow-ellipsis ng-binding'][@title='General Request']")
	protected Element wbeGeneralRequestLink;
	@FindBy(xpath = ".//*[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope'][contains(text(),'General Request')]")
	protected Label lblGeneralRequest;
	@FindBy(xpath = "//h2[@class='h4 m-t-none m-b-xs text-overflow-ellipsis ng-binding'][@title='EMEA General Request']")
	protected Element wbeGeneralRequestEMEALink;
	@FindBy(xpath = ".//*[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope'][@title='EMEA General Request']")
	protected Element wbeGeneralRequestEMEATitle;
	@FindBy(xpath = "//h1[.='EMEA General Request']")
	protected Element wbeGeneralRequestTitle;
	@FindBy(xpath = "//label[contains(text(),'Category of Request')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Textbox wbeCategoryOfRequestMandatory;
	@FindBy(xpath = "//label[contains(text(),'Please provide a detailed description of your request')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Textbox wbeDetailedDescriptionMandatory;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'EMEA General Request')]")
	protected Label lblViewCartEMEAGeneralRequest;
	@FindBy(xpath = "//span[@class='select2-chosen']")
	protected Element wbeCategory;
	@FindBy(xpath = "//input[@id='s2id_autogen2_search']")
	protected Textbox txtCategoryInner;
	@FindBy(xpath = "//textarea[@name='request_details']")
	protected Textbox txtDescription;
	@FindBy(xpath = "//html/body/div/header/div/div/nav/div[1]/a/img")
	protected Element wbeAllegisLogo;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'General Request')]")
	protected Label lblViewCartGeneralRequest;
	@FindBy(xpath = "//p[contains(text(),'Submit a general request to the Service Desk for fulfillment.')]")
	protected Element wbeViewCartSubmitGeneralRequest;
	@FindBy(xpath = "//th[contains(text(),'Item')]")
	protected Element wbeItem;
	@FindBy(xpath = "//th[contains(text(),'Price')]")
	protected Element wbePrice;
	@FindBy(xpath = "//th[contains(text(),'Quantity')]")
	protected Element wbeQuantity;
	@FindBy(xpath = "//th[contains(text(),'Subtotal')]")
	protected Element wbeSubtotal;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'General Request')]")
	protected Element wbeViewCartGeneralRequest;
	@FindBy(xpath = ".//*[@class='select2-result-label'][contains(text(),'Email')]")
	protected Element wbeCategoryofrequest;
	@FindBy(xpath = "//div[@class='btn-group']/a[.='View Cart']")
	protected Element btnViewCart;
	@FindBy(xpath = "//h1[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope'][contains(text(),'Conference Display')]")
	protected Label lblConferenceTitle;
	@FindBy(xpath = "//div[@class='text-muted sc-cat-item-short-description ng-binding ng-scope']")
	protected Label lblPageDescription;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope']")
	protected Label lblDisplayLocation;
	@FindBy(xpath = "//span[@class='fa fa-asterisk mandatory']")
	protected Label lblDisplayReq;
	@FindBy(xpath = "//a[contains(@class, 'select2-choice')]")
	protected Button btnDisplayLocationDropDown;
	@FindBy(xpath = "//input[@id='s2id_autogen1_search']")
	protected Textbox txtDisplayInput;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Employee Services')]")
	protected Element wbeEmployeeServices;
	@FindBy(xpath = "//h1[contains(text(), 'Employee Services')]")
	protected Element wbeEmployeeServicesPage;
	@FindBy(xpath = "//h2[@title='Job Status Change']")
	protected Element wbeJobStatusChangeLink;
	@FindBy(xpath = "//h1[.='Job Status Change']")
	protected Element wbeJobStatusChangePage;
	@FindBy(xpath = "//div[contains(text(), 'Employees can request changes to their current employment program')]")
	protected Element wbeEmployeeServicesChangeRequest;
	@FindBy(xpath = "//h2[@class='h4 m-t-none m-b-xs text-overflow-ellipsis ng-binding'][contains (text(),'Job Status Change')]")
	protected Element wbeJobStatusChange;
	@FindBy(xpath = "//h1[@class='h2 m-n font-thin ng-binding ng-scope'][contains (text(),'Job Status Change')]")
	protected Element wbeJobChangeTitleLabel;
	@FindBy(xpath = "//label[contains(text(),'Date of Change')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeDateChange;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Date of Change')]/following-sibling::span/div/input")
	protected Textbox txtDateOfChange;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Manager')]")
	protected Element wbeManager;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Manager')]/following-sibling::span//a")
	protected Textbox txtNewManager;
	@FindBy(xpath = ".//*[@id='select2-drop']//input")
	protected Textbox txtDropdownSearch;
	@FindBy(xpath = "//legend[contains(text(),'Select the types of changes required')]")
	protected Element wbeTypeOfChanges;
	@FindBy(xpath = "//span[contains(text(), 'Job Title')]/../input[@type='checkbox']")
	protected Textbox txtJobTitle;
	@FindBy(xpath = "//span[contains(text(), 'Company Brand')]/../input[@type='checkbox']")
	protected Textbox txtCompanyBrand;
	@FindBy(xpath = "//span[contains(text(), 'Office Move')]/../input[@type='checkbox']")
	protected Textbox txtOfficeMove;
	@FindBy(xpath = "//span[contains(text(), 'Laptop')]/../input[@type='checkbox']")
	protected Textbox txtLaptop;
	@FindBy(xpath = "//span[contains(text(), 'Mobile')]/../input[@type='checkbox']")
	protected Textbox txtMobile;
	@FindBy(xpath = "//label[contains(text(),'Notes')]")
	protected Element wbeNotes;
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Company Brand')]")
	protected Element wbeCompanyBrand;
	@FindBy(xpath = "//label[contains(text(),'Notes')]/following-sibling::span//textarea")
	protected Textbox txtNotes;
	@FindBy(xpath = ".//button[@id='submit'][contains(text(),'Next')]")
	protected Element btnNext;
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Describe Needs')]/preceding-sibling::div")
	protected Element wbeDescribeNeedsIcon;
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Describe Needs')]")
	protected Element wbeDescribeNeeds;
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Choose Options')]/preceding-sibling::div")
	protected Element wbeChooseOptionsIcon;
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Choose Options')]")
	protected Element wbeChooseOptions;
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Job Title')]")
	protected Element wbeJobTitle;
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Job Title Change')]")
	protected Element wbeJobTitleChangeLabel;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Job Title')]")
	protected Textbox wbeNewJobTitle;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Job Title')]/following-sibling::span/span/input")
	protected Textbox txtNewJobTitle;
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Summary')]/preceding-sibling::div")
	protected Element wbeSummaryIcon;
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Summary')]")
	protected Element wbeSummary;
	@FindBy(xpath = "//h2[@title='Life Change']")
	protected Element wbeLifeChangeLink;
	@FindBy(xpath = "//h1[.='Life Change']")
	protected Element wbeLifeChangePage;
	@FindBy(xpath = "//h1[@class='h2 m-n font-thin ng-binding ng-scope'][contains (text(),'Life Change')]")
	protected Element wbeLifeChangeTitleLabel;
	@FindBy(xpath = "//span[contains(text(), 'Name Change')]/../input[@type='checkbox']")
	protected Textbox txtNameChange;
	@FindBy(xpath = "//a[@class='linked'][contains(text(),'EMEA End User Support')]")
	protected Link lnkEMEAEndUserSupport;
	@FindBy(xpath = "//span[contains(text(), 'Paternity/Maternity Leave')]/../input[@type='checkbox']")
	protected Textbox txtMaternityLeave;
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Name Change')]")
	protected Element wbeNameChange;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Display Name')]")
	protected Textbox wbeNewDisplayName;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Display Name')]/following-sibling::span/span/input")
	protected Textbox txtNewDisplayName;
	@FindBy(xpath = "//legend[contains(text(),'Which name are you changing? ')]")
	protected Element wbeNameChanges;
	@FindBy(xpath = "//span[contains(text(), 'First Name')]/../input[@type='radio']")
	protected Textbox txtFirstName;
	@FindBy(xpath = "//span[contains(text(), 'Last Name')]/../input[@type='radio']")
	protected Textbox txtLastName;
	@FindBy(xpath = "//span[contains(text(), 'Both')]/../input[@type='radio']")
	protected Textbox txtBoth;
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Laptop')]")
	protected Element wbeLaptopLabel;
	@FindBy(xpath = "//div[@class='col-md-6 col-lg-6 hidden-xs hidden-sm align-text break-word ng-binding'][contains(text(),'Order a Laptop')]")
	protected Element wbeOrderLaptopLabel;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Keyboard Language')]")
	protected Element wbeKeyboardLanguage;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Keyboard Language')]/following-sibling::span//a")
	protected Textbox txtKeyboardLanguage;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Power Cable Type')]")
	protected Element wbePowerCable;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Power Cable Type')]/following-sibling::span//a")
	protected Textbox txtPowerCable;
	@FindBy(xpath = ".//*[@id='select2-chosen-47']//input")
	protected Textbox txtKeyboardDropdownSearch;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Department')]")
	protected Element wbeDepartment;
	@FindBy(xpath = ".//*[@id='select2-chosen-22']//input")
	protected Textbox txtDepartmentDropdownSearch;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Department')]/following-sibling::span//a")
	protected Textbox txtDepartment;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Company Brand')]")
	protected Textbox wbeNewCompanyBrand;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Company Brand')]/following-sibling::span/span/input")
	protected Textbox txtNewCompanyBrand;
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Office Move')]")
	protected Element wbeOfficeMove;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Office')]")
	protected Element wbeNewOffice;
	@FindBy(xpath = "//fieldset//label[contains(text(),'New Office')]/following-sibling::span//a")
	protected Textbox txtNewOffice;
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Mobile Phone')]")
	protected Element wbeMobilePhone;
	@FindBy(xpath = "//div[@class='m-t guide-description clearfix visible-md visible-lg break-word ng-binding ng-scope hidden-xs hidden-sm']/div/p[contains(text(),'Request a mobile phone.')]")
	protected Element wbeMobilePhoneLabelDesc1;
	@FindBy(xpath = "//span[@class='break-word ng-binding'][contains(text(),'Paternity/Maternity Leave')]")
	protected Element wbeMaternityLeave;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope']")
	protected Element wbeRequestTypeLabel;
	@FindBy(xpath = "//span[contains(text(), 'Proceeding to Leave')]/../input[@type='radio']")
	protected Textbox txtProceedingToLeave;
	@FindBy(xpath = "//span[contains(text(), 'Returning from Leave')]/../input[@type='radio']")
	protected Textbox txtReturningFromLeave;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Manager')]")
	protected Element wbeManagerLabel;
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_manager']")
	protected Element txtManagerValidation;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Manager')]")
	protected Element wbeManagerMaternity;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Manager')]/following-sibling::span//a")
	protected Textbox txtMaternityManager;
	@FindBy(xpath ="//h1[contains(text(),'USB Headset')]")
	protected Label lblUSBHeadsetRequest;
	@FindBy(xpath ="//h1[contains(text(),'Wired Headset')]")
	protected Label lblWiredHeadsetRequest;
	@FindBy(xpath = "//label[contains(text(),'Please select your preference')]//span[@class='fa fa-asterisk mandatory']")
	protected Textbox lblSelectPreference;
	@FindBy(xpath = "//label[contains(text(),'Please provide a reason for your request')]//span[@class='fa fa-asterisk mandatory']")
	protected Textbox lblReasonRequest;
	@FindBy(xpath = "//div[@class='select2-search']/label[contains(text(), 'select your preference')]/following-sibling::input")
	protected Textbox txtHeadSetDropdownSearch;
	@FindBy(xpath ="//label[contains(text(),'Please select your preference')]/following-sibling::span//a")
	protected Textbox txtSelectPreference;
	@FindBy(xpath ="//label[contains(text(),'Please provide a reason for your request')]/following-sibling::span/textarea")
	protected Textbox txtReasonforRequest;
	@FindBy(xpath = "//h1[contains(text(),'Email Forwarding')]")
	protected Label lblEmailForwarding;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Forwarding from')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Label lblForwardingFromRequired;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Forwarding from')]//following-sibling::span/sp-email-element//input")
	protected Textbox txtForwardingFrom;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Forwarding to')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Label lblForwardingToRequired;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Forwarding to')]//following-sibling::span/sp-email-element//input")
	protected Textbox txtForwardingTo;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Start date')]")
	protected Label lblStartdate;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Start date')]/following-sibling::span/div/input")
	protected Textbox txtStartDate;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Start date')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Label lblStartdateRequired;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'End date')]")
	protected Label lblEnddate;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'End date')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Label lblEnddateRequired;
	@FindBy(xpath = "//fieldset//label[contains(text(),'End date')]/following-sibling::span/div/input")
	protected Textbox txtEndDate;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Reason')]")
	protected Label lblReason;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Reason')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Label lblReasonRequired;
	@FindBy(xpath = "//label[contains(text(),'Reason')]//following-sibling::span/textarea")
	protected Textbox txtReason;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Type of access required')]")
	protected Element wbeAccessType;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Type of access required')]/following-sibling::span//a")
	protected Textbox txtSalesForceAccess;
	@FindBy(xpath = "//input[@id='s2id_autogen1_search']")
	protected Textbox txtAccessTypeDropdownSearch;
	@FindBy(xpath = "//label[.= 'Mirror user']//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeSalesForceMirrorUser;
	@FindBy(xpath = "//span[@id='sp_formfield_mirror_user']")
	protected Textbox txtSalesForceMirrorUser;
	@FindBy(xpath = "//input[@id='s2id_autogen2_search']")
	protected Textbox txtMirrorUserDropdownSearch;
	@FindBy(xpath = "//h1[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope']")
	protected Element lblSalesforce;
	@FindBy(xpath = "//h1[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope']")
	protected Label lblConnectedAccessForm;
	@FindBy(xpath = "//div[@class='ng-binding']/p[contains(text(),'This')]")
	protected Label lblConnectedAccessDesc;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Operating Company')]")
	protected Label lblOperatingCompany;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Which environment')]")
	protected Label lblEnvironment;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Type')]")
	protected Label lblType;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Date')]")
	protected Label lblDate;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Email')]")
	protected Label lblEmail;
	@FindBy(xpath = "//span[@title='More information']")
	protected Label lblHint;
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_operating_company']")
	protected Element wbeOperatingCompany;
	@FindBy(xpath = "//div[@class='select2-container ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty']")
	protected Element wbeEnvironment;
	@FindBy(xpath = "//input[@id='sp_formfield_requesting_access_to']")
	protected Textbox txtEnvironment;
	@FindBy(xpath = "//input[@id='sp_formfield_type_of_access']")
	protected Textbox txtTypeOfAccess;
	@FindBy(xpath = "//input[@id='sp_formfield_date_needed']")
	protected Textbox txtDateNeeded;
	@FindBy(xpath = "//input[@id='sp_formfield_email']")
	protected Textbox txtUserEmail;
	@FindBy(xpath = "//div[@id='select2-drop']/div/input")
	protected Element wbeDropSearch;
	@FindBy(xpath = "//ul[@id='select2-results-2']/li/div[contains(text(),'Aerotek APAC')]")
	protected Element btnAerotek;
	@FindBy(xpath = "//h1[contains(text(), 'Order Confirmation')]")
	protected Element wbeOrderConfirmation;
	@FindBy(xpath = "//div[@class='col-sm-8']/div/a/span[1]")
	protected Element wbeOrderConfirmationRequestFor;
	@FindBy(xpath = "//label[contains(text(), 'Delivery Information')]/i")
	protected Element wbeDeliveryInformation;
	@FindBy(xpath = "//label[@for='deliver-to']/i")
	protected Button btnDeliveryInformation;
	@FindBy(xpath = "//label[contains(text(), 'Special instructions')]/i")
	protected Element wbeSpecialInstructions;
	@FindBy(xpath = "//label[@for='deliver-to']/following-sibling::textarea")
	protected Textbox txtDeliveryInformation;
	@FindBy(xpath = "//label[@for='special-instructions']")
	protected Element wbeSpecialInstructionsLabel;
	@FindBy(xpath = "//label[@for='special-instructions']/following-sibling::textarea")
	protected Textbox txtSpecialInstructions;
	@FindBy(xpath = ".//button[@name='submit']/span[contains(text(),'Checkout')]")
	protected Element btnCheckOut;
	@FindBy(xpath = "//button[contains(@class, 'ng-binding')][.='Order Now']")
	protected Element btnOrderNow;
	@FindBy(xpath = "//div/a[@class='ng-scope'][.='View Cart']")
	protected Element wbeViewCart;
	@FindBy(xpath = "//h1[.='Your Cart']")
	protected Element wbeYourCart;
	@FindBy(xpath = "//div[@class='sc-btn-group']//span[.='Proceed to Checkout']")
	protected Button btnProceedToCheckout;
	@FindBy(xpath = "//div[contains(text(),'Item has been added to your cart.')]")
	protected Element wbeItemAddedToCart;
	@FindBy(xpath = "//b[@class='ng-binding'][contains(text(),'REQ')]")
	protected Element requestNum;
	@FindBy(xpath = "//span[@class='visible-lg-inline ng-binding']")
	protected Element wbeUser;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//li/a[.='Logout']")
	protected Element wbeLogout;
	@FindBy(xpath = "//div//label[contains(text(),'Deliver to')]/following-sibling::textarea")
	protected Textbox txtDeliverTo;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Telephony and Conferencing')]")
	protected Element wbeTelephonyConferencing;
	@FindBy(xpath = "//h2[@class='h4 m-t-none m-b-xs text-overflow-ellipsis ng-binding'][@title='Web Conferencing AMER']")
	protected Element wbeConferencingAMERLink;
	@FindBy(xpath = "//h2[@class='h4 m-t-none m-b-xs text-overflow-ellipsis ng-binding'][contains(text(),'Web Conferencing')]")
	protected Element wbeConferencingEMEALink;
	@FindBy(xpath = ".//*[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope'][contains(text(),'Web Conferencing')]")
	protected Label lblWebConferencingAMER;
	@FindBy(xpath = ".//*[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope'][contains(text(),'Web Conferencing')]")
	protected Label lblWebConferencingEMEA;
	@FindBy(xpath = "//*[contains(text(),'Search results')]")
	protected Element wbeSearchResult;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'Web Conferencing')]")
	protected Label lblViewCartWebConferencingAMER;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'Web Conferencing')]")
	protected Label lblViewCartWebConferencingEMEA;
	@FindBy(xpath = "//p[contains(text(),'Request audio/web conferencing for AMER or APAC Region')]")
	protected Element wbeViewCartSubmitWebConfAmerRequest;
	@FindBy(xpath = "//p[contains(text(),'Setup inter-office or external web conferencing')]")
	protected Element wbeViewCartSubmitWebConfEMEARequest;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Web Conferencing')]")
	protected Element wbeViewCartWebConferencingAMER;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Web Conferencing')]")
	protected Element wbeViewCartWebConferencingEMEA;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Hardware')]")
	protected Element wbeHardware;
	@FindBy(xpath = "//div[@class='overflow-100']/h2[contains(text(),'MiFi')]")
	protected Element wbeMifi;
	@FindBy(xpath = "//textarea[@class='form-control ng-scope ng-isolate-scope ng-empty ng-valid ng-touched']")
	protected Element wbeReasonTxtBox;
	@FindBy(xpath = "//label[contains(text(),'Deliver to')]/following-sibling::textarea")
	protected Textbox txtDeliverToReason;
	@FindBy(xpath = "//div[@class='text-muted sc-cat-item-short-description ng-binding ng-scope'][contains(text(),'4G Wi-Fi Hotspot')]")
	protected Element wbeMifiLabel;
	@FindBy(xpath = "//span[@class='type-textarea field-actual state-mandatory']/textarea")
	protected Textbox txtMifiReason;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'MiFi')]")
	protected Label lblViewCartMifiRequest;
	@FindBy(xpath = "//p[contains(text(),'4G Wi-Fi Hotspot')]")
	protected Element wbeViewCartSubmitMifiRequest;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'MiFi')]")
	protected Label lblYourCartMifiRequest;
	@FindBy(xpath = "//p[@class='ng-binding'][contains(text(),'4G Wi-Fi Hotspot')]")
	protected Element wbeYourCartSubmitMifiRequest;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'MiFi')]")
	protected Element wbeViewCartMifiRequest;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Software')]")
	protected Link lnkSoftware;
	@FindBy(xpath = "//h2[@title='Windows 10 Upgrade']")
	protected Link lnkWindows;
	@FindBy(xpath = "//div[@class='text-muted sc-cat-item-short-description ng-binding ng-scope']")
	protected Label lblWindowsSubTitle;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Who is the upgrade for?')]")
	protected Label lblRequestorField;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Select the computer')]")
	protected Label lblSelectComputerField;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Preferred upgrade date')]")
	protected Label lblPreferredDate;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Who')]/following-sibling::span//div/a")
	protected Textbox txtDropdownRequestor;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Select')]/following-sibling::span//div/a")
	protected Textbox txtDropdownComputer;
	@FindBy(xpath = "//input[@id='sp_formfield_upgrade_date']")
	protected Textbox txtPreferredDate;
	@FindBy(xpath = "//div[contains(text(),'Charles Mayfield')]")
	protected Textbox txtEmployeeSelect;
	@FindBy(xpath = "//div[contains(text(),'5CG8124721 - ProBook Notebook PC')]")
	protected Textbox txtComputerSelect;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Internet and Network Services')]")
	protected Link wbeNetwrkServices;
	@FindBy(xpath ="//h2[@class='h4 m-t-none m-b-xs text-overflow-ellipsis ng-binding'][contains(text(),'Network Drive Access')]")
	protected Link wbeNetworkDriveAccess;
	@FindBy(xpath = "//h1[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope']")
	protected Element wbeNetworkDriveTitle;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Type of drive')]")
	protected Label lblTypeOfDrive;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Network folder path')]")
	protected Label lblFolderPath;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Type of Permission')]")
	protected Label lblPermissionType;
	@FindBy(xpath = "//input[@id='sp_formfield_drive_letter']")
	protected Element wbeDriveTypeField;
	@FindBy(xpath = "//input[@id='sp_formfield_network_folder_path']")
	protected Element wbeFolderPathField;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Onboarding/Offboarding')]")
	protected Element onboardOffboardCategory;
	@FindBy(xpath="//h2[@title='Vanity Email Request']")
	protected Element vanityEmailLink;
	@FindBy(xpath ="//h1[contains(text(),'Vanity Email')]")
	protected Label lblVanityEmailRequest;
	@FindBy(xpath ="//label[@class='field-label ng-binding ng-scope'][contains(text(),'New Email Address')]/following-sibling::span/span/input")
	protected Textbox txtNwEmlAddrss;
	@FindBy (xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'New Email Address')]")
	protected Label lblNwEmlAddrss;
	@FindBy (xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Employee ID')]")
	protected Label lblEmplyId;
	@FindBy (xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Employee ID')]/following-sibling::span/span/input")
	protected Textbox txtEmplyId;
	@FindBy (xpath = "//label[@class = 'field-label ng-binding ng-scope'][contains(text(),'Name of the Employee')]/following-sibling::span/span/input")
	protected Textbox txtNmEmply;
	@FindBy (xpath = "//label[@class = 'field-label ng-binding ng-scope'][contains(text(),'Name of the Employee')]")
	protected Label lblNmEmply;
	@FindBy (xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Vanity Selection')]/following-sibling::span/div[2]")
	protected Element drpdwnVntySlctn;
	@FindBy (xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Vanity Selection')]")
	protected Label lblVntySlctn;
	@FindBy (xpath="//label[contains(text(), 'Vanity Selection undefined')]/following-sibling::input")
	protected Textbox srchVntySlctn;
	@FindBy (xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Program/Department')]/following-sibling::span/div[2]")
	protected Element prgrmCstbx;
	@FindBy (xpath="//input[@class='select2-input']")
	protected Textbox srchPrgrmCst;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Effective Date')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbEffctvDt;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Effective Date')]/following-sibling::span/div/input")
	protected Textbox txtEffctvDt;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Vanity Email')]")
	protected Element wbeViewCartVntyEmlRqst;
	@FindBy(xpath = "//*[contains(text(),'click here to view')]")
	protected Element wbeClickHereToView;
	@FindBy(xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Email Address to Remove')]")
	protected Label lblEmlAddrssRmv;
	@FindBy(xpath ="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Email Address to Remove')]/following-sibling::span/span/input")
	protected Textbox txtEmlAddrssRmv;
	@FindBy(xpath = "//label[@for='deliver-to']")
	protected Element  wbeDeliveryInformationLabel;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'Vanity Email')]")
	protected Label lblViewCartVanityEmailRequest;
	@FindBy(xpath = "//p[contains(text(),'Request to add/change an existing employee')]")
	protected Element wbeViewCartVanityEmailRequest;
	@FindBy(xpath = "//*[contains(text(),'Get Help')]")
	protected Element wbeGetHelp;
	@FindBy(xpath = "//span[@class='btn btn-warning']")
	protected Textbox txtReportAnIssueHeader;
	@FindBy(xpath = "//div[@class='col-sm-12']")
	protected Textbox txtRequiredInformation;
	@FindBy(xpath = "//span[@class='fa fa-asterisk mandatory']")
	protected Textbox txtDetailedDescriptionRequired;
	@FindBy(xpath = "//textarea[@class='form-control ng-scope ng-isolate-scope ng-empty ng-valid']")
	protected Textbox txtDetailedDescription;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-block ng-binding ng-scope']")
	protected Button btnSubmit;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Ticket Form')]")
	protected Textbox txtTicketForm;
	@FindBy(xpath = "//div[@class='panel-heading bg-primary']")
	protected Textbox txtCallRecord;
	@FindBy(xpath = "//span[@class='cxs-results-title ng-binding']")
	protected Textbox txtKATitle;
	@FindBy(xpath = "//span[@class='ng-binding'][contains(text(),'Purchase a Domain')]")
	protected Textbox txtPurchaseADomain;
	@FindBy(xpath = "//span[@class='cxs-results-title ng-binding']")
	protected Textbox txtKnowledgeArticles;
	@FindBy(xpath = "//span[contains(text(),'Add attachments')]")
	protected Element wbeFileUploadLink;
	@FindBy(xpath = "//a[@class='get-attachment ng-binding'][contains(text(),'TestFile')]")
	protected Element wbeAttachFile;
	@FindBy(xpath = "//a[@class='content_editable'][contains(text(),'TestFile')]")
	protected Element wbeFileTransfer;
	@FindBy(xpath = "//div[@class='ng-binding ng-scope'][contains(text(),'CALL')]")
	protected Element callNumber;
	@FindBy(xpath = "//span[@class='ng-binding'][contains(text(),'Lenovo Desktop')]")
	protected Textbox txtLenovoDesktop;
	@FindBy(xpath = "//span[@class='btn btn-warning']")
	protected Element wbeReportAnIssue;
	@FindBy (xpath = "//span[@title='Enterprise Applications']")
	protected Element eleEnterpriseApplicateCategory;
	@FindBy (xpath = "//h1[contains(text(),'Additional RWS Access')]")
	protected Label lblAddRWSAccessRequest;
	@FindBy (xpath = "//h2[@title='RWS Access Request']")
	protected Element eleRwsAccessRequestItem;
	@FindBy (xpath = "//h1[contains(text(),'RWS New Account')]")
	protected Label lblRWSAccessRequest;
	@FindBy (xpath = "//div[@class='text-muted sc-cat-item-short-description ng-binding ng-scope']")
	protected Label lblRWSAccessDesc;
	@FindBy (xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Specific reason for access')]")
	protected Label lblSpecificReason;
	@FindBy (xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Specific reason for access')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Label lblSpecificReasonRequired;
	@FindBy (xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Do you need additional job posting access?')]")
	protected Label lblAdditionalAccess;
	@FindBy(xpath = "//label[contains(text(),'Specific reason for access')]/following-sibling::span/textarea")
	protected Textbox txtSpecificReason;
	@FindBy(xpath = "//label[@class='field-label ng-binding ng-scope'][contains(text(),'Do you need additional job posting access?')]/following-sibling::span/div/a/span[@class='select2-chosen']")
	protected Element eleAdditionalAccess;
	@FindBy(xpath = "//button[@name='submit']")
	protected Element eleSubmit;
	@FindBy(xpath = "//h2[contains(text(),'Return Equipment')]")
	protected Element lnkReturnEquipmentRequest;
	@FindBy(xpath = "//label[contains(text(), 'Office ID (Where the equipment resides)')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span/div//span[@class='select2-chosen']")
	protected Textbox txtOfficeID;
	@FindBy(xpath = "//label[contains(text(),'Office ID (Where the equipment resides)')]//following-sibling::span/div/a")
	protected Element eleOfficeID;
	@FindBy(xpath = "//label[contains(text(), 'Equipment Type')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span/div//span[@class='select2-chosen']")
	protected Textbox txtEquipmentType;
	@FindBy(xpath = "//label[contains(text(), 'Manufacturer and Model')]/following-sibling::span//span/input")
	protected Textbox txtManufacturerandModel2;
	@FindBy (xpath = "//span[@id='select2-chosen-2']")
	protected Element eleEquipmentType;
	@FindBy(xpath = "//label[contains(text(), 'Manufacturer and Model')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span//span/input")
	protected Textbox txtManufacturerandModel;
	@FindBy(xpath = "//label[contains(text(), 'Enter the Asset Tag')]/following-sibling::span/span/input")
	protected Textbox txtEnterAssetTag;
	@FindBy(xpath = "//label[contains(text(), 'Enter the Serial Number (located on the Manufacturer label)')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span//span/input")
	protected Textbox txtSerialNumber;
	@FindBy(xpath = "//label[contains(text(), 'Enter the Serial Number')]/following-sibling::span//span/input")
	protected Textbox txtSerialNumber2;
	@FindBy(xpath ="//label[contains(text(), 'Comments')]/following-sibling::span/textarea")
	protected Textbox txtComments;
	@FindBy(xpath= "//h1[contains(text(),'Return Equipment')]")
	protected Label lblReturnEquipment;
	@FindBy(xpath = "//input[@id='s2id_autogen2_search']")
	protected Textbox txtDropdownSearch2;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'Return Equipment')]")
	protected Label lblViewCartReturnEquipmentRequest;
	@FindBy(xpath = "//p[contains(text(),'Return excess')]")
	protected Element wbeViewCartReturnEquipmentRequest;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Return Equipment')]")
	protected Element wbeViewCartReturnEquipmentRqst;
	@FindBy(xpath = "//a[@id='cart-dropdown']/span[@ng-if='cartItemCount > 0']")
	protected Element wbeCartQuantity;
	@FindBy(xpath = "//*[contains(text(),'Browse by Categories')]")
	protected Link lnBrowsebyCategories;	
	@FindBy(xpath = "//table[@class='table table-striped status-table ng-scope']")
	protected Element wbeOrderConformationTable;
	@FindBy(xpath ="//a[@class='ng-binding ng-scope'][contains(text(),'MiFi')]")
	protected Link lnkOrderItem;
	@FindBy(xpath = "//textarea[@id='post-input']")
	protected Textbox txtMessageInput;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	protected Button btnSubmitMessage;
	@FindBy(xpath = "//*[contains(text(),'Service Catalog')]")
	protected Element wbeServiceCatalog;
	@FindBy(xpath ="//*[contains(text(),'Popular Items')]")
	protected Label lblPopularItems;
	@FindBy(xpath="//h2[@title='Principal Consultant Onboarding']")
	protected Element lnkPrincipalConsultantOnboarding;
	@FindBy(xpath="//div[@class='text-muted sc-cat-item-short-description ng-binding ng-scope'][contains(text(),' Onboard a newly accepted Principal Consultant')]")
	protected Label lblShortDescription;
	@FindBy(xpath="//div[contains(@class, 'ng-binding')]/p[contains(text(),'Creation of an approved Principal')]")
	protected Label lblDescription;
	@FindBy(xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'First Name')]//following-sibling::span/span/input")
	protected Textbox txtPrincipalFirstName;
	@FindBy(xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Middle Name')]//following-sibling::span/span/input")
	protected Textbox txtPrincipalMiddlename;
	@FindBy(xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Last Name')]//following-sibling::span/span/input")
	protected Textbox txtPrincipalLastName;
	@FindBy(xpath="//label[@class='field-label ng-binding ng-scope'][contains(text(),'Employee ID')]//following-sibling::span/span/input")
	protected Textbox txtEmpid;
	@FindBy(xpath = "//label[contains(text(),'Last Name')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Element lblLastNameMandatory;
	@FindBy(xpath = "//label[contains(text(),'First Name')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Element lblFirstNameMandatory;
	@FindBy(xpath = "//label[contains(text(),'Personal Email')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Element lblPersononalEmailMandatory;
	@FindBy(xpath = "//label[contains(text(),'Office Location')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Element lblOfficeLocationMandatory;
	@FindBy(xpath = "//label[contains(text(),'Employee ID')]/span/span[@class='fa fa-asterisk mandatory']")
	protected Element lblEmployeeIDMandatory;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Personal Email')]/following-sibling::span//input")
	protected Textbox txtPersonalEmail;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Office Location')]/following-sibling::span//a")
	protected Textbox txtOfficeLocation;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Office Location')]/following-sibling::span//span")
	protected Element lblOfficeLocationfield;
	@FindBy(xpath = "//fieldset//label[contains(text(),'Account Manager')]/following-sibling::span//a")
	protected Textbox txtAccountManager;
	@FindBy(xpath = "//label[contains(text(),'Account Manager')]/following-sibling::span//span//a//span")
	protected Element lblAccountManager;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'Principal Consultant Onboarding')]")
	protected Label lblViewCartPrincipalConsultantRequest;
	@FindBy(xpath = "//p[contains(text(),'Onboard a newly accepted Principal Consultant')]")
	protected Element wbeViewCartPrincipalConsultantRequest;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Principal Consultant Onboarding')]")
	protected Element wbeViewCartPrincipalConsultantRqst;
	@FindBy(xpath ="//*[@class='text-muted item-short-desc break-word ng-binding'][contains(text(),'Used to support new websites and company')]")
	protected Link wbePurchaseDomain;
	@FindBy(xpath ="//input[@id='sp_formfield_domain_name']")
	protected Textbox txtDomainName;
	@FindBy(xpath ="//input[@id='sp_formfield_contract_years']")
	protected Textbox txtYearsDomain;
	@FindBy(xpath ="//textarea[@id='sp_formfield_reason']")
	protected Textbox txtReasonpurchase;
	@FindBy(xpath ="//div/h1[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope']")
	protected Label domainTitle;
	@FindBy(xpath ="//span[@id='select2-chosen-1']")
	protected Element wbeOpCo;
	@FindBy(xpath ="//span[@id='select2-chosen-2']")
	protected Element wbeProgramDept;
	@FindBy(xpath =".//*[@id='select2-drop']//input")
	protected Textbox wbeOpCoSearch;
	@FindBy(xpath = "//*[@class='media-heading ng-binding'][contains(text(),'Purchase a Domain')]")
	protected Label lblViewCarPurchaseRequest;
	@FindBy(xpath = "//p[contains(text(),'Used to support new websites and company email addresses.')]")
	protected Element wbeViewCartSubmitPurchaseRequest;
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Purchase a Domain')]")
	protected Element wbeViewCartPurchaseRequest;
	@FindBy(xpath = "//h1[contains(text(),'Offboard Employee')]")
	protected Element wbeOffboardEmployeetitle;
	@FindBy(xpath = "//div[contains(text(),'De-provision employee access and return equipment')]")
	protected Element wbeDescription;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee ID')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span//input")
	protected Textbox txtTerminatedEmployeeID;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee name')]//span/../../following-sibling::span//input")
	protected Textbox txtTerminatedEmployeeName;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee email address')]//span/../../following-sibling::span//input")
	protected Textbox txtTerminatedEmployeeEmailAddress;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee operating company')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span/div//span[@class='select2-chosen']")
	protected Textbox txtTerminatedEmployeeOperatingCompany;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee hire date')]//span/../../following-sibling::span/div/input")
	protected Textbox txtTerminatedEmployeeHireDate;
	@FindBy(xpath = "//label[contains(text(), 'Termination date')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span/div/input")
	protected Textbox txtTerminationDate;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee office ID')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span/div//span[@class='select2-chosen']")
	protected Textbox txtTerminatedEmployeeOfficeID;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee assigned assets')]/following-sibling::span/div/ul/li/input")
	protected Textbox txtTerminatedEmployeeAssignedAssets;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee assigned assets')]//span/../../following-sibling::span/div/ul//div")
	protected Element wbeTerminatedEmployeeAssignedAssetsValue;
	@FindBy(xpath = "//label[contains(text(), 'Name of contact returning assets')]//span/../../following-sibling::span//input")
	protected Textbox txtNameOfContactReturningAssets;
	@FindBy(xpath = "//label[contains(text(), 'Phone number of contact returning assets')]//span/../../following-sibling::span//input")
	protected Textbox txtPhoneNumberOfContactReturningAssets;
	@FindBy(xpath = "//label[contains(text(),'Office where assets are located')]/../..//following-sibling::span//input")
	protected Textbox txtOfficeAssetsLocated;
	@FindBy(xpath = "//label[contains(text(),'Office where assets are located')]//span[@class='fa fa-asterisk mandatory']/../..//following-sibling::span//input")
	protected Textbox txtOfficeAssetsLocatedRequired;
	@FindBy(xpath = "//label[contains(text(), 'Address where assets are located')]//span/../../following-sibling::span//textarea")
	protected Textbox txtAddressAssetsLocated;
	@FindBy(xpath = "//label[contains(text(), 'Requester')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span/span//a")
	protected Textbox txtRequester;
	@FindBy(xpath = "//div[@class='select2-search']/following-sibling::ul/li/../../div/input")
	protected Textbox txtSelectSearch;
	@FindBy(xpath = "//label[contains(text(), 'Requester email address')]//span/../../following-sibling::span//input")
	protected Textbox txtRequesterEmailAddress;
	@FindBy(xpath = "//label[contains(text(), 'Requester phone number')]//span/../../following-sibling::span//input")
	protected Textbox txtRequesterPhoneNumber;
	@FindBy(xpath = "//label[contains(text(), 'Enterprise Applications')]")
	protected Element wbeEnterpriseApplications;
	@FindBy(xpath = "//span[contains(text(), 'MaxHire')]/../input[@type='checkbox']")
	protected Checkbox chkMaxHire;
	@FindBy(xpath = "//span[contains(text(), 'WSSRD')]/../input[@type='checkbox']")
	protected Checkbox chkWSSRD;
	@FindBy(xpath = "//span[contains(text(), 'Salesforce')]/../input[@type='checkbox']")
	protected Checkbox chkSalesforce;
	@FindBy(xpath = "//span[contains(text(), 'Disable Phone')]/../input[@type='checkbox']")
	protected Checkbox chkDisablePhone;
	@FindBy(xpath = "//span[contains(text(), 'GM (General Motors)')]/../input[@type='checkbox']")
	protected Checkbox chkGeneralMotors;
	@FindBy(xpath = "//span[contains(text(), 'VDI OffBoard')]/../input[@type='checkbox']")
	protected Checkbox chkVDIOffboard;
	@FindBy(xpath = "//label[contains(text(), 'VDI Pool Name')]//span/../../following-sibling::span//input")
	protected Textbox txtVDIPoolName;
	@FindBy(xpath = "//label[contains(text(), 'Terminated employee shipping address')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span//textarea")
	protected Textbox txtShippingAddress;
	@FindBy(xpath = "//div[@class='select2-search']/following-sibling::ul/li")
	protected Element wbeDropdownValues;
	@FindBy(xpath = "//span[contains(text(), 'Candidate Tracker')]/../input[@name='candidate_tracker']")
	protected Checkbox chkCandidateTracker;
	@FindBy(xpath = "//h1[.='Planview']")
	protected Element wbePlanviewHeader;
	@FindBy(xpath = "//img[@alt='Planview']")
	protected Element wbePlanviewImage;
	@FindBy(xpath = "//div[contains(text(), 'Submit a request for New, Modify or Deactivate a Planview account')]")
	protected Element wbeShortDescription;
	@FindBy(xpath = "//div[contains(@class, 'binding')]//p[contains(text(), 'Planview has two major functions:')]")
	protected Element wbeDescriptionOne;
	@FindBy(xpath = "//div[contains(@class, 'binding')]//p[contains(text(), 'Portfolio and Resource Management (PRM) formerly known as Planview Enterprise, and Capability and Technology Management (CTM) formerly known as Troux.')]")
	protected Element wbeDescriptionTwo;
	@FindBy(xpath = "//div[contains(@class, 'binding')]//p[contains(text(), 'The PRM portion is used by IS managers and project managers to manage project budgets and resources. It is also used by all IS employees to post weekly timesheets.')]")
	protected Element wbeDescriptionThree;
	@FindBy(xpath = "//div[contains(@class, 'binding')]//p[contains(text(), 'The CTM portion is used by Enterprise Architecture to manage applications and technology used across the organization.')]")
	protected Element wbeDescriptionFour;
	@FindBy(xpath = "//label[contains(text(), 'Type of request')]//span[@class='fa fa-asterisk mandatory']/../../following-sibling::span//div/a")
	protected Textbox txtTypeOfRequest;
	@FindBy(xpath = "//span[.='Add attachments']")
	protected Element wbeAddAttachments;
	@FindBy(xpath = "//button[@name='add_to_cart']")
	protected Button btnAddToCart;
	@FindBy(xpath = "//button[@name='add_to_wishlist']")
	protected Button btnAddToWishList;
	@FindBy(xpath = "//b[contains(text(), 'Delivery Time:')]/..")
	protected Element wbeDeliveryTime;
	@FindBy(xpath = "//button[@name='submit']")
	protected Element wbeOrderNow;
	@FindBy(xpath = "//ul[@class='select2-results']/li/div")
	protected List<Element> wbeDropDownValues;
	@FindBy(xpath = "//div[@id='select2-drop']/div[@class='select2-search']//input")
	protected Textbox txtDropDownSearchValue;
	@FindBy(xpath = "//label[contains(text(), 'Job Title')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeJobTitleMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Employee type')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeEmployeetypeMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Vendor')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeVendorMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Employee location')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeEmployeeLocationMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Number of Hours/Week')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeNumberOfHoursWeekMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Delivery Area')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeDeliveryAreaMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Team')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeTeamMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Supervisor')]//span[@class='fa fa-asterisk mandatory']")
	protected Element wbeSupervisorMandatory;
	@FindBy(xpath = "//label[contains(text(), 'Job Title')]/..//following-sibling::span//div/a")
	protected Textbox txtPlanviewJobTitle;
	@FindBy(xpath = "//label[contains(text(), 'Employee type')]/..//following-sibling::span//div/a")
	protected Textbox txtEmployeetype;
	@FindBy(xpath = "//input[@name='vendor']")
	protected Textbox txtVendor;
	@FindBy(xpath = "//label[contains(text(), 'Employee location')]/..//following-sibling::span//div/a")
	protected Textbox txtEmployeeLocation;
	@FindBy(xpath = "//input[@name='number_of_hours_week']")
	protected Textbox txtNumberOfHoursWeek;
	@FindBy(xpath = "//input[@name='delivery_area']")
	protected Textbox txtDeliveryArea;
	@FindBy(xpath = "//input[@name='team']")
	protected Textbox txtTeam;
	@FindBy(xpath = "//label[contains(text(), 'Supervisor')]/..//following-sibling::span//div/a")
	protected Textbox txtSupervisor;
	@FindBy(xpath = "//input[@name='bill_rate']")
	protected Textbox txtBillDate;
	@FindBy(xpath = "//textarea[@name='notes']")
	protected Textbox txtPlanviewNotes;
		
	/** Constructor **/
	public PortalRequestDetailsPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}
}
