package com.example.smkcoding_project2.data

import com.example.smkcoding_project2.item.DataCovid
import retrofit2.Call
import retrofit2.http.GET

interface DataService {
    @GET("dataCovid")
    fun getData(): Call<List<DataCovid>>
}