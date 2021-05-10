package tr.edu.medipol.weatherapi_koin.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import tr.edu.medipol.weatherapi_koin.di.networkModule
import tr.edu.medipol.weatherapi_koin.di.viewModelModule

class NewsApp : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@NewsApp)
            androidLogger(Level.ERROR)
            modules(networkModule, viewModelModule)
        }

    }
}