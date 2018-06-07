package br.com.rodrigobriet.tmdbclient.resources.find.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.find.models.submodels.FindMovieResultItem;
import br.com.rodrigobriet.tmdbclient.resources.find.models.submodels.FindPersonResultItem;
import br.com.rodrigobriet.tmdbclient.resources.find.models.submodels.FindTvEpisodeResultItem;
import br.com.rodrigobriet.tmdbclient.resources.find.models.submodels.FindTvResultItem;

public class FindById {

	@SerializedName("movie_results")
	private List<FindMovieResultItem> movieResults;
	
	@SerializedName("person_results")
	private List<FindPersonResultItem> personResults;
	
	@SerializedName("tv_results")
	private List<FindTvResultItem> tvResults;
	
	@SerializedName("tv_episode_results")
	private List<FindTvEpisodeResultItem> tvEspisodeResults;
	
	// TODO TvSeason valid ID to get object to map
	//@SerializedName("tv_season_results")
	//private List<FindTvSeasonResultItem> tvSeasonResults;

	public List<FindMovieResultItem> getMovieResults() {
		return movieResults;
	}

	public FindById(List<FindMovieResultItem> movieResults, List<FindPersonResultItem> personResults,
			List<FindTvResultItem> tvResults, List<FindTvEpisodeResultItem> tvEspisodeResults) {
		this.movieResults = movieResults;
		this.personResults = personResults;
		this.tvResults = tvResults;
		this.tvEspisodeResults = tvEspisodeResults;
	}

	public List<FindPersonResultItem> getPersonResults() {
		return personResults;
	}

	public List<FindTvResultItem> getTvResults() {
		return tvResults;
	}

	public List<FindTvEpisodeResultItem> getTvEspisodeResults() {
		return tvEspisodeResults;
	}
	
}
