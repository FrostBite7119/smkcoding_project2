package com.example.smkcoding_project2.item


import com.google.gson.annotations.SerializedName

data class Recovered(
    @SerializedName("detail")
    val detail: String,
    @SerializedName("value")
    val value: Int
)