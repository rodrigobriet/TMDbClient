package com.github.rodrigobriet.tmdbclient.resources.collections;


import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import com.github.rodrigobriet.tmdbclient.resources.collections.models.CollectionsDetails;
import com.github.rodrigobriet.tmdbclient.resources.collections.models.CollectionsImages;
import com.github.rodrigobriet.tmdbclient.resources.collections.models.CollectionsTranslations;

public class Collections extends ResourcesHolder {

	public Collections(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}
	
	public ResourceQuery<CollectionsDetails, LanguageQuery> getDetails(int collectionId) {
		return new ResourceQuery.Builder<CollectionsDetails, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/collection/{collection_id}")
				.setPathValues(""+collectionId)
				.setModelClass(CollectionsDetails.class)
				.build();
	}
	
	public ResourceQuery<CollectionsImages, LanguageQuery> getImages(int collectionId) {
		return new ResourceQuery.Builder<CollectionsImages, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/collection/{collection_id}/images")
				.setPathValues(""+collectionId)
				.setModelClass(CollectionsImages.class)
				.build();
	}
	
	public ResourceQuery<CollectionsTranslations, LanguageQuery> getTranslations(int collectionId) {
		return new ResourceQuery.Builder<CollectionsTranslations, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/collection/{collection_id}/translations")
				.setPathValues(""+collectionId)
				.setModelClass(CollectionsTranslations.class)
				.build();
	}

}
