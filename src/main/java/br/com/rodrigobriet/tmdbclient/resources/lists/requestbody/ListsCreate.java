package br.com.rodrigobriet.tmdbclient.resources.lists.requestbody;

import com.google.gson.annotations.SerializedName;

public class ListsCreate {

	@SerializedName("name")
	private String name;
	
	@SerializedName("description")
	private String description;
	
	@SerializedName("language")
	private String language;
	
	public ListsCreate(String name, String description, String language) {
		super();
		this.name = name;
		this.description = description;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getLanguage() {
		return language;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
