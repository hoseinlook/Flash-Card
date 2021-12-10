package com.example.flashcard.activities

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.flashcard.R
import com.example.flashcard.components.NavigationItem

@Composable
fun BottomNavigationBar() {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Categories
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.cardview_light_background),
        elevation = 5.dp
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Column(horizontalAlignment = CenterHorizontally, verticalArrangement = Arrangement.Center ) {
                        Icon(
                            painterResource(id = item.icon),
                            contentDescription = item.title
                        )
                    }
                },
                label = { Text(text = item.title) },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                    /* Add code later */
                }
            )
        }
    }
}