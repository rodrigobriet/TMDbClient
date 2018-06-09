package br.com.rodrigobriet.tmdbclient.resources.keywords;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageIncludeAdultQuery;
import br.com.rodrigobriet.tmdbclient.resources.keywords.models.KeywordsDetails;
import br.com.rodrigobriet.tmdbclient.resources.keywords.models.KeywordsMovies;

public class Keywords extends ResourcesConf {

	public Keywords(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public Resource<KeywordsDetails> getDetails(int keywordId) {
		return new Resource<>("/keyword/{keyword_id}", apiKey, requestService, new GsonMapping<>(KeywordsDetails.class), keywordId);
	}
	
	public ResourceQuery<KeywordsMovies, LanguageIncludeAdultQuery> getMovies(int keywordId) {
		return new ResourceQuery<>("/keyword/{keyword_id}/movies", apiKey, requestService, new GsonMapping<>(KeywordsMovies.class), keywordId);
	}
	
}
