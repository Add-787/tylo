/**
 * Created by developer on 15-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.record

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Ui state for the Record screen
 */
data class RecordUiState(
    val summary: String = ""
)

@HiltViewModel
class RecordViewModel @Inject constructor(

) : ViewModel() {


}
