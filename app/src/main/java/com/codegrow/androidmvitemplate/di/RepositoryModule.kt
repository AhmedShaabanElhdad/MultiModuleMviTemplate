package com.codegrow.androidmvitemplate.di

import com.codegrow.data.repository.RepositoryImp
import com.codegrow.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * Module that holds Repository classes
 */
@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun provideRepository(repository : RepositoryImp) : Repository

}