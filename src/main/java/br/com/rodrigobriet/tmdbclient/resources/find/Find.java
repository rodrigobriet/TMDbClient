package br.com.rodrigobriet.tmdbclient.resources.find;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.ExternalSourceQuery;
import br.com.rodrigobriet.tmdbclient.resources.find.models.FindById;

public class Find extends ResourcesConf {

	public Find(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQuery<FindById, ExternalSourceQuery> byExternalId(String externalSource, String externalId) {
		ResourceQuery<FindById, ExternalSourceQuery> r = new ResourceQuery<>("/find/{external_id}", apiKey, requestService, new GsonMapping<>(FindById.class), externalId);
		return r.setQuery(ExternalSourceQuery.EXTERNAL_SOURCE, externalSource);
	}

}
