package br.com.rodrigobriet.tmdbclient.resources.networks;


import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.resources.networks.models.NetworksAltenativeNames;
import br.com.rodrigobriet.tmdbclient.resources.networks.models.NetworksDetails;
import br.com.rodrigobriet.tmdbclient.resources.networks.models.NetworksImages;

public class Networks extends ResourcesConf {

	public Networks(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public Resource<NetworksDetails> getDetails(int networkId) {
		return new Resource<>("/network/{network_id}", apiKey, requestService, new GsonMapping<>(NetworksDetails.class), networkId);
	}

	public Resource<NetworksAltenativeNames> getAlternativeNames(int networkId) {
		return new Resource<>("/network/{network_id}/alternative_names", apiKey, requestService, new GsonMapping<>(NetworksAltenativeNames.class), networkId);
	}
	
	public Resource<NetworksImages> getImages(int networkId) {
		return new Resource<>("/network/{network_id}/images", apiKey, requestService, new GsonMapping<>(NetworksImages.class), networkId);
	}
	
}
