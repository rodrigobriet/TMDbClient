package br.com.rodrigobriet.tmdbclient.resources.networks.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.networks.models.submodels.NetworksImagesLogosItem;

public class NetworksImages {
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("logos")
	private List<NetworksImagesLogosItem> logos;

	public int getId() {
		return id;
	}

	public List<NetworksImagesLogosItem> getLogos() {
		return logos;
	}
	
}
