package tr.edu.medipol.weatherapi_koin.network

sealed class DataState<out T> {
    //object Loading:DataState<Nothing>()
    data class Success<T>(val data:T?):DataState<T>()
    data class Exception(val exception:String):DataState<Nothing>()
}