package br.com.rodrigobriet.tmdbclient.resources.keywords;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.LanguageIncludeAdultQuery;
import br.com.rodrigobriet.tmdbclient.resources.keywords.models.KeywordsDetails;
import br.com.rodrigobriet.tmdbclient.resources.keywords.models.KeywordsMovies;

public class Keywords extends ResourcesHolder {

	public Keywords(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public Resource<KeywordsDetails> getDetails(int keywordId) {
		return new Resource.Builder<KeywordsDetails>(requestService, mappingService, apiKey)
				.setPath("/keyword/{keyword_id}")
				.setPathValues(""+keywordId)
				.setModelClass(KeywordsDetails.class)
				.build();
	}
	
	public ResourceQuery<KeywordsMovies, LanguageIncludeAdultQuery> getMovies(int keywordId) {
		return new ResourceQuery.Builder<KeywordsMovies, LanguageIncludeAdultQuery>(requestService, mappingService, apiKey)
				.setPath("/keyword/{keyword_id}/movies")
				.setPathValues(""+keywordId)
				.setModelClass(KeywordsMovies.class)
				.build();
	}
	
}
