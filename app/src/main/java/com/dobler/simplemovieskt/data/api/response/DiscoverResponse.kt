package com.dobler.simplemovieskt.data.api.response

import com.dobler.simplemovieskt.data.model.Movie

data class DiscoverResponse(
    val page: Int,
    val movies: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)