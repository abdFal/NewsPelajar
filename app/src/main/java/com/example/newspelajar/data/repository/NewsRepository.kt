package com.example.newspelajar.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.newspelajar.data.model.NewsResponse
import com.example.newspelajar.data.network.ApiClient
import com.example.newspelajar.data.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {

    private val _antaraTerbaruNews = MutableLiveData<NewsResponse>()
    val antaraTerbaruNews: LiveData<NewsResponse> = _antaraTerbaruNews
    private val _antaraPolitikNews = MutableLiveData<NewsResponse>()
    val antaraPolitikNews: LiveData<NewsResponse> = _antaraPolitikNews
    private val _antaraHukumNews = MutableLiveData<NewsResponse>()
    val antaraHukumNews: LiveData<NewsResponse> = _antaraHukumNews

    private val _cnnTerbaruNews = MutableLiveData<NewsResponse>()
    val cnnTerbaruNews: LiveData<NewsResponse> = _cnnTerbaruNews
    private val _cnnNasionalNews = MutableLiveData<NewsResponse>()
    val cnnNasionalNews: LiveData<NewsResponse> = _cnnNasionalNews
    private val _cnnInternasionalNews = MutableLiveData<NewsResponse>()
    val cnnInternasionalNews: LiveData<NewsResponse> = _cnnInternasionalNews


    private val _tribunTerbaruNews = MutableLiveData<NewsResponse>()
    val tribunTerbaruNews: LiveData<NewsResponse> = _tribunTerbaruNews
    private val _tribunSelebNews = MutableLiveData<NewsResponse>()
    val tribunSelebNews: LiveData<NewsResponse> = _tribunSelebNews
    private val _tribunLifestyleNews = MutableLiveData<NewsResponse>()
    val tribunLifeStyleNews: LiveData<NewsResponse> = _tribunLifestyleNews


    fun fetchAntaraNewsTerbaru() {
        ApiClient.provideApiService().getAntaraNewsTerbaru().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _antaraTerbaruNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }
    fun fetchAntaraNewsPolitik() {
        ApiClient.provideApiService().getAntaraNewsPolitik().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _antaraPolitikNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }
    fun fetchAntaraNewsHukum() {
        ApiClient.provideApiService().getAntaraNewsHukum().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _antaraHukumNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }

    fun fetchTribunNewsTerbaru() {
        ApiClient.provideApiService().getTribunNewsTerbaru().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _tribunTerbaruNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }
    fun fetchTribunNewsSeleb() {
        ApiClient.provideApiService().getTribunNewsSeleb().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _tribunSelebNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }
    fun fetchTribunNewsSLifestyle() {
        ApiClient.provideApiService().getTribunNewsLifestyle().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _tribunLifestyleNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }


    fun fetchCnnNewsTerbaru() {
        ApiClient.provideApiService().getCnnNewsTerbaru().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _cnnTerbaruNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }
    fun fetchCnnNewsNasional() {
        ApiClient.provideApiService().getCnnNewsNasional().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _cnnNasionalNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }
    fun fetchCnnNewsInternasional() {
        ApiClient.provideApiService().getCnnNewsInternasional().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    _cnnInternasionalNews.postValue(response.body())
                } else {
                    Log.e("Repository", "onResponse: Call error with HTTP status code" + response.code())
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Log.e("Repository", "onFailure"+ t.localizedMessage)
            }
        })
    }
}