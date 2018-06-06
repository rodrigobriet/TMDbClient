package br.com.rodrigobriet.tmdbclient.resources.credits;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.resources.credits.models.CreditsDetails;

public class Credits extends ResourcesConf {

	public Credits(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public Resource<CreditsDetails> getDetails(String creditId) {
		return new Resource<>("/credit/{credit_id}", apiKey, requestService, new GsonMapping<>(CreditsDetails.class), creditId);
	}
}
