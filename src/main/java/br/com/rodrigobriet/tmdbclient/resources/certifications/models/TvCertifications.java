package br.com.rodrigobriet.tmdbclient.resources.certifications.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.certifications.models.submodels.TvCertificationsList;

public class TvCertifications {

	@SerializedName("certifications")
	private TvCertificationsList certifications;

	public TvCertificationsList getCertifications() {
		return certifications;
	}
	
}
