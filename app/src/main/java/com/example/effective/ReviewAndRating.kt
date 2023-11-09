package com.example.effective

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.effective.ui.theme.AppTheme

@Composable
fun ReviewAndRating() {
    Column {
        Text(
            text = stringResource(R.string.ReviewAndRating),
            style = AppTheme.TextStyle.Bold_16,
            color = AppTheme.TextColors.secondary,
            modifier = Modifier
                .padding(start = 24.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Rating()
        Spacer(modifier = Modifier.height(37.dp))
        Review()
    }
}

@Composable
fun Rating() {
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
    ) {
        Text(
            text = stringResource(R.string.rating),
            style = AppTheme.TextStyle.Bold_48,
            color = AppTheme.TextColors.secondary
        )
        Spacer(modifier = Modifier.width(17.dp))
        Column {
            Image(
                painter = painterResource(R.drawable.group_84),
                contentDescription = null,
                modifier = Modifier
                    .width(82.dp)
                    .height(12.dp)
                    .offset(y = 18.dp)
            )
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = stringResource(R.string.sM_Reviews),
                style = AppTheme.TextStyle.Regular_12,
                color = AppTheme.TextColors.grey,
                modifier = Modifier
                    .padding(start = 5.dp)
            )
        }
    }
}

@Composable
fun Review() {
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.prof1),
            contentDescription = null,
            modifier = Modifier
                .width(36.dp)
                .height(36.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = stringResource(R.string.name1),
                style = AppTheme.TextStyle.Bold_16,
                color = AppTheme.TextColors.secondary
            )
            Text(
                text = stringResource(R.string.date),
                style = AppTheme.TextStyle.Regular_12,
                color = AppTheme.TextColors.grey
            )
        }
    }
    Spacer(modifier = Modifier.height(16.dp))

    Row(
        modifier = Modifier
            .padding(start = 24.dp, end = 24.dp)
    ) {
        Text(
            text = stringResource(R.string.comment),
            style = AppTheme.TextStyle.Regular_12,
            color = AppTheme.TextColors.lightGrey
        )
    }
    Spacer(modifier = Modifier.height(24.dp))

    Box(
        modifier = Modifier
            .height(0.5.dp)
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp)
            .background(color = AppTheme.TextColors.grey)
    )
    Spacer(modifier = Modifier.height(24.dp))
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.prof2),
            contentDescription = null,
            modifier = Modifier
                .width(36.dp)
                .height(36.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = stringResource(R.string.name2),
                style = AppTheme.TextStyle.Bold_16,
                color = AppTheme.TextColors.secondary
            )
            Text(
                text = stringResource(R.string.date),
                style = AppTheme.TextStyle.Regular_12,
                color = AppTheme.TextColors.grey
            )
        }
    }
    Spacer(modifier = Modifier.height(16.dp))

    Row(
        modifier = Modifier
            .padding(start = 24.dp, end = 24.dp)
    ) {
        Text(
            text = stringResource(R.string.comment),
            style = AppTheme.TextStyle.Regular_12,
            color = AppTheme.TextColors.lightGrey
        )
    }
}


@Preview
@Composable
fun CommentsPreview() {
        ReviewAndRating()
}