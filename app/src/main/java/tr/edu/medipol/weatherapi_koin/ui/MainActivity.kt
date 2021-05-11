package tr.edu.medipol.weatherapi_koin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.imageLoader
import coil.load
import org.koin.androidx.viewmodel.ext.android.viewModel
import tr.edu.medipol.weatherapi_koin.R
import tr.edu.medipol.weatherapi_koin.databinding.ActivityMainBinding
import tr.edu.medipol.weatherapi_koin.model.WeatherModel
import tr.edu.medipol.weatherapi_koin.network.Config
import tr.edu.medipol.weatherapi_koin.network.DataState

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMainBinding
    val mainViewModel by viewModel<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        mainViewModel.getNews(Config.COUNTRY, Config.API_KEY).observe(this) {
            if (it is DataState.Success) {
                if (it.data != null) {
                    implementUI(it.data.articles.first())
                }
            }
        }
    }

    private fun implementUI(weatherModel: WeatherModel) {
        viewBinding.apply {
            imageView.load(weatherModel.image)
            itemDescription.text = weatherModel.description
            itemContent.text = weatherModel.content
            itemTitle.text = weatherModel.title
        }
    }
}
//if it bak
//yapılan her şeye baştan sona bakılarak anlamaya çalış//
