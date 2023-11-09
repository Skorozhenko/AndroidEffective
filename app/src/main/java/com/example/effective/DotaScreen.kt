package com.example.effective

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective.ui.theme.AppTheme

@Composable
fun DotaScreen() {

    //val context = LocalContext.current
    val lazyListState = rememberLazyListState()


    LazyColumn(
        state = lazyListState,
        modifier = Modifier
            .fillMaxSize(),

    ) {
        item {
            DotaScreenHeader()
        }

        item {
            ScrollableChipsRow(
                    itemsList = listOf(
                        stringResource(R.string.MOBA),
                        stringResource(R.string.MULTIPLAYER),
                        stringResource(R.string.STRATEGY),
                        stringResource(R.string.MOBA),
                        stringResource(R.string.MULTIPLAYER),
                        stringResource(R.string.STRATEGY)
                    ),
                    modifier = Modifier,
                    contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )

            Text(
                text = stringResource(R.string.info_about_game),
                style = AppTheme.TextStyle.Regular_19,
                color = AppTheme.TextColors.lightGrey,
                modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 25.dp,)
            )

            ImagesRow()
            Spacer(modifier = Modifier.height(20.dp))

            ReviewAndRating()

            Spacer(modifier = Modifier.height(40.dp))

            val selected = remember { mutableStateOf(false) }
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (selected.value) Color.Gray else AppTheme.ButtonColor.buttonColor),
                onClick = { selected.value = !selected.value },

                modifier = Modifier
                    .fillMaxSize()
                    .width(327.dp)
                    .height(64.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(shape = RoundedCornerShape(20.dp)),
                //.clickable( onClick = {}),
                //colors = ButtonDefaults.buttonColors(AppTheme.ButtonColor.buttonColor)
            ) {
                Text(
                    text = stringResource(R.string.buttom),
                    style = AppTheme.TextStyle.Bold_20,
                    color = AppTheme.TextColors.buttonColor
                )
            }
            Spacer(modifier = Modifier.height(38.dp))

        }
    }
}



@Preview
@Composable
fun DotaScreenPreview() {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        DotaScreen()
    }
}