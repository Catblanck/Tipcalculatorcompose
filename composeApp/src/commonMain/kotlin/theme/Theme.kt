package theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val TipColorScheme = lightColorScheme(

    primary = AccentPink,
    secondary = AccentPink,

    background = BackgroundGray,
    surface = BackgroundGray,

    onPrimary = TextDark,
    onSecondary = TextDark,
    onBackground = TextDark,
    onSurface = TextDark
)

@Composable
fun TipCalculatorTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = TipColorScheme,
        typography = Typography(),
        content = content
    )
}