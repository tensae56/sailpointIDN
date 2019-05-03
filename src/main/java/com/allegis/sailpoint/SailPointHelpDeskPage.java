package com.allegis.sailpoint;

import org.openqa.selenium.support.FindBy;

import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Textbox;

public class SailPointHelpDeskPage  {
	@FindBy(xpath = "//span[@class='slpt-nav-item-label'][contains(text(),' Helpdesk ')]")
	private Element wbeHelpDeskIcon;
	
	@FindBy(xpath = "//input[@id='slpt-user-list-panel-search-inputEl']")
	private Textbox txtSearchUsers;
	
	@FindBy(xpath = "//td[@class='slpt-clickable-cell-text'][contains(text(),'')]")
	private Element wbeSelectedUser;
	
	@FindBy(xpath = "//span[@id='slpt-user-panel-accounts-tab-btnInnerEl']")
	private Element wbeAccountsTab;
	
	@FindBy(xpath = "//span[@id='slpt-user-panel-activity-tab-btnInnerEl\']")
	private Element wbeActivityTab;
	
}
