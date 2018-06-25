package com.github.rodrigobriet.tmdbclient.resources.people.models.submodels;

import com.github.rodrigobriet.tmdbclient.core.models.MovieResultItem;
import com.github.rodrigobriet.tmdbclient.core.models.TvResultItem;
import com.google.gson.annotations.SerializedName;

public class PeopleTaggedImagesResultItem {

	@SerializedName("aspect_ratio")
	private float aspectRatio;
	
	@SerializedName("file_path")
	private String filePath;
	
	@SerializedName("height")
	private int height;
	
	@SerializedName("id")
	private String id;
	
	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("width")
	private int width;
	
	@SerializedName("image-type")
	private String imageType;
	
	@SerializedName("media-type")
	private String mediaType;
	
	private MovieResultItem movieMedia;
	
	private TvResultItem tvMedia;
	
	public PeopleTaggedImagesResultItem(float aspectRatio, String filePath, int height, String id, String iso639_1,
			float voteAverage, int voteCount, int width, String imageType, String mediaType, MovieResultItem movieMedia,
			TvResultItem tvMedia) {
		this.aspectRatio = aspectRatio;
		this.filePath = filePath;
		this.height = height;
		this.id = id;
		this.iso639_1 = iso639_1;
		this.voteAverage = voteAverage;
		this.voteCount = voteCount;
		this.width = width;
		this.imageType = imageType;
		this.mediaType = mediaType;
		this.movieMedia = movieMedia;
		this.tvMedia = tvMedia;
	}

	public float getAspectRatio() {
		return aspectRatio;
	}

	public String getFilePath() {
		return filePath;
	}

	public int getHeight() {
		return height;
	}

	public String getId() {
		return id;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public int getWidth() {
		return width;
	}

	public String getImageType() {
		return imageType;
	}

	public String getMediaType() {
		return mediaType;
	}

	public MovieResultItem getMovieMedia() {
		return movieMedia;
	}

	public TvResultItem getTvMedia() {
		return tvMedia;
	}
	
}
