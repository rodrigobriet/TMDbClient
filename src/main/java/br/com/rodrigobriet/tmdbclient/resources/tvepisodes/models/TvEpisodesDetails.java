package br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.global.CreditsCrew;
import br.com.rodrigobriet.tmdbclient.core.models.global.GuestStars;
import br.com.rodrigobriet.tmdbclient.core.models.global.Translations;
import br.com.rodrigobriet.tmdbclient.core.models.global.Videos;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.submodels.TvEpisodesTranslationsItemData;

public class TvEpisodesDetails {

	@SerializedName("air_date")
	private String airDate;
	
	@SerializedName("crew")
	private List<CreditsCrew> crew;
	
	@SerializedName("episode_number")
	private int episodeNumber;
	
	@SerializedName("guest_stars")
	private List<GuestStars> guestStars;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("production_code")
	private String productionCode;
	
	@SerializedName("season_number")
	private int seasonNumber;
	
	@SerializedName("still_path")
	private String stillPath;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("credits")
	private TvEpisodesCredits credits;
	
	@SerializedName("external_ids")
	private TvEpisodesExternalIds externalIds;
	
	@SerializedName("images")
	private TvEpisodesImages images;
	
	@SerializedName("translations")
	private Translations<TvEpisodesTranslationsItemData> translations;
	
	@SerializedName("videos")
	private Videos videos;

	public String getAirDate() {
		return airDate;
	}

	public List<CreditsCrew> getCrew() {
		return crew;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public List<GuestStars> getGuestStars() {
		return guestStars;
	}

	public String getName() {
		return name;
	}

	public String getOverview() {
		return overview;
	}

	public int getId() {
		return id;
	}

	public String getProductionCode() {
		return productionCode;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public String getStillPath() {
		return stillPath;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public TvEpisodesCredits getCredits() {
		return credits;
	}

	public TvEpisodesExternalIds getExternalIds() {
		return externalIds;
	}

	public TvEpisodesImages getImages() {
		return images;
	}

	public Translations<TvEpisodesTranslationsItemData> getTranslations() {
		return translations;
	}

	public Videos getVideos() {
		return videos;
	}
	
}
