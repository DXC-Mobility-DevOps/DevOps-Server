package com.hpe.devops.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;

@Path("/v01")
public class BaseWebController {
	

	/*************************** Check Connection ****************************/
	
	@GET
    @Path("/isConnected")
    @Produces("text/plain")
    public Response isConnected() {
        return Response.status(HttpStatus.SC_OK).build();    
    }
	 
}

// http://localhost:8080/DevOpsServer/v01/isConnected

// http://35.166.79.166:8080/DevOpsServer/v01/isConnected