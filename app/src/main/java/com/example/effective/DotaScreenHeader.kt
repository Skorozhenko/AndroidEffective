package com.example.effective

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {
    HeaderBackground(
        painter = painterResource(R.drawable.mask_group123),
        modifier = modifier
            .fillMaxSize()
            .width(475.dp)
            .height(340.dp),
        contentScale = ContentScale.Crop
    )
    DotaLogoAndText()

}

@Composable
fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    contentScale: ContentScale
) {
    Box {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = modifier,
            contentScale = contentScale,
        )
    }
}



@Preview
@Composable
fun DotaScreenHeaderPreview() {
    //Surface(
     //   color = AppTheme.BgColors.primary,
    //)
    //{
        DotaScreenHeader()
    //}
}