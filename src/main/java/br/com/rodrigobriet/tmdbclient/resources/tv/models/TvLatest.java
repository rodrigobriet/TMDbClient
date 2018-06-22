package br.com.rodrigobriet.tmdbclient.resources.tv.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.DetailsGenresItem;
import br.com.rodrigobriet.tmdbclient.core.models.DetailsProductionCompaniesItem;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvDetailsCreatedByItem;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvDetailsNetworksItem;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvDetailsSeasonsItem;

public class TvLatest {

	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("created_by")
	private List<TvDetailsCreatedByItem> createdBy;
	
	@SerializedName("episode_run_time")
	private int[] episodeRunTime;
	
	@SerializedName("first_air_date")
	private String firstAirDate;
	
	@SerializedName("genres")
	private List<DetailsGenresItem> genres;
	
	@SerializedName("homepage")
	private String homepage;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("in_production")
	private boolean inProduction;
	
	@SerializedName("languages")
	private List<String> languages;
	
	@SerializedName("last_air_date")
	private String lastAirDate;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("networks")
	private List<TvDetailsNetworksItem> networks;
	
	@SerializedName("number_of_episodes")
	private int numberOfEpisodes;
	
	@SerializedName("number_of_seasons")
	private int numberOfSeasons;
	
	@SerializedName("origin_country")
	private List<String> originCountry;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("original_name")
	private String originalName;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("popularity")
	private int popularity;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("production_companies")
	private List<DetailsProductionCompaniesItem> productionCompanies;
	
	@SerializedName("seasons")
	private List<TvDetailsSeasonsItem> seasons;
	
	@SerializedName("status")
	private String status;
	
	@SerializedName("type")
	private String type;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;

	public String getBackdropPath() {
		return backdropPath;
	}

	public List<TvDetailsCreatedByItem> getCreatedBy() {
		return createdBy;
	}

	public int[] getEpisodeRunTime() {
		return episodeRunTime;
	}

	public String getFirstAirDate() {
		return firstAirDate;
	}

	public List<DetailsGenresItem> getGenres() {
		return genres;
	}

	public String getHomepage() {
		return homepage;
	}

	public int getId() {
		return id;
	}

	public boolean isInProduction() {
		return inProduction;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public String getLastAirDate() {
		return lastAirDate;
	}

	public String getName() {
		return name;
	}

	public List<TvDetailsNetworksItem> getNetworks() {
		return networks;
	}

	public int getNumberOfEpisodes() {
		return numberOfEpisodes;
	}

	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}

	public List<String> getOriginCountry() {
		return originCountry;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getOriginalName() {
		return originalName;
	}

	public String getOverview() {
		return overview;
	}

	public int getPopularity() {
		return popularity;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public List<DetailsProductionCompaniesItem> getProductionCompanies() {
		return productionCompanies;
	}

	public List<TvDetailsSeasonsItem> getSeasons() {
		return seasons;
	}

	public String getStatus() {
		return status;
	}

	public String getType() {
		return type;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public int getVoteCount() {
		return voteCount;
	}
	
}
