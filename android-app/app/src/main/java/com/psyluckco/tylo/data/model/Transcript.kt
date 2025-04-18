package com.psyluckco.tylo.data.model

import android.os.Build
import androidx.annotation.RequiresApi
import com.google.type.DateTime
import java.sql.Time
import java.sql.Timestamp
import java.time.LocalTime
import java.util.Date
import kotlin.time.TimeSource

data class Transcript constructor(
    val time: LocalTime = LocalTime.now(),
    val name: String,
    val summary: String,
    val tage: List<String>
)
