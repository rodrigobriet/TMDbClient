package br.com.rodrigobriet.tmdbclient.resources.reviews;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.resources.reviews.models.ReviewsDetails;

public class Reviews extends ResourcesHolder {

	public Reviews(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public Resource<ReviewsDetails> getDetails(String reviewId) {
		return new Resource.Builder<ReviewsDetails>(requestService, mappingService, apiKey)
				.setPath("/review/{review_id}")
				.setPathValues(reviewId)
				.setModelClass(ReviewsDetails.class)
				.build();
	}
}
