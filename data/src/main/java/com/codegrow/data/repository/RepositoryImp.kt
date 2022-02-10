package com.codegrow.data.repository

import com.codegrow.domain.repository.Repository
import javax.inject.Inject

/**
 * Implementation class of [Repository]
 */
class RepositoryImp @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : Repository {


}