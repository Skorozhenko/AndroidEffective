package com.example.effective

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective.ui.theme.AppTheme


@Composable
private fun DotaLogo(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.size(width = 88.dp, height = 95.dp)) {
    Image(
        painter = painterResource(R.drawable.group_88),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(18.dp))
    )
    }
}

@Composable
fun DotaLogoAndText() {
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
            .offset(y = -30.dp)
    ) {
        DotaLogo()
        Spacer(modifier = Modifier.width(12.dp))
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .height(80.dp)
        ) {
            Text(
                text = stringResource(R.string.DoTA_2),
                style = AppTheme.TextStyle.Bold_20,
                color = AppTheme.TextColors.secondary,
                )
            //Spacer(modifier = Modifier.height(5.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.group_84),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .size(width = 76.dp, height = 12.dp)

                )
                Text(
                    text = stringResource(R.string.sM),
                    style = AppTheme.TextStyle.Regular_12,
                    color = AppTheme.TextColors.grey,
                    modifier = Modifier
                        .padding(start = 15.dp)
                )
            }
        }
    }
}



@Preview
@Composable
fun DotaLogoAndTextPreview() {
    DotaLogoAndText()
}

