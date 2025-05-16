/**
 * Created by developer on 16-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.capture

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Ui state for the Record screen
 */
data class CaptureUiState(
    val summary: String = ""
)

@HiltViewModel
class CaptureViewModel @Inject constructor(

) : ViewModel() {


}