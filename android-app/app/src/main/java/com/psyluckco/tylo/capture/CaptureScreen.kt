/**
 * Created by developer on 16-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.capture

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.psyluckco.tylo.record.RecordScreen
import com.psyluckco.tylo.ui.theme.TyloTheme

@Composable
fun CaptureScreen(
    snackbarHostState: SnackbarHostState,
    modifier: Modifier = Modifier
) {

    Scaffold {
            innerPadding ->
        CaptureContent(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        )
    }

}

@Composable
fun CaptureContent(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.surface
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text("This is Capture screen")
        }
    }
}

@Preview
@Composable
fun CaptureContentPreview() {
    TyloTheme {
        CaptureScreen(
            snackbarHostState = SnackbarHostState()
        )
    }

}