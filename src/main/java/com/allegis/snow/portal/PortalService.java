package com.allegis.snow.portal;

import com.allegis.snow.base.BasePage;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.WaitAllegis;

/**
 * Represents a portal services.
 * 
 * @author
 * @version 1.0
 * @since 01-18-2019
 */
public class PortalService extends BasePage {
	/** Constructor **/
	public PortalService(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}

	// navigate directly to categories page using URL.
	public void navigateCategoriesPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get("https://allegisgrouptraining.service-now.com/sp?id=sc_category");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get("https://allegisgrouptemp.service-now.com/sp?id=sc_category");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get("https://allegisgroup.service-now.com/sp?id=sc_category");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get("https://allegisgrouptest.service-now.com/sp?id=sc_category");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate directly to on-boarding employee page using URL.
	public void navigateOnboardEmployeePage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item_guide&sys_id=77272c9413a89b009448b2d96144b0b9&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item_guide&sys_id=77272c9413a89b009448b2d96144b0b9&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item_guide&sys_id=77272c9413a89b009448b2d96144b0b9&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item_guide&sys_id=77272c9413a89b009448b2d96144b0b9&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate directly to on-boarding employee APAC India sail point page using
	// URL.
	public void navigateOnboardEmployeeAPACIndiaSailPointPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp/?id=sc_cat_item_guide&sys_id=0ee95fb313c967400207f027d144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp/?id=sc_cat_item_guide&sys_id=0ee95fb313c967400207f027d144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp/?id=sc_cat_item_guide&sys_id=0ee95fb313c967400207f027d144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp/?id=sc_cat_item_guide&sys_id=0ee95fb313c967400207f027d144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}
	// navigate directely to on-boarding employee Sailpoint North America page
	public void navigateOnboardEmployeeSailPointNorthAmerica(String environment) {
		if(environment.contentEquals("test")) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		driver.get("https://allegisgrouptest.service-now.com/sp?id=sc_cat_item_guide&sys_id=1aca428713ffeb406000345fd144b01a&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
	}
	}
	// navigate directly to off-boarding employee page using URL.
	public void navigateOffboardingEmployeePage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=207b1645138747409448b2d96144b0b6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=207b1645138747409448b2d96144b0b6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=207b1645138747409448b2d96144b0b6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=207b1645138747409448b2d96144b0b6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate directly to privacy incident page using URL.
	public void navigatePrivacyIncidentPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=11a12d56137adb086000345fd144b064&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=11a12d56137adb086000345fd144b064&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=11a12d56137adb086000345fd144b064&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=11a12d56137adb086000345fd144b064&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate directly to security incident page using URL.
	public void navigateSecurityIncidentPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=491d4f761338e2002d763d27d144b011&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=491d4f761338e2002d763d27d144b011&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=491d4f761338e2002d763d27d144b011&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=491d4f761338e2002d763d27d144b011&sysparm_category=9b8a936913646600dbe53598d144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate directly to plan view page using URL.
	public void navigatePlanViewPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=68faa15b13f2a3006000345fd144b012&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=68faa15b13f2a3006000345fd144b012&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=68faa15b13f2a3006000345fd144b012&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=68faa15b13f2a3006000345fd144b012&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to job status change page using URL
	public void navigateJobStatusChangePage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item_guide&sys_id=3d74235813829f086000345fd144b03a&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item_guide&sys_id=3d74235813829f086000345fd144b03a&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item_guide&sys_id=3d74235813829f086000345fd144b03a&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item_guide&sys_id=3d74235813829f086000345fd144b03a&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to life change page using URL
	public void navigateLifeChangePage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item_guide&sys_id=f2d42586138e5fcc6000345fd144b01c&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item_guide&sys_id=f2d42586138e5fcc6000345fd144b01c&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item_guide&sys_id=f2d42586138e5fcc6000345fd144b01c&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item_guide&sys_id=f2d42586138e5fcc6000345fd144b01c&sysparm_category=b13a1d561306df006000345fd144b03a");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Request for Work page using URL
	public void navigateRequestForWork(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=9413e090136743409448b2d96144b053&sysparm_category=deb0930e1367c7409448b2d96144b031");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=9413e090136743409448b2d96144b053&sysparm_category=deb0930e1367c7409448b2d96144b031");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=9413e090136743409448b2d96144b053&sysparm_category=deb0930e1367c7409448b2d96144b031");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=9413e090136743409448b2d96144b053&sysparm_category=deb0930e1367c7409448b2d96144b031");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Conference Display page using URL
	public void navigateConferenceDisplay(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=c80caaf913733604dbe53598d144b066&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=c80caaf913733604dbe53598d144b066&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=c80caaf913733604dbe53598d144b066&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=c80caaf913733604dbe53598d144b066&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Email Forwarding page using URL
	public void navigateEmailForwardingPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=d896054413d267806000345fd144b0a5&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=d896054413d267806000345fd144b0a5&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=d896054413d267806000345fd144b0a5&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=d896054413d267806000345fd144b0a5&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to General Request page using URL
	public void navigateGeneralRequestPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=59109a7b13f91e40a110da82e144b091&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=59109a7b13f91e40a110da82e144b091&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=59109a7b13f91e40a110da82e144b091&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=59109a7b13f91e40a110da82e144b091&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to EMEA General Request page using URL
	public void navigateEMEAGeneralRequestPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=ad333adb139d97c09448b2d96144b01a&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=ad333adb139d97c09448b2d96144b01a&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=ad333adb139d97c09448b2d96144b01a&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=ad333adb139d97c09448b2d96144b01a&sysparm_category=da4737e613637e8083c575c36144b051");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to MiFi page using URL
	public void navigateMiFiPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=d53b775a13ca6200dbe53598d144b0c6&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=d53b775a13ca6200dbe53598d144b0c6&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=d53b775a13ca6200dbe53598d144b0c6&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=d53b775a13ca6200dbe53598d144b0c6&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Principal Consultant Onboarding page using URL
	public void navigatePrincipalConsultantOnboardingPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=cbdd4bdf13151bc09448b2d96144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=cbdd4bdf13151bc09448b2d96144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=cbdd4bdf13151bc09448b2d96144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=cbdd4bdf13151bc09448b2d96144b038&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Purchase a Domain page using URL
	public void navigatePurchaseaDomainPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=ef321091131687002d763d27d144b046&sysparm_category=6010626413b596406c22bc62e144b0bd");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=ef321091131687002d763d27d144b046&sysparm_category=6010626413b596406c22bc62e144b0bd");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=ef321091131687002d763d27d144b046&sysparm_category=6010626413b596406c22bc62e144b0bd");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=ef321091131687002d763d27d144b046&sysparm_category=6010626413b596406c22bc62e144b0bd");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Report an Issue page using URL
	public void navigateReportanIssuePage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=d8bc71bc13b23a402d763d27d144b02e&sysparm_category=1528cb5b137b6f406000345fd144b0de");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=d8bc71bc13b23a402d763d27d144b02e&sysparm_category=1528cb5b137b6f406000345fd144b0de");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=d8bc71bc13b23a402d763d27d144b02e&sysparm_category=1528cb5b137b6f406000345fd144b0de");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=d8bc71bc13b23a402d763d27d144b02e&sysparm_category=1528cb5b137b6f406000345fd144b0de");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Return Equipment(RMA) page using URL
	public void navigateReturnEquipmentPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=5ffa652913abdb006000345fd144b020&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=5ffa652913abdb006000345fd144b020&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=5ffa652913abdb006000345fd144b020&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=5ffa652913abdb006000345fd144b020&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Sales force page using URL
	public void navigateSalesforcePage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=e2baf8a1137d67009448b2d96144b0a4&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=e2baf8a1137d67009448b2d96144b0a4&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=e2baf8a1137d67009448b2d96144b0a4&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=e2baf8a1137d67009448b2d96144b0a4&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Vanity Email page using URL
	public void navigateVanityEmailPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=b045996613a9cb00dbe53598d144b0d6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=b045996613a9cb00dbe53598d144b0d6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=b045996613a9cb00dbe53598d144b0d6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=b045996613a9cb00dbe53598d144b0d6&sysparm_category=2e10e6a013b596406c22bc62e144b0fb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Web Conferencing page using URL
	public void navigateWebConferencingPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=5a1d0ba11307fa002d763d27d144b07b&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=5a1d0ba11307fa002d763d27d144b07b&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=5a1d0ba11307fa002d763d27d144b07b&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=5a1d0ba11307fa002d763d27d144b07b&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Web Conferencing EMEA page using URL
	public void navigateWebConferencingEMEAPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=8e850876134743009448b2d96144b0b9&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=8e850876134743009448b2d96144b0b9&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=8e850876134743009448b2d96144b0b9&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=8e850876134743009448b2d96144b0b9&sysparm_category=278a936913646600dbe53598d144b0f1");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Windows 10 Upgrade page using URL
	public void navigateWindows10UpgradePage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=4995d2741390ef086000345fd144b08d&sysparm_category=3c63713a1355de006000745fd144b0f4");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=4995d2741390ef086000345fd144b08d&sysparm_category=3c63713a1355de006000745fd144b0f4");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=4995d2741390ef086000345fd144b08d&sysparm_category=3c63713a1355de006000745fd144b0f4");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=4995d2741390ef086000345fd144b08d&sysparm_category=3c63713a1355de006000745fd144b0f4");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to Wired Headset page using URL
	public void navigateWiredHeadset(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=94f81a4913effa802d763d27d144b078&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=94f81a4913effa802d763d27d144b078&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=94f81a4913effa802d763d27d144b078&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=94f81a4913effa802d763d27d144b078&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate to USB Headset page using URL
	public void navigateUSBHeadset(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=991784b513c7fa002d763d27d144b0ac&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=991784b513c7fa002d763d27d144b0ac&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=991784b513c7fa002d763d27d144b0ac&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=991784b513c7fa002d763d27d144b0ac&sysparm_category=48d67b1813619240ede1735fd144b0eb");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate directly to RWS New Account page using URL.
	public void navigateRWSNewAccountPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=427a9c4c13d6a7809448b2d96144b0fc&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=427a9c4c13d6a7809448b2d96144b0fc&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=427a9c4c13d6a7809448b2d96144b0fc&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=427a9c4c13d6a7809448b2d96144b0fc&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}

	// navigate directly to Additional RWS Access page using URL.
	public void navigateAdditionalRWSAccessPage(String environment) {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("training")) {
			driver.get(
					"https://allegisgrouptraining.service-now.com/sp?id=sc_cat_item&sys_id=810c42dd13fea3406000345fd144b029&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("temp")) {
			driver.get(
					"https://allegisgrouptemp.service-now.com/sp?id=sc_cat_item&sys_id=810c42dd13fea3406000345fd144b029&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else if (environment.contentEquals("prod")) {
			driver.get(
					"https://allegisgroup.service-now.com/sp?id=sc_cat_item&sys_id=810c42dd13fea3406000345fd144b029&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		} else {
			driver.get(
					"https://allegisgrouptest.service-now.com/sp?id=sc_cat_item&sys_id=810c42dd13fea3406000345fd144b029&sysparm_category=f22b856913bd67009448b2d96144b0ab");
			WaitAllegis.hardWait(MAX_TIMEOUT);
		}
	}
}