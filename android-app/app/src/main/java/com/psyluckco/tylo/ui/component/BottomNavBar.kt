/**
 * Created by developer on 13-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.psyluckco.tylo.R
import com.psyluckco.tylo.ui.theme.TyloShapes
import com.psyluckco.tylo.ui.theme.TyloTheme

@Composable
fun BottomNavBar(
    items: List<BottomNavBarItem>,
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

    Card(
        shape = TyloShapes.medium,
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 12.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .height(60.dp)
                .width(265.dp)
        ) {
            items.forEachIndexed { index, item ->
                AnimatedContent(
                    targetState = item.isSelected,
                    transitionSpec = {
                        (
                                fadeIn(animationSpec = tween(durationMillis = 200)) +
                                scaleIn(initialScale = 0.8f, animationSpec = tween(durationMillis = 300))
                        )
                            .togetherWith(
                                // Exit transition: fade out and slide out to the left
                                scaleOut(targetScale = 0.8f, animationSpec = tween(durationMillis = 300))
                            )

                    },
                    label = "animated nav button"
                ) { itemIsSelected ->
                    Icon(
                        painter = painterResource(if (itemIsSelected) item.selectedIconRes else item.unselectedIconRes),
                        contentDescription = item.contentDescription,
                        modifier = modifier.size(45.dp),
                    )
                }

            }
        }

    }

}

@Preview
@Composable
fun BottomNavBarPreview() {
    val items = listOf(
        BottomNavBarItem(
            unselectedIconRes = R.drawable.custom_home_unselected_icon,
            selectedIconRes = R.drawable.custom_home_selected_icon,
            contentDescription = "Home",
            isSelected = true
        ),
        BottomNavBarItem(
            unselectedIconRes = R.drawable.custom_mic_unselected_icon,
            selectedIconRes = R.drawable.custom_mic_selected_icon,
            contentDescription = "Settings",
            isSelected = false
        ),
        BottomNavBarItem(
            unselectedIconRes = R.drawable.custom_placeholder_unselected_icon,
            selectedIconRes = R.drawable.custom_placeholder_selected_icon,
            contentDescription = "Settings",
            isSelected = false
        )
    )

    TyloTheme {
        BottomNavBar(items = items, onItemSelected = {})
    }

}

data class BottomNavBarItem(
    @DrawableRes val selectedIconRes: Int,
    @DrawableRes val unselectedIconRes: Int,
    val contentDescription: String?,
    val isSelected: Boolean
)