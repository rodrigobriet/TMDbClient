package br.com.rodrigobriet.tmdbclient.resources.configuration;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationAPI;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationCountries;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationJobs;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationLanguages;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationTimezones;

public class Configuration extends ResourcesHolder {

	public Configuration(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public Resource<ConfigurationAPI> getAPIConfiguration() {
		return new Resource.Builder<ConfigurationAPI>(requestService, mappingService, apiKey)
			.setPath("/configuration")
			.setModelClass(ConfigurationAPI.class)
			.build();
	}
	
	public Resource<ArrayList<ConfigurationCountries>> getCountries() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationCountries.class).getType();
		return new Resource.Builder<ArrayList<ConfigurationCountries>>(requestService, mappingService, apiKey)
				.setPath("/configuration/countries")
				.setModelClass(type)
				.build();
	}
	
	public Resource<ArrayList<ConfigurationJobs>> getJobs() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationJobs.class).getType();
		return new Resource.Builder<ArrayList<ConfigurationJobs>>(requestService, mappingService, apiKey)
				.setPath("/configuration/jobs")
				.setModelClass(type)
				.build();
	}
	
	public Resource<ArrayList<ConfigurationLanguages>> getLanguages() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationLanguages.class).getType();
		return new Resource.Builder<ArrayList<ConfigurationLanguages>>(requestService, mappingService, apiKey)
				.setPath("/configuration/languages")
				.setModelClass(type)
				.build();
	}

	public Resource<ArrayList<String>> getPrimaryTranslations() {
		Type type = TypeToken.getParameterized(ArrayList.class, String.class).getType();
		return new Resource.Builder<ArrayList<String>>(requestService, mappingService, apiKey)
				.setPath("/configuration/primary_translations")
				.setModelClass(type)
				.build();
	}
	
	public Resource<ArrayList<ConfigurationTimezones>> getTimeZones() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationTimezones.class).getType();
		return new Resource.Builder<ArrayList<ConfigurationTimezones>>(requestService, mappingService, apiKey)
				.setPath("/configuration/timezones")
				.setModelClass(type)
				.build();
	}
	
}
