package br.com.rodrigobriet.tmdbclient.resources.credits.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.credits.models.submodels.CreditsDetailsMedia;
import br.com.rodrigobriet.tmdbclient.resources.credits.models.submodels.CreditsDetailsPerson;

public class CreditsDetails {

	@SerializedName("credit_type")
	private String creditType;
	
	@SerializedName("department")
	private String department;
	
	@SerializedName("job")
	private String job;
	
	@SerializedName("media")
	private CreditsDetailsMedia media;
	
	@SerializedName("media_type")
	private String mediaType;
	
	@SerializedName("id")
	private String id;
	
	@SerializedName("person")
	private CreditsDetailsPerson person;

	public String getCreditType() {
		return creditType;
	}

	public String getDepartment() {
		return department;
	}

	public String getJob() {
		return job;
	}

	public CreditsDetailsMedia getMedia() {
		return media;
	}

	public String getMediaType() {
		return mediaType;
	}

	public String getId() {
		return id;
	}

	public CreditsDetailsPerson getPerson() {
		return person;
	}
	
}
