package com.ivan.moviecatalogue10

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {


    @GET("/3/movie/popular?api_key=6f0dbdd0b93e77012c4a05ce097c8805")
    fun getMovieList(): Call<MovieResponse>
}