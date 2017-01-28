package com.hpe.devops.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {

	// Singleton Instance
	private static PropertyFileReader propertyFileReader = null;
	
	private static Properties properties = null;
	
	private PropertyFileReader() {
		properties = new Properties();
		loadPropertyFile();
	}
	
	public static PropertyFileReader getInstance() {
		if (propertyFileReader == null) {
			synchronized (PropertyFileReader.class) {
				if (propertyFileReader == null) {
					propertyFileReader = new PropertyFileReader();
				}
			}
		}
		return propertyFileReader;
	}

	private void loadPropertyFile() {
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(IServerConfiguration.PROPERTY_FILE_NAME);
		try {	
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key){
		return properties.getProperty(key);
	}

}
