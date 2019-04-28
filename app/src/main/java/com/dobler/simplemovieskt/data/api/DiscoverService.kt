package com.dobler.simplemovieskt.data.api


import com.dobler.simplemovieskt.data.api.response.DiscoverResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface DiscoverService {

    @GET("discover/movie")
    fun list(@Query("sort_by") sort_by: String?): Call<DiscoverResponse>

}