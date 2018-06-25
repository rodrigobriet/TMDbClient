package com.github.rodrigobriet.tmdbclient.resources.tv.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.core.models.AccountStates;
import com.github.rodrigobriet.tmdbclient.core.models.AlternativeTitles;
import com.github.rodrigobriet.tmdbclient.core.models.Credits;
import com.github.rodrigobriet.tmdbclient.core.models.DetailsGenresItem;
import com.github.rodrigobriet.tmdbclient.core.models.DetailsProductionCompaniesItem;
import com.github.rodrigobriet.tmdbclient.core.models.Images;
import com.github.rodrigobriet.tmdbclient.core.models.Keywords;
import com.github.rodrigobriet.tmdbclient.core.models.Reviews;
import com.github.rodrigobriet.tmdbclient.core.models.Translations;
import com.github.rodrigobriet.tmdbclient.core.models.Videos;
import com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvDetailsCreatedByItem;
import com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvDetailsNetworksItem;
import com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvDetailsSeasonsItem;
import com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvTranslationsItemData;
import com.google.gson.annotations.SerializedName;

public class TvDetails {

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
	private float popularity;
	
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
	
	@SerializedName("account_states")
	private AccountStates accountStates;
	
	@SerializedName("alternative_titles")
	private AlternativeTitles alternativeTitles;
	
	@SerializedName("content_ratings")
	private TvContentRatings contentRatings;
	
	@SerializedName("credits")
	private Credits credits;
	
	@SerializedName("external_ids")
	private TvExternalIds externalIds;
	
	@SerializedName("images")
	private Images images;
	
	@SerializedName("keywords")
	private Keywords keywords;
	
	@SerializedName("recommendations")
	private TvRecommendations recommendations;
	
	@SerializedName("reviews")
	private Reviews reviews;
	
	@SerializedName("screened_theatrically")
	private TvScreenedTheatrically screenedTheatrically;
	
	@SerializedName("similar")
	private TvSimilar similar;
	
	@SerializedName("translations")
	private Translations<TvTranslationsItemData> translations;
	
	@SerializedName("videos")
	private Videos videos;

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

	public float getPopularity() {
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

	public AccountStates getAccountStates() {
		return accountStates;
	}

	public AlternativeTitles getAlternativeTitles() {
		return alternativeTitles;
	}

	public TvContentRatings getContentRatings() {
		return contentRatings;
	}

	public Credits getCredits() {
		return credits;
	}

	public TvExternalIds getExternalIds() {
		return externalIds;
	}

	public Images getImages() {
		return images;
	}

	public Keywords getKeywords() {
		return keywords;
	}

	public TvRecommendations getRecommendations() {
		return recommendations;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public TvScreenedTheatrically getScreenedTheatrically() {
		return screenedTheatrically;
	}

	public TvSimilar getSimilar() {
		return similar;
	}

	public Translations<TvTranslationsItemData> getTranslations() {
		return translations;
	}

	public Videos getVideos() {
		return videos;
	}
	
}
