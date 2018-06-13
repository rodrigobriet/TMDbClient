package br.com.rodrigobriet.tmdbclient.resources.search.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.global.MovieResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.global.PersonResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.global.TvResultItem;

// TODO custom deserialization
public class SearchMulti {

	@SerializedName("page")
	private int page;
	
	@SerializedName("total_results")
	private int totalResults;
	
	@SerializedName("total_pages")
	private int totalPages;
	
	private List<MovieResultItem> movieResults;
	
	private List<TvResultItem> TvResults;
	
	private List<PersonResultItem> personResults;

	public SearchMulti(int page, int totalResults, int totalPages, List<MovieResultItem> movieResults,
			List<TvResultItem> tvResults, List<PersonResultItem> personResults) {
		super();
		this.page = page;
		this.totalResults = totalResults;
		this.totalPages = totalPages;
		this.movieResults = movieResults;
		TvResults = tvResults;
		this.personResults = personResults;
	}

	public int getPage() {
		return page;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public List<MovieResultItem> getMovieResults() {
		return movieResults;
	}

	public List<TvResultItem> getTvResults() {
		return TvResults;
	}

	public List<PersonResultItem> getPersonResults() {
		return personResults;
	}
	
}
