package com.allegis.utilities;

import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;

/**
 * Represents an constants .
 * 
 * @author Shiva
 * @version 1.0
 * @since 05-01-2018
 */
public class ConstantsProperties {
	protected AllegisDriver driver;
	public static final String SHIPPINGTEXT= "Test Shipping Address entered";
	public static final String SPECIALINSTRUCTIONS= "Test Special Instructions entered";
	public static final String INC_EMAIL_TEXT1 = "Dear ";
	public static final String INC_EMAIL_TEXT2 = "Your incident ";
	public static final String INC_EMAIL_TEXT3 = " has been resolved. Please contact the Service Desk within the next 72 hours if you continue to experience issues. After this time your ticket will be closed and a new ticket will need to be opened.";
	public static final String INC_EMAIL_TEXT4 = "Resolution notes: Resolved";
	public static final String INC_EMAIL_TEXT5 = "If you have any questions or want to check the status, please visit Service Portal";
	public static final String INC_EMAIL_TEXT6 = "Thank You,";
	public static final String INC_EMAIL_TEXT7 = "Service Desk";
	public static final String OFFBOARD_CLOSENOTE = "Closed the task";
	public static final String OFFBOARD_AD_SHORTDESC = "Disable AD account";
	public static final String OFFBOARD_AD_DESC = "Use this task to disable the Active Directory Account of the Terminated Employee";
	public static final String OFFBOARD_AD_ASSGROUP = "TERMINATIONS";
	public static final String OFFBOARD_SALESFORCE_SHORTDESC = "Disable Salesforce account of Terminated Employee; ";
	public static final String OFFBOARD_SALESFORCE_DESC = "Use this task to disable the Salesforce Account of the Terminated Employee";
	public static final String OFFBOARD_SALESFORCE_ASSGROUP = "Salesforce";
	public static final String OFFBOARD_MAXHIRE_SHORTDESC = "Disable MaxHire account of Terminated Employee; ";
	public static final String OFFBOARD_MAXHIRE_DESC = "Use this task to disable the MaxHire Account of the Terminated Employee";
	public static final String OFFBOARD_MAXHIRE_ASSGROUP = "MaxHire";
	public static final String OFFBOARD_WSSRD_SHORTDESC = "Disable WSSRD account of Terminated Employee; ";
	public static final String OFFBOARD_WSSRD_DESC = "Use this task to disable the WSSRD Account of the Terminated Employee";
	public static final String OFFBOARD_WSSRD_ASSGROUP = "WSSRD";
	public static final String OFFBOARD_VDI_SHORTDESC = "Disable VDI of Terminated Employee; ";
	public static final String OFFBOARD_VDI_DESC = "Use this task to remove the terminated employee from the VDI Pool";
	public static final String OFFBOARD_VDI_ASSGROUP = "OPS_WINDOWS";
	public static final String OFFBOARD_PHONE_SHORTDESC = "Off-board a phone for a terminated employee; ";
	public static final String OFFBOARD_PHONE_DESC = "Use this task to remove telephone services of the terminated employee";
	public static final String OFFBOARD_PHONE_ASSGROUP = "iNOC Team";
	public static final String OFFBOARD_GM_SHORTDESC = "Disable GM forwarding for Terminated Employee; ";
	public static final String OFFBOARD_GM_DESC = "Use this task to remove the email forwarding Contact of the terminated employee";
	public static final String OFFBOARD_GM_ASSGROUP = "OPS_IDENTITY";
	public static final String OFFBOARD_LOCAL_SHORTDESC = "Terminated Employee Hardware ";
	public static final String OFFBOARD_DSSLOCAL_SHORTDESC = "Ship Hardware ";
	public static final String OFFBOARD_TASK_ASSGROUP = "Task 3658";
	public static final String OFFBOARD_SECURITY_ASSGROUP = "ALC Security Freeze";
	public static final String OFFBOARD_ALCRETURNEQUIPMENT_ASSGROUP = "ALC Returned Equipment";
	public static final String OFFBOARD_ALCPACKING_ASSGROUP = "ALC Packing and Shipping";
	public static final String OFFBOARD_HELPDESK_SHORTDESC = "Remove user from Candidate Tracker security group; ";
	public static final String OFFBOARD_HELPDESK_DESC = "Remove user from group: gr_Allegis_Appian_prod_users";
	public static final String OFFBOARD_HELPDESK_ASSGROUP = "Helpdesk";
	public static final String OFFBOARD_APPIANSUPPORT_SHORTDESC = "Remove Candidate Tracker access; ";
	public static final String OFFBOARD_APPIANSUPPORT_DESC = "Please remove Candidate Tracker access for ";
	public static final String OFFBOARD_APPIANSUPPORT_ASSGROUP = "Appian Support";
	public static final String PROBLEM_TASK_INPROGRESS = "PRB State: New to In Progress";
	public static final String PROBLEM_TASK_KNOWNERROR = "PRB State: In Progress to Known Error";
	public static final String CALLS_REQUEST_MESSAGE = "Call form updated Click Submit to proceed to the Catalog";
	public static final String CALLS_INCIDENT_MESSAGE = "Knowledge attached & added to comments - Save record to finalize.";
	public static final String CREATEKNOWLEDGEARTICLE_MSG = "This knowledge article has been published";
	public static final String INC_ACK_EMAIL_TEXT1 = "Dear ";
	public static final String INC_ACK_EMAIL_TEXT2 = "Please find below the details of the incident that has been assigned to you.";
	public static final String INC_ACK_EMAIL_TEXT3 = "You can view all the details of the incident by following the link below:";
	public static final String INC_ACK_EMAIL_TEXT4 = "Thank you";
	public static final String INC_OPEN_EMAIL_TEXT1 = "Dear ";
	public static final String INC_OPEN_EMAIL_TEXT2 = "Please find below the details of the Service Desk incident you have raised. Make sure that you store this email safely in the event you need to refer back to it";
	public static final String INC_OPEN_EMAIL_TEXT3 = "If you wish to update or check the status of this incident, please visit the Self Service Portal ";
	public static final String INC_OPEN_EMAIL_TEXT4 = "Thank you";
	public static final String INC_OPEN_EMAIL_TEXT5 = "Service Desk";
	public static final String NEWHIRE_EMAIL_TEXT1 = "Dear Customer";
	public static final String NEWHIRE_EMAIL_TEXT2 = "You are receiving this email because a request, ";
	public static final String NEWHIRE_EMAIL_TEXT3 = " has been closed. For additional setup instructions please click the link below.";
	public static final String NEWHIRE_EMAIL_TEXT4 ="for additional setup instructions please click the link below.";
	public static final String NEWHIRE_EMAIL_TEXT5 = "Request Number: ";
	public static final String NEWHIRE_EMAIL_TEXT6 = "Summary: ";
	public static final String NEWHIRE_EMAIL_TEXT7 = "If you believe this Request has been closed in error, please contact the Service Desk.";
	public static final String NEWHIRE_EMAIL_TEXT8 = "Please do not reply to this email. It is being sent from an unmonitored email address and any replies will be discarded";
	public static final String NEWHIRE_EMAIL_TEXT9 = "Please provide your feedback by clicking on the link below.";
	public static final String NEWHIRE_EMAIL_TEXT10 = "Thank You";
	public static final String NEWHIRE_EMAIL_TEXT11 = "The following request for your new ";
	public static final String NEWHIRE_EMAIL_TEXT12 = "Service Desk";
	public static final String NEWHIRE_ITEM_ENTERPRISEAPP = "Request access to an enterprise application";
	public static final String NEWHIRE_ITEM_NVISION = "PeopleSoft nVision application access";
	public static final String NEWHIRE_ITEM_WIRED = "Wired headset for phone or PC";
	public static final String NEWHIRE_ITEM_STANDARDLAPTOP = "MarketSource standard laptop computer";
	public static final String NEWHIRE_ITEM_ONBASE = "OnBase application access";
	public static final String NEWHIRE_ITEM_OASIS = "PeopleSoft Oasis application access";
	public static final String NEWHIRE_ITEM_PHONE = "Desk phone with extension";
	public static final String NEWHIRE_ITEM_EXTERNAL = "External computer monitor";
	public static final String NEWHIRE_ITEM_TIMECENTRAL = "Time Central application access";
	public static final String NEWHIRE_ITEM_FS = "PeopleSoft FS application access";
	public static final String NEWHIRE_ITEM_BUILDING = "MarketSource building access";
	public static final String NEWHIRE_ITEM_HR = "PeopleSoft HR application access";
	public static final String SECURITY_POLICYREPORTNUMMOREINFO = "This information is required by Asset Management for tracking stolen/lost assets.Please be aware that you WILL NOT receive a replacement laptop unless ALL of the police report information is provided. In addition you will be required to provide a copy of the police report as soon as it is made available to you";
	public static final String PRINCIPAL_CONSULTANT_EMAIL_TEXT1 = "The Principal Consultant request for ";
	public static final String PRINCIPAL_CONSULTANT_EMAIL_TEXT2 = "has been fulfilled and the ticket has been closed.";
	public static final String PRIVACY_DESCRIPTION = "A Data Subject Request is a formal request for information about the processing of an individual's personal data. In some jurisdictions, these requests can be made in writing or orally at any place, and to any person within the organization. It is important to immediately report a request so that it can be escalated to the Global Privacy Office.";
	public static final String PRIVACY_NOTE = "NOTE: Do not provide personal information beyond what is being asked for when completing the form.";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT1 = "Dear Customer";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT2 = "An account has been provisioned for your new employee, ";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT3 = ". The new employee's credentials can be found below.";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT4 = "Username: ";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT5 = "Password: 1234567";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT6 = "Email address: ";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT7 = "Use Your Username and password to log into your computer and applications";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT8 = "Please visit the Self Service Portal to make additional service requests or review the status of your open requests";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT9 = "Please do not reply to this email. It is being sent from an unmonitored email address and any replies will be discarded.";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT10 ="Thank You";
	public static final String NEWHIRE_CREDENTIAL_EMAIL_TEXT11 ="Service Desk";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT1 = "Please approve the following request:";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT2 = "Short Description: Report a Data Subject Request";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT3 = "Priority: 3 - Moderate";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT4 = "Requested For: ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT5 = "Requested By: ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT6 = "Summary of Requested items:";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT7 = ": 1 X Privacy Incident at $0.00 each";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT8 = "Options:";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT9 = "What is the nature of the data subject request? = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT10 = "What is the full name of the requester? = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT11 = "Known alias(es) = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT12 = "ID number(s) = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT13 = "Email address(es) = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT14 = "Brand(s) = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT15 = "Please indicate any known contact information for the requester = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT16 = "Country where requester resides = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT17 = "Date and time the request was made = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT18 = "How did you receive the request? = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT19 = "From Date = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT20 = "End Date = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT21 = "Deadline = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT22 = "Additional Information = ";
	public static final String PRIVACY_APPROVER_EMAIL_TEXT23 = "Comments:";
	public static final String SUBMITTER_EMAIL_TEXT1 = "You are receiving this email because a request, ";
	public static final String SUBMITTER_EMAIL_TEXT2 = " has been opened on your behalf.";
	public static final String SUBMITTER_EMAIL_TEXT3 = "Click here to view the request: ";
	public static final String PRIVACY_SUBMITTER_EMAILSHORTDESC = "Short description: Report a Data Subject Request";
	public static final String PRIVACY_RESOLVER_EMAIL_TEXT1 = "Requested for: NA End user";
	public static final String PRIVACY_RESOLVER_EMAIL_TEXT2 = "Short description: GDPR Data Subject Access Request";
	public static final String PRIVACY_RESOLVER_EMAIL_TEXT3 = "Description: We have received a Data Subject Access Request and ask that you provide the data in a customer presentable report.  All data must be completed and returned by the deadline or the company may incur severe penalties. Please see the additional information section for any specific instructions.";
	public static final String PRIVACY_RESOLVER_EMAIL_TEXT4 = "Click here to view: ";
	public static final String PRIVACY_TASK_SHORTDESC = "GDPR Data Subject Access Request";
	public static final String PRIVACY_ATS_DESC = "We have received a Data Subject Access Request and ask that you provide the data in a customer presentable report. All data must be completed and returned by the deadline or the company may incur severe penalties. Please see the additional information section for any specific instructions.";
	public static final String PRIVACY_ATS_ASSGROUP = "Connected ATS";
	public static final String PRIVACY_EMEA_DESC = "We have received a Data Subject Access Request and ask that you provide the data in a customer presentable report. All data must be completed and returned by the deadline or the company may incur severe penalties. Please see the additional information section for any specific instructions.";
	public static final String PRIVACY_EMEA_ASSGROUP = "EMEA Engineering";
	public static final String PRIVACY_EMEADEV_DESC = "We have received a Data Subject Access Request and ask that you provide the data in a customer presentable report. All data must be completed and returned by the deadline or the company may incur severe penalties. Please see the additional information section for any specific instructions.";
	public static final String PRIVACY_EMEADEV_ASSGROUP = "EMEA Dev GDPR";
	public static final String PRIVACY_EMEAERP_DESC = "We have received a Data Subject Access Request and ask that you provide the data in a customer presentable report. All data must be completed and returned by the deadline or the company may incur severe penalties. Please see the additional information section for any specific instructions.";
	public static final String PRIVACY_EMEAERP_ASSGROUP = "EMEA ERP GDPR";
	public static final String GENERAL_SUBMITTER_EMAILSHORTDESC = "Short description: Submit a general request to the Service Desk for fulfillment.";

	/** Constructor **/
	public ConstantsProperties(AllegisDriver driver) {
		this.driver = driver;
		ElementFactory.initElements(driver, this);
	}
}
