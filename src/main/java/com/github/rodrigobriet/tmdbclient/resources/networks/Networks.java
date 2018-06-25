package com.github.rodrigobriet.tmdbclient.resources.networks;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.Resource;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.resources.networks.models.NetworksAltenativeNames;
import com.github.rodrigobriet.tmdbclient.resources.networks.models.NetworksDetails;
import com.github.rodrigobriet.tmdbclient.resources.networks.models.NetworksImages;

public class Networks extends ResourcesHolder {
	
	public Networks(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public Resource<NetworksDetails> getDetails(int networkId) {
		return new Resource.Builder<NetworksDetails>(requestService, mappingService, apiKey)
				.setPath("/network/{network_id}")
				.setPathValues(""+networkId)
				.setModelClass(NetworksDetails.class)
				.build();
	}

	public Resource<NetworksAltenativeNames> getAlternativeNames(int networkId) {
		return new Resource.Builder<NetworksAltenativeNames>(requestService, mappingService, apiKey)
				.setPath("/network/{network_id}/alternative_names")
				.setPathValues(""+networkId)
				.setModelClass(NetworksAltenativeNames.class)
				.build();
	}
	
	public Resource<NetworksImages> getImages(int networkId) {
		return new Resource.Builder<NetworksImages>(requestService, mappingService, apiKey)
				.setPath("/network/{network_id}/images")
				.setPathValues(""+networkId)
				.setModelClass(NetworksImages.class)
				.build();
	}
	
}
