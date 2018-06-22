package br.com.rodrigobriet.tmdbclient.resources.certifications;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.resources.certifications.models.MovieCertifications;
import br.com.rodrigobriet.tmdbclient.resources.certifications.models.TvCertifications;

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
