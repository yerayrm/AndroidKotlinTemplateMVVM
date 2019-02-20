package com.devyry.templatekotlinmvvm.di

import android.app.Application
import android.content.Context
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
    internal fun provideContext(application: Application): Context {
        return application
    }


}