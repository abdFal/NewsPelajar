package com.example.newspelajar.data.network

import com.example.newspelajar.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("antara/terbaru/")
    fun getAntaraNewsTerbaru(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>

    @GET("antara/politik/")
    fun getAntaraNewsPolitik(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>

    @GET("antara/hukum/")
    fun getAntaraNewsHukum(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>

    @GET("tribun/terbaru/")
    fun getTribunNewsTerbaru(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>
    @GET("tempo/seleb/")
    fun getTribunNewsSeleb(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>
    @GET("tempo/cantik/")
    fun getTribunNewsLifestyle(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>

    @GET("cnn/terbaru/")
    fun getCnnNewsTerbaru(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>
    @GET("cnn/nasional/")
    fun getCnnNewsNasional(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>
    @GET("cnn/internasional/")
    fun getCnnNewsInternasional(
        @Query("pageSize") pageSize: Int = 10,
    ): Call<NewsResponse>
}