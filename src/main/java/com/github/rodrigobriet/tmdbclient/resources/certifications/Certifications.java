package com.github.rodrigobriet.tmdbclient.resources.certifications;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.Resource;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.resources.certifications.models.MovieCertifications;
import com.github.rodrigobriet.tmdbclient.resources.certifications.models.TvCertifications;

public class Certifications extends ResourcesHolder {

	public Certifications(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}
	
	public Resource<MovieCertifications> getMovieCertifications() {
		return new Resource.Builder<MovieCertifications>(requestService, mappingService, apiKey)
				.setPath("/certification/movie/list")
				.setModelClass(MovieCertifications.class)
				.build();
	}

	public Resource<TvCertifications> getTvCertifications() {
		return new Resource.Builder<TvCertifications>(requestService, mappingService, apiKey)
				.setPath("/certification/tv/list")
				.setModelClass(TvCertifications.class)
				.build();
	}
}
