package com.example.effective.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object AppTheme {
    object TextColors {
        val secondary = Color(255,255,255)
        val chipText = Color(68, 169, 244)
        val grey = Color(66, 68, 72)
        val lightGrey = Color(211, 211, 211)
        val buttonColor = Color(5,11,24)
    }


    object BgColors {
        val primary = Color(5,11,24)
        val chipBg = Color(28, 51, 71)
        val video = Color(255,255,255,80)
    }

    object ButtonColor {
        val buttonColor = Color(255, 255, 0)
        val buttonClip = Color(240, 230, 130)
    }

    object TextStyle {

        val Regular_19
            @Composable get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
//                    lineHeightStyle = LineHeightStyle(
//                        LineHeightStyle.Alignment.Proportional,
//                        LineHeightStyle.Trim.None
//                    ),
                )

        val Bold_16
            @Composable get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
//                    lineHeightStyle = LineHeightStyle(
//                        LineHeightStyle.Alignment.Proportional,
//                        LineHeightStyle.Trim.None
//                    ),
//                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    letterSpacing = 0.6.sp,
                    lineHeight = 19.sp
                )

        val Regular_12
            @Composable
            get() =
                TextStyle (
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
//                    platformStyle = PlatformTextStyle(includeFontPadding = false),
//                    lineHeightStyle = LineHeightStyle(
//                        LineHeightStyle.Alignment.Proportional,
//                        LineHeightStyle.Trim.None
//                    ),
                    letterSpacing = 0.5.sp,
                    lineHeight = 13.sp
                )

        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
//                    platformStyle = PlatformTextStyle(includeFontPadding = false),
//                    lineHeightStyle = LineHeightStyle(
//                        LineHeightStyle.Alignment.Proportional,
//                        LineHeightStyle.Trim.None
//                    ),
                )

        val Bold_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
//                    platformStyle = PlatformTextStyle(includeFontPadding = false),
//                    lineHeightStyle = LineHeightStyle(
//                        LineHeightStyle.Alignment.Proportional,
//                        LineHeightStyle.Trim.None
//                    ),
                    letterSpacing = 0.5.sp,
                    lineHeight = 26.sp
                )
    }
}


@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (isSystemInDarkTheme()) {
            darkColors(
                primary = Color(0xFF0E0701),
                secondary = Color(0xFFF5F1ED),
            )
        } else {
            lightColors(
                primary = Color(0xFF0E0701),
            )
        },
        content = content,
    )
}

