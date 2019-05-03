package com.allegis.sailpoint;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.allegis.snow.base.LoginPage;
import com.framework.utils.TestEnvironment;
import com.framework.utils.TestReporter;
import com.framework.utils.annotationsAllegis.Retry;
import com.framework.utils.dataProviders.ExcelDataProvider;

public class PeopleSoftDataEntryTestEmployee extends TestEnvironment {
	public static String resource = "src/main/resources/excelsheets/peopleSoftDataSheet.xlsx";

	/**
	 * read data from excel
	 */
	@DataProvider(name = "TestData", parallel = true)
	public Object[][] TestData() {
		try {
			Object[][] excelData = new ExcelDataProvider("/excelsheets/peopleSoftDataSheet.xlsx", "peopleSoft_data")
					.getTestData();
			return excelData;
		} catch (Exception e) {
			TestReporter.assertTrue(false, "An error occured while accessing the Data Provider" + e);
			e.printStackTrace();
		}
		return new Object[][] { {} };
	}

	/**
	 * setup the environment and launch the application.
	 * 
	 * @param runLocation      local/remote.
	 * 
	 * @param browserUnderTest Chrome/IE/FireFox.
	 * @param browserVersion   version of the browser.
	 * @param operatingSystem  window.;
	 * @param environment      test/prod.
	 * @param updateVersionOne result status true/false.
	 * @return None.
	 */
	@BeforeClass
	@Parameters({ "runLocation", "browserUnderTest", "browserVersion", "operatingSystem", "environment",
			"updateVersionOne" })
	public void setup(@Optional String runLocation, String browserUnderTest, String browserVersion,
			String operatingSystem, String environment, boolean updateVersionOne) {
		setBrowserUnderTest(browserUnderTest);
		setBrowserVersion(browserVersion);
		setOperatingSystem(operatingSystem);
		setRunLocation(runLocation);
		setTestEnvironment(environment);
		setUpdateVersionOne(updateVersionOne);
	}

	/**
	 * close opened application.
	 * 
	 * @param testResults Result of the test case.
	 * @return None
	 */
	@AfterClass
	public void close(ITestContext testResults) {
		endTest("New Hire OnBoard for EMEA PS application", testResults);
	}

	/**
	 * NA New Hire OnBoarding.Create a a New Hire OnBoard Request.
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws IOException 
	 * @throws Exception
	 */
	@Retry(2)
	@Test(dataProvider = "TestData", enabled = true, description = "Data Entry Test in PeopleSoft")
	// @Preamble(versionOneTestID = { })
	public void dataEntryPeopleSoft(String number, String firstName, String middleName, String lastName, String gender,
			String nationalID, String ethnicGroup, String region, String opco, String department, String location,
			String jobCode, String supervisorID, String jobType, String payGroup, String employeeType,
			String taxLocationCode, String holidaySchedule, String rateCode, String benefits, String benefitProgram) throws IOException {
		setApplicationUnderTest("PEOPLESOFT");
		testStart("Data Entry Test in PeopleSoft");
		int row = Integer.parseInt(number);
		String PEOPLESOFTDATAENTRY = null;
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.loginWithCredentialsPF("PEOPLESOFT_TEST");
		PeopleSoftEmployeeAddPersonPage psDataEntry = new PeopleSoftEmployeeAddPersonPage(getDriver());
		psDataEntry.addPerson();
		psDataEntry.addName(firstName, middleName, lastName);
		psDataEntry.setAge();
		psDataEntry.setGender(gender);
		psDataEntry.setNationalID(nationalID);
		psDataEntry.clickContactInfo();
		psDataEntry.clickAddAddressDetail();
		psDataEntry.clickAddAddress();
		psDataEntry.editAddress();
		psDataEntry.clickRegional();
		psDataEntry.selectRegion(ethnicGroup);
		psDataEntry.clickCustomPersonalData();
		psDataEntry.setCustomPersonalData();
		psDataEntry.clickShowMoreTabsIcon();
		psDataEntry.clickOrganizationalRelationship();
		psDataEntry.setOrganizationalRelationShipEmployee();
		psDataEntry.clickAddRelationShipAndCaptureEmployeeId();
		psDataEntry.setWorkLocation(region, opco, department, location);
		psDataEntry.clickAndSetCustomData();
		psDataEntry.clickAndSetJobInformation(jobCode, supervisorID, jobType);
		psDataEntry.clickAndSetPayroll(payGroup, employeeType, taxLocationCode, holidaySchedule);
		psDataEntry.clickAndSetCompensation(rateCode);
		psDataEntry.setBenefitProgramParticipation(benefits, benefitProgram);
		psDataEntry.handlePopUp();
		psDataEntry.verifyAccountCreation();
		PEOPLESOFTDATAENTRY = psDataEntry.captureEmployeeID();
		psDataEntry.writeTo(resource, "peopleSoft_data", "employeeID", row, PEOPLESOFTDATAENTRY);

	}
}
