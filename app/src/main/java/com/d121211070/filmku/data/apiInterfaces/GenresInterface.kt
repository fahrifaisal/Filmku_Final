package com.d121211070.filmku.data.apiInterfaces

import com.d121211070.filmku.models.GenresList
import retrofit2.Response
import retrofit2.http.GET

interface GenresInterface {
    @GET("genre/movie/list?api_key=d572e8fd1d04d7ac7df987eaaab5067b&language=en-US")
    suspend fun getGenres(): Response<GenresList>
}