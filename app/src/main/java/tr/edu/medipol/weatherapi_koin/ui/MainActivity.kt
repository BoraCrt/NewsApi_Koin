package tr.edu.medipol.weatherapi_koin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import tr.edu.medipol.weatherapi_koin.R
import tr.edu.medipol.weatherapi_koin.network.DataState

class MainActivity : AppCompatActivity(){
    val mainViewModel by viewModel<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel.getNews().observe(this) {
            if (it is DataState.Success){

            }
        }
    }
}
