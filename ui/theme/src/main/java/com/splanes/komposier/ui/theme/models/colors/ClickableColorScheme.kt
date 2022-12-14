package com.splanes.komposier.ui.theme.models.colors

import androidx.compose.ui.graphics.Color

data class ClickableColorScheme(
    val disabled: Color,
    val default: Color,
    val pressed: Color,
    val clicked: Color = default,
)
