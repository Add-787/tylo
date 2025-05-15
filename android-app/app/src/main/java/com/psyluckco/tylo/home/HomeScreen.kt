/**
 * Created by developer on 18-04-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.home

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.psyluckco.tylo.ui.component.AppBar
import com.psyluckco.tylo.ui.component.AppSearchBar
import com.psyluckco.tylo.ui.theme.TyloTheme


@Composable
fun HomeScreen(
    snackbarHostState: SnackbarHostState,
    modifier: Modifier = Modifier
) {

    Scaffold {
        innerPadding ->
        HomeContent(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        )
    }

}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    isRefreshing: Boolean = false,
    transcripts: List<String> = emptyList()
) {

//    Column(
//        modifier = modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        Row(
//            modifier = modifier.height(180.dp)
//        ) {
//
//        }
//
//        AppSearchBar()
//
//        Row(
//            modifier = modifier
//                .height(65.dp)
//                .padding(12.dp)
//                .horizontalScroll(rememberScrollState())
//        ) {
//
//            repeat(10) {
//                Text("Item $it", modifier = Modifier.padding(2.dp))
//            }
//
//        }
//
//    }

    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.surface
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text("This is Home screen")
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun HomeContentPreview() {
    TyloTheme {
        HomeContent(
        )
    }
}