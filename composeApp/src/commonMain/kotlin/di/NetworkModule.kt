package di

import io.ktor.client.*
import ktor.client
import org.koin.dsl.module

val networkBaseModule = module {

    single<HttpClient>{ client}
    //factory<DispatchersProvider>{ DefaultDispatchersProvider() }
}
