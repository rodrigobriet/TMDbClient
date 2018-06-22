package br.com.rodrigobriet.tmdbclient.core.resources;

import java.lang.reflect.Type;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

public abstract class ResourceBuilder<ModelT, ResourceT> {

	protected RequestService requestService;
	protected MappingService mappingService;
	protected String apiKey;
	
	protected ResourceMethod resourceMethod = ResourceMethod.GET;
	
	protected String path;
	protected String[] pathValues;
	
	protected Class<ModelT> modelClass;
	protected Type modelType;
	
	protected Object bodyContent;
	
	public ResourceBuilder(RequestService requestService, MappingService mappingService, String apiKey) {
		this.requestService = requestService;
		this.mappingService = mappingService;
		this.apiKey = apiKey;
	}

	public ResourceBuilder<ModelT, ResourceT> setPath(String path) {
		this.path = path;
		return this;
	}

	public ResourceBuilder<ModelT, ResourceT> setModelClass(Class<ModelT> modelClass) {
		this.modelClass = modelClass;
		return this;
	}

	public ResourceBuilder<ModelT, ResourceT> setModelClass(Type modelType) {
		this.modelType = modelType;
		return this;
	}

	public ResourceBuilder<ModelT, ResourceT> setResourceMethod(ResourceMethod resourceMethod) {
		this.resourceMethod = resourceMethod;
		return this;
	}

	public ResourceBuilder<ModelT, ResourceT> setPathValues(String ... pathValues) {
		this.pathValues = pathValues;
		return this;
	}
	
	public ResourceBuilder<ModelT, ResourceT> setBodyContent(Object bodyContent) {
		this.bodyContent = bodyContent;
		return this;
	}

	public abstract ResourceT build();
	
}
