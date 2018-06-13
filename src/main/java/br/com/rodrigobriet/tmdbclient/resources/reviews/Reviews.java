package br.com.rodrigobriet.tmdbclient.resources.reviews;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.resources.reviews.models.ReviewsDetails;

public class Reviews extends ResourcesConf {

	public Reviews(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public Resource<ReviewsDetails> getDetails(String reviewId) {
		return new Resource<>("/review/{review_id}", apiKey, requestService, new GsonMapping<>(ReviewsDetails.class), reviewId);
	}
}
