package com.sulnae.sulnae.network

import com.sulnae.sulnae.`object`.Alcohol
import com.sulnae.sulnae.`object`.AlcoholRating
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApi {
    @POST("/create")
    fun createRating(@Body rating: AlcoholRating): Call<ResponseBody>

    @GET("/drink")
    fun getDrinkInfo(): Call<List<Alcohol>>
}