import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle
import androidx.compose.runtime.remember
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import io.ktor.client.*
import navigation.RootComponent

fun MainViewController() = ComposeUIViewController {

    val root = remember {
        RootComponent(DefaultComponentContext(LifecycleRegistry()))
    }

    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
                UIUserInterfaceStyle.UIUserInterfaceStyleDark
    App(
        root = root,
        darkTheme = isDarkTheme,
        dynamicColor = false,
    )
}
