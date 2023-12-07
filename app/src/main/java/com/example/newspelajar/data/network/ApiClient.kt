package com.example.newspelajar.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {
    private val BASE_URL = "https://api-berita-indonesia.vercel.app/"

    fun provideApiService(): ApiService{
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(ApiService::class.java)
    }


}