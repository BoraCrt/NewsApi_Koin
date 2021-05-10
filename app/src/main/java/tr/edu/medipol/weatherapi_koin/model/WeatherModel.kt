package tr.edu.medipol.weatherapi_koin.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable //serializiable,parseable bakılacak..(class'a göre)
data class WeatherModel(@SerialName("title") val title:String, @SerialName("description") val description :String, @SerialName("content") val content:String)
enum class News(val url: String){
    HURRIYET("Hurriyet.com.tr"),MILLIYET("Milliyet.com.tr")
}

