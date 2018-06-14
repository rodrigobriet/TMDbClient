package br.com.rodrigobriet.tmdbclient.resources.people;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQueryAppend;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedQuery;
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

public class People extends ResourcesConf {

	public People(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQueryAppend<PeopleDetails, LanguageQuery, PeopleAppend> getDetails(int personId, PeopleAppend ... appends) {
		ResourceQueryAppend<PeopleDetails, LanguageQuery, PeopleAppend> r =
				new ResourceQueryAppend<>("/person/{person_id}", apiKey, requestService, new GsonMapping<>(PeopleDetails.class), personId);
		
		for(PeopleAppend p: appends) {
			r.addAppend(p);
		}
		
		return r;
	}
	
	public ResourceQuery<PeopleMovieCredits, LanguageQuery> getMovieCredits(int personId) {
		return new ResourceQuery<>("/person/{person_id}/movie_credits", apiKey, requestService, new GsonMapping<>(PeopleMovieCredits.class), personId);
	}

	public ResourceQuery<PeopleTvCredits, LanguageQuery> getTvCredits(int personId) {
		return new ResourceQuery<>("/person/{person_id}/tv_credits", apiKey, requestService, new GsonMapping<>(PeopleTvCredits.class), personId);
	}
	
	public ResourceQuery<PeopleCombinedCredits, LanguageQuery> getCombinedCredits(int personId) {
		return new ResourceQuery<>("/person/{person_id}/combined_credits", apiKey, requestService, new GsonMapping<>(PeopleCombinedCredits.class), personId);
	}
	
	public ResourceQuery<PeopleExternalIds, LanguageQuery> getExternalIds(int personId) {
		return new ResourceQuery<>("/person/{person_id}/external_ids", apiKey, requestService, new GsonMapping<>(PeopleExternalIds.class), personId);
	}
	
	public Resource<PeopleImages> getImages(int personId) {
		return new Resource<>("/person/{person_id}/images", apiKey, requestService, new GsonMapping<>(PeopleImages.class), personId);
	}
	
	public ResourceQuery<PeopleTaggedImages, PaggedQuery> getTaggedImages(int personId) {
		return new ResourceQuery<>("/person/{person_id}/tagged_images", apiKey, requestService, new GsonMapping<>(PeopleTaggedImages.class), personId);
	}
	
	public ResourceQuery<PeopleTranslations, LanguageQuery> getTranslations(int personId) {
		return new ResourceQuery<>("/person/{person_id}/translations", apiKey, requestService, new GsonMapping<>(PeopleTranslations.class), personId);
	}
	
	public ResourceQuery<PeopleLatest, LanguageQuery> getLatest() {
		return new ResourceQuery<>("/person/latest", apiKey, requestService, new GsonMapping<>(PeopleLatest.class));
	}
	
	public ResourceQuery<PeoplePopular, PaggedQuery> getPopular() {
		return new ResourceQuery<>("/person/popular", apiKey, requestService, new GsonMapping<>(PeoplePopular.class));
	}
	
}
