package com.example.effective

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
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
fun ButtonInstall() {
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
}


@Preview
@Composable
fun ButtonInstallPreview() {
    ButtonInstall()
}