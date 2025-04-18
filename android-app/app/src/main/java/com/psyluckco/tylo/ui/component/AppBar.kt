/**
 * Created by developer on 17-04-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.ui.component

import android.R.attr.contentDescription
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.key.Key.Companion.Ro
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.psyluckco.tylo.ui.theme.TyloTheme

@Composable
fun AppBar(modifier: Modifier = Modifier) {

    BottomAppBar(
        modifier = Modifier
            .height(69.dp)
            .width(180.dp)
            .clip(
                RoundedCornerShape(65.dp)
            ),
        containerColor = MaterialTheme.colorScheme.secondary
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.surface),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface
                )

            }

            Box(
                modifier = Modifier
                    .size(58.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.Outlined.Place,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.size(42.dp)
                )

            }

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.surface),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.Outlined.Send,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface
                )

            }

        }



    }
}

@Preview
@Composable
private fun AppBarPreview() {
    TyloTheme {
        AppBar()
    }
}

