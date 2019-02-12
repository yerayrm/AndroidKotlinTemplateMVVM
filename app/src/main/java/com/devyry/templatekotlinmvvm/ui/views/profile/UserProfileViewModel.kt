package com.devyry.templatekotlinmvvm.ui.views.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.devyry.templatekotlinmvvm.model.User

/**
 * Created by Yeray Rguez on 12/02/2019.
 */
class UserProfileViewModel : ViewModel() {

    private lateinit var userId: String
    private lateinit var user: LiveData<User>

    fun init(userId: String?) {
        this.userId = userId!!
    }

    fun getUser() : LiveData<User> {
        return user
    }

}