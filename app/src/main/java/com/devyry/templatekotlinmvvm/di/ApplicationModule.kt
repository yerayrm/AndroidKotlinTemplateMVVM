package com.devyry.templatekotlinmvvm.di

import android.content.Context
import com.devyry.templatekotlinmvvm.App
import com.devyry.templatekotlinmvvm.data.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApplicationModule {

    companion object {
        const val APPLICATION_CONTEXT = "application.context"
    }

    @Provides
    @Named(APPLICATION_CONTEXT)
    @Singleton
    internal fun provideContext(application: App): Context {
        return application
    }

    @Provides
    @Singleton
    internal fun provideUserRepository(userRepository: UserRepository): UserRepository {
        return UserRepository()
    }


}