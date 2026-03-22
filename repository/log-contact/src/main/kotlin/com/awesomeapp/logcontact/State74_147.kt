package com.awesomeapp.logcontact

sealed class State74_147 {
    data object Loading : State74_147()
    data class Success(val data: String) : State74_147()
    data class Error(val message: String) : State74_147()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}