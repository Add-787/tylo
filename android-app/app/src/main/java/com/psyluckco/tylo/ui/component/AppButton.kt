package com.psyluckco.tylo.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.psyluckco.tylo.ui.theme.TyloTheme

@Composable
fun AppButton(
    text: String = "",
    onClick: () -> Unit,
) {

    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(text = text)
    }

}

@Preview
@Composable
private fun AppButtonPreview() {
    TyloTheme {
        AppButton(
            text = "Click",
            onClick = { }
        )
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun AppButtonDarkPreview() {
    TyloTheme {
        AppButton(
            text = "Click",
            onClick = { }
        )
    }
}