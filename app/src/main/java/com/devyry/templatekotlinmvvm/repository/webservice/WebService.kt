package com.devyry.templatekotlinmvvm.repository.webservice

import com.devyry.templatekotlinmvvm.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Yeray Rguez on 11/02/2019.
 */
interface WebService {

    @GET("/users/{user}")
    fun getUser(@Path("user") userId: String) : Call<User>

}