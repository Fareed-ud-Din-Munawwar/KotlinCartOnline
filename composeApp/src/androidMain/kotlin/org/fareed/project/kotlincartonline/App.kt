package org.fareed.project.kotlincartonline
 
import android.app.Application
import di.sharedBase
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        
        startKoin {
            modules(sharedBase())
        }
    }
}