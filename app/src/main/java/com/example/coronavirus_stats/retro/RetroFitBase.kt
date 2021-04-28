package com.example.coronavirus_stats.retro

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitBase {
    companion object {
        private const val baseUrl = "https://api.quarantine.country/api/v1/summary/"
        fun getRetroInstance(): Retrofit = Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}