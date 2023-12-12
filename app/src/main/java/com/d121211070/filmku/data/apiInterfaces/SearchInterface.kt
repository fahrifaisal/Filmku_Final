package com.d121211070.filmku.data.apiInterfaces

import com.d121211070.filmku.models.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchInterface {
    @GET("search/movie?api_key=93a203e39bf33f4f09b0dffd4d9015ec")
    suspend fun getSearchResult(
        @Query("query") searchMovie: String,
        @Query("page") page: String
    ): Response<MovieList>
}