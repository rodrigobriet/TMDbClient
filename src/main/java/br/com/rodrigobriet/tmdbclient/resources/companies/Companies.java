package br.com.rodrigobriet.tmdbclient.resources.companies;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.resources.companies.models.CompaniesAlternativeNames;
import br.com.rodrigobriet.tmdbclient.resources.companies.models.CompaniesDetails;
import br.com.rodrigobriet.tmdbclient.resources.companies.models.CompaniesImages;

public class Companies extends ResourcesConf {

	public Companies(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public Resource<CompaniesDetails> getDetails(int companyId) {
		return new Resource<>("/company/{company_id}", apiKey, requestService, new GsonMapping<>(CompaniesDetails.class), companyId);
	}
	
	public Resource<CompaniesAlternativeNames> getAlternativeNames(int companyId) {
		return new Resource<>("/company/{company_id}/alternative_names", apiKey, requestService, new GsonMapping<>(CompaniesAlternativeNames.class), companyId);
	}
	
	public Resource<CompaniesImages> getImages(int companyId) {
		return new Resource<>("/company/{company_id}/images", apiKey, requestService, new GsonMapping<>(CompaniesImages.class), companyId);
	}

}
