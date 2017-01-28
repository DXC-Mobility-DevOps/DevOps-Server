package com.hpe.devops.utilities;

import com.hpe.devops.entities.UserDetails;

public class ServerConfiguration {
	
	// Property File Instance
	private static PropertyFileReader propertyFileReader = PropertyFileReader.getInstance();
	
	public static UserDetails getUserDetails() {
		UserDetails userDetails = new UserDetails();
		userDetails.userName = propertyFileReader.getProperty(IServerConfiguration.USER_NAME);
		userDetails.password = propertyFileReader.getProperty(IServerConfiguration.PASSWORD);
		return userDetails;
	}
	
}