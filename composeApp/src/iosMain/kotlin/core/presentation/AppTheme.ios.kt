package core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.material3.MaterialTheme
import theme.DarkColorScheme
import theme.LightColorScheme
import theme.Typography

@Composable
actual fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}
