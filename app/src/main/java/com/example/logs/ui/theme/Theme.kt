package com.example.logs.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpace
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.graphics.colorspace.Rgb

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,


    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun LogsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }


    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
@Composable
fun DebugButtonColors() : ButtonColors{
    return ButtonDefaults.buttonColors(contentColor = Color.Green)
}

@Composable
fun InfoButtonColors() : ButtonColors{
   return ButtonDefaults.buttonColors(contentColor = Color.Blue)
}

@Composable
fun WarningButtonColors() : ButtonColors{
    return ButtonDefaults.buttonColors(contentColor = Color.hsv(39F, 100F, 100F))
}

@Composable
fun ErrorButtonColors() : ButtonColors{
    return ButtonDefaults.buttonColors(contentColor = Color.Red)
}


