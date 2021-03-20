package com.example.currencyconverter.main

import com.example.currencyconverter.data.models.Currency
import com.example.currencyconverter.util.Resource
import retrofit2.Response

interface MainRepository {

    suspend fun getRates(base: String): Resource<Currency>
}