package br.com.rodrigobriet.tmdbclient.resources.companies;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.resources.companies.models.CompaniesAlternativeNames;
import br.com.rodrigobriet.tmdbclient.resources.companies.models.CompaniesDetails;
import br.com.rodrigobriet.tmdbclient.resources.companies.models.CompaniesImages;

public class Companies extends ResourcesHolder {

	public Companies(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}
	
	public Resource<CompaniesDetails> getDetails(int companyId) {
		return new Resource.Builder<CompaniesDetails>(requestService, mappingService, apiKey)
				.setPath("/company/{company_id}")
				.setPathValues(""+companyId)
				.setModelClass(CompaniesDetails.class)
				.build();
	}
	
	public Resource<CompaniesAlternativeNames> getAlternativeNames(int companyId) {
		return new Resource.Builder<CompaniesAlternativeNames>(requestService, mappingService, apiKey)
				.setPath("/company/{company_id}/alternative_names")
				.setPathValues(""+companyId)
				.setModelClass(CompaniesAlternativeNames.class)
				.build();
	}
	
	public Resource<CompaniesImages> getImages(int companyId) {
		return new Resource.Builder<CompaniesImages>(requestService, mappingService, apiKey)
				.setPath("/company/{company_id}/images")
				.setPathValues(""+companyId)
				.setModelClass(CompaniesImages.class)
				.build();
	}

}
