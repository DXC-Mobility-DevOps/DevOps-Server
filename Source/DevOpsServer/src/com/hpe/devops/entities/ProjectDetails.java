package com.hpe.devops.entities;

import java.util.ArrayList;

public class ProjectDetails {
	public String projectName;
	public String buildVersion;
	public String buildName;
	public String buildPlatform;
	public String buildStatus;
	public String buildHealth;
	public String buildTriggeredBy;
	public String codeCoveragePercentage;
	public String lastCommitDate;
	public String lastCommitBy;
	public String lastCommitComment;
	public String lastCommitEmailId;
	
	public static ArrayList<ProjectDetails> getDummyData() {
		ArrayList<ProjectDetails> projectDetailsList = new ArrayList<>();
		
		ProjectDetails projectDetails1 = new ProjectDetails();
		projectDetails1.projectName = "Aeroplan";
		projectDetails1.buildVersion = "2.0.5";
		projectDetails1.buildName = "Aeroplan_2.0.5";
		projectDetails1.buildPlatform = "Android";
		projectDetails1.buildStatus = "Success";
		projectDetails1.buildHealth = "100";
		projectDetails1.buildTriggeredBy = "SCM Change";
		projectDetails1.codeCoveragePercentage = "100";
		projectDetails1.lastCommitDate = "04-Apr-2017 14:00";
		projectDetails1.lastCommitBy = "Gokul Nath Periasamy";
		projectDetails1.lastCommitComment = "UI/UX Modifications for MYR";
		projectDetails1.lastCommitEmailId = "gokul-nath.periasamy@hpe.com";
		projectDetailsList.add(projectDetails1);
		
		ProjectDetails projectDetails2 = new ProjectDetails();
		projectDetails2.projectName = "AHOLD";
		projectDetails2.buildVersion = "3.6";
		projectDetails2.buildName = "AHOLD_3.6";
		projectDetails2.buildPlatform = "Android";
		projectDetails2.buildStatus = "Success";
		projectDetails2.buildHealth = "80";
		projectDetails2.buildTriggeredBy = "SCM Change";
		projectDetails2.codeCoveragePercentage = "80";
		projectDetails2.lastCommitDate = "02-Apr-2017 09:00";
		projectDetails2.lastCommitBy = "Vivek Kumar";
		projectDetails2.lastCommitComment = "Implement UI changes.";
		projectDetails2.lastCommitEmailId = "vicek-kumar@hpe.com";
		projectDetailsList.add(projectDetails2);
		
		ProjectDetails projectDetails3 = new ProjectDetails();
		projectDetails3.projectName = "SHELL";
		projectDetails3.buildVersion = "12.2.3.5";
		projectDetails3.buildName = "SHELL_12.2.3.5";
		projectDetails3.buildPlatform = "Android";
		projectDetails3.buildStatus = "Failed";
		projectDetails3.buildHealth = "40";
		projectDetails3.buildTriggeredBy = "SCM Change";
		projectDetails3.codeCoveragePercentage = "50";
		projectDetails3.lastCommitDate = "03-Apr-2017 05:50";
		projectDetails3.lastCommitBy = "Gokul Nath Periasamy";
		projectDetails3.lastCommitComment = "Shell Fixes";
		projectDetails3.lastCommitEmailId = "gokul-nath.periasamy@hpe.com";
		projectDetailsList.add(projectDetails3);
		
		ProjectDetails projectDetails4 = new ProjectDetails();
		projectDetails4.projectName = "AmericanAirlines";
		projectDetails4.buildVersion = "8.5.1";
		projectDetails4.buildName = "AmericanAirlines_8.5.1";
		projectDetails4.buildPlatform = "Android";
		projectDetails4.buildStatus = "Success";
		projectDetails4.buildHealth = "100";
		projectDetails4.buildTriggeredBy = "SCM Change";
		projectDetails4.codeCoveragePercentage = "100";
		projectDetails4.lastCommitDate = "04-Apr-2017 14:00";
		projectDetails4.lastCommitBy = "Gokul Nath Periasamy";
		projectDetails4.lastCommitComment = "Fix build issues.";
		projectDetails4.lastCommitEmailId = "gokul-nath.periasamy@hpe.com";
		projectDetailsList.add(projectDetails4);
		
		ProjectDetails projectDetails5 = new ProjectDetails();
		projectDetails5.projectName = "UnitedAirlines";
		projectDetails5.buildVersion = "16.2";
		projectDetails5.buildName = "UnitedAirlines_16.2";
		projectDetails5.buildPlatform = "Android";
		projectDetails5.buildStatus = "Success";
		projectDetails5.buildHealth = "30";
		projectDetails5.buildTriggeredBy = "SCM Change";
		projectDetails5.codeCoveragePercentage = "60";
		projectDetails5.lastCommitDate = "03-Apr-2017 14:00";
		projectDetails5.lastCommitBy = "Gokul Nath Periasamy";
		projectDetails5.lastCommitComment = "Include new Jars";
		projectDetails5.lastCommitEmailId = "ua-user@hpe.com";
		projectDetailsList.add(projectDetails5);
		
		ProjectDetails projectDetails6 = new ProjectDetails();
		projectDetails6.projectName = "DXCIoT";
		projectDetails6.buildVersion = "2.0.5";
		projectDetails6.buildName = "DXCIoT_2.0.5";
		projectDetails6.buildPlatform = "Android";
		projectDetails6.buildStatus = "Success";
		projectDetails6.buildHealth = "100";
		projectDetails6.buildTriggeredBy = "Manual by 19.2.5.10";
		projectDetails6.codeCoveragePercentage = "100";
		projectDetails6.lastCommitDate = "-";
		projectDetails6.lastCommitBy = "-";
		projectDetails6.lastCommitComment = "-";
		projectDetails6.lastCommitEmailId = "-";
		projectDetailsList.add(projectDetails6);
		
		ProjectDetails projectDetails7 = new ProjectDetails();
		projectDetails7.projectName = "DevOps-iOSClient";
		projectDetails7.buildVersion = "1.0";
		projectDetails7.buildName = "DevOps-iOSClient_1.0";
		projectDetails7.buildPlatform = "iOS";
		projectDetails7.buildStatus = "Success";
		projectDetails7.buildHealth = "100";
		projectDetails7.buildTriggeredBy = "SCM Change";
		projectDetails7.codeCoveragePercentage = "100";
		projectDetails7.lastCommitDate = "04-Apr-2017 14:00";
		projectDetails7.lastCommitBy = "Gokul Nath Periasamy";
		projectDetails7.lastCommitComment = "Initial Commit";
		projectDetails7.lastCommitEmailId = "gokul-nath.periasamy@hpe.com";
		projectDetailsList.add(projectDetails7);
		
		return projectDetailsList;
	}
}
