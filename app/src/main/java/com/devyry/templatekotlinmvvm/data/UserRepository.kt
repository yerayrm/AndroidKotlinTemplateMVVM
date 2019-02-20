package com.devyry.templatekotlinmvvm.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.devyry.templatekotlinmvvm.model.User
import com.devyry.templatekotlinmvvm.data.webservice.WebService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Yeray Rguez on 11/02/2019.
 */
class UserRepository(private var webService: WebService) {

    fun getUser(userId: String) : LiveData<User> {
        val data: MutableLiveData<User> = MutableLiveData()
        webService.getUser(userId = userId).enqueue(object : Callback<User>
        {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                data.value = response.body()
            }

            override fun onFailure(call: Call<User>, t: Throwable) {

            }
        })
        return data
    }

}