# TMDb Client
This library allow to request content from **[The Movie Database API](https://developers.themoviedb.org/3/getting-started/introduction)** using async methods.

## Usage
To use the API you need to create a new instance of the TMDb class giving you _API key_, a _directory_ to be used as cache and the _cache size_ in bytes.
```java
File cacheFolder = new File("dir/for/cache/folder");
int cacheSizeInBytes = 1 * 1024 * 1024; // "1MB"
TMDb db = new TMDb("TMDB_APY_KEY", cacheFolder, cacheSizeInBytes);
```
The TMDb class has a method for each API endpoint category (```getAccount(), getAuthentication(), getCertifications(), getChanges(), getCollections(), getCompanies(), getConfiguration(), getCredits(), getDiscover(), getFind(), getGenres(), getGuest(), getKeywords(), getLists(), getMovies(), getNetworks(), getPeople(), getReviews(), getSearch(), getTv(), getTvSeasons() and getTvEpisodes()```). This methods allow you to access the endpoints for each category.

## How to request a resource

After you have a instance of TMDb, to request a endpoint you just need to _get_ the category and _get_ the resource.
```java
int movieId = 550;
db.getMovies().getDetails(movieId).request(new RequestCallback<MoviesDetails>() {

  @Override
  public void onSucess(Header responseHeader, MoviesDetails model) {
    // TODO Auto-generated method stub
  }

  @Override
  public void onError(Header requestHeader, IOException e) {
    // TODO Auto-generated method stub
  }

  @Override
  public void OnFail(Header responseHeader, StatusMessage statusMessage) {
    // TODO Auto-generated method stub
  }
});
```
Each request need to receive a **[RequestCallback<?>](https://github.com/rodrigobriet/TMDbClient/blob/master/src/main/java/br/com/rodrigobriet/tmdbclient/core/requests/interfaces/RequestCallback.java)** implementation, where ? is the model type returned by te request.

## Setting query strings
Some resources allow the use of a custom query string. To set this query you can use the ```setQuery()``` method. Each resource allow a diferent type of query.
```java
db.getMovies().getDetails(550)
.setQuery(MoviesDetailsQuery.LANGUAGE, "pt-BR")
.reque...
```

## How to use append_to_response
The ```getPeople().getDetails()```, ```getMovies().getDetails```, ```getTv().getDetails```, ```getTvSeason().getDetails``` and ```getTvEpisode().getDetails()``` allow the use of a "special" query string called _append_to_response_. This query allow you to request extra information about the resource consuming only one request in the rate-limiting.
To set this query you can give extra _attributes_ to the ```getDetails()``` methods. Each resource has a set of appends values. For movies:
```java
db.getMovies().getDetails(550, MoviesAppend.ACCOUNT_STATES, MoviesAppend.ALTERNATIVE_TITLES, MoviesAppend.CREDITS, MoviesAppend.EXTERNAL_IDS, MoviesAppend.IMAGES, MoviesAppend.KEYWORDS, MoviesAppend.LISTS, MoviesAppend.RECOMMENDATIONS, MoviesAppend.RELEASE_DATES, MoviesAppend.REVIEWS, MoviesAppend.SIMILAR, MoviesAppend.TRANSLATIONS, MoviesAppend.VIDEOS)
.setQuery(MoviesDetailsQuery.LANGUAGE, "pt-BR")
.reque...
```

## Note
This library has **NO** affilitation with [The Movie Database](https://www.themoviedb.org/).
