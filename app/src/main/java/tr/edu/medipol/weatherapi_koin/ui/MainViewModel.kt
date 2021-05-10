package tr.edu.medipol.weatherapi_koin.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import tr.edu.medipol.weatherapi_koin.model.News
import tr.edu.medipol.weatherapi_koin.network.NewsService
import tr.edu.medipol.weatherapi_koin.network.networkCall

class MainViewModel(private val  WeatherService: NewsService) : ViewModel() {
    fun getNews() = liveData {
        emit(networkCall {
            WeatherService.getNews()
        })
    }
}

