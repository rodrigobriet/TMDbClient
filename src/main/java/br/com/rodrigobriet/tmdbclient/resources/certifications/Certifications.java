package br.com.rodrigobriet.tmdbclient.resources.certifications;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.resources.certifications.models.MovieCertifications;
import br.com.rodrigobriet.tmdbclient.resources.certifications.models.TvCertifications;

public class Certifications extends ResourcesConf {

	public Certifications(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public Resource<MovieCertifications> getMovieCertifications() {
		return new Resource<>("/certification/movie/list", apiKey, requestService, new GsonMapping<>(MovieCertifications.class));
	}

	public Resource<TvCertifications> getTvCertifications() {
		return new Resource<>("/certification/tv/list", apiKey, requestService, new GsonMapping<>(TvCertifications.class));
	}
}
