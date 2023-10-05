package com.anhnt02.githubsearch.api

import com.anhnt02.githubsearch.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>
}