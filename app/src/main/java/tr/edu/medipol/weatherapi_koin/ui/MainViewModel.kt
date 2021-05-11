package tr.edu.medipol.weatherapi_koin.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import tr.edu.medipol.weatherapi_koin.network.NewsService
import tr.edu.medipol.weatherapi_koin.network.networkCall

class MainViewModel(private val  newsService: NewsService) : ViewModel() {
    fun getNews(country:String,apikey:String) = liveData {
        emit(networkCall {
            newsService.getNews(country,apikey)
        })
    }
}

