import data.Product
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Provider : KoinComponent {
    private val client by inject<HttpClient>()

    suspend fun getAllProducts() = client.get("https://fakestoreapi.com/products").body<List<Product>>()
    
    suspend fun getAllCategories() = client.get("https://fakestoreapi.com/products/categories").body<List<String>>()

}
