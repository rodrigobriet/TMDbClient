package com.github.rodrigobriet.tmdbclient.resources.certifications.models;

import com.github.rodrigobriet.tmdbclient.resources.certifications.models.submodels.MovieCertificationsList;
import com.google.gson.annotations.SerializedName;

public class MovieCertifications {

	@SerializedName("certifications")
	private MovieCertificationsList certifications;

	public MovieCertificationsList getCertifications() {
		return certifications;
	}
	
}
