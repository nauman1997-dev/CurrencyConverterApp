package com.example.currencyconverter.data.models


data class Currency(
    val base: String,
    val date: String,
    val rates: Rates
)