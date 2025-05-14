package com.psyluckco.tylo.ui.theme

import android.app.Activity
import android.os.Build
import android.provider.CalendarContract.Colors
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = tylo_theme_dark_primary,
    onPrimary = tylo_theme_dark_onPrimary,
    primaryContainer = tylo_theme_dark_primaryContainer,
    onPrimaryContainer = tylo_theme_dark_onPrimaryContainer,
    secondary = tylo_theme_dark_secondary,
    onSecondary = tylo_theme_dark_onSecondary,
    secondaryContainer = tylo_theme_dark_secondaryContainer,
    onSecondaryContainer = tylo_theme_dark_onSecondaryContainer,
    tertiary = tylo_theme_dark_tertiary,
    onTertiary = tylo_theme_dark_onTertiary,
    tertiaryContainer = tylo_theme_dark_tertiaryContainer,
    onTertiaryContainer = tylo_theme_dark_onTertiaryContainer,
    error = tylo_theme_dark_error,
    onError = tylo_theme_dark_onError,
    errorContainer = tylo_theme_dark_errorContainer,
    onErrorContainer = tylo_theme_dark_onErrorContainer,
    background = tylo_theme_dark_background,
    onBackground = tylo_theme_dark_onBackground,
    surface = tylo_theme_dark_surface,
    onSurface = tylo_theme_dark_onSurface,
    surfaceVariant = tylo_theme_dark_surfaceVariant,
    onSurfaceVariant = tylo_theme_dark_onSurfaceVariant,
    outline = tylo_theme_dark_outline,
    inverseSurface = tylo_theme_dark_inverseSurface,
    inverseOnSurface = tylo_theme_dark_inverseOnSurface,
    inversePrimary = tylo_theme_dark_inversePrimary,
    surfaceTint = tylo_theme_dark_surfaceTint,
)

private val LightColorScheme = lightColorScheme(
    primary = tylo_theme_light_primary,
    onPrimary = tylo_theme_light_onPrimary,
    primaryContainer = tylo_theme_light_primaryContainer,
    onPrimaryContainer = tylo_theme_light_onPrimaryContainer,
    secondary = tylo_theme_light_secondary,
    onSecondary = tylo_theme_light_onSecondary,
    secondaryContainer = tylo_theme_light_secondaryContainer,
    onSecondaryContainer = tylo_theme_light_onSecondaryContainer,
    tertiary = tylo_theme_light_tertiary,
    onTertiary = tylo_theme_light_onTertiary,
    tertiaryContainer = tylo_theme_light_tertiaryContainer,
    onTertiaryContainer = tylo_theme_light_onTertiaryContainer,
    error = tylo_theme_light_error,
    onError = tylo_theme_light_onError,
    errorContainer = tylo_theme_light_errorContainer,
    onErrorContainer = tylo_theme_light_onErrorContainer,
    background = tylo_theme_light_background,
    onBackground = tylo_theme_light_onBackground,
    surface = tylo_theme_light_surface,
    onSurface = tylo_theme_light_onSurface,
    surfaceVariant = tylo_theme_light_surfaceVariant,
    onSurfaceVariant = tylo_theme_light_onSurfaceVariant,
    outline = tylo_theme_light_outline,
    inverseSurface = tylo_theme_light_inverseSurface,
    inverseOnSurface = tylo_theme_light_inverseOnSurface,
    inversePrimary = tylo_theme_light_inversePrimary,
    surfaceTint = tylo_theme_light_surfaceTint,
)

//@Composable
//fun AndroidappTheme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
//    // Dynamic color is available on Android 12+
//    dynamicColor: Boolean = true,
//    content: @Composable () -> Unit
//) {
//    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }
//
//        darkTheme -> DarkColorScheme
//        else -> LightColorScheme
//    }
//
//    MaterialTheme(
//        colorScheme = colorScheme,
//        typography = Typography,
//        content = content
//    )
//}

@Composable
fun TyloTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}