package com.github.rodrigobriet.tmdbclient.resources.reviews;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.Resource;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.resources.reviews.models.ReviewsDetails;

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
