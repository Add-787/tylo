/**
 * Created by developer on 02-04-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.psyluckco.tylo.ui.theme.TyloTheme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun AppLineGraph(
    modifier: Modifier = Modifier,
    dataPoints: List<Float>
) {

    val lineColor = Color(0xFF007AFF) // Blue line color
    val shadeColor = lineColor.copy(alpha = 0.3f) // Lighter blue shade

    Canvas(modifier = modifier.height(100.dp).width(200.dp)) {
        val width = size.width
        val height = size.height

        // Normalize data points
        val maxY = dataPoints.maxOrNull() ?: 1f
        val minY = dataPoints.minOrNull() ?: 0f
        val pointSpacing = width / (dataPoints.size - 1)

        // Transform function to map data points to canvas coordinates
        fun transformY(value: Float) = height - ((value - minY) / (maxY - minY) * height)

        val path = Path().apply {
            moveTo(0f, transformY(dataPoints[0]))

            for (i in 1 until dataPoints.size) {
                lineTo(i * pointSpacing, transformY(dataPoints[i]))
            }

            // Close the shape for shading (extend to bottom)
            lineTo(width, height)  // Right bottom
            lineTo(0f, height)      // Left bottom
            close()
        }

        // Draw shaded area
        drawPath(path, brush = Brush.verticalGradient(listOf(shadeColor, Color.Transparent)))

        // Draw line graph
        for (i in 0 until dataPoints.size - 1) {
            drawLine(
                color = lineColor,
                start = Offset(i * pointSpacing, transformY(dataPoints[i])),
                end = Offset((i + 1) * pointSpacing, transformY(dataPoints[i + 1])),
                strokeWidth = 5f
            )
        }
    }



}

@Preview(showBackground = true)
@Composable
private fun AppLineGraphPreview() {
    TyloTheme {
        AppLineGraph(dataPoints = listOf(3.0f,6.0f,4.0f,7.0f,9.0f,7.0f))
    }
}