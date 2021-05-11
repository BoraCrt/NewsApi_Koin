package tr.edu.medipol.weatherapi_koin.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import tr.edu.medipol.weatherapi_koin.model.RequestModel
import tr.edu.medipol.weatherapi_koin.model.WeatherModel

interface NewsService {
        @GET("top-headlines")
        suspend fun getNews(@Query("country")country:String,@Query("apikey") apikey:String) : Response<RequestModel> //Response
    }
//api keyi retrofite eklenecek//
//default query ekleme//
//country//
//haberlerin resimleri eklenecek,coil,glide//
//Query olarak api key ve country eklenmesi

//retrofit default query bakılarak api key tanımla