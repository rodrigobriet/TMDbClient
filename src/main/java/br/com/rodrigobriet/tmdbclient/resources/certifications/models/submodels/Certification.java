package br.com.rodrigobriet.tmdbclient.resources.certifications.models.submodels;

import com.google.gson.annotations.SerializedName;

public class Certification {

	@SerializedName("certification")
	private String certification;
	
	@SerializedName("meaning")
	private String meaning;
	
	@SerializedName("order")
	private int order;

	public String getCertification() {
		return certification;
	}

	public String getMeaning() {
		return meaning;
	}

	public int getOrder() {
		return order;
	}
	
}
