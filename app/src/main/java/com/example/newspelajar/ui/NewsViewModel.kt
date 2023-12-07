package com.example.newspelajar.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.newspelajar.data.model.NewsResponse
import com.example.newspelajar.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository): ViewModel()  {
    val antaraNewsTerbaru: LiveData<NewsResponse> = repository.antaraTerbaruNews
    val antaraNewsPolitik: LiveData<NewsResponse> = repository.antaraPolitikNews
    val antaraNewsHukum: LiveData<NewsResponse> = repository.antaraHukumNews

    val cnnNewsTerbaru: LiveData<NewsResponse> = repository.cnnTerbaruNews
    val cnnNewsNasional: LiveData<NewsResponse> = repository.cnnNasionalNews
    val cnnNewsInternasional: LiveData<NewsResponse> = repository.cnnInternasionalNews

    val tribunNewsTerbaru: LiveData<NewsResponse> = repository.tribunTerbaruNews
    val tribunNewsSeleb: LiveData<NewsResponse> = repository.tribunSelebNews
    val tribunNewsLifestyle: LiveData<NewsResponse> = repository.tribunLifeStyleNews

    fun getAntaraNewsTerbaru(){
        repository.fetchAntaraNewsTerbaru()
    }fun getAntaraNewsPolitik(){
        repository.fetchAntaraNewsPolitik()
    }fun getAntaraNewsHukum(){
        repository.fetchAntaraNewsHukum()
    }

    fun getCnnNewsTerbaru(){
        repository.fetchCnnNewsTerbaru()
    }fun getCnnNewsNasional(){
        repository.fetchCnnNewsNasional()
    }fun getCnnNewsInternasional(){
        repository.fetchCnnNewsInternasional()
    }

    fun getTribunNewsTerbaru(){
        repository.fetchTribunNewsTerbaru()
    }fun getTribunNewsSeleb(){
        repository.fetchTribunNewsSeleb()
    }fun getTribunNewsLifestyle(){
        repository.fetchTribunNewsSLifestyle()
    }
}