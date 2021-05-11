package tr.edu.medipol.weatherapi_koin.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestModel(
    @SerialName("status") val status : String="",
    @SerialName("totalResults") val total : Int=1,
    @SerialName("articles") val articles  : List<WeatherModel> = listOf()

)
