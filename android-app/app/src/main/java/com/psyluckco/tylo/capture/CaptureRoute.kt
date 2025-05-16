/**
 * Created by developer on 16-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.capture

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import com.psyluckco.tylo.record.RecordScreen
import com.psyluckco.tylo.record.RecordViewModel

@Composable
fun CaptureRoute(
    captureViewModel: CaptureViewModel = hiltViewModel(),
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() }
) {

    CaptureScreen(
        snackbarHostState = snackbarHostState
    )

}