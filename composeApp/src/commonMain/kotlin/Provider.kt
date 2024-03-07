import io.ktor.client.*
import io.ktor.client.request.*
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Provider : KoinComponent {
    private val client by inject<HttpClient>()

    suspend fun getAllProducts() = client.get("https://fakestoreapi.com/products")
    
}
