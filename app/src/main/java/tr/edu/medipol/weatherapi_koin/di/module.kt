package tr.edu.medipol.weatherapi_koin.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create
import tr.edu.medipol.weatherapi_koin.network.NewsService
import tr.edu.medipol.weatherapi_koin.ui.MainViewModel
import java.util.concurrent.TimeUnit

val networkModule = module {
    single {
        val client = OkHttpClient.Builder()
            .writeTimeout(20L, TimeUnit.SECONDS)
            .readTimeout(20L, TimeUnit.SECONDS)
            .connectTimeout(20L, TimeUnit.SECONDS)
            .build()
        Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .client(client)
            .addConverterFactory(
                Json {ignoreUnknownKeys = true}.asConverterFactory("application/json".toMediaType()
            ))
            .build()

    }
    single {
        (get()as Retrofit).create(NewsService::class.java) //2.ci metod
    }
}
val viewModelModule= module {
    viewModel { MainViewModel(get()) }
}
//okhttp logger eklenecek//