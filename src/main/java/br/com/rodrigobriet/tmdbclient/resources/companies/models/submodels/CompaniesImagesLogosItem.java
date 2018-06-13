package br.com.rodrigobriet.tmdbclient.resources.companies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class CompaniesImagesLogosItem {

	@SerializedName("aspect_ratio")
	private float aspectRatio;
	
	@SerializedName("file_path")
	private String filePath;
	
	@SerializedName("height")
	private int height;
	
	@SerializedName("id")
	private String id;
	
	@SerializedName("file_type")
	private String fileType;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("width")
	private int width;

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

	public String getFileType() {
		return fileType;
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
	
}
