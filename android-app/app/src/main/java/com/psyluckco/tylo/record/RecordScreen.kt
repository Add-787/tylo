/**
 * Created by developer on 12-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.record

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.psyluckco.tylo.ui.theme.TyloTheme

@Composable
fun RecordScreen(
    snackbarHostState: SnackbarHostState,
    modifier: Modifier = Modifier
) {

    Scaffold {
        innerPadding ->
            RecordContent(
                modifier = modifier
                    .fillMaxSize()
                    .padding(paddingValues = innerPadding)
            )
    }
    
}

@Composable
fun RecordContent(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.surface
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text("This is Record screen")
        }
    }
}

@Preview
@Composable
fun RecordContentPreview() {
    TyloTheme {
        RecordScreen(
            snackbarHostState = SnackbarHostState()
        )
    }

}

