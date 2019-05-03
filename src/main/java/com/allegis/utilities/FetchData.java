package com.allegis.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Represents fetchdata to handle data through properties file.
 * 
 * @author Kiran
 * @version 1.0
 * @since 05-01-2018
 */
public class FetchData {
	Properties props = new Properties();
	
	/**
	* load data from properties file
	* 
	* @param None.
	* @return None
	* 
	*/
	public void loadData() throws IOException {
		String resourceName = "textValidation.properties";
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
		    props.load(resourceStream);
		}
	}
	
	/**
	* fetch and return data based on the paramater
	* 
	* @param data.
	* 				data to load from properties file
	* @return String 
	* 
	*/
	public String text(String data) throws IOException{
		loadData();
		return props.getProperty(data);		
	}
}
