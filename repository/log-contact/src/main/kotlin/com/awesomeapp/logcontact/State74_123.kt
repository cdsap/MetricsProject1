package com.awesomeapp.logcontact

sealed class State74_123 {
    data object Loading : State74_123()
    data class Success(val data: String) : State74_123()
    data class Error(val message: String) : State74_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}