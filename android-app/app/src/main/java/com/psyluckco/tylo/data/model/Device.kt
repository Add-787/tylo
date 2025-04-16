package com.psyluckco.tylo.data.model

data class Device(
    val name: String,
    val data: List<Sensor>,
    val userId: String = ""
)
