package com.devyry.templatekotlinmvvm.ui.views.profile

/*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.devyry.templatekotlinmvvm.R
import com.devyry.templatekotlinmvvm.ui.base.BaseFragment

class UserProfileFragment : BaseFragment() {

    private val UID_KEY = "uid"

    private lateinit var viewModel: UserProfileViewModel


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val userId = arguments?.getString(UID_KEY)
        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel::class.java)
        viewModel.init(userId)

        viewModel.getUser().observe(this, Observer {
            //Update UI
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_profile, container, false)
    }

}
*/