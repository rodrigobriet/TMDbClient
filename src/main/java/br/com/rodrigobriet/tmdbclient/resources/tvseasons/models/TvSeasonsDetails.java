package br.com.rodrigobriet.tmdbclient.resources.tvseasons.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.Credits;
import br.com.rodrigobriet.tmdbclient.core.models.Images;
import br.com.rodrigobriet.tmdbclient.core.models.Videos;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesDetails;

public class TvSeasonsDetails {

	@SerializedName("_id")
	private String _id;
	
	@SerializedName("air_date")
	private String airDate;
	
	@SerializedName("episodes")
	private List<TvEpisodesDetails> episodes;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("season_number")
	private String seasonNumber;
	
	@SerializedName("credits")
	private Credits credits;
	
	@SerializedName("external_ids")
	private TvExternalIds externalIds;
	
	@SerializedName("images")
	private Images images;
	
	@SerializedName("videos")
	private Videos videos;

	public String get_id() {
		return _id;
	}

	public String getAirDate() {
		return airDate;
	}

	public List<TvEpisodesDetails> getEpisodes() {
		return episodes;
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

	public String getPosterPath() {
		return posterPath;
	}

	public String getSeasonNumber() {
		return seasonNumber;
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

	public Videos getVideos() {
		return videos;
	}
	
}
