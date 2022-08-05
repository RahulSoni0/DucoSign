package com.devcommop.joaquin.codeforgood

import android.app.Application
import android.content.Context
import com.devcommop.joaquin.codeforgood.di.dataModule
import com.devcommop.joaquin.codeforgood.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppController: Application() {

    companion object{
        private var INSTANCE: AppController? = null

        @JvmStatic
        fun getInstance() : Context {
            return INSTANCE as AppController
        }
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@AppController)
            modules(viewModelModule)
            modules(dataModule)
        }
        INSTANCE = this
    }

}