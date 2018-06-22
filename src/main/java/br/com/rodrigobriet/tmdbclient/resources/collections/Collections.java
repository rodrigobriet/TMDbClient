package br.com.rodrigobriet.tmdbclient.resources.collections;


import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.resources.collections.models.CollectionsDetails;
import br.com.rodrigobriet.tmdbclient.resources.collections.models.CollectionsImages;
import br.com.rodrigobriet.tmdbclient.resources.collections.models.CollectionsTranslations;

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
