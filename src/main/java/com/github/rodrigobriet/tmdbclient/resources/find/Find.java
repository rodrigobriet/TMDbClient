package com.github.rodrigobriet.tmdbclient.resources.find;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.ExternalSourceQuery;
import com.github.rodrigobriet.tmdbclient.resources.certifications.models.MovieCertifications;
import com.github.rodrigobriet.tmdbclient.resources.find.models.FindById;

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
