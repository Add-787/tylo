package com.psyluckco.tylo.data.model

import com.google.firebase.Timestamp

data class Sensor(
    val value: Int,
    val timestamp: Timestamp
)
