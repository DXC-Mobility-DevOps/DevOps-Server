package com.hpe.devops.controllers;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.hpe.devops.entities.ProjectDetails;

@Path("/v01/projectdetails")
public class ProjectDetailsWebController {

	@GET
	@Path("/list")
	@Produces("application/json")
	public ArrayList<ProjectDetails> getProjectDetailsList() {
		return ProjectDetails.getDummyData();
	}

}

// http://localhost:8080/DevOpsServer/v01/projectdetails/list

// http://35.166.79.166:8080/DevOpsServer/v01/projectdetails/list
