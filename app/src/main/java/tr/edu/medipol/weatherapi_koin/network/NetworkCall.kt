package tr.edu.medipol.weatherapi_koin.network

import retrofit2.Response

suspend fun<T:Any> networkCall(call:suspend()-> Response<T>):DataState<T> {
    return try  {

        val response=call.invoke()
        if (response.isSuccessful) {
            DataState.Success(response.body())

        }else DataState.Exception(response.message())
    } catch (exception:Exception) {
        DataState.Exception(exception.localizedMessage?:"HATA!!!")
    }

}