package com.splanes.komposier.ui.theme.defaults.colors

import androidx.compose.ui.graphics.Color
import com.splanes.komposier.ui.theme.models.colors.ThemeColorScheme
import com.splanes.komposier.ui.theme.models.colors.of

object OrientThemeColors : DefaultThemeColors {
    override val baseColors: List<ThemeBaseColor> = listOf(ThemeBaseColor.Blue, ThemeBaseColor.Gray)
    override val light by lazy {
        ThemeColorScheme.of(
            primary = Color(0xFF006684),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFFBDE9FF),
            onPrimaryContainer = Color(0xFF001F2A),
            secondary = Color(0xFF00677D),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFFB3EBFF),
            onSecondaryContainer = Color(0xFF001F27),
            tertiary = Color(0xFF006A63),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF72F7EA),
            onTertiaryContainer = Color(0xFF00201D),
            error = Color(0xFFBA1A1A),
            errorContainer = Color(0xFFFFDAD6),
            onError = Color(0xFFFFFFFF),
            onErrorContainer = Color(0xFF410002),
            background = Color(0xFFF6FEFF),
            onBackground = Color(0xFF001F24),
            surface = Color(0xFFF6FEFF),
            onSurface = Color(0xFF001F24),
            surfaceVariant = Color(0xFFDCE4E9),
            onSurfaceVariant = Color(0xFF40484C),
            outline = Color(0xFF70787D),
            inverseOnSurface = Color(0xFFD0F8FF),
            inverseSurface = Color(0xFF00363D),
            inversePrimary = Color(0xFF67D3FF),
            surfaceTint = Color(0xFF006684),
            outlineVariant = Color(0xFF70787D),
            scrim = Color(0xFF000000),
            success = Color(0xFF90C867),
            successContainer = Color(0xFFB8F38C),
            onSuccessContainer = Color(0xFF0B2000),
            warning = Color(0xFFFF8844),
            warningContainer = Color(0xFFFFDBCB),
            onWarningContainer = Color(0xFF341100),
            info = Color(0xFF494FB9),
            infoContainer = Color(0xFFE0E0FF),
            onInfoContainer = Color(0xFF02006E)
        )
    }
    override val dark by lazy {
        ThemeColorScheme.of(
            primary = Color(0xFF67D3FF),
            onPrimary = Color(0xFF003546),
            primaryContainer = Color(0xFF004D64),
            onPrimaryContainer = Color(0xFFBDE9FF),
            secondary = Color(0xFF5AD5F9),
            onSecondary = Color(0xFF003642),
            secondaryContainer = Color(0xFF004E5F),
            onSecondaryContainer = Color(0xFFB3EBFF),
            tertiary = Color(0xFF51DBCE),
            onTertiary = Color(0xFF003733),
            tertiaryContainer = Color(0xFF00504A),
            onTertiaryContainer = Color(0xFF72F7EA),
            error = Color(0xFFFFB4AB),
            errorContainer = Color(0xFF93000A),
            onError = Color(0xFF690005),
            onErrorContainer = Color(0xFFFFDAD6),
            background = Color(0xFF001F24),
            onBackground = Color(0xFF97F0FF),
            surface = Color(0xFF001F24),
            onSurface = Color(0xFF97F0FF),
            surfaceVariant = Color(0xFF40484C),
            onSurfaceVariant = Color(0xFFC0C8CD),
            outline = Color(0xFF8A9297),
            inverseOnSurface = Color(0xFF001F24),
            inverseSurface = Color(0xFF97F0FF),
            inversePrimary = Color(0xFF006684),
            surfaceTint = Color(0xFF67D3FF),
            outlineVariant = Color(0xFF8A9297),
            scrim = Color(0xFF000000),
            success = Color(0xFF9DD673),
            successContainer = Color(0xFF245100),
            onSuccessContainer = Color(0xFFB8F38C),
            warning = Color(0xFFFFB691),
            warningContainer = Color(0xFF783100),
            onWarningContainer = Color(0xFFFFDBCB),
            info = Color(0xFFBFC2FF),
            infoContainer = Color(0xFF3339A3),
            onInfoContainer = Color(0xFFE0E0FF)
        )
    }
}
