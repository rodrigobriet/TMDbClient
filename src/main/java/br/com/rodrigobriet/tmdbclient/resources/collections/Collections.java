package br.com.rodrigobriet.tmdbclient.resources.collections;


import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.resources.collections.models.CollectionsDetails;
import br.com.rodrigobriet.tmdbclient.resources.collections.models.CollectionsImages;
import br.com.rodrigobriet.tmdbclient.resources.collections.models.CollectionsTranslations;

public class Collections extends ResourcesConf {

	public Collections(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQuery<CollectionsDetails, LanguageQuery> getDetails(int collectionId) {
		return new ResourceQuery<>("/collection/{collection_id}", apiKey, requestService, new GsonMapping<>(CollectionsDetails.class), collectionId);
	}
	
	public ResourceQuery<CollectionsImages, LanguageQuery> getImages(int collectionId) {
		return new ResourceQuery<>("/collection/{collection_id}/images", apiKey, requestService, new GsonMapping<>(CollectionsImages.class), collectionId);
	}
	
	public ResourceQuery<CollectionsTranslations, LanguageQuery> getTranslations(int collectionId) {
		return new ResourceQuery<>("/collection/{collection_id}/translations", apiKey, requestService, new GsonMapping<>(CollectionsTranslations.class), collectionId);
	}

}
