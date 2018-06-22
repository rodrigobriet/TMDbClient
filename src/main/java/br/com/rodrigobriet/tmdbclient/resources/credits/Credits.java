package br.com.rodrigobriet.tmdbclient.resources.credits;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.resources.credits.models.CreditsDetails;

public class Credits extends ResourcesHolder {

	public Credits(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public Resource<CreditsDetails> getDetails(String creditId) {
		//return new Resource<>("/credit/{credit_id}", apiKey, requestService, new GsonMapping<>(CreditsDetails.class), creditId);
		return new Resource.Builder<CreditsDetails>(requestService, mappingService, apiKey)
				.setPath("/credit/{credit_id}")
				.setPathValues(""+creditId)
				.setModelClass(CreditsDetails.class)
				.build();
	}
}
