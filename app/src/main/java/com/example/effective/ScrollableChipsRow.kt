package com.example.effective

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.effective.ui.theme.AppTheme

@Composable
fun ScrollableChipsRow(
    itemsList: List<String>,
    modifier: Modifier,
    contentPadding: PaddingValues
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier.offset(y = -10.dp)
    ) {
        items(itemsList) { item ->
            Chip(item)
        }
    }
}

@Composable
fun Chip(item: String) {
    Box(
        modifier = Modifier
            .background(
                AppTheme.BgColors.chipBg,
                shape = RoundedCornerShape(150.dp)
            )
    ) {
        Text(
            item,
            color = AppTheme.TextColors.chipText,
            style = AppTheme.TextStyle.Regular_12,
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, bottom = 5.dp, top = 5.dp))
    }
}

