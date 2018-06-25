package com.github.rodrigobriet.tmdbclient.resources.certifications.models;

import com.github.rodrigobriet.tmdbclient.resources.certifications.models.submodels.TvCertificationsList;
import com.google.gson.annotations.SerializedName;

public class TvCertifications {

	@SerializedName("certifications")
	private TvCertificationsList certifications;

	public TvCertificationsList getCertifications() {
		return certifications;
	}
	
}
