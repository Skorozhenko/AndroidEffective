package com.example.effective

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective.ui.theme.AppTheme

@Composable
fun ImagesRow() {
    Box(contentAlignment = Alignment.Center) {
        LazyRow(
            modifier = Modifier.padding(start = 24.dp, end = 10.dp, top = 20.dp)
        ) {
            item {
                Video()
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image_17),
                    contentDescription = null,
                    modifier = Modifier
                        .width(240.dp)
                        .height(135.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .padding(end = 15.dp)
                )
            }
        }
    }
}

@Composable
fun Video() {
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.image_18),
            contentDescription = null,
            modifier = Modifier
                .width(253.dp)
                .height(138.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .padding(end = 15.dp)
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(48.dp)
                .clip(shape = CircleShape)
                .background(AppTheme.BgColors.video, shape = CircleShape)
        ) {
//                IconButton(onClick = { }) {
//                    Icon(Icons.Filled.PlayArrow)
            Image(
                painter = painterResource(R.drawable.arrow),
                contentDescription = null,
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
        }

    }
}

@Preview
@Composable
fun ImageRowPreview() {
    ImagesRow()
}