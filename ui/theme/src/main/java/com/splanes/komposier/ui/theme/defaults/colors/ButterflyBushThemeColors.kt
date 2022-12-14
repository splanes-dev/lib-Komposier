package com.splanes.komposier.ui.theme.defaults.colors

import androidx.compose.ui.graphics.Color
import com.splanes.komposier.ui.theme.models.colors.ThemeColorScheme
import com.splanes.komposier.ui.theme.models.colors.of

internal object ButterflyBushThemeColors : DefaultThemeColors {
    override val baseColors: List<ThemeBaseColor> = listOf(ThemeBaseColor.Blue)
    override val light by lazy {
        ThemeColorScheme.of(
            primary = Color(0xFF5855A3),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFFE2DFFF),
            onPrimaryContainer = Color(0xFF12095D),
            secondary = Color(0xFF5E5C70),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFFE3E0F8),
            onSecondaryContainer = Color(0xFF1A1A2B),
            tertiary = Color(0xFF795367),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFFFFD8EA),
            onTertiaryContainer = Color(0xFF2E1223),
            error = Color(0xFFBA1A1A),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFFFDAD6),
            onErrorContainer = Color(0xFF410002),
            background = Color(0xFFFFFBFF),
            onBackground = Color(0xFF1C1B1E),
            surface = Color(0xFFFFFBFF),
            onSurface = Color(0xFF1C1B1E),
            surfaceVariant = Color(0xFFE4E1EB),
            onSurfaceVariant = Color(0xFF47464E),
            outline = Color(0xFF78767F),
            inverseSurface = Color(0xFF313033),
            inverseOnSurface = Color(0xFFF3EFF4),
            inversePrimary = Color(0xFFC3C0FF),
            surfaceTint = Color(0xFF5855A3),
            outlineVariant = Color(0xFF78767F),
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
            primary = Color(0xFFC3C0FF),
            onPrimary = Color(0xFF292572),
            primaryContainer = Color(0xFF403D8A),
            onPrimaryContainer = Color(0xFFE2DFFF),
            secondary = Color(0xFFC7C4DB),
            onSecondary = Color(0xFF2F2F40),
            secondaryContainer = Color(0xFF464558),
            onSecondaryContainer = Color(0xFFE3E0F8),
            tertiary = Color(0xFFE8B9D0),
            onTertiary = Color(0xFF462638),
            tertiaryContainer = Color(0xFF5F3C4F),
            onTertiaryContainer = Color(0xFFFFD8EA),
            error = Color(0xFFFFB4AB),
            onError = Color(0xFF690005),
            errorContainer = Color(0xFF93000A),
            onErrorContainer = Color(0xFFFFB4AB),
            background = Color(0xFF1C1B1E),
            onBackground = Color(0xFFE5E1E6),
            surface = Color(0xFF1C1B1E),
            onSurface = Color(0xFFE5E1E6),
            surfaceVariant = Color(0xFF47464E),
            onSurfaceVariant = Color(0xFFC8C5CF),
            outline = Color(0xFF928F99),
            inverseSurface = Color(0xFFE5E1E6),
            inverseOnSurface = Color(0xFF313033),
            inversePrimary = Color(0xFF5855A3),
            surfaceTint = Color(0xFFC3C0FF),
            outlineVariant = Color(0xFF928F99),
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
