package di

import Provider
import io.ktor.client.*
import ktor.client
import org.koin.dsl.module

val networkBaseModule = module {

    single<HttpClient>{ client}
    single<Provider>{ Provider()}
    //factory<DispatchersProvider>{ DefaultDispatchersProvider() }
}
