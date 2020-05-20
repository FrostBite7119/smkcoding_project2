package com.example.smkcoding_project2.item


import com.google.gson.annotations.SerializedName

data class Confirmed(
    @SerializedName("detail")
    val detail: String,
    @SerializedName("value")
    val value: Int
)