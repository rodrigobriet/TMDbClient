package br.com.rodrigobriet.tmdbclient.resources.certifications.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.certifications.models.submodels.MovieCertificationsList;

public class MovieCertifications {

	@SerializedName("certifications")
	private MovieCertificationsList certifications;

	public MovieCertificationsList getCertifications() {
		return certifications;
	}
	
}
