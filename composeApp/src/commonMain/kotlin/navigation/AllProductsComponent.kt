package navigation

import Provider
import com.arkivanov.decompose.ComponentContext
import data.Product
import io.ktor.client.call.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AllProductsComponent(
    componentContext: ComponentContext,
    private val provider: Provider
): ComponentContext by componentContext {
    
    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private val _allProductsList = MutableStateFlow<List<Product>>(listOf())
    val allProductList = _allProductsList.asStateFlow()
    
    fun getAllProducts(){
        coroutineScope.launch {
            _allProductsList.value = provider.getAllProducts().body()  
        }
    }
}
