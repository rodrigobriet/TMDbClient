package br.com.rodrigobriet.tmdbclient.resources.configuration.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ConfigurationJobs {

	@SerializedName("department")
	private String department;
	
	@SerializedName("jobs")
	private List<String> jobs;

	public String getDepartment() {
		return department;
	}

	public List<String> getJobs() {
		return jobs;
	}
	
}
