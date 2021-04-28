package com.example.coronavirus_stats.retro
import com.example.coronavirus_stats.recycler.State
import com.example.coronavirus_stats.recycler.ListRecycler
import retrofit2.http.GET
import retrofit2.http.Query

interface ImportState {
    @GET("latest")
    suspend fun getState(): ListRecycler

    @GET("state")
    suspend fun getState(@Query("state") state: String): State
}