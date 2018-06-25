package com.github.rodrigobriet.tmdbclient.resources.find.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.core.models.MovieResultItem;
import com.github.rodrigobriet.tmdbclient.core.models.PersonResultItem;
import com.github.rodrigobriet.tmdbclient.core.models.TvResultItem;
import com.github.rodrigobriet.tmdbclient.core.models.TvSeasonResultItem;
import com.github.rodrigobriet.tmdbclient.resources.find.models.submodels.FindTvEpisodeResultItem;
import com.google.gson.annotations.SerializedName;

public class FindById {

	@SerializedName("movie_results")
	private List<MovieResultItem> movieResults;
	
	@SerializedName("person_results")
	private List<PersonResultItem> personResults;
	
	@SerializedName("tv_results")
	private List<TvResultItem> tvResults;
	
	@SerializedName("tv_episode_results")
	private List<FindTvEpisodeResultItem> tvEspisodeResults;
	
	@SerializedName("tv_season_results")
	private List<TvSeasonResultItem> tvSeasonResults;

	public FindById(List<MovieResultItem> movieResults, List<PersonResultItem> personResults,
			List<TvResultItem> tvResults, List<FindTvEpisodeResultItem> tvEspisodeResults, List<TvSeasonResultItem> tvSeasonResults) {
		super();
		this.movieResults = movieResults;
		this.personResults = personResults;
		this.tvResults = tvResults;
		this.tvEspisodeResults = tvEspisodeResults;
		this.tvSeasonResults = tvSeasonResults;
	}

	public List<MovieResultItem> getMovieResults() {
		return movieResults;
	}

	public List<PersonResultItem> getPersonResults() {
		return personResults;
	}

	public List<TvResultItem> getTvResults() {
		return tvResults;
	}

	public List<FindTvEpisodeResultItem> getTvEspisodeResults() {
		return tvEspisodeResults;
	}

	public List<TvSeasonResultItem> getTvSeasonResults() {
		return tvSeasonResults;
	}
	
}
