package br.com.rodrigobriet.tmdbclient.resources.people;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceAppend;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.PaggedQuery;
import br.com.rodrigobriet.tmdbclient.resources.people.appends.PeopleAppend;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleCombinedCredits;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleDetails;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleImages;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleLatest;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleMovieCredits;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeoplePopular;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleTaggedImages;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleTranslations;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleTvCredits;

public class People extends ResourcesHolder {
	
	public People(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceAppend<PeopleDetails, LanguageQuery, PeopleAppend> getDetails(int personId, PeopleAppend ... appends) {
		ResourceAppend<PeopleDetails, LanguageQuery, PeopleAppend> r = new ResourceAppend.Builder<PeopleDetails, LanguageQuery, PeopleAppend>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}")
				.setPathValues(""+personId)
				.setModelClass(PeopleDetails.class)
				.build();
		
		for(PeopleAppend p: appends) {
			r.addAppend(p);
		}
		
		return r;
	}
	
	public ResourceQuery<PeopleMovieCredits, LanguageQuery> getMovieCredits(int personId) {
		return new ResourceQuery.Builder<PeopleMovieCredits, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}/movie_credits")
				.setPathValues(""+personId)
				.setModelClass(PeopleMovieCredits.class)
				.build();
	}

	public ResourceQuery<PeopleTvCredits, LanguageQuery> getTvCredits(int personId) {
		return new ResourceQuery.Builder<PeopleTvCredits, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}/tv_credits")
				.setPathValues(""+personId)
				.setModelClass(PeopleTvCredits.class)
				.build();
	}
	
	public ResourceQuery<PeopleCombinedCredits, LanguageQuery> getCombinedCredits(int personId) {
		return new ResourceQuery.Builder<PeopleCombinedCredits, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}/combined_credits")
				.setPathValues(""+personId)
				.setModelClass(PeopleCombinedCredits.class)
				.build();
	}
	
	public ResourceQuery<PeopleExternalIds, LanguageQuery> getExternalIds(int personId) {
		return new ResourceQuery.Builder<PeopleExternalIds, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}/external_ids")
				.setPathValues(""+personId)
				.setModelClass(PeopleExternalIds.class)
				.build();
	}
	
	public Resource<PeopleImages> getImages(int personId) {
		return new Resource.Builder<PeopleImages>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}/images")
				.setPathValues(""+personId)
				.setModelClass(PeopleImages.class)
				.build();
	}
	
	public ResourceQuery<PeopleTaggedImages, PaggedQuery> getTaggedImages(int personId) {
		return new ResourceQuery.Builder<PeopleTaggedImages, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}/tagged_images")
				.setPathValues(""+personId)
				.setModelClass(PeopleTaggedImages.class)
				.build();
	}
	
	public ResourceQuery<PeopleTranslations, LanguageQuery> getTranslations(int personId) {
		return new ResourceQuery.Builder<PeopleTranslations, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/person/{person_id}/translations")
				.setPathValues(""+personId)
				.setModelClass(PeopleTranslations.class)
				.build();
	}
	
	public ResourceQuery<PeopleLatest, LanguageQuery> getLatest() {
		return new ResourceQuery.Builder<PeopleLatest, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/person/latest")
				.setModelClass(PeopleLatest.class)
				.build();
	}
	
	public ResourceQuery<PeoplePopular, PaggedQuery> getPopular() {
		return new ResourceQuery.Builder<PeoplePopular, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/person/popular")
				.setModelClass(PeoplePopular.class)
				.build();
	}
	
}
