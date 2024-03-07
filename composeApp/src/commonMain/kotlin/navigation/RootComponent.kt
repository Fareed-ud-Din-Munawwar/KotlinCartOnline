package navigation

import Provider
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import kotlinx.serialization.Serializable

class RootComponent(
    componentContext: ComponentContext,
    //private val provider: Provider,
): ComponentContext by componentContext {
    private val navigation = StackNavigation<Configuration>()
    val childStack = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.AllProductsScreen,
        handleBackButton = true,
        childFactory = ::createChild
    )
    
    private fun createChild(
        config: Configuration,
        context: ComponentContext
    ): Child {
        return when(config) {
            Configuration.AllProductsScreen -> Child.AllProductsScreen(
                AllProductsComponent(
                    componentContext = context, Provider()
                    
                )
            )
        }
    }

    sealed class Child {
        data class AllProductsScreen(val component: AllProductsComponent): Child()
    }

    @Serializable
    sealed class Configuration {
        @Serializable
        data object AllProductsScreen: Configuration()

    }
}
