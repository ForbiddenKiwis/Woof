package com.example.woof.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.woof.R
import org.w3c.dom.Text

// Set of Material typography styles to start with

val AbrilFatFace = FontFamily(
    Font(R.font.abrilfatface_regular, FontWeight.Normal)
)

val Montserrat = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

@Composable
fun appTypography(): Typography {
    val isPreview = LocalInspectionMode.current

    val abril = if (isPreview) FontFamily.Serif else AbrilFatFace
    val montserrat = if (isPreview) FontFamily.SansSerif else Montserrat

    return Typography(
        displayLarge = TextStyle(
            fontFamily = abril,
            fontWeight = FontWeight.Normal,
            fontSize = 36.sp
        ),
        displayMedium = TextStyle(
            fontFamily = montserrat,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        ),
        labelSmall = TextStyle(
            fontFamily = montserrat,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = montserrat,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        )
    )
}

//val Typography = Typography(
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    )
//    /* Other default text styles to override
//    titleLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 22.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp
//    ),
//    labelSmall = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Medium,
//        fontSize = 11.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    )
//    */
//)