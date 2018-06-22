package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.AccountStates;
import br.com.rodrigobriet.tmdbclient.core.models.AlternativeTitles;
import br.com.rodrigobriet.tmdbclient.core.models.Credits;
import br.com.rodrigobriet.tmdbclient.core.models.DetailsGenresItem;
import br.com.rodrigobriet.tmdbclient.core.models.DetailsProductionCompaniesItem;
import br.com.rodrigobriet.tmdbclient.core.models.Images;
import br.com.rodrigobriet.tmdbclient.core.models.Keywords;
import br.com.rodrigobriet.tmdbclient.core.models.Reviews;
import br.com.rodrigobriet.tmdbclient.core.models.Translations;
import br.com.rodrigobriet.tmdbclient.core.models.Videos;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesDetailsBelongsToCollection;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesDetailsProductionCountries;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesDetailsSpokenLanguages;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesTranslationsItemData;

public class MoviesDetails {

	@SerializedName("adult")
	private boolean adult;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("belongs_to_collection")
	private MoviesDetailsBelongsToCollection belongsToCollection;
	
	@SerializedName("budget")
	private int budget;
	
	@SerializedName("genres")
	private List<DetailsGenresItem> genres;
	
	@SerializedName("homepage")
	private String homepage;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("imdb_id")
	private String imdbId;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("original_title")
	private String originalTitle;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("production_companies")
	private List<DetailsProductionCompaniesItem> procutionCompanies;
	
	@SerializedName("production_countries")
	private List<MoviesDetailsProductionCountries> productionCountries;
	
	@SerializedName("release_date")
	private String releaseDate;
	
	@SerializedName("revenue")
	private int revenue;
	
	@SerializedName("runtime")
	private int runtime;
	
	@SerializedName("spoken_languages")
	private List<MoviesDetailsSpokenLanguages> spokenLanguages;
	
	@SerializedName("status")
	private String status;
	
	@SerializedName("tagline")
	private String tagline;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("video")
	private boolean video;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("account_states")
	private AccountStates accountStates;
	
	@SerializedName("alternative_titles")
	private AlternativeTitles alternativeTitles;
	
	@SerializedName("credits")
	private Credits credits;
	
	@SerializedName("external_ids")
	private MoviesExternalIds externalIds;
	
	@SerializedName("images")
	private Images images;
	
	@SerializedName("keywords")
	private Keywords keywords;
	
	@SerializedName("release_dates")
	private MoviesReleaseDates releaseDates;
	
	@SerializedName("videos")
	private Videos videos;
	
	@SerializedName("translations")
	private Translations<MoviesTranslationsItemData> translations;
	
	@SerializedName("recommendations")
	private MoviesRecommendations recommendations;
	
	@SerializedName("similar")
	private MoviesSimilar similar;
	
	@SerializedName("reviews")
	private Reviews reviews;
	
	@SerializedName("lists")
	private MoviesLists lists;

	public boolean isAdult() {
		return adult;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public MoviesDetailsBelongsToCollection getBelongsToCollection() {
		return belongsToCollection;
	}

	public int getBudget() {
		return budget;
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

	public String getImdbId() {
		return imdbId;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getOriginalTitle() {
		return originalTitle;
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

	public List<DetailsProductionCompaniesItem> getProcutionCompanies() {
		return procutionCompanies;
	}

	public List<MoviesDetailsProductionCountries> getProductionCountries() {
		return productionCountries;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public int getRevenue() {
		return revenue;
	}

	public int getRuntime() {
		return runtime;
	}

	public List<MoviesDetailsSpokenLanguages> getSpokenLanguages() {
		return spokenLanguages;
	}

	public String getStatus() {
		return status;
	}

	public String getTagline() {
		return tagline;
	}

	public String getTitle() {
		return title;
	}

	public boolean isVideo() {
		return video;
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

	public Credits getCredits() {
		return credits;
	}

	public MoviesExternalIds getExternalIds() {
		return externalIds;
	}

	public Images getImages() {
		return images;
	}

	public Keywords getKeywords() {
		return keywords;
	}

	public MoviesReleaseDates getReleaseDates() {
		return releaseDates;
	}

	public Videos getVideos() {
		return videos;
	}

	public Translations<MoviesTranslationsItemData> getTranslations() {
		return translations;
	}

	public MoviesRecommendations getRecommendations() {
		return recommendations;
	}

	public MoviesSimilar getSimilar() {
		return similar;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public MoviesLists getLists() {
		return lists;
	}
	
}
