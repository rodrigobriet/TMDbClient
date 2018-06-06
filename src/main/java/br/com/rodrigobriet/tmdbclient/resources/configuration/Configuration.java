package br.com.rodrigobriet.tmdbclient.resources.configuration;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.reflect.TypeToken;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationAPI;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationCountries;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationJobs;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationLanguages;
import br.com.rodrigobriet.tmdbclient.resources.configuration.models.ConfigurationTimezones;

public class Configuration extends ResourcesConf {

	public Configuration(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public Resource<ConfigurationAPI> getAPIConfiguration() {
		return new Resource<>("/configuration", apiKey, requestService, new GsonMapping<>(ConfigurationAPI.class));
	}
	
	public Resource<ArrayList<ConfigurationCountries>> getCountries() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationCountries.class).getType();
		return new Resource<>("/configuration/countries", apiKey, requestService, new GsonMapping<>(type));
	}
	
	public Resource<ArrayList<ConfigurationJobs>> getJobs() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationJobs.class).getType();
		return new Resource<>("/configuration/jobs", apiKey, requestService, new GsonMapping<>(type));
	}
	
	public Resource<ArrayList<ConfigurationLanguages>> getLanguages() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationLanguages.class).getType();
		return new Resource<>("/configuration/languages", apiKey, requestService, new GsonMapping<>(type));
	}

	public Resource<ArrayList<String>> getPrimaryTranslations() {
		Type type = TypeToken.getParameterized(ArrayList.class, String.class).getType();
		return new Resource<>("/configuration/primary_translations", apiKey, requestService, new GsonMapping<>(type));
	}
	
	public Resource<ArrayList<ConfigurationTimezones>> getTimeZones() {
		Type type = TypeToken.getParameterized(ArrayList.class, ConfigurationTimezones.class).getType();
		return new Resource<>("/configuration/timezones", apiKey, requestService, new GsonMapping<>(type));
	}
	
}
