/**
 * Created by developer on 18-04-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class HomeUiState(
    val transcripts: List<String> = emptyList()
)

@HiltViewModel
class HomeViewModel @Inject constructor(

) : ViewModel() {

}