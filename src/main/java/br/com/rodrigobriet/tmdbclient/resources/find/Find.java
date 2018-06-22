package br.com.rodrigobriet.tmdbclient.resources.find;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.ExternalSourceQuery;
import br.com.rodrigobriet.tmdbclient.resources.certifications.models.MovieCertifications;
import br.com.rodrigobriet.tmdbclient.resources.find.models.FindById;

public class Find extends ResourcesHolder {

	public Find(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}
	
	public ResourceQuery<FindById, ExternalSourceQuery> byExternalId(String externalSource, String externalId) {
		ResourceQuery<FindById, ExternalSourceQuery> r = new ResourceQuery.Builder<FindById, ExternalSourceQuery>(requestService, mappingService, apiKey)
				.setPath("/find/{external_id}")
				.setPathValues(externalId)
				.setModelClass(MovieCertifications.class)
				.build();
		return r.setQuery(ExternalSourceQuery.EXTERNAL_SOURCE, externalSource);
	}

}
