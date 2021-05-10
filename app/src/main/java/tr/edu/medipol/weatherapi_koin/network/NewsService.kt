package tr.edu.medipol.weatherapi_koin.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import tr.edu.medipol.weatherapi_koin.model.WeatherModel

interface NewsService {
        @GET("top-headlines?country=tr&apiKey=1af66a46eb5f4fa2a26333fcaa19caeb")
        suspend fun getNews() : Response<WeatherModel> //Response
    }
//api keyi retrofite eklenecek//
//default query ekleme//
//country//
//haberlerin resimleri eklenecek,coil,glide//