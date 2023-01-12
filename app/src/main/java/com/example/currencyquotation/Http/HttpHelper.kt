package com.example.currencyquotation.Http

import okhttp3.OkHttpClient
import okhttp3.Request


class HttpHelper {

    fun get () {

        val URL = "https://api.exchangerate.host/convert?from=USD&to=BRL"

        // cliente que dispara a requisição
        val client = OkHttpClient()

        // requisição GET
        val request = Request.Builder().url(URL).get().build()

        // Requisitar
        val response = client.newCall(request).execute()

        // extrair body
        val responseBody = response.body

        // exibir body
        if (responseBody != null){
            val json = responseBody.string()
            println("RESPOSTA ========================================" + json)
        }

    }
}