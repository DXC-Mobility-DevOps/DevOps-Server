package com.hpe.devops.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;

import com.hpe.devops.entities.UserDetails;
import com.hpe.devops.utilities.ServerConfiguration;

@Path("/user/v01")
public class UserWebController {

	/*************************** Check Credentials ***************************/

	@GET
	@Path("/isAuthenticated/{userName}/{password}")
	@Produces("application/json")
	public Response isAuthenticated(@PathParam("userName") String userName, @PathParam("password") String password) {
		return checkUserDetails(userName, password);
	}

	private Response checkUserDetails(String userName, String password) {
		UserDetails userDetails = ServerConfiguration.getUserDetails();
		if (userName.equals(userDetails.userName) && password.equals(userDetails.password)) {
			return Response.status(HttpStatus.SC_OK)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.build();
		}
		return Response.status(HttpStatus.SC_UNAUTHORIZED)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.build();
	}

}

// http://localhost:8080/DevOpsServer/user/v01/isAuthenticated/admin/admin
