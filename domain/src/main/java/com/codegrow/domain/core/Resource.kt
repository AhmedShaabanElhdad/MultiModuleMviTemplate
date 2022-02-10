package com.codegrow.domain.core


sealed class Resource<out T> {
    class Success<T>(val data: T) : Resource<T>()
    class Error(val message: String) : Resource<Nothing>()
    class ErrorRes(val resource: Int) : Resource<Nothing>()
    object Loading : Resource<Nothing>()
    object Empty : Resource<Nothing>()
}