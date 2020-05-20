package com.example.smkcoding_project2.item


import com.google.gson.annotations.SerializedName

data class DailyTimeSeries(
    @SerializedName("example")
    val example: String,
    @SerializedName("pattern")
    val pattern: String
)