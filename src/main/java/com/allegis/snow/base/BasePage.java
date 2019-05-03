package com.allegis.snow.base;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.allegis.utilities.ExcelApiTest;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Represents an constants .
 * 
 * @author Shiva
 * @version 1.0
 * @since 02-20-2018
 */
public class BasePage {
	protected AllegisDriver driver;	
	public static int ROW = 0;
	public static int COLUMN = 0;
	public static final int MIN_TIMEOUT = 1;
	public static final int MAX_TIMEOUT = 2;
	public static final int TIMEOUT = 6;
	
	/** Constructor **/
	public BasePage(AllegisDriver driver) {
		this.driver = driver;
		ElementFactory.initElements(driver, this);
	}

	/**
	 * wait for object to be visible in specified time.
	 * 
	 * @param element
	 *            Element.
	 * @return None
	 */
	public void waitForObjectToVisible(Element element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * wait for object to be clickable in specified time.
	 * 
	 * @param element
	 *            Element.
	 * @return None
	 */
	public void waitForObjectToBeClickable(Element element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 40);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * wait for text to be present in element in specified time.
	 * 
	 * @param element
	 *            Element.
	 * @param text
	 *            to be present.
	 * @return None
	 */
	public void textToBePresentInElement(Element element, String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver.getWebDriver(), 40);
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * select value from any drop down.
	 * 
	 * @param text to be select.
	 * @param element Element.
	 * @return None
	 */
	public void selectValueInDropDown(String text, Element element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	/**
	 * get selected value from any drop down.
	 * 
	 * @param element Element.
	 * @return value
	 */
	public String getSelectedValueInDropDown(Element element) {
		Select select = new Select(element);
		WebElement option = select.getFirstSelectedOption();
		return option.getText();
	}
	
	/**
	* retry identification of stale elements
	* 
	* @param by
	*           By
	* @return boolean
	* 
	*/
	public boolean retryAttempt(By by) {
	    boolean validate = false;
	    int k = 0;
	    while(k < 5) {
	        try {
	            driver.findElement(by).click();
	            validate = true;
	            break;
	        } catch(StaleElementReferenceException e) {
	        }
	        k++;
	    }
	    return validate;
	}
	
	/**
	 * to get the random characters
	 * @param numberOfChar
	 *            the number of random chars to be generated
	 * 
	 * @return char
	 */
	public static String generateRandomChars(int numberOfChar) {
	    String text="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < numberOfChar; i++) {
	        sb.append(text.charAt(random.nextInt(text.length())));
	    }
	    return sb.toString();
	}
	
	/**
	 * switch the frame from default.
	 * 
	 * @param None.
	 * @return None
	 */
	public void switchFrame() {
		driver.getWebDriver().switchTo().defaultContent();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		driver.getWebDriver().switchTo().frame("gsft_main");
		WaitAllegis.hardWait(MAX_TIMEOUT);
	}
	
	/**
	 * switch the frame from default.
	 * 
	 * @param None.
	 * @return None
	 */
	public void switchFrameToDefault() {
		driver.getWebDriver().switchTo().defaultContent();
		WaitAllegis.hardWait(MAX_TIMEOUT);
	}
	
	/**
	 * delete all cookies and set the url.
	 * 
	 * @param None.
	 * @return None
	 */
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
		driver.get("about:");
		WaitAllegis.hardWait(MAX_TIMEOUT);
	}
	
	
	/**
	 * write data to excel
	 * 
	 * @param sheetName
	 * @param columnName
	 * @param rowc
	 * @param text
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
